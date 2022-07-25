# Prims Algorithm

## Given a graph which consists of several edges connecting its nodes, find a subgraph of the given graph with the following properties:

- The subgraph contains all the nodes present in the original graph.
- The subgraph is of minimum overall weight (sum of all edges) among all such subgraphs.
- It is also required that there is exactly one, exclusive path between any two nodes of the subgraph.


## Input Format

The first line has two space-separated integers *n* and *m*, the number of nodes and edges in the graph.

Each of the next *m* lines contains three space-separated integers *x*, *y* and *r*, the end nodes of *edges*, and the edge's weight.
The last line has an integer *start*, denoting the starting node.


## Constraints

2 <= n <= 3000

1 <= m <= ( n * (n-1) ) / 2

1 <= x,y,start <= n

0 <= r <= 1000



## Sample Input

5 6

1 2 3

1 3 4

4 2 6

5 2 2

2 3 5

3 5 7

1


## Sample Output

15
