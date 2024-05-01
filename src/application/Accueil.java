package application;
	
import java.io.InputStream;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;


public class Accueil extends Application {
	@Override
	public void start(Stage primaryStage) {
		ScrollPane sp = new ScrollPane() {public void requestFocus() {}}; //permet de scroller, défiler la page
		VBox boxAccueil = new VBox(20); //VBOX qui va contenir tous les composants de la page d'accueil
		
		//HBox qui représente le header de la page 
		HBox hboxHeader = new HBox();
		hboxHeader.setStyle("-fx-background-color: green;");
		
		//Logo de l'interface 
		Class <?> clazz = this.getClass();
		InputStream input = clazz.getResourceAsStream("/images/logo.png");
		Image image = new Image(input);
		//Composant graphique qui représente l'image du logo
		ImageView imageView = new ImageView(image);
		imageView.setFitWidth(80); // Largeur souhaitée
		imageView.setFitHeight(80); // Hauteur souhaitée		
		StackPane logo = new StackPane();
		HBox.setMargin(imageView, new Insets(20));
		logo.getChildren().add(imageView);
		
		//Création du bouton d'accueil
		Button btnAccueil = new Button("Accueil");
		btnAccueil.setFont(Font.font(16));
		btnAccueil.setTextFill(Color.WHITE);
		btnAccueil.setStyle("-fx-background-color: green;");
			
		HBox.setMargin(btnAccueil, new Insets(20)); //espace situé autour de la bordure
		btnAccueil.setPadding(new Insets(10)); 
		
		//Quand la souris passe au dessus du bouton, le texte devient vert clair pour indiquer que l'on se trouve dans cette catégorie
		EventHandler<MouseEvent> lienAccueil = new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				btnAccueil.setFont(Font.font("Arial", 16));
				btnAccueil.setTextFill(Color.LIGHTGREEN);
				btnAccueil.setStyle("-fx-background-color: green;");
						
			}};
		btnAccueil.addEventHandler(MouseEvent.MOUSE_ENTERED, lienAccueil);
		
		//Quand la souris sort de la zone du bouton, le texte revient à son état normal c'est à dire en blanc
		EventHandler<MouseEvent> lienAccueil2 = new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				btnAccueil.setFont(Font.font("Arial", 16));
				btnAccueil.setTextFill(Color.WHITE);
				btnAccueil.setStyle("-fx-background-color: green;");
	
						
			}};
		btnAccueil.addEventHandler(MouseEvent.MOUSE_EXITED, lienAccueil2);
	
		
		
		//Création du bouton Calendrier
		Button btnCalendrier = new Button("Calendrier 2023");
		btnCalendrier.setFont(Font.font(16));
		btnCalendrier.setTextFill(Color.WHITE);
		btnCalendrier.setStyle("-fx-background-color: green;");
		HBox.setMargin(btnCalendrier, new Insets(20));
		btnCalendrier.setPadding(new Insets(10));
		
		EventHandler<MouseEvent> lienCal = new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				btnCalendrier.setFont(Font.font("Arial", 16));
				btnCalendrier.setTextFill(Color.LIGHTGREEN);
				btnCalendrier.setStyle("-fx-background-color: green;");
						
			}};
		btnCalendrier.addEventHandler(MouseEvent.MOUSE_ENTERED, lienCal);
		
		EventHandler<MouseEvent> lienCal2 = new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				btnCalendrier.setFont(Font.font("Arial", 16));
				btnCalendrier.setTextFill(Color.WHITE);
				btnCalendrier.setStyle("-fx-background-color: green;");
						
			}};
		btnCalendrier.addEventHandler(MouseEvent.MOUSE_EXITED, lienCal2);
		
		
		//Création d'un menu Actualités
        MenuButton actualites = new MenuButton("Actualités"); 
  
        // Création des items du menu représentant les différentes pages
        MenuItem m1 = new MenuItem("Sorties 2023"); 
        MenuItem m2 = new MenuItem("Parking 2023");
        MenuItem m3 = new MenuItem("Soirées VEM"); 
        MenuItem m4 = new MenuItem("Maison de retraite Les Maraîchers"); 
        MenuItem m5 = new MenuItem("Articles");
  
        // Ajout des items au menu 
        actualites.getItems().addAll(m1, m2, m3, m4, m5);
        actualites.setFont(Font.font(16));
        actualites.setStyle("-fx-background-color: green;");
        actualites.setTextFill(Color.WHITE);
   		
		HBox.setMargin(actualites, new Insets(20));
		actualites.setPadding(new Insets(10));
		
		//Quand la souris passe au dessus du bouton, le texte devient vert clair pour indiquer que l'on se trouve dans cette catégorie
		EventHandler<MouseEvent> lienActualites = new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				actualites.setFont(Font.font("Arial", 16));
				actualites.setTextFill(Color.LIGHTGREEN);
				actualites.setStyle("-fx-background-color: green;");
								
			}};
			actualites.addEventHandler(MouseEvent.MOUSE_ENTERED, lienActualites);
				
		//Quand la souris sort de la zone du bouton, le texte revient à son état normal c'est à dire en blanc
		EventHandler<MouseEvent> lienActualites2 = new EventHandler<MouseEvent>() {
		@Override
		public void handle(MouseEvent event) {
			actualites.setFont(Font.font("Arial", 16));
			actualites.setTextFill(Color.WHITE);
			actualites.setStyle("-fx-background-color: green;");
			
								
		}};
		actualites.addEventHandler(MouseEvent.MOUSE_EXITED, lienActualites2);
		
		//Création d'un menu Archives 
        MenuButton archives = new MenuButton("Archives"); 
  
        // Création des items du menu représentant les différentes pages 
        MenuItem menuItem1= new MenuItem("2022"); 
        MenuItem menuItem2 = new MenuItem("2021"); 
        MenuItem menuItem3 = new MenuItem("2020"); 
  
        // Ajout des items au menu  
        archives.getItems().addAll(menuItem1, menuItem2, menuItem3); 
        archives.setFont(Font.font(16)); 
        archives.setStyle("-fx-background-color: green;");
        archives.setTextFill(Color.WHITE);
   		
		HBox.setMargin(archives, new Insets(20));
		archives.setPadding(new Insets(10));
		
		//Quand la souris passe au dessus du bouton, le texte devient vert clair pour indiquer que l'on se trouve dans cette catégorie
		EventHandler<MouseEvent> lienArchives = new EventHandler<MouseEvent>() {
		@Override
		public void handle(MouseEvent event) {
			archives.setFont(Font.font("Arial", 16));
			archives.setTextFill(Color.LIGHTGREEN);
			archives.setStyle("-fx-background-color: green;");
										
		}};
		archives.addEventHandler(MouseEvent.MOUSE_ENTERED, lienArchives);
						
		//Quand la souris sort de la zone du bouton, le texte revient à son état normal c'est à dire en blanc
		EventHandler<MouseEvent> lienArchives2 = new EventHandler<MouseEvent>() {
		@Override
		public void handle(MouseEvent event) {
			archives.setFont(Font.font("Arial", 16));
			archives.setTextFill(Color.WHITE);
			archives.setStyle("-fx-background-color: green;");
					
										
		}};
		archives.addEventHandler(MouseEvent.MOUSE_EXITED, lienArchives2);
		
		hboxHeader.getChildren().addAll(logo,btnAccueil, btnCalendrier, actualites,archives);
		
		//Image de la page d'accueil 
		Class <?> clazz2 = this.getClass();
		InputStream input2 = clazz2.getResourceAsStream("/images/imageAccueil.jpeg");
		Image image2 = new Image(input2);
		
		ImageView imageView2 = new ImageView(image2);
		imageView2.setFitHeight(primaryStage.getHeight()); // Largeur souhaitée
		imageView2.setFitHeight(350); // Hauteur souhaitée
		imageView2.setPreserveRatio(true);//permet à l'image de conserver son rapport hauteur/largeur d'origine lorsqu'elle est redimensionnée
		HBox imageAccueil = new HBox();
		
		imageAccueil.getChildren().add(imageView2);//ajout de l'image d'accueil à une hbox
		
		//HBox contenant le texte des informations importantes
		HBox hboxText = new HBox(100);
		Label label1 = new Label("Depuis 1980");
		label1.setFont(Font.font("Arial", 20)); //choix de la police et de la taille
		label1.setStyle("-fx-font-weight: bold;"); //texte en gras
		HBox.setMargin(label1, new Insets(20));
		label1.setPadding(new Insets(5));

		Label label2 = new Label("70 collectionneurs");
		label2.setFont(Font.font("Arial", 20));
		label2.setStyle("-fx-font-weight: bold;");
		HBox.setMargin(label2, new Insets(20));
		label2.setPadding(new Insets(5));
		
		Label label3 = new Label("1989 et antérieurs");
		label3.setFont(Font.font("Arial", 20));
		label3.setStyle("-fx-font-weight: bold;");
		HBox.setMargin(label3, new Insets(20));
		label3.setPadding(new Insets(5));
		
		
		Label label4 = new Label("Tous les premiers dimanches du mois");
		label4.setFont(Font.font("Arial", 20));
		label4.setStyle("-fx-font-weight: bold;");
		HBox.setMargin(label4, new Insets(20));
		label4.setPadding(new Insets(5));	
		hboxText.getChildren().addAll(label1, label2,label3, label4);
		
		//HBox qui va arranger l'image du président et le texte de facon horizontale
		HBox hboxPresident = new HBox();
		Class <?> clazz3 = this.getClass();
		InputStream input3 = clazz3.getResourceAsStream("/images/president.jpg"); //image du président
		Image image3 = new Image(input3);
		//ImageView est un composant graphique qui représente l'image du président
		ImageView imageView3 = new ImageView(image3);
		imageView3.setFitHeight(500); // Largeur souhaitée
		imageView3.setFitHeight(300); // Hauteur souhaitée
		imageView3.setPreserveRatio(true); //permet à l'image de conserver son rapport hauteur/largeur d'origine lorsqu'elle est redimensionnée
		HBox.setMargin(imageView3, new Insets(45));
		Label textPresident = new Label("Créé en 1980 par M. Marcel Bigot, le V.E.M. (Véhicules d’Époque du Maine) \nest une association qui regroupe 70 passionnés de véhicules de collection antérieurs à 1989. Le club est multimarque."
				+ " \nLe VEM organise chaque premier dimanche du mois le rassemblement des passionnés de voitures, motos anciennes\net de prestige sur le parking du Leclerc"
				+ "des Fontenelles au Mans. Le VEM compte 70 collectionneurs qui entretiennent,\nfont vivre et transmettent le patrimoine automobile."
				+ " Passion, partage, convivialité, bonne humeur sont les maîtres mots\ndu VEM. Ses adhérents se retrouvent régulièrement pour partager d’agréables moments, immortalisés par les photos\nvisibles sur ce site. Vous découvrirez le calendrier des sorties et animations du club en naviguant sur ce site et si l’envie\nde nous rejoindre vous tente, le bulletin d’inscription s’y trouve également.\n"
				+ "Je vous souhaite la bienvenue et une agréable navigation sur notre site.");
		textPresident.setFont(Font.font("Arial", 18));
		textPresident.setAlignment(Pos.CENTER);
		
		HBox.setMargin(textPresident, new Insets(45));
		hboxPresident.getChildren().addAll(imageView3,textPresident);
		
		//Création d'une VBox qui va contenir du texte et le lien du bulletin d'adhésion
		VBox vbox = new VBox();
		//Texte 
		Label labelJoin = new Label("Nous rejoindre");
		labelJoin.setFont(Font.font("Arial", 40));
		labelJoin.setAlignment(Pos.CENTER);
		
		//Lien pour accéder au bulletin d'adhésion 
		Hyperlink link = new Hyperlink("Bulletin d'adhésion");
		link.setTextFill(Color.GREEN);
		link.setFont(Font.font("Arial", 18));
		link.setAlignment(Pos.CENTER);
		
		//Quand la souris va être cliquée on va être redirigé vers le bulletin d'adhésion
		EventHandler<MouseEvent> lien = new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				getHostServices().showDocument("http://clubvem.fr/wp-content/uploads/2023/03/Bulletin_Adhesion.pdf");
			
		}};
		link.addEventHandler(MouseEvent.MOUSE_CLICKED, lien);
		
		//Quand la souris va passer au dessus du lien, il va devenir gras
		EventHandler<MouseEvent> lien2 = new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				link.setFont(Font.font("Arial", 18));
				link.setStyle("-fx-font-weight: bold;");
			
		}};
		link.addEventHandler(MouseEvent.MOUSE_ENTERED, lien2);
		
		//Quand la souris va passer au dessus du lien, il va devenir gras
		EventHandler<MouseEvent> lien3 = new EventHandler<MouseEvent>() {
		@Override
		public void handle(MouseEvent event) {
			link.setFont(Font.font("Arial", 18));
			link.setStyle("-fx-font-weight: normal;");
					
		}};
		link.addEventHandler(MouseEvent.MOUSE_EXITED, lien3);
		
				
		vbox.setAlignment(Pos.CENTER);
		vbox.getChildren().addAll(labelJoin, link);
		
		//StackPane qui va placer le texte au dessus du rectangle gris
		StackPane stackJoin = new StackPane();
		
		Rectangle rect = new Rectangle(1200, 200);
		rect.setFill(Color.LIGHTGRAY); //couleur de remplissage
		rect.setStroke(Color.BLACK);//couleur de la bordure
		
		stackJoin.getChildren().addAll(rect,vbox);
		
		//HBox qui représente le footer de la page 
		HBox hboxFooter = new HBox(40);
		hboxFooter.setStyle("-fx-background-color: lightgrey;");
		hboxFooter.setMinHeight(200);
		HBox hboxLogo = new HBox();
		
		//Logo de l'interface 
		Class <?> clazz4 = this.getClass();
		InputStream input4 = clazz4.getResourceAsStream("/images/logofooter.png");
		Image image4 = new Image(input4);
		//Composant graphique qui représente l'image du logo du footer
		ImageView imageView4 = new ImageView(image4);
		imageView4.setFitWidth(100); // Largeur souhaitée
		imageView4.setFitHeight(100); // Hauteur souhaitée		
		StackPane logo2 = new StackPane();
		logo2.getChildren().add(imageView4);
		HBox.setMargin(imageView4, new Insets(40));
		//logo2.setPadding(new Insets(40));
		
		Label labelfooter = new Label("Véhicules d'Epoque du Maine (V.E.M.) est une association régie par la loi de 1901\r\n"
				+ "Le V.E.M. est affilié à la  FFVE (Fédération Française des Véhicules d'Epoque), sous le n° 151");
		
		HBox.setMargin(labelfooter, new Insets(40));
		labelfooter.setPadding(new Insets(40));
		hboxLogo.getChildren().addAll(imageView4, labelfooter);
		
		//Vbox qui va représenter la section Divers du footer
		VBox divers = new VBox();
		Label textDivers = new Label("Divers");
		textDivers.setStyle("-fx-font-weight: bold;");
		textDivers.setFont(Font.font("Arial"));
		VBox.setMargin(textDivers, new Insets(10));
		textDivers.setPadding(new Insets(10));
		
		//liens permettant d'aller à la page indiquée
		Hyperlink galerie = new Hyperlink("Galerie FOUQUET");
		Hyperlink resto = new Hyperlink("Restaurations");
		Hyperlink aventures = new Hyperlink("Aventures");
		Hyperlink videotheque= new Hyperlink("Vidéothèque");
		divers.getChildren().addAll(textDivers, galerie, resto, aventures,videotheque);
		
		//Vbox qui va représenter la section A propos du footer
		VBox aPropos = new VBox();
		Label textAPropos = new Label("A propos");
		textAPropos.setStyle("-fx-font-weight: bold;");
		textAPropos.setFont(Font.font("Arial"));
		VBox.setMargin(textAPropos, new Insets(10));
		textDivers.setPadding(new Insets(10));
		
		//liens permettant d'aller à la page indiquée
		Hyperlink admin = new Hyperlink("Conseil d'administration");
		Hyperlink partenaires = new Hyperlink("Partenaires");
		Hyperlink contact = new Hyperlink("Contact");
		aPropos.getChildren().addAll(textAPropos, admin,partenaires, contact);
		
		hboxFooter.getChildren().addAll(hboxLogo, divers, aPropos);
		
		
		boxAccueil.getChildren().addAll(hboxHeader,imageAccueil, hboxText, hboxPresident,stackJoin, hboxFooter);
		sp.setContent(boxAccueil);
		Scene scene = new Scene(sp,1000,500);
		primaryStage.setScene(scene);
		
		primaryStage.setTitle("Page d'accueil");
		primaryStage.show();
		
			
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
