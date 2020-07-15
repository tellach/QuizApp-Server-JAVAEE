package encodage;

import com.sun.faces.application.view.MultiViewHandler;
import java.io.IOException;
import javax.faces.component.UIViewRoot;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;


public class LoginViewHandler extends MultiViewHandler {


    @Override
    public UIViewRoot restoreView(FacesContext facesContext, String viewId) {
        /**
         * {@link javax.faces.application.ViewExpiredException}. This happens
         * only when we try to logout from timed out pages.
         */
        UIViewRoot root = null;
        root = super.restoreView(facesContext, viewId);
        if (root == null) {
            root = createView(facesContext, "");
            //facesContext.renderResponse();
            FacesContext context = FacesContext.getCurrentInstance();
            ExternalContext e = context.getExternalContext();
            String navigateTo = e.getRequestContextPath();
            try {
                e.redirect(e.encodeResourceURL(e.getRequestContextPath()));//+ "/login.xhtml"
            } catch (IOException ex) {
                ex.printStackTrace();
                //Logger.getLogger(LoginViewHandler.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return root;
    }
}
