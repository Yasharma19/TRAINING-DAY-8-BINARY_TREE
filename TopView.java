/* 
    
    class Node 
        int data;
        Node left;
        Node right;
    */
static class Info {
            Node node;
            int hd;

            public Info(Node node, int hd) {
                this.node = node;
                this.hd = hd;
            }
        }
    public static void topView(Node root) {
      
        Queue<Info> q = new LinkedList<>();
            HashMap<Integer, Node> h = new HashMap<>();
            int min = 0, max = 0;
            q.add(new Info(root, 0));
            q.add(null);

            while (!q.isEmpty()) {
                Info curr = q.remove();
                if (curr == null) {
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                }
                else{
                    if (!h.containsKey(curr.hd)) {
                        h.put(curr.hd, curr.node);
                    }
                    if (curr.node.left!=null) {
                        q.add(new Info(curr.node.left, curr.hd-1));
                        min = Math.min(min, curr.hd-1);
                    }
                    if (curr.node.right!=null) {
                        q.add(new Info(curr.node.right, curr.hd+1));
                        max = Math.max(max, curr.hd+1);
                    }
                }
            }
            for (int i = min; i < max+1; i++) {
                System.out.print(h.get(i).data+" ");
            }
            System.out.println();
      
    }