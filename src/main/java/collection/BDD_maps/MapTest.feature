Feature: POST feature

  Scenario: Add a new book in library by filling all mandatory fields with valid data

    Given Se folosesc liste de map
      | Nume    | Prenume  | An   | Locatie   |
      | cristea | danut    | 1993 | Bucuresti |
      | cristea | georgian | 1990 | Buzau     |
      | cristea | doru     | 1970 | Buzau     |
    And Se foloseste map
      | Prenume1 | danut    |
      | Prenume2 | georgian |
      | Prenume3 | doru     |
