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

import ges.portal.samples.authentication.CurrentUser;

public class UserView extends VerticalLayout implements View {

	public static final String VIEW_NAME = "Benutzer";

	public UserView() {

		setSizeFull();
		setStyleName("about-view");
		addComponent(new TextField("Benutzer", CurrentUser.get()));
	}

	@Override
	public void enter(ViewChangeEvent event) {
	}

}
