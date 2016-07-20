package com.epam.ui.view;

public class UrlConstants {
	public static final String LIST_CLIENTS = "/listClients";

	public static final String SHOW_CLIENT = "/showClient";

	public static final String NEW_CLIENT = "/newClient";

	public static final String NEW_CLIENT_POST = "/newClientPost";

	public static final String SHOW_PICTURE = "/showPicture";

	public static final String LOGIN = "/login";

	public static String showClient(long clientId) {
		return SHOW_CLIENT + "?id=" + clientId;
	}

	public static String showPicture(long clientId) {
		return SHOW_PICTURE + "?id=" + clientId;
	}
}