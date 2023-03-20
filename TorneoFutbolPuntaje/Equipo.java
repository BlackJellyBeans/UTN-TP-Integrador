public class Equipo {
	
		//Atributos
	
        private String nombre;

        private String descripcion;
        
        //Contructor
        
        public Equipo(String nombre, String descripcion) {
            this.nombre = nombre;
            this.descripcion = descripcion;

        //Setters
            
        }
        public String setNombre(String nombre) {
            this.nombre = nombre;
        }
        public String setDescripcion() { 
            return descripcion;
        }
        
        //Getters
        
        public String getNombre() {
            this.nombre;
        }
        public void getDescripcion(String descripcion) {
            this.descripcion = descripcion;
        } 
}