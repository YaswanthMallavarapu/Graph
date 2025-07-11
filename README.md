<h1>Graph Traversal Techniques (DFS & BFS)</h1>

<h2>What is a Graph?</h2>
<p>A graph is a non-linear data structure consisting of nodes (vertices) and edges that connect pairs of nodes.</p>
<ul>
    <li>Can be directed or undirected</li>
    <li>Can be cyclic or acyclic</li>
    <li>Can be weighted or unweighted</li>
</ul>

<img src="https://upload.wikimedia.org/wikipedia/commons/thumb/5/5b/Undirected.svg/400px-Undirected.svg.png" alt="Graph Example">

<h2>Graph Traversal Techniques</h2>

<h3>1. Depth-First Search (DFS)</h3>
<p>Traverses as far as possible along each branch before backtracking</p>
<pre>
Example:
Input Graph (Adjacency List):
0 → [1, 2]
1 → [0, 3]
2 → [0, 4]
3 → [1]
4 → [2]

DFS Starting at 0:
[0, 1, 3, 2, 4]

</pre>

<h3>2. Breadth-First Search (BFS)</h3>
<p>Traverses all neighbors at the present depth before moving deeper</p>
<pre>
Example:
Input Graph (Adjacency List):
0 → [1, 2]
1 → [0, 3]
2 → [0, 4]
3 → [1]
4 → [2]

BFS Starting at 0:
[0, 1, 2, 3, 4]

</pre>
