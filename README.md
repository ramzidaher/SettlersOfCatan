# Settlers of Cattan

This is a personal implementation of the popular board game, Settlers of Catan. This game was designed and developed using JavaFX and SceneBuilder. The main aim of creating this game was to provide a platform for friends and families to connect, strategize, and have fun in the comfort of their homes.

## Game Description

Settlers of Cattan is a multiplayer board game where players assume roles as settlers, each attempting to build and develop their individual holdings while trading and acquiring resources. Players earn points as their settlements grow; the first to reach a set number of points, typically 10, is the winner. The game is set up randomly, ensuring a unique experience every time.

## Software Requirements

- JDK 8 or later.
- JavaFX SDK.
- SceneBuilder (optional for further development).

## Installation

1. Clone the repository or download the zip file and extract it.
2. Open your preferred IDE, import the project and ensure you have the JavaFX library set up.
3. Run the `GameRunner.java` file.

## Game Features

- Multiplayer: Enjoy the game with your friends and family members.
- Rich GUI: The game interface is designed to be simple, yet visually appealing.
- Rules Enforcement: The game ensures that all player actions are in line with the Settlers of Catan rules.
- Save and Load Game: Have the ability to save a game in progress and load it at a later time.

## Development

### File Structure

The file structure of the project is divided into:

1. `src/main/java`: This directory contains all Java source code files. The main method is located in `Main.java`.
2. `src/main/resources`: This directory contains all non-Java files needed for the program, such as FXML files, images, etc.
3. `test`: This directory contains all test related source code.

### Building

To build the game:

1. Open a terminal in the project root directory.
2. Run `javac -cp path_to_javafx_sdk/lib/*:. src/main/java/*.java`.

### Running

To run the game:

1. Open a terminal in the project root directory.
2. Run `java -cp path_to_javafx_sdk/lib/*:. Main`.

## Contributions

Contributions, issues, and feature requests are welcome. Please feel free to check [issues page](#) for issues.

## License

This project is licensed under the MIT License - see the [LICENSE.md](#) file for details.

## Acknowledgements

- [JavaFX Documentation](https://openjfx.io/javadoc/11/)
- [Scene Builder Documentation](https://gluonhq.com/products/scene-builder/)

## Disclaimer

This is a fan-made project and is not affiliated with the official Settlers of Catan board game.
