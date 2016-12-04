package models;

import java.util.*;
import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;

// es necesario para que esta clase sea mapeada en la base de datos
@Entity

public class Bio extends Model{

//@Id se usa para definir la llave primaria
	@Id
	public Long id;
	
	//	@Constraints.Required es un campo re querido en la base de datos
	@Constraints.Required
	public String flora;
	
	@Constraints.Required
	public String fauna;

	@Constraints.Required
	public String contaminacionagua;
	
	@Constraints.Required
	public String contaminacionacustica;
	
  	
	@Constraints.Required
	public String recomendacion;
	
	//indica la relacion que hay entre bio y calidad de aire de muchos a uno
	@ManyToOne
   	@Constraints.Required
  	public Calidad calidad;
	
	//indica la relacion que hay entre bio y departamento de muchos a uno
	@ManyToOne
   	@Constraints.Required
  	public Departamento departamento;
  	
  	//indica la relacion que hay entre bio y departamento de muchos a uno
	@ManyToOne
   	@Constraints.Required
  	public Municipio municipio;
  	
  		
//metodo para obtener el calidad del aire apartir del id
  	public Calidad getCalidad(Long id){
  	    return Calidad.find.where().idEq(id).findUnique();
  	}
	
  	//metodo para obtener el departamento apartir del id
  	public Departamento getDepartamento(Long id){
  	    return Departamento.find.where().idEq(id).findUnique();
  	}
  	
  	//metodo para obtener el municipio apartir del id
  	public Municipio getMunicipio(Long id){
  	    return Municipio.find.where().idEq(id).findUnique();
  	}
  	
   public static Finder<Long, Bio> find = new Finder<Long,Bio>(Bio.class);
   
   // el metodo page nos retorna una pagina de bios recibiendo como parametros:
   //page es la pagina a mostrar
   //pageSize numero de bio por pagina que se mostraran
   //SortBy atributo por el cual se ordenara de manera ascendente o desendente
   //filter pais de columna que sera aplicado el filtro
   
       public static PagedList<Bio> page(int page, int pageSize, String sortBy, String order, String filter) {
        return 
            find.where()
                .ilike("flora", "%" + filter + "%")
                .orderBy(sortBy + " " + order)
                .fetch("calidad")
                .fetch("departamento")
                .fetch("municipio")
                .findPagedList(page, pageSize);
    }
 }//fin de la clase