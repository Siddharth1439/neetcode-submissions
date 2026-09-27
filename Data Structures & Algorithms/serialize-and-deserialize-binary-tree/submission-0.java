public class Codec {

    public String serialize(TreeNode root) {

        if (root == null) {
            return "";
        }

        Queue<TreeNode> q = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        q.offer(root);

        while (!q.isEmpty()) {

            TreeNode temp = q.poll();

            if (temp == null) {
                sb.append("null,");
                continue;
            }

            sb.append(temp.val).append(",");

            q.offer(temp.left);
            q.offer(temp.right);
        }

        return sb.toString();
    }

    public TreeNode deserialize(String data) {

        if (data == null || data.length() == 0) {
            return null;
        }

        String[] values = data.split(",");

        TreeNode root =
            new TreeNode(Integer.parseInt(values[0]));

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        int i = 1;

        while (!q.isEmpty()) {

            TreeNode temp = q.poll();

            if (!values[i].equals("null")) {
                temp.left =
                    new TreeNode(Integer.parseInt(values[i]));
                q.offer(temp.left);
            }
            i++;

            if (!values[i].equals("null")) {
                temp.right =
                    new TreeNode(Integer.parseInt(values[i]));
                q.offer(temp.right);
            }
            i++;
        }

        return root;
    }
}