package ges.portal.samples.user;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.FontAwesome;
import com.vaadin.shared.Version;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.CustomLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.TextField;
import com.vaadin.ui.*;

import ges.portal.samples.authentication.CurrentUser;

public class UserView extends VerticalLayout implements View {

	public static final String VIEW_NAME = "Ihre Daten";

	public UserView() {

		FormLayout userForm = new FormLayout();
		userForm.addStyleName("outlined");
		userForm.setSizeFull();
		userForm.setMargin(true);
		userForm.setSpacing(true);

		Label title = new Label("Benutzereinstellungen");
		userForm.addComponent(title);

		TextField tfUser = new TextField("Benutzername", CurrentUser.get());
		tfUser.setIcon(FontAwesome.USER);
		tfUser.setRequired(true);
		userForm.addComponent(tfUser);

		TextField tfMail = new TextField("E-Mail");
		tfMail.setIcon(FontAwesome.ENVELOPE);
		tfMail.setRequired(true);
		userForm.addComponent(tfMail);

		TextField tfPassword = new TextField("Passwort");
		tfPassword.setIcon(FontAwesome.KEY);
		tfPassword.setRequired(true);
		userForm.addComponent(tfPassword);

		addComponent(userForm);
	}

	@Override
	public void enter(ViewChangeEvent event) {
	}

}
