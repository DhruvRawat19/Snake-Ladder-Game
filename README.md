# Snake and Ladder Game

This repository contains a desktop Java/Swing UI prototype for a Snake and Ladder game. The primary application is `snkkk.java`, which builds a window with a control sidebar, player name fields, dice controls, player markers, and static side graphics.

This project is a **UI prototype, not a complete Snake and Ladder rule engine**. The reviewed `snkkk.java` implementation does not calculate snake or ladder movements, track board positions, manage turns, or implement a win condition.

## Implemented Features

- A Swing/AWT desktop window titled "snake and ladder"
- A randomly generated dice roll with values from 1 through 6
- Dice image switching through `dice1.png` to `dice6.png`
- A `Roll` button that updates the displayed dice and changes the Player 1 marker's x position
- Two editable player name fields labeled "Player 1 Name" and "Player 2 Name"
- A visual reset button and static start/about controls
- Static graphics for the application side panel, start area, and player markers

The roll logic is visual only. Each roll sets a horizontal position for Player 1, but it does not convert the dice value into a board square or apply any square, snake, ladder, turn, or victory rules.

### Reset and Control State

`snkkk.java` creates a reset button from `reset.png`, but it does not attach an action listener or restore the player position or dice image. The start button and some decorative controls likewise do not implement gameplay actions. `b2` in the older `sl.java` variant has reset behavior commented out rather than active.

## Prerequisites

- Java Development Kit (JDK) with `javac` and `java`
- A graphical desktop environment capable of opening a Swing window

## Setup and Run

Run the following commands from the repository root:

```bash
javac snkkk.java
java snkkk
```

The image loading uses relative paths such as `"dice1.png"` and `"swt.jpg"`. On Windows, open a command prompt or PowerShell in the repository root before running the application so those assets resolve correctly.

## Project Structure

- `snkkk.java` - Primary and runnable Java/Swing Snake and Ladder UI implementation
- `sl.java` - Earlier Snake and Ladder UI variant retained as an experimental source
- `snake.java` - Standalone Snake game experiment
- `snake3.java` - Alternate keyboard-controlled Snake experiment
- `swt.jpg` - Side-panel background graphic
- `s1.png` - Static right-side graphic
- `start.jpg` - Static start-area graphic
- `start.gif` - Start control graphic
- `about.gif` - About control graphic
- `reset.png` - Reset button graphic
- `player1.png`, `player2.png` - Player marker graphics
- `dice.gif` - Animated or decorative dice graphic
- `dice1.png` through `dice6.png` - Dice face graphics

Compiled `.class` files may also be present in a local checkout.

## Experimental Files

`sl.java` is an earlier UI variant of the same board-side prototype. It contains similar fields and a roll implementation, but also leaves reset behavior commented out.

`snake.java` and `snake3.java` are separate Snake experiments rather than rule-complete Snake and Ladder implementations. They use keyboard input and timers to move a Snake; `snake.java` references image assets that are not present in this repository.

## Technical Details

- The primary source uses `JFrame`, `JPanel`, `JButton`, `JTextField`, `ImageIcon`, and `Graphics`
- The window is sized with `setBounds(200, 100, 990, 725)`
- The dice is generated as a random integer from 1 through 6
- Player 1 starts at `(40, 630)` and is moved to preset x positions after a roll
- Player 2 and static side graphics are drawn at fixed positions
- UI assets are loaded from the process working directory with `ImageIcon` and `Graphics.drawImage`

## Known Limitations

- The implementation is a UI/prototype rather than a complete game
- Snake and ladder board mappings are not implemented
- Dice rolls do not advance a logical player position
- There is no turn switching or player 1/player 2 gameplay loop
- There is no win condition or finish-square detection
- The reset button is not connected to reset logic
- The start button does not start or control a game loop
- `sl.java`, `snake.java`, and `snake3.java` are experimental and are not the implementation used by the `snkkk.java` entry point
