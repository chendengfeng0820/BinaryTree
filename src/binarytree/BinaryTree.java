package binarytree;

/**
 * @author: cdf
 * @create: 2020-03-17 15:25
 * 二叉树
 **/
class Main{
    public static void main(String[] args) {
        BinaryTree binaryTree=new BinaryTree();
        HeroNode root  = new HeroNode(1,"唐僧");
        HeroNode node1 = new HeroNode(2,"孙悟空");
        HeroNode node2 = new HeroNode(3,"猪八戒");
        HeroNode node3 = new HeroNode(4,"沙和尚");
        HeroNode node4 = new HeroNode(5,"白龙马");

        root.setLeft(node1);
        root.setRight(node2);
        node1.setLeft(node3);
        node1.setRight(node4);

        binaryTree.setRoot(root);
        System.out.println("========前序查找========");
        System.out.println(binaryTree.preSearch(3));

        System.out.println("========中序查找========");
        System.out.println(binaryTree.preSearch(5));


//        System.out.println("========前序遍历========");
//        binaryTree.preOrder();
//
//
//        System.out.println("========中序遍历========");
//        binaryTree.midOrder();
//
//
//        System.out.println("========后序遍历========");
//        binaryTree.lastOrder();

    }
}
class BinaryTree {
    private HeroNode root;

    public void setRoot(HeroNode root) {
        this.root = root;
    }


    //前序查找
    public HeroNode preSearch(int id){
        if(this.root!=null){
            return root.preSearch(id);
        }else {
            return null;
        }
    }

    //中序查找
    public HeroNode midSearch(int id){
        if(this.root!=null){
            return root.midSearch(id);
        }else {
            return null;
        }
    }

    //前序遍历调用
    public void preOrder(){
        if(root!=null){
            this.root.preOrder();
        }else {
            System.out.println("二叉树为空");
        }
    }

    //中序遍历调用
    public void midOrder(){
        if (root!=null){
            this.root.midOrder();
        }else {
            System.out.println("二叉树为空");
        }
    }

    //后序遍历调用
    public void lastOrder(){
        if(root!=null){
            this.root.lastOrder();
        }else {
            System.out.println("二叉树为空");
        }
    }
    }


//定义二叉树节点
class HeroNode{
    private int id;
    private String name;
    private HeroNode left;
    private HeroNode right;

    //前序查找
    public HeroNode preSearch(int id) {
        HeroNode resNode = null;
        if (this.id == id) {
            return this;
        }
        if (this.left != null) {
            resNode = this.left.preSearch(id);
        }
        if (resNode != null) {
            return resNode;
        }
        if (this.right != null) {
            resNode = this.right.preSearch(id);
        }
        return resNode;
    }

    //中序查找
    public HeroNode midSearch(int id){
        HeroNode resNode=null;
        if(this.left!=null){
            resNode=this.left.midSearch(id);
        }
        if(resNode!=null){
            return resNode;
        }
        if(this.id==id){
            return this;
        }
        if(this.right!=null){
            resNode=this.right.midSearch(id);
        }
        return resNode;
    }

    //前序遍历
    public void preOrder(){
        System.out.println(this);
        if(this.left!=null){
            this.left.preOrder();
        }
        if(this.right!=null){
            this.right.preOrder();
        }
    }

    //中序遍历
    public void midOrder(){
        if(this.left!=null){
            this.left.midOrder();
        }
        System.out.println(this);
        if (this.right!=null){
            this.right.midOrder();
        }
    }

    //后序遍历
    public void lastOrder(){
        if (this.left!=null){
            this.left.lastOrder();
        }
        if (this.right!=null){
            this.right.lastOrder();
        }
        System.out.println(this);
    }

    public HeroNode(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HeroNode getLeft() {
        return left;
    }

    public void setLeft(HeroNode left) {
        this.left = left;
    }

    public HeroNode getRight() {
        return right;
    }

    public void setRight(HeroNode right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
