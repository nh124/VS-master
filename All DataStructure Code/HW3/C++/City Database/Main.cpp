#include <iostream>
#include <string>
#include <cmath>

using namespace std;

struct Node
{
    Node *left;
    Node *right;
    string name;
    int x;
    int y;
    bool erase;

public:
    Node(string name, int x, int y)
    {
        this->name = name;
        this->left = NULL;
        this->right = NULL;
        this->x = x;
        this->y = y;
    }
};

class cityDatabase
{
    Node *root;

    /*----------------Adding city to database--------------------------------------------*/
public:
    Node *setElement(Node *node, string name, int x, int y)
    {
        if (node == NULL)
        { // O(1)

            node = new Node(name, x, y); // O(1)
            node->name = name;           // O(1)
            node->left = NULL;           // O(1)
            node->right = NULL;          // O(1)
            node->x = x;                 // O(1)
            node->y = y;                 // O(1)
            node->erase = false;         // O(1)
        }
        if (name < node->name)
        { // O(1)

            node->left = setElement(node->left, name, x, y); // O(n)
        }
        else if (name > node->name)
        { // O(1)

            node->right = setElement(node->right, name, x, y); // O(n)
        }
        else
        {
            if (node->erase == true)
            {                        // O(1)
                node->erase = false; // O(1)
                node->x = x;         // O(1)
                node->y = y;         // O(1)
            }
        }
        return node; // O(1)
    }
    /*
     * O(2n + 14)-> O(n) Big O: O(n) -> tight upper bound: O(5n) -> loose
     * upperBound: O(100n) Big omega: O(log(n)) -> tight lower bound: 25(O(log(x)))
     * -> loose lower bound: O(log(n)) Big theta:Since this method have a Big omega
     * and Big O then we can say that the average or Big theta is the base runtime:
     * O(n).
     */

    /*----------------Search city by coordinate/name--------------------------------------------*/
public:
    Node *searchByCoordinate(Node *node, int x, int y)
    {
        if (node == NULL)
        {                // O(1)
            return NULL; // O(1)
        }
        Node *temp = NULL; // O(1)
        if (node->x == x && node->y == y)
        { // O(1)
            if (node->erase == false)
            {                // O(1)
                temp = node; // O(1)
            }
        }
        if (temp == NULL)
        {                                                // O(1)
            temp = searchByCoordinate(node->left, x, y); // O(n)
        }
        if (node == NULL)
        {                                                 // O(1)
            temp = searchByCoordinate(node->right, x, y); // O(n)
        }
        return temp; // O(1)
    }
    /*
     * O(2n + 9)-> O(n) Big O: O(n) -> tight upper bound: O(5n) -> loose upperBound:
     * O(100n) Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose
     * lower bound: O(log(n)) Big theta:Since this method have a Big omega and Big O
     * then we can say that the average or Big theta is the base runtime: O(n).
     */

public:
    Node *searchByName(Node *node, string name)
    {
        if (node == NULL)
        {                // O(1)
            return NULL; // O(1)
        }
        if (node->name == name)
        { // O(1)
            if (node->erase == false)
            {                // O(1)
                return node; // O(1)
            }
            else
            {
                return searchByName(node->right, name); // O(n)
            }
        }
        if (name < node->name)
        {                                          // O(1)
            return searchByName(node->left, name); // O(n)
        }
        return searchByName(node->right, name); // O(n)
    }
    /*
     * O(3n + 6)-> O(n) Big O: O(n) -> tight upper bound: O(5n) -> loose upperBound:
     * O(100n) Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose
     * lower bound: O(log(n)) Big theta:Since this method have a Big omega and Big O
     * then we can say that the average or Big theta is the base runtime: O(n).
     */

    /*----------------Delete city in the database by name/coordinate--------------------------------------------*/
public:
    void deleteByName(Node *node, string name)
    {                                             // O(1)
        Node *newNode = searchByName(node, name); // O(1)
        if (newNode == NULL)
        { // O(1)
            std::cout << "City not found"
                      << "\n"; // O(1)
        }
        newNode->erase = true; // O(1)
        std::cout << "City " << newNode->name << " at "
                  << "(" << newNode->x << "," << newNode->y << ")"
                  << " Has been deleted"
                  << "\n"; // O(1)
    }
    /*
     * O(1) -> O(1) ig O: O(n) -> tight upper bound: O(1/10n) -> loose upperBound:
     * O(100n) Big omega: O(1/2) -> tight lower bound: O(1/220) -> loose lower
     * bound: O(1/2) Big theta:Since this method have a Big omega and Big O then we
     * can say that the average or Big theta is the base runtime: O(1).
     */

public:
    void deleteByCoordinate(Node *node, int x, int y)
    {
        Node *newNode = searchByCoordinate(node, x, y); // O(1)
        if (newNode == NULL)
        { // O(1)
            std::cout << "City not found"
                      << "\n"; // O(1)
        }
        newNode->erase = true; // O(1)
        std::cout << "City " << newNode->name << " at "
                  << "(" << newNode->x << "," << newNode->y << ")"
                  << " Has been deleted"
                  << "\n"; // O(1)
    }
    /*
     * O(6) -> O(1) ig O: O(n) -> tight upper bound: O(1/10n) -> loose upperBound:
     * O(100n) Big omega: O(1/2) -> tight lower bound: O(1/220) -> loose lower
     * bound: O(1/2) Big theta:Since this method have a Big omega and Big O then we
     * can say that the average or Big theta is the base runtime: O(1).
     */

    /*----------------Print city to database within distance--------------------------------------------*/
public:
    void inOrder(Node *node, int x, int y, double z)
    {
        if (node == NULL)
        {           // O(1)
            return; // O(1)
        }
        inOrder(node->left, x, y, z); // O(n)
        if (node->erase == false)
        {                                                                                      // O(1)
            double distance = sqrt(pow((double)node->x - x, 2) + pow((double)node->y - y, 2)); // O(1)
            if (distance < z)
            { // O(1)
                std::cout << node->name << " is at "
                          << "(" << node->x << "," << node->y << ")"
                          << "\n"; // O(1)
            }
        }
        inOrder(node->right, x, y, z); // O(n)
    }
    /*
     * O(2n + 6)-> O(n) Big O: O(n) -> tight upper bound: O(5n) -> loose upperBound:
     * O(100n) Big omega: O(log(n)) -> tight lower bound: 25(O(log(x))) -> loose
     * lower bound: O(log(n)) Big theta:Since this method have a Big omega and Big O
     * then we can say that the average or Big theta is the base runtime: O(n).
     */
};

int main()
{

    cityDatabase city = cityDatabase();
    Node *root = new Node("New York", 3, 1);
    city.setElement(root, "Savannah", 2, 4);
    city.setElement(root, "Augusta", 8, 10);
    city.setElement(root, "Macon", 12, 6);
    city.setElement(root, "Valdosta", 18, 10);
    city.setElement(root, "Atlanta", 1, 10);
    city.setElement(root, "Athens", 9, 1);

    std::cout << "All cities within 9.0"
              << "\n";
    city.inOrder(root, 1, 4, 9.0);

    // System.out.println(city.searchByCoordinate(root, 2,4));
    // System.out.println(city.searchByName(root, "Macon"));

    // System.out.println(city.deleteByCoordinate(root,2,4));
    city.deleteByName(root, "Athens");
    city.inOrder(root, 1, 4, 9.0);

    return -1;
}
