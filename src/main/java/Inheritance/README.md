# Inheritance

A restaurant/review library that creates `Restaurant` objects and provides functionality to associate reviews with them.

Can be run with `.gradlew run`.

Testing performed with JUnit.

## Architecture/Design

The library has the following setup:

All core functionality is implemented on the `Business` abstract class. Each type of business inherits from this class and extends its behavior.

Additionally, there is a `Review` class that contains data pertinent to a general type of review left by customers for a business.

This may be made `abstract` in the future but for now is only used by extension. Each business has a static class, which follows the naming convention `BusinessReview`, that extends the `Review` class' behavior.