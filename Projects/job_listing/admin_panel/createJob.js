function createNewJob() {
  let newJob = `<div class="newJob">
      <div class="picture left">
        <div class="image-container">
          <img src="${this.dp}" alt="" id="newJobDp"/>
        </div>
      </div>`;

  newJob += ` <div class="details center">
      <div class="top">
        <div class="company">${this.company}</div>`;

  if (this.jobStatus !== "") {
    newJob += `<div class="jobStatus">${this.jobStatus}</div>`;
  }
  if (this.jobType !== "") {
    newJob += `<div class="jobType">${this.jobType}</div>`;
  }

  newJob += `</div>
      
              <div class="job-title middle">  
                <div class="role">${this.jobRole}</div>
              </div>
      
              <div class="job-desc bottom">
                <div class="update">${this.updated}</div>
                <i class="dot"></i>
                <div class="employment">${this.employment}</div>
                <i class="dot"></i>
                <div class="location">${this.location}</div>
              </div>
            </div> 
            <div class="skills right">
                  <div class="data">
                 
                  <ul>`;

  if (this.data !== undefined) {
    const filters = Object.values(this.data).flat();
    for (let filter of filters) {
      newJob += `<li class="filter-data">${filter}</li>`;
    }
  }

  newJob += `
                </ul>
                </div>
                </div>
                </div>`;

  return newJob;
}

export default createNewJob;

{
  /* <div class="newJob">
    <div class="picture left">
      <div class="image-container">
        <img src="" alt="" />
      </div>
    </div>
  
    <div class="details center">
      <div class="top">
        <div class="company">Photosnap</div>
        <div class="jobStatus">New!</div>
        <div class="jobType">Featured</div>
      </div>
  
      <div class="job-title middle">
        <div class="role">Senior Frontend Developer</div>
      </div>
  
      <div class="job-desc bottom">
        <div class="update">1d ago</div>
        <i class="dot"></i>
        <div class="employment">Full Time</div>
        <i class="dot"></i>
        <div class="location">USA only</div>
      </div>
    </div>
  
    <div class="skills right">
      <div class="data">
        <ul>
          <li>Frontend</li>
          <li>Senior</li>
          <li>HTML</li>
          <li>CSS</li>
          <li>JavaScript</li>
        </ul>
      </div>
    </div>
  </div>; */
}
