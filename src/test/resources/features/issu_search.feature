@IssuJournal
Feature: Validate Issu Page

  @Search
  Scenario: Validate Journal Page
    Given Navigate to Main Page
    When Search for journal "National Geographic"
    Then Results got specified with text "National Geographic"