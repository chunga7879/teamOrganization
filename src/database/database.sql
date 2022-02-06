
CREATE TABLE Employee (
    EmployeeName CHAR(50) PRIMARY KEY,
    EmployeeEmail CHAR(50)
);

CREATE TABLE Project (
    ProjectName CHAR(50) PRIMARY KEY,
    MinNumTeamMember INT,
    MaxNumTeamMember INT,
    StartDate Date,
    EndDate Date
);

CREATE TABLE employeSkills (
    EmployeeName CHAR(50) PRIMARY KEY,
    HW_pcdDesign int,
    HW_signalProcessing int,
    HW_CAD int,
    HW_simulation int,
    NW_dataScience INT,
    NW_machineLearning INT,
    NW_protocol INT,
    RE_sourceChecking INT,
    RE_journalResearch INT,
    RE_dataCollection INT,
    SW_objectOrientedProgramming INT,
    SW_webDevelopment INT,
    SW_appDevelopment INT,
    SW_UXdesign INT,
    SW_testing INT,
    FOREIGN KEY (EmployeeName) REFERENCES Employee
        ON DELETE CASCADE);


CREATE TABLE projectSkills (
    ProjectName CHAR(50) PRIMARY KEY,
    HW_pcdDesign int,
    HW_signalProcessing int,
    HW_CAD int,
    HW_simulation int,
    NW_dataScience INT,
    NW_machineLearning INT,
    NW_protocol INT,
    RE_sourceChecking INT,
    RE_journalResearch INT,
    RE_dataCollection INT,
    SW_objectOrientedProgramming INT,
    SW_webDevelopment INT,
    SW_appDevelopment INT,
    SW_UXdesign INT,
    SW_testing INT,
    FOREIGN KEY (ProjectName) REFERENCES Project
        ON DELETE CASCADE);

CREATE TABLE EmployeeAvailableTime (
    EmployeeName CHAR(50) PRIMARY KEY,
    StartDate Date,
    EndDate Date,
    FOREIGN KEY (EmployeeName) REFERENCES Employee
        ON DELETE CASCADE);







