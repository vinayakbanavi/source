/*---------------------Resource import --------------------*/

console.log("working");

import { jobs } from "./jobs.js";
import getContainer from "./container.js";

/*--------------------------Ajax---------------------------*/
$(document).ready(function () {
  $(window).resize(function () {
    if (window.innerWidth <= 600) {
      $(".content").animate({ paddingTop: "6vw" }, 0);
    } else {
      $(".content").animate({ paddingTop: "1vw" }, 0);
    }
  });

  /*----------------hide filter bar--------------*/
  // $(".filter-bar").fadeOut(0);

  /*---------------Appending Jobs----------------*/
  for (const job of jobs) {
    let content = getContainer.apply(job);
    $("#jobs").append(content);
  }

  /*---------------Collecting Data---------------*/
  var jobData = [];

  for (const job of jobs) {
    const data = Object.values(job.data).flat();

    data.forEach((element, index, array) => {
      array[index] = element.toLowerCase();
    });

    jobData.push(data);
  }
  console.log(JSON.stringify(jobData));

  /*---------------Responsive Border------------*/
  $(".job").click(function () {
    let borderLeft = $(this).css("border-left");

    if (borderLeft === "4px solid rgba(0, 0, 0, 0)")
      $(this).css({ "border-left": "4px solid hsl(180, 29%, 50%)" });
    else $(this).css({ "border-left": "4px solid transparent" });
  });

  /*------------Restore Functionality------------*/
  $("#search-space").keyup(function () {
    restore();
  });

  $("#clear").click(function () {
    $("#data").val("");
    restore();
  });

  function restore() {
    // alert("checking");

    let data = $("#data").val().toLowerCase().split(",");

    if (!data[0] == "") {
      $("#clear").show(100);
      return;
    } else {
      $("#clear").hide(100);
      for (let i = 0; i < jobData.length; i++) {
        $("#job" + (i + 1)).show(0);
      }
    }
  }

  /*----------Collecting filter-data---------------- */

  var filterData = new Set();

  $(".filter-data").click(function () {
    event.stopPropagation();

    // $(".filter-bar").show(600).css("display", "flex");
    // $(".filter-bar").fadeIn(500);

    // alert(window.innerWidth);
    // adjust the job container to accomodate the filter bar

    let filter = $(this).text().toLowerCase();

    if (filterData.has(filter)) {
      return;
    } else {
      filterData.add(filter);
      // console.log(filterData.values());
      showFilters($(this).text());
    }
  });

  /*------------Showing the selected filter into the filter bar-------------- */

  function showFilters(text) {
    let filterContainer = `<div class="filter">
          <div class="tag">${text}</div>
          <div class="clear">
          <div class="cross1"></div>
          <div class="cross2"></div>
          </div>
          </div>`;
    // $(".filter-bar").append(filterContainer);
    let $filter = $(filterContainer).hide();
    $(".active-filters").append($filter);
    $filter.fadeIn(500);

    $("#data").val("");
    applyFilter();
  }

  /*------------Remove the element from the filter bar-------------- */

  $(document).on("click", ".clear", function () {
    let filter = $(this).prev().text().toLowerCase();
    //   remove the data from the filterData
    // console.log(filter);
    filterData.delete(filter);
    // console.log(filterData.values());

    var parentElement = $(this).parent();

    $(parentElement).fadeOut(200, function () {
      $(this).remove();
      applyFilter();
      setTimeout(function () {
        checkEmpty();
      }, 0);
    });
  });

  /*----------------------check Empty------------------------------ */
  function checkEmpty() {
    // alert($(".filter-bar").children().length);
    if ($(".active-filters").children().length !== 0) {
      return;
    } else {
      restore();
      // $(".filter-bar").fadeOut(500);
      $(".content").animate({ paddingTop: "0" }, 500);
    }
  }

  /*-------------------------Apply filter------------------------------ */
  function applyFilter() {
    console.log("applyFilter");
    const data = Array.from(filterData.values()); // Convert iterable object to an array
    console.log(JSON.stringify(data));

    if (data.length === 0) {
      return;
    }

    for (let i = 0; i < jobData.length; i++) {
      const job = jobData[i];

      let exist = data.every((element) => job.includes(element));

      if (!exist) {
        $("#job" + (i + 1)).hide(0);
      } else {
        $("#job" + (i + 1)).show(0);
      }
    }
  }

  /*-------------------------Restore filter------------------------------ */

  function restore() {
    for (let i = 0; i < jobData.length; i++) {
      $("#job" + (i + 1)).show(0);
    }
  }

  /*----------------------Search functionality---------------------------*/

  $(".filter-bar").click(function () {
    $("#data").focus();
  });

  /*------------Search Enter------------*/
  $("#data").keyup(function (event) {
    if (event.keyCode === 13) {
      performSearch();
    }
  });

  const filtersMap = new Map([
    ["frontend", "Frontend"],
    ["backend", "Backend"],
    ["fullstack", "Fullstack"],
    ["junior", "Junior"],
    ["midweight", "Midweight"],
    ["senior", "Senior"],
    ["python", "Backend"],
    ["ruby", "Ruby"],
    ["javascript", "JavaScript"],
    ["html", "HTML"],
    ["css", "CSS"],
    ["react", "React"],
    ["sass", "Sass"],
    ["vue", "Vue"],
    ["django", "Django"],
    ["ror", "RoR"],
  ]);

  function performSearch() {
    const data = $("#data").val().toLowerCase().trim();

    if (data.length == "" || filterData.has(data)) {
      if (filterData.has(data)) {
        $("#data").val("");
      }
      return;
    }

    filterData.add(data);

    if (!filtersMap.has(data)) {
      showFilters(data);
    } else {
      showFilters(filtersMap.get(data));
    }
  }

  $("#data").keyup(function (event) {
    if (event.keyCode === 8) {
      let data = $(".active-filters")
        .children()
        .last()
        .children()
        .first()
        .text()
        .toLowerCase();

      // alert(data);
      if (filterData.has(data)) {
        filterData.delete(data);
        applyFilter();
      }

      $(".active-filters").children().last().remove();
      checkEmpty();
    }
  });
});

/*
- Role: Frontend, Backend, Fullstack
- Level: Junior, Midweight, Senior
- Languages: Python, Ruby, JavaScript, HTML, CSS
- Tools: React, Sass, Vue, Django, RoR (Ruby on Rails) 

class Job {
  constructor(company, role, updated, employment, location) {
    this.company = company;
    this.role = role;
    this.updated = updated;
    this.employment = employment;
    this.location = location;
    this.data = data;
  }
}

const companies = [
  "Photosnap",
  "Manage",
  "Account",
  "MyHome",
  "Loop Studios",
  "Faceit",
  "Shortly",
  "Insure",
  "EyeCam Co.",
  "The Air Filter Company",
];


extra functionalities

//Dynamic place holder  
  $("#data").focus(function () {
    $(this).attr("placeholder", "");
  });

  $("#data").blur(function () {
    $(this).attr("placeholder", "Search jobs");
  });

  // search button
    $("#search-button").click(function () {
    performSearch();
  });

    function performSearch() {
    const data = $("#data").val().toLowerCase().split(",");

    if (data[0] == "") {
      return;
    }

    data.forEach((element, index, array) => {
      array[index] = element.trim();
    });

    for (let i = 0; i < jobData.length; i++) {
      const job = jobData[i];

      let exist = data.every((element) => job.includes(element));

      if (!exist) {
        $("#job" + (i + 1)).hide(0);
      } else {
        $("#job" + (i + 1)).show(0);
      }
    }
  }
*/
