function getContainer() {
  let job = `<div class="job" id="${this.id}">
          <div class="picture left">
            <div class="image-container">
              <img src="${this.dp}" alt="photosnap" />
            </div>
          </div>
    
          <div class="details center">
            <div class="top">
              <div class="company">${this.company}</div>`;

  if (this.jobStatus !== "") {
    job += `<div class="jobStatus">${this.jobStatus}</div>`;
  }
  if (this.jobType !== "") {
    job += `<div class="jobType">${this.jobType}</div>`;
  }

  job += `</div>
    
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
      job += `<li class="filter-data">${filter}</li>`;
    }
  }

  job += `
              </ul>
              </div>
              </div>
              </div>`;

  return job;
}

export default getContainer;
