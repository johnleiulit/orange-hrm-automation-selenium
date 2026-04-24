Feature: To validate the Orange HRM Application

Background:

Given User is on the Login page
When Admin enters valid credentials
Then It should navigate to Admin Dashboard

@tc001 @Regression @Admin
Scenario: To add employee

Given Admin is on the Dashboard
When Admin clicks the PIM on the sidebar
Then It should navigate to PIM section

When Admin clicks add button
And Admin input the firstname field
And Admin input the middlename field
And Admin input the lastname field
And Admin input the employee id
And Admin enable the create login details
And Admin input username
And Admin input password
And Admin input confirm password
And Admin clicks save button
Then the Employee should be added successfully

# Continue on Personal Details page
When Admin enters other id
And Admin enters driver license number
And Admin enters license expiry date
And Admin enters nationality
And Admin enters marital status
And Admin enters Date of Birth
And Admin enters gender
And Admin clicks save button
Then Employee should be updated successfully

# Continue on Contact Details page
When Admin clicks contact details on the sidebar
Then Admin should be navigated to contact details page

When Admin enters street 1
And Admin enters street 2
And Admin enters city
And Admin enters state/province
And Admin enters zip/postal code
And Admin enters country
And Admin enters home
And Admin enters mobile
And Admin enters work
And Admin enters work email
And Admin enters other email
And Admin clicks save button
Then It should show successfully updated

# Continue on Emergency Contacts page
When Admin clicks emergency contacts on the sidebar
Then Admin should be navigated to emergency contacts

When Admin click add button
And Admin enters name
And Admin enters relationship
And Admin enters home telephone
And Admin enters mobile
And Admin enters work telephone
And Admin clicks save button
Then It should show successsfully updated

# Continue on Dependents page
When Admin clicks dependents on the sidebar
Then Admin should be navigated to dependents page

When Admin clicks add button on dependents
And Admin enters dependent name
And Admin enters dependent relationship
And Admin enters specify relationship
And Admin selects dependent date of birth
And Admin clicks save button
Then It should show dependent successfully updated

# Continue on Immigration page
When Admin clicks immigration on the sidebar
Then Admin should be navigated to immigration page

When Admin clicks add button on immigration
And Admin enters number immigration
And Admin enters issued date immigration
And Admin enters expiry date immigration
And Admin enters eligible status immigration
And Admin enters issued by immigration
And Admin enters eligible review date immigration
And Admin enters comments immigration
And Admin clicks save button immigration
Then It should show immigration successfully updated

# Continue on Job page
When Admin clicks job on the sidebar
Then should be navigated to job page

When Admin enters joined date on job details
And Admin enters job title on job details
And Admin enters job category on job details
And Admin enters sub unit on job details
And Admin enters location on job details
And Admin enters employments status on job details
And Admin enable include employment contract details
And Admin enters contract start date on job details
And Admin enters contract end date on job details
And Admin clicks save button
Then It should show job details successfully updated

# Continue on Salary page
When Admin clicks salary on the sidebar
Then should be navigated to salary page

When Admin clicks add button on salary
And Admin enters salary components on salary
And Admin enters pay grade on salary
And Admin enters pay frequency on salary
And Admin enters currecncy on salary
And Admin enters ammount on salary 
And Admin enters comments on salary
And Enable deposit details on salary
And Admin enters account number on deposit details
And Admin enters account type on deposit details
And Admin enters routing number on deposit details
And Admin enters ammount on deposit details
And Admin clicks save button on salary
Then It should show salary successfully updated

# Continue on Report-to page
When Admin clicks report-to on the sidebar
Then should be navigated to report to page

When Admin clicks add button on report
And Admin enters name supervisor
And Admin enters reporting method on report
And Admin clicks save button on report
Then It should show report to successfully updated

# Continue on Qualification page
When Admin clicks qualifications on the sidebar
Then should be navigated to qualifications page

When Admin clicks add button on qualifications
And Admin enters company on work experience
And Admin enters job title on work experience
And Admin enters from date on work experience
And Admin enters to date on work experience
And Admin enters comments on work experience
And Admin clicks save button on work experience
Then It should show qualification successfully updated
# Education
When Admin clicks add button on education
And Admin enters level on education
And Admin enters institute on education
And Admin enters major/specialization on education
And Admin enters year on education
And Admin enters gpa/score on education
And Admin enters start date on education
And Admin enters end date on education
And Admin clicks save button on education
Then It should show education successfully updated
# Skills
When Admin clicks add button on skills
And Admin enters skill add skill
And Adnmin enters years of experience on skill
And Admin enters comments on skill
And Admin cliks save button on skill
Then It should show skill sucessfully updated
# Languages
When Admin clicks add button on langauges
And Admin enters language
And Admin enters fluency on language
And Admin enters competency on language
And Admin enters comments on language
And Admin clicks save button on language
Then It should show language successfully updated
# License
When Admin clicks add butto on license
And Admin enters license type
And Admin enters license number
And Admin enters issued date on license
And Admin enters expiry date on license
And Admin clicks save button on license
Then It should show license successfully updated

# Continue on Memberships page
When Admin clicks memberships on the sidebar
Then should be navigated to memberships page

When Admin clicks add button on membership
And Admin enters membership
And Admin enters subscription paid by on membership
And Admin enters subscription amount on membership
And Admin enters currency on membership
And Admin enters subscription commence date on membership
And Admin enters subscription renewal date on membership
And Admin clicks save button on membership
Then It should show membership successfully updated

@tc002 @Regression @Admin
Scenario: To validate filtering employee

Given Admin is on the Dashboard
When Admin clicks the PIM on the sidebar
Then It should navigate to PIM section

# Employee Name
When Admin enters employee name
And Admin clicks search button
Then It should display the filtered results by employee name

When Admin clicks reset button
Then All filter fields should be cleared

# Employee Id
When Admin enters employee id
And Admin clicks search button
Then It should display the filtered results by employee id

When Admin clicks reset button
Then All filter fields should be cleared

# Employment Status
When Admin selects employment status
And Admin clicks search button
Then It should display the filtered results by employment status

When Admin clicks reset button
Then All filter fields should be cleared

# Include
When Admin selects include
And Admin clicks search button
Then It should display the filtered results by include

When Admin clicks reset button
Then All filter fields should be cleared

# Supervisor Name
When Admin enters supervisor name
And Admin clicks search button
Then It should display the filtered results by supervisor name

When Admin clicks reset button
Then All filter fields should be cleared

# Job Title
When Admin selects job title
And Admin clicks search button
Then It should display the filtered results by job title

When Admin clicks reset button
Then All filter fields should be cleared

# Sub Unit
When Admin selects sub unit
And Admin clicks search button
Then It should display the filtered results by sub unit

When Admin clicks reset button
Then All filter fields should be cleared

# All Fields
When Admin fills all filter fields
And Admin clicks search button
Then It should display the filtered results using all applied filters







