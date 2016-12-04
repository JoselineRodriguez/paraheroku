package controllers;

import play.mvc.*;
import play.data.*;
import static play.data.Form.*;

import views.html.*;

import models.*;

/**
 * administrar base de datos de bios
 */
public class Application extends Controller {
    
    /**
     * Este resultado directamente redirigir a la aplicación de origen.
     */
    public Result GO_HOME = redirect(
        routes.Application.list(0, "flora", "asc", "")
    );
    
    /**
     * Gestionar solicitudes de ruta predeterminadas, redirigir a la lista de bios
     */
    public Result index() {
        return GO_HOME;
    }


    public Result list(int page, String sortBy, String order, String filter) {
        return ok(
            list.render(
                Bio.page(page, 5, sortBy, order, filter),
                sortBy, order, filter
            )
        );
    }
    

    public Result edit(Long id) {
        Form<Bio> bioForm = form(Bio.class).fill(
            Bio.find.byId(id)
        );
        return ok(
            editForm.render(id, bioForm)
        );
    }
    

    public Result update(Long id) {
        Form<Bio> bioForm = form(Bio.class).bindFromRequest();
        if(bioForm.hasErrors()) {
            return badRequest(editForm.render(id, bioForm));
        }
        Bio bio = bioForm.get();
        bio.id = id;
        bio.update();
        flash("success", "Biodivesidad " + bio.flora + " Ha sido actualizado");
        return GO_HOME;
    }


    public Result create() {
        Form<Bio> bioForm = form(Bio.class);
        return ok(
            createForm.render(bioForm)
        );
    }

    public Result save() {
        Form<Bio> bioForm = form(Bio.class).bindFromRequest();
        if(bioForm.hasErrors()) {
            return badRequest(createForm.render(bioForm));
        }
        bioForm.get().save();
        flash("success", "Biodiversidad " + bioForm.get().flora + " Ha sido creado");
        return GO_HOME;
    }

   
    public Result delete(Long id) {
        Bio.find.ref(id).delete();
        flash("success", "Se ha eliminado la Biodiversidad");
        return GO_HOME;
    }
}//fin clase
