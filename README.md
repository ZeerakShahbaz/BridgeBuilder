# BridgeBuilder Game

## Overview
BridgeBuilder is a command-line strategy game implemented in Java, where players act as civil engineers to construct bridges across a grid-represented lake. Players contend against an AI opponent that strategically places obstacles to impede construction. The game challenges players with dynamic grid sizes, multiple bridge construction paths, and varying difficulty levels.

## Features
- **Dynamic Game Grid:** Choose the size of the grid to increase the complexity and potential score.
- **Multiple Bridge Paths:** Construct bridges horizontally, vertically, or diagonally with specific scoring rules.
- **Adaptive AI Opponent:** Compete against an AI with two difficulty settings. The AI places obstacles more strategically in hard mode.
- **Scoring System:** Earn points based on the bridge’s path and grid size. Bonus points are available for larger grids and specific diagonal placements.

## Technologies Used
- Java

## How to Play
1. Start the game by specifying the grid size.
2. Players use '+' to mark their bridge construction on the grid.
3. The AI opponent uses '0' to place obstacles.
4. The game is won by successfully linking one side of the grid to the opposite side through a continuous line of player tokens.

## Classes and Responsibilities
- **Player:** Manages player actions, including token placement and score management.
- **GameBoard:** Handles the grid (lake) representation, move validation, and checks for win conditions.
- **Engineer:** Controls the AI opponent's strategy based on the selected difficulty level.

## Installation
Clone the repository and run the game using a Java IDE or compile and run from the command line:
```bash
javac BridgeBuilder.java
java BridgeBuilder
