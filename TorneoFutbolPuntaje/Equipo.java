public class Equipo {

        private String nombre;

        private String descripcion;

        public Equipo(String nombre1, String descripcion1) {
            this.nombre = nombre1;
            this.descripcion = descripcion1;

        }
        public String setNombre(String nombre) {
            return this.nombre = nombre;
        }
        public String getNombre() {
            return this.nombre;
        }
        public String getDescripcion() { 
            return descripcion;
    }
        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }

        }