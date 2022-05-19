class KruskalPath:
    parent, rank = dict(), dict()

    def find(self, node):
        # path compression 기법
        if self.parent.get(node) != node:
            self.parent[node] = self.find(self.parent.get(node))
        return self.parent.get(node)

    def union(self, node_v, node_u):
        root1 = self.find(node_v)
        root2 = self.find(node_u)

        # union-by-rand 기법
        if self.rank.get(root1) > self.rank.get(root2):
            self.parent[root2] = root1
        else:
            self.parent[root1] = root2
            if self.rank.get(root1) == self.rank.get(root2):
                self.rank[root2] += 1

    def make_set(self, node):
        self.parent[node] = node
        self.rank[node] = 0

    def kruskal_func(self, vertices, edges):
        mst = list()

        # 1. 초기화
        for i in range(len(vertices)):
            self.make_set(vertices[i])

        # 2. 간선 weight 기반 정렬
        edges.sort(key=lambda x: x.weight)

        for i in range(len(edges)):
            current_edge = edges[i]
            if self.find(current_edge.node_v) != self.find(current_edge.node_u):
                self.union(current_edge.node_v, current_edge.node_u)
                mst.append(current_edge)

        return mst


class Edge:
    def __init__(self, weight, node_v, node_u):
        self.weight = weight
        self.node_v = node_v
        self.node_u = node_u

    def __repr__(self):
        return f"({self.weight}, {self.node_v}, {self.node_u})"


if __name__ == '__main__':
    edges = [
        Edge(7, 'A', 'B'),
        Edge(5, 'A', 'D'),
        Edge(7, 'B', 'A'),
        Edge(8, 'B', 'C'),
        Edge(9, 'B', 'D'),
        Edge(7, 'B', 'E'),
        Edge(8, 'C', 'B'),
        Edge(5, 'C', 'E'),
        Edge(5, 'D', 'A'),
        Edge(9, 'D', 'B'),
        Edge(7, 'D', 'E'),
        Edge(6, 'D', 'F'),
        Edge(7, 'E', 'B'),
        Edge(5, 'E', 'C'),
        Edge(7, 'E', 'D'),
        Edge(8, 'E', 'F'),
        Edge(9, 'E', 'G'),
        Edge(6, 'F', 'D'),
        Edge(8, 'F', 'E'),
        Edge(11, 'F', 'G'),
        Edge(11, 'G', 'F'),
        Edge(9, 'G', 'E')
    ]
    vertices = ['A', 'B', 'C', 'D', 'E', 'F', 'G']

    k_object = KruskalPath()
    result = k_object.kruskal_func(vertices, edges)
    print(result)
