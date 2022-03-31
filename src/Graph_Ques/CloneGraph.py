def cloneGraph(node):
    oldToNew = {}
    if node == None:
        return None

    def dfs(node):
        if node in oldToNew:
            return oldToNew[node]

        copy = Node(node.val)
        oldToNew[node] = copy
        for neighbor in node.neighbors:
            copy.neighbors.append(dfs(neighbor))
        return copy

    return dfs(node)
