function getAdminPanel() {
  return ` <div class="display">
  <div class="header">
    <div class="mask"></div>
    <div class="bg"></div>
    <div class="admin-menu">
      <div class="bar1"></div>
      <div class="bar2"></div>
      <div class="bar3"></div>
    </div>
  </div>

  <div class="fixed-container">
    <div class="data-container">
      <div class="col1">
        <form action="" id="jobData-form">
          <div class="heading">Job Data</div>
          <div class="job-details">
            <div class="details-scrollable">
              <div class="detail">
                <div class="params">Display Picture</div>
                <div class="values image-input-container">
                  <div class="file-upload">
                    <span id="file-status">Choose Image</span>
                    <input
                      type="file"
                      id="image-upload"
                      accept="image/*"
                    />
                  </div>
                  <div class="file-selected">
                    <span id="file-name"></span>
                  </div>
                </div>
              </div>
              <div class="detail">
                <div class="params">
                  <label for="company">Company Name</label>
                </div>
                <div class="values">
                  <input
                    type="text"
                    name="company"
                    spellcheck="false"
                    id="company"
                  />
                </div>
              </div>
              <div class="detail">
                <div class="params">
                  <label for="jobStatus">New Opening</label>
                </div>
                <div class="values box-container">
                  <div class="box">
                    <label for="jobStatusYes" class="tagname">YES</label>
                    <input
                      type="radio"
                      id="jobStatusYes"
                      name="jobStatus"
                      value="NEW!"
                    />
                  </div>

                  <div class="box">
                    <label for="jobStatusNo" class="tagname">NO</label>
                    <input
                      type="radio"
                      id="jobStatusNo"
                      name="jobStatus"
                      value=""
                      checked
                    />
                  </div>
                </div>
              </div>
              <div class="detail">
                <div class="params">Featured</div>
                <div class="values box-container">
                  <div class="box">
                    <label for="jobTypeYes" class="tagname">YES</label>
                    <input
                      type="radio"
                      id="jobTypeYes"
                      name="jobType"
                      value="Featured"
                    />
                  </div>

                  <div class="box">
                    <label for="jobTypeNo" class="tagname">NO</label>
                    <input
                      type="radio"
                      id="jobTypeNo"
                      name="jobType"
                      value=""
                      checked
                    />
                  </div>
                </div>
              </div>
              <div class="detail">
                <div class="params">
                  <label for="jobRole">Job Role Title</label>
                </div>
                <div class="values">
                  <input
                    type="text"
                    name="jobRole"
                    spellcheck="false"
                    id="jobRole"
                  />
                </div>
              </div>
              <div class="detail">
                <div class="params">
                  <label for="updated">Updated</label>
                </div>
                <div class="values">
                  <input
                    type="text"
                    name="updated"
                    spellcheck="false"
                    id="updated"
                  />
                </div>
              </div>
              <div class="detail">
                <div class="params">
                  <label for="employment">Employment</label>
                </div>
                <div class="values">
                  <input
                    type="text"
                    name="employment"
                    spellcheck="false"
                    id="employment"
                  />
                </div>
              </div>
              <div class="detail">
                <div class="params">
                  <label for="location">location</label>
                </div>
                <div class="values">
                  <input
                    type="text"
                    name="location"
                    spellcheck="false"
                    id="location"
                  />
                </div>
              </div>

              <div class="detail requirementsHeader">
                <div>Requirement Criteria</div>
              </div>

              <div class="detail">
                <div class="params">
                  <label for="roleData">Role</label>
                </div>
                <div class="values">
                  <input
                    type="text"
                    id="roleData"
                    name="role"
                    list="role-list"
                    autocomplete="false"
                  />
                  <datalist id="role-list">
                    <option value="Frontend"></option>
                    <option value="Backend"></option>
                    <option value="Fullstack"></option>
                  </datalist>
                </div>
              </div>
              <div class="detail">
                <div class="params">
                  <label for="levelData">Experience Level</label>
                </div>
                <div class="values">
                  <input
                    type="text"
                    id="levelData"
                    name="level"
                    list="level-list"
                    autocomplete="false"
                  />
                  <datalist id="level-list">
                    <option value="Junior"></option>
                    <option value="Midweight"></option>
                    <option value="Senior"></option>
                  </datalist>
                </div>
              </div>
              <div class="detail">
                <div class="params">
                  <label for="languageData">Languages</label>
                </div>
                <div class="values">
                  <input
                    type="text"
                    id="languageData"
                    name="languages"
                    list="language-list"
                    autocomplete="false"
                  />
                  <datalist id="language-list">
                    <option value="Python"></option>
                    <option value="Ruby"></option>
                    <option value="JavaScript"></option>
                    <option value="HTML"></option>
                    <option value="CSS"></option>
                  </datalist>
                </div>
              </div>
              <div class="detail">
                <div class="params">
                  <label for="toolsData">Tools</label>
                </div>
                <div class="values">
                  <input
                    type="text"
                    id="toolsData"
                    name="tools"
                    list="tool-list"
                    autocomplete="false"
                  />
                  <datalist id="tool-list">
                    <option value="React"></option>
                    <option value="Sass"></option>
                    <option value="Vue"></option>
                    <option value="Django"></option>
                    <option value="RoR"></option>
                  </datalist>
                </div>
              </div>
            </div>
          </div>
          <div class="controls">
            <div id="submit">Submit</div>
            <div id="preview" class="preview">Preview</div>
          </div>
        </form>
      </div>
      <div class="col2"></div>
    </div>
  </div>
</div>`;
}

export default getAdminPanel;
