# Draft Team

### Problem
There are *n* teams (zero-indexed) that are drafting players ranked *1, 2, 3, ...* in sequential order. Each of these teams has a different number of picks remaining. For example, team *1* can have 3 picks remaining while team *3* can have 1 team remaining.

For a given team *i* (zero-indexed), return what ranked player they will select with their final pick.

### Input
You will be given two inputs:

```teams``` : array of the number of draft picks each team has left

```i``` : the team (zero-indexed) for which we want to know the final ranked player selected

```
public static draftTeam(long[] teams, int i)
```

### Example
*Inputs*: ```{5,1,2}, 2 ```

Label Teams A, B, C

Team A picks player 1

Team B picks player 2

Team C picks player 3

Team A picks player 4

Team B does not have any players left to pick

Team C picks player 5

*Output*: ``` 5 ```
