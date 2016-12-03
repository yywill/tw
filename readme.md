# Project Structure Overview:

Languages:
* java
* anltr

Requirements:

* maven dependencies
  * junit
  * anltr runtime
  * log4j
* maven compile plugins
  * anltr compile time support
  
Recommend IDE:

* IntelliJ with anltr plugin

Source Code:

* src/main/java/ : Questions list here
* src/test/java/ : Solutions list here & Test-Dervien Testcases
* *.java Java source codes
* *.g4 anltr4 source codes

## 1. Problem One:

Bootstrap: com.throughtworks.williamyang.homework.solutions.ProblemOneSolution

It is a batch questions about diagraph algorithm. "com.throughtworks.williamyang.homework.problems.trains.*" modes the DirectedEdge and EdgeWeightedDigraph.

The question is too obivious to name DirectedEdge as track. DirectedEdge.create is a static creation to create a track from a command(like "AB5").

![Proof of Solution](/images/screenshot_of_1.PNG)

## 2. Problem Two:

Bootstrap: com.throughtworks.williamyang.homework.solutions.ProblemTwoSolution

Solved by greedy alogrithm. The problem involves multiple notions. Those notions could be translated into java classes easily. A **shedular** *plans* **tracks** by embeded greedy alogrithm, and each **track** includes *morning* and *afternoon* **sessions** which have serveral **talks**. 

The trick parts:

* feed creation method of talks by command string, and it is complexy enough to use regex to group search variables.
* since network talks begins no earlier than 4pm and no later than 5pm, it could be hard code to fix at 5pm. 
* clock time should be set as member variables for track and talk, becaues it is the result of schedularing.

![Proof of Solution](/images/screenshot_of_2.PNG)

## 3. Problem Three:

Bootstrap: com.throughtworks.williamyang.homework.solutions.ProblemThreeSolution

I aware the constraints of "not using any frameworks". But, I would strongly recommend a parsing DSL tool(in my solution: anltr), because parsing tech is a copy paste work which must be replaced by auto-mathine. Beyond of that, the problem could be solved by two dictionaries. One is used to decryto secret number systems. Another is used for pricing. 

![Proof of Solution](/images/screenshot_of_3.PNG)
