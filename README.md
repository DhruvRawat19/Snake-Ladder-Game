# Snake and Ladder Game

A desktop Snake and Ladder game built with Java and Swing. The project provides a graphical game board, player names, animated-style controls, dice images, and player markers.

## Features

- Graphical 10-row-style board loaded from project image assets
- Two player name fields
- Dice roll button with randomized values
- Separate dice images for rolls 1 through 6
- Player and board graphics rendered with Swing
- Reset and start controls

## Technology

- Java
- Java AWT and Swing
- Local PNG, JPG, and GIF image assets

## Project Structure

- `snkkk.java` - Main source for the primary Snake and Ladder window
- `sl.java` - Alternative Snake and Ladder application entry point
- `snake.java` - Snake-themed game experiment
- `snake3.java` - Older snake game experiment
- `*.png`, `*.jpg`, `*.gif` - Board, player, dice, start, reset, and other UI assets
- `*.class` - Compiled Java bytecode artifacts

The repository also contains older demo and experimental source files. `snkkk.java` is the primary entry point for the graphical Snake and Ladder application.

## Prerequisites

- Java Development Kit (JDK) 8 or newer
- Java available on the system `PATH`

## Run the Game

From the repository root, compile the main source:

```bash
javac snkkk.java
```

Then start the application:

```bash
java snkkk
```

Keep all image files in the repository root because the Java source loads assets by relative filename.