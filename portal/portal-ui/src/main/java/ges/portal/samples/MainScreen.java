package ges.portal.samples;

import ges.portal.MyUI;
import ges.portal.samples.about.AboutView;
import ges.portal.samples.crud.SampleCrudView;
import ges.portal.samples.user.*;

import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.server.FontAwesome;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.HorizontalLayout;

/**
 * Content of the UI when the user is logged in.
 * 
 * 
 */
public class MainScreen extends HorizontalLayout {
	private Menu menu;

	public MainScreen(MyUI ui) {

		setStyleName("main-screen");

		CssLayout viewContainer = new CssLayout();
		viewContainer.addStyleName("valo-content");
		viewContainer.setSizeFull();

		final Navigator navigator = new Navigator(ui, viewContainer);
		navigator.setErrorView(ErrorView.class);
		menu = new Menu(navigator);
		menu.addView(new SampleCrudView(), SampleCrudView.VIEW_NAME, SampleCrudView.VIEW_NAME, FontAwesome.FILE_TEXT);
		menu.addView(new UserView(), UserView.VIEW_NAME, UserView.VIEW_NAME, FontAwesome.USER);
		menu.addView(new AboutView(), AboutView.VIEW_NAME, AboutView.VIEW_NAME, FontAwesome.INFO_CIRCLE);

		navigator.addViewChangeListener(viewChangeListener);

		addComponent(menu);
		addComponent(viewContainer);
		setExpandRatio(viewContainer, 1);
		setSizeFull();
	}

	// notify the view menu about view changes so that it can display which view
	// is currently active
	ViewChangeListener viewChangeListener = new ViewChangeListener() {

		@Override
		public boolean beforeViewChange(ViewChangeEvent event) {
			return true;
		}

		@Override
		public void afterViewChange(ViewChangeEvent event) {
			menu.setActiveView(event.getViewName());
		}

	};
}
