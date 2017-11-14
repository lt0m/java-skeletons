Feature: Service Information

	As a Procedure Executor
	I want to search for instructions
	So that I am able to proceed with the procedure

	Scenario: Search for non-existent instructions
		When I search for information code "11"
		Then I receive empty instructions list
