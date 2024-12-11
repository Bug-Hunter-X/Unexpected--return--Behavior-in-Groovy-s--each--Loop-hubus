# Groovy `each` Loop `return` Behavior

This example demonstrates a common misunderstanding regarding the `return` statement within Groovy's `each` method.  The `return` statement only exits the `each` loop, not the enclosing method.  This can lead to unexpected results when attempting to prematurely terminate a method based on a condition within the loop.

The `bug.groovy` file shows the problematic code. The `bugSolution.groovy` demonstrates the corrected approach.