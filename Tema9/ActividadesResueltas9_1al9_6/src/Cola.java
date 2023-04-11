interface Cola {
    void encolar(Integer o);//metodo abstracto.
    Integer desencolar();//metodo abstracto.

    //implemento la Actividad Resuelta 9.6:
    default void encolarMultiple(Integer nuevo, int repeticiones){
      for (int i = 0; i < repeticiones; i++) {
        encolar(nuevo);//a implementar en la clase.
      }

    }
    
}

