package programacion;

public class Tarea1_Persona {
	String nombre;

	String apellidos;

	String dni;

	int edad;

	public Tarea1_Persona() {

	}

	public Tarea1_Persona(String nombre, String apellidos, String dni, int edad) {

		this.nombre = nombre;

		this.apellidos = apellidos;

		this.dni = dni;

		this.edad = edad;

	}

	// set para guardar el valor en el atributo correspondiente

	public void setNombre(String nombre) {

		this.nombre = nombre;

	}

	public String getNombre() {

		return nombre;

	}

	public void setApellidos(String apellidos) {

		this.apellidos = apellidos;

	}

	public String getApellidos() {

		return apellidos;

	}

	public void setDni(String dni) {

		this.dni = dni;

	}

	public String getDni() {

		return dni;

	}

	public void setEdad(int edad) {

		this.edad = edad;

	}

	public int getEdad() {

		return edad;

	}

	public static void main(String[] args) {

		class Profesor extends Tarea1_Persona {

			String asignatura;

			String email;

			public Profesor() {

			}

			public Profesor(String nombre, String apellidos, String dni, int edad, String asignatura, String email) {

				super(nombre, apellidos, dni, edad);

				this.asignatura = asignatura;

				this.email = email;

			}

			public void setAsignatura(String asignatura) {

				this.asignatura = asignatura;

			}

			public String getAsignatura() {

				return asignatura;
			}

			public void setEmail(String email) {

				this.email = email;

			}

			public String getEmail() {

				return email;

			}

			public void mostrarDatos() {

				// Para no repetir código he decidido crear un metodo para mostrar los datos

				System.out.println("Nombre del profesor: " + this.getNombre());

				System.out.println("apellidos del profesor: " + this.getApellidos());

				System.out.println("DNI del profesor: " + this.getDni());

				System.out.println("Edad del profesor: " + this.getEdad());

				System.out.println("Asignatura del profesor: " + this.getAsignatura());

				System.out.println("email del profesor: " + this.getEmail());

				System.out.println("\n---------------------------");

			}

		}

		Profesor profesorAula1 = new Profesor("María del Carmen", "Buenestado Fernández", "12345678A", 42,
				"Programacion", "m_carman@cesur.com");

		profesorAula1.mostrarDatos();

		Profesor profesorAula2 = new Profesor("Robert Cecil", "Martin", "98765432B", 70, "Programacion",
				"robert_c.martin@cesur.com");

		profesorAula2.mostrarDatos();

	}
}
