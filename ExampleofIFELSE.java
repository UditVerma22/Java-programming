class ExampleofIFELSE {
    public static void main(String args[]) {
        int a = 20;
        if (a > 10) 
            // Agar if(a>10); ke aage semicolon aayega to same error
            System.out.println("Greater");
            System.out.println("Indore");

            // Error -> else -> else without if
            System.out.println("Smaller");
            System.out.println("Bhopal");
        
    }

}
