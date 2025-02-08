# Kotlin `removeIf` Gotcha

This repository demonstrates a common error when using the `removeIf` function in Kotlin. The `removeIf` function modifies the list directly, which can be problematic if you're not expecting it.

The `bug.kt` file contains the problematic code, while `bugSolution.kt` shows a safer approach.

## Problem

The `removeIf` function modifies the list in place.  This can lead to unexpected consequences if you're not expecting the original list to be modified. For example, if you're iterating through the list and removing elements, you might accidentally skip elements because the indices change.

## Solution

Use a new list to avoid direct modification of the original list. This maintains the integrity of the original data and makes the code easier to reason about.