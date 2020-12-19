
#include <iostream>
#include <string>

class game
{
    std::string board[3][3];
    std::string marker;

public:
    void boardConstruction()
    {
        for (int i = 0; i < 3; i++)
        { // O(3n)
            for (int j = 0; j < 3; j++)
            {                       // O(9n^2)
                board[i][j] = "__"; // O(n^2)
            }
        }
    }
    /*
     * O(10n^2 + 3n + 3 ) -> O(n^2) Big O: O(n^3) -> tight upper bound: O(11n^2) ->
     * loose upperBound: O(10.5n^2) Big omega: O(n) -> tight lower bound: O(1) ->
     * loose lower bound: O(1/2) Big theta:Since this method have a Big omega and
     * Big O then we can say that the average or Big theta is the base runtime:
     * O(n^2).
     */

public:
    void pBoard()
    {
        for (int i = 0; i < 3; i++)
        { // O(1)
            for (int j = 0; j < 3; j++)
            { // O(3n)
                if (j == 0)
                { // O(n)
                    std::cout << "| "
                              << " ";
                }
                std::cout << board[i][j] << " | "
                          << " "; // O(n)
            }
            std::cout << "\n"; // O(1)
        }
    }
    /*
     * O(10n^2 + 3n + 3 ) -> O(n^2) Big O: O(n^3) -> tight upper bound: O(11n^2) ->
     * loose upperBound: O(10.5n^2) Big omega: O(n) -> tight lower bound: O(1) ->
     * loose lower bound: O(1/2) Big theta:Since this method have a Big omega and
     * Big O then we can say that the average or Big theta is the base runtime:
     * O(n^2).
     */

public:
    void inputing()
    {
        std::cout << "Please input you placement: 1 - 9 "
                  << "\n"; // O(1)
        int input;         // O(1)
        std::cin >> input; // O(1)
        marker = "X";      // O(1)
        // 1
        if (input - 1 == 0)
        { // O(1)
            // player();
            board[0][0] = marker; // O(1)
            pBoard();             // O(1)
            inputing();           // O(1)
        }
        // 2
        else if (input - 1 == 1)
        {
            player();             // O(1)
            board[0][1] = marker; // O(1)
            pBoard();             // O(1)
            //input();// O(1)
        }
        // 3
        else if (input - 1 == 2)
        {
            player();             // O(1)
            board[0][2] = marker; // O(1)
            pBoard();             // O(1)
            inputing();
        }
        // 4
        else if (input - 1 == 3)
        {
            player();             // O(1)
            board[1][0] = marker; // O(1)
            pBoard();             // O(1)
            inputing();           // O(1)
        }
        // 5
        else if (input - 1 == 4)
        {
            player();             // O(1)
            board[1][1] = marker; // O(1)
            pBoard();             // O(1)
            inputing();           // O(1)
        }
        // 6
        else if (input - 1 == 5)
        {
            player();             // O(1)
            board[1][2] = marker; // O(1)
            pBoard();             // O(1)
            inputing();           // O(1)
        }
        // 7
        else if (input - 1 == 6)
        {
            player();             // O(1)
            board[2][0] = marker; // O(1)
            pBoard();             // O(1)
            inputing();           // O(1)
        }
        // 8
        else if (input - 1 == 7)
        {
            player();             // O(1)
            board[2][1] = marker; // O(1)
            pBoard();             // O(1)
            inputing();           // O(1)
        }
        // 9
        else if (input - 1 == 8)
        {
            player();             // O(1)
            board[2][2] = marker; // O(1)
            pBoard();             // O(1)
            inputing();           // O(1)
        }
        else
        {
            std::cout << "Wrong input"
                      << "\n"; // O(1)
            pBoard();          // O(1)
            inputing();        // O(1)
        }
    }
    /*
     * base runtime: O(43) -> O(1) Big O: O(n) -> tight upper bound: O(1/10n) ->
     * loose upperBound: O(100n) Big omega: O(1/2) -> tight lower bound: O(1/220) ->
     * loose lower bound: O(1/2) Big theta:Since this method have a Big omega and
     * Big O then we can say that the average or Big theta is the base runtime:
     * O(1).
     */

public:
    void player()
    {
        if (marker == "X")
        {                 // O(1)
            marker = "O"; // O(1)
        }
        else if (marker == "O")
        {
            marker = "X"; // O(1)
        }
    }
    /*
     * base runtime: O(3) -> O(1) Big O: O(n) -> tight upper bound: O(1/10n) ->
     * loose upperBound: O(100n) Big omega: O(1/2) -> tight lower bound: O(1/220) ->
     * loose lower bound: O(1/2) Big theta:Since this method have a Big omega and
     * Big O then we can say that the average or Big theta is the base runtime:
     * O(1).
     */

public:
    void winCond()
    {
        // row1
        if (board[0][0] == board[0][1] && board[0][0] == board[0][2])
        { // O(1)
            std::cout << "player " << board[0][0] << "  wins!"
                      << "\n"; // O(1)
        }
        // row2
        else if (board[1][0] == board[1][1] && board[1][0] == board[1][2])
        {
            std::cout << "player " << board[1][0] << "  !"
                      << "\n"; // O(1)
        }
        // row3
        else if (board[2][0] == board[2][1] && board[2][0] == board[2][2])
        {
            std::cout << "player " << board[2][0] << "  wins!"
                      << "\n"; // O(1)
        }
        else if (board[0][0] == board[1][1] && board[0][0] == board[2][2])
        {
            std::cout << "player " << board[0][0] << "  wins!"
                      << "\n"; // O(1)
        }
        else
        {
            std::cout << "The game was a draw!"
                      << "\n"; // O(1)
        }
    }
    /*
     * base runtime: O(6) -> O(1) Big O: O(n) -> tight upper bound: O(1/10n) ->
     * loose upperBound: O(100n) Big omega: O(1/2) -> tight lower bound: O(1/220) ->
     * loose lower bound: O(1/2) Big theta:Since this method have a Big omega and
     * Big O then we can say that the average or Big theta is the base runtime:
     * O(1).
     */
};

int main()
{
    game gaming = game();
    gaming.boardConstruction();
    gaming.pBoard();
    gaming.inputing();

    return -1;
}
