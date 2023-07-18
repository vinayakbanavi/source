/*---------------------Resource import --------------------*/

console.log("working");

import { jobs } from "./jobs.js";
import getContainer from "./container.js";

import createNewJob from "./createJob.js";
import getAdminPanel from "./adminPanel.js";

/*--------------------------JQUERY---------------------------*/

$(document).ready(function () {
  /*---------------Initial Setups---------------*/

  $(".display").fadeOut(0);

  /*---------------Apending Admin Panel---------------*/
  appendAdminPanel();
  function appendAdminPanel() {
    $(".header").append(getAdminPanel());
    $(".newJob").fadeOut(0);
    $(".col2").hide();
    $(".display").fadeOut(0);
  }

  /*---------------Displaying Jobs---------------*/

  displayJobs();

  function displayJobs() {
    console.log("displaying jobs : " + jobs.length);

    for (const job of jobs) {
      let content = getContainer.apply(job);
      console.log(JSON.stringify(job));
      $("#jobs").append(content);
    }
  }

  /*---------------Collecting Jobs Data---------------*/
  var jobData = [];
  createJobData();

  function createJobData() {
    for (const job of jobs) {
      const data = Object.values(job.data).flat();

      data.forEach((element, index, array) => {
        array[index] = element.toLowerCase();
      });

      jobData.push(data);
    }
    console.log("\nJob Data Created");
    console.log(JSON.stringify(jobData));
  }

  /*----------Interactive filter-data---------------- */

  var filterData = new Set();

  $(document).on("click", ".filter-data", function (event) {
    $(".job").css({ "border-left": "4px solid transparent" });
    let filter = $(this).text().toLowerCase();

    if (filterData.has(filter)) {
      return;
    } else {
      filterData.add(filter);
      showFilters($(this).text());
    }
  });

  /*------------Showing the selected filter in the filter bar-------------- */

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

  /*------------Remove the element from the filter bar on clear icon-------------- */

  $(document).on("click", ".clear", function () {
    let filter = $(this).prev().text().toLowerCase();

    filterData.delete(filter);

    var parentElement = $(this).parent();

    $(parentElement).fadeOut(200, function () {
      $(this).remove();
      applyFilter();
      setTimeout(function () {
        checkEmpty();
      }, 0);
    });
  });

  $(".clearFilters").click(function () {
    filterData.clear();
    $(".active-filters").empty();
    checkEmpty();
  });

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

  /*----------------------check Empty------------------------------ */
  function checkEmpty() {
    if ($(".active-filters").children().length !== 0) {
      return;
    } else {
      restore();
    }
  }

  /*-------------------------Restore all jobs ------------------------------ */

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
    let input = $("#data").val();
    // alert(input);
    if (event.keyCode === 8 && input === "") {
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

  /*------------------------------------------------------Admin Panel------------------------------------------------------- */

  $(".admin-menu").click(function () {
    // window.open("admin-panel.html", "_blank");

    $(".display").fadeToggle(100);
    $(".filter-bar").fadeToggle(100);
  });

  var fileInput = $("#image-upload");
  var fileNameSpan = $("#file-name");

  fileInput.change(function (event) {
    var file = event.target.files[0];
    if (file) {
      fileNameSpan.text(file.name);
      $("#file-status").text("Change Image");
    } else {
      fileNameSpan.text("");
      $("#file-status").text("Choose Image");
    }
  });

  $("input[name='jobType']").change(function (event) {
    let selected = $(this).prev().text();

    if (selected == "YES") {
      $("#jobTypeYes").parent().css("background", "black");
      $("#jobTypeNo").parent().css("background", "hsl(180, 29%, 50%)");
    } else {
      $("#jobTypeYes").parent().css("background", "hsl(180, 29%, 50%)");
      $("#jobTypeNo").parent().css("background", "black");
    }
  });

  $("input[name='jobStatus']").change(function (event) {
    let selected = $(this).prev().text();

    if (selected == "YES") {
      $("#jobStatusYes").parent().css("background", "black");
      $("#jobStatusNo").parent().css("background", "hsl(180, 29%, 50%)");
    } else {
      $("#jobStatusYes").parent().css("background", "hsl(180, 29%, 50%)");
      $("#jobStatusNo").parent().css("background", "black");
    }
  });

  $("#requirements").click(function () {
    $("#dropdown-content").show(0);
  });

  $("#requirementsSelected").click(function () {
    $("#dropdown-content").hide(0);
  });

  function createJob() {
    const job = {
      id: "job" + jobs.length + 1,
      dp: "assets/images/the-air-filter-company.svg",
      company: "The Air Filter Company",
      jobStatus: "",
      jobType: "",
      jobRole: "Front-end Dev",
      updated: "1mo ago",
      employment: "Part Time",
      location: "Worldwide",
      data: {
        role: "Frontend",
        level: "Junior",
        languages: ["JavaScript"],
        tools: ["React", "Sass"],
      },
    };
  }

  $(".preview").click(function () {
    applyNewJob();
    preview();
  });

  function applyNewJob() {
    let job = createJob();
    let newJob = createNewJob.apply(job);
    $(".col2").html(newJob);
  }

  /*----------------------------------------Create New Job ---------------------------------------- */
  function createJob() {
    var formData = $("#jobData-form").serializeArray();
    var form = {};

    // Convert form data to object
    $.each(formData, function (index, field) {
      form[field.name] = field.value;
    });

    let languagesArray = [];
    let toolsArray = [];

    if (form.languages !== "") {
      // console.log(form.languages);
      languagesArray = form.languages.split(",").map((lang) => lang.trim());
    }

    if (form.tools !== "") {
      // console.log(form.tools);
      toolsArray = form.tools.split(",").map((lang) => lang.trim());
    }

    // const imgPath = getImageFile();

    // alert(imgPath);

    const job = {
      id: "job" + (jobs.length + 1),
      dp: imageURL,
      company: form.company,
      jobStatus: form.jobStatus,
      jobType: form.jobType,
      jobRole: form.jobRole,
      updated: form.updated,
      employment: form.employment,
      location: form.location,
      data: {
        role: form.role,
        level: form.level,
        languages: languagesArray,
        tools: toolsArray,
      },
    };

    return job;
  }

  function preview() {
    let preview = $(".col2").css("display");

    if (preview === "none") {
      // alert("working");
      $(".newJob").fadeOut(0);
      $(".col2").toggle(800);

      setTimeout(function () {
        $(".newJob").fadeIn(1000);
      }, 1000);
    } else {
      $(".newJob").fadeOut(900);
      setTimeout(function () {
        $(".col2").toggle(800);
      }, 900);
    }
  }

  $(".update").click(function () {
    // alert("working");
    applyNewJob();
  });

  $("form input").change(function () {
    applyNewJob();
  });

  $("#submit").click(function () {
    // console.log("\nNew Job Submited");

    let job = createJob();
    jobs.push(job);

    // console.log("\njobs array updated : " + jobs.length);
    // console.log(JSON.stringify(jobs));

    const data = Object.values(job.data).flat();
    data.forEach((element, index, array) => {
      array[index] = element.toLowerCase();
    });
    jobData.push(data);
    // console.log("\njobs Data updated : " + jobData.length);
    // console.log(JSON.stringify(jobData));

    let content = getContainer.apply(job);
    // console.log(JSON.stringify(job));

    // console.log("\nAdding Job to the Content" + content);
    $("#jobs").append(content);

    setTimeout(function () {
      $(".display").fadeToggle(100);
      $(".filter-bar").fadeToggle(100);
    }, 100);
  });

  // Create an array to store image files
  var imageURL;

  // Function to handle image file selection
  function handleImageUpload(event) {
    var image = event.target.files[0]; // Get the first selected file

    imageURL = URL.createObjectURL(image); // Create a URL for the file

    $(".newJob img").attr("src", imageURL); // Set the src attribute of the image element
  }
  $("#image-upload").on("change", handleImageUpload);

  /*---------------Responsive Border------------*/
  $(".job").click(function () {
    let borderLeft = $(this).css("border-left");

    if (borderLeft === "4px solid rgba(0, 0, 0, 0)")
      $(this).css({ "border-left": "4px solid hsl(180, 29%, 50%)" });
    else $(this).css({ "border-left": "4px solid transparent" });
  });

  $(document).on("error", "#jobDp", function () {
    this.style.display = "none"; // Hide the image if it's broken or empty
  });
});

/*

  Restore clear icon functionality

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

*/
