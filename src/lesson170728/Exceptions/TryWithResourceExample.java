package lesson170728.Exceptions;

public class TryWithResourceExample {

    static class Resource implements AutoCloseable{
        public void close(){}

        public void use() {
        }
    }
    public static void main(String[] args) {
        Resource resource = new Resource();
//        try{
//            resource.use();
//        }finally{
//            resource.close();
//        }
        try(Resource r2 = new Resource()){
            resource.close();
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
