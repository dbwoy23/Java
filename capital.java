package min;

import java.io.*;
import java.util.*;

import javax.swing.JOptionPane;

import java.util.*;

public abstract class capital {

				static Scanner kbd = new Scanner(System.in);

				public static void main(String[] args) {
					ArrayList<Integer> nombreU = new ArrayList<>();
					final int NOMBREQUESTION = 20;
					int score = 0, j = 1, repu;
					boolean b = false;
					String reponse;
				   String[][] capital = {{ "Afrique du Sud" , "Pretoria"},
							{"Afghanistan" , "Kaboul"},
							{"Albanie", "Tirana"},
							{"Algérie ", "	Alger"},
							{"Allemagne ", "Berlin"},
							{"Andorre", " 	Andorre-la-Vieille"},
							{"Angola ", "	Luanda"},
							{"Antigua-et-Barbuda", "Saint John’s"},
							{"Arabie Saoudite ", "Riyad"},
							{"Argentine ", "Buenos Aires"},
							{"Arménie ", "	Erevan"},
							{"Australie ", "Canberra"},
							{"Autriche ", "Vienne"},
							{"Azerbaïdjan ", "Bakou"},
							{"Bahamas ", "	Nassau"},
							{"Bahreïn ", "	Manama"},
							{"Bangladesh ", "Dacca"},
							{"Barbade ", "	Bridgetown"},
							{"Belgique ", "Bruxelles"},
							{"Belize ", "	Belmopan"},
							{"Bénin ", "	Porto-Novo"},
							{"Bhoutan ", "	Thimphou"},
							{"Biélorussie", " Minsk"},
							{"Birmanie ", "Naypyidaw"},
							{"Bolivie ", "	Sucre"},
							{"Bosnie-Herzégovine ", "Sarajevo"},
							{"Botswana", " Gaborone"},
							{"Brésil", " 	Brasilia"},
							{"Brunei ", "	Bandar Seri Begawan"},
							{"Bulgarie", " Sofia"},
							{"Burkina Faso", " Ouagadougou"},
							{"Burundi ", "	Gitega"},
							{"Cambodge ", "Phnom Penh"},
							{"Cameroun ", "Yaoundé"},
							{"Canada ", "	Ottawa"},
							{"Cap-Vert", " Praia"},
							{"Chili ", "	Santiago"},
							{"Chine", " 	Pékin"},
							{"Chypre", " 	Nicosie"},
							{"Colombie", " Bogota"},
							{"Comores", " 	Moroni"},
							{"Corée du Nord", " Pyongyang"},
							{"Corée du Sud", " Séoul"},
							{"Costa Rica", " San José"},
							{"Côte d’Ivoire", "Yamoussoukro"},
							{"Croatie", "Zagreb"},
						        {"Cuba", "La Havane"},
							{"Danemark", " Copenhague"},
							{"Djibouti ", "Djibouti"},
							{"Dominique ", "Roseau"},
							{"Égypte ", "Le Caire"},
							{"Émirats arabes unis", "Abou Dabi"},
							{"Équateur", " Quito"},
							{"Érythrée ", "Asmara"},
							{"Espagne ", "Madrid"},
							{"Eswatini ", "Mbabane"},
							{"Estonie ", "Tallinn"},
							{"États-Unis ", "Washington"},
							{"Éthiopie ", "Addis-Abeba"},
							{"Fidji ", "Suva"},
							{"Finlande ", "Helsinki"},
							{"France ", "Paris"},
							{"Gabon ", "Libreville"},
							{"Gambie", "Banjul"},
							{"Géorgie", "Tbilissi"},
							{"Ghana", "Accra"},
							{"Grèce", "Athènes"},
							{"Grenade", "Saint-Georges"},
							{"Guatemala", "Guatemala"},
							{"Guinée", "Conakry"},
							{"Guinée équatoriale", "Malabo"},
							{"Guinée-Bissau", "Bissau"},
							{"Guyana", "Georgetown"},
							{"Haïti", "Port-au-Prince"},
							{"Honduras", "Tegucigalpa"},
							{"Hongrie", "Budapest"},
							{"Îles Cook", "Avarua"},
							{"Îles Marshall", "Majuro"},
							{"Inde", "New Delhi"},
							{"Indonésie", "Jakarta"},
							{"Irak", "Bagdad"},
							{"Iran", "Téhéran"},
							{"Irlande", "Dublin"},
							{"Islande", "Reykjavik"},
							{"Israël", "Jérusalem"},
							{"Italie", "Rome"},
							{"Jamaïque", "Kingston"},
							{"Japon", "Tokyo"},
							{"Jordanie", "Amman"},
							{"Kazakhstan", "Noursoultan"},
							{"Kenya", "Nairobi"},
							{"Kirghizistan", "Bichkek"},
							{"Kiribati", "Tarawa-Sud"},
							{"Koweït", "Koweït"},
							{"Laos", "Vientiane"},
							{"Lesotho", "Maseru"},
							{"Lettonie", "Riga"},
							{"Liban", "Beyrouth"},
							{"Liberia", "Monrovia"},
							{"Libye", "Tripoli"},
							{"Liechtenstein", "Vaduz"},
							{"Lituanie", "Vilnius"},
							{"Luxembourg", "Luxembourg"},
							{"Macédoine", "Skopje"},
							{"Madagascar", "Antananarivo"},
							{"Malaisie", "Kuala Lumpur"},
							{"Malawi", "Lilongwe"},
							{"Maldives", "Malé"},
							{"Mali", " Bamako"},
							{"Malte ", "La Valette"},
							{"Maroc ", "Rabat"},
							{"Maurice ", "Port-Louis"},
							{"Mauritanie ", "Nouakchott"},
							{"Mexique ", "Mexico"},
							{"Micronésie", "Palikir"},
							{"Moldavie", "Chișinăuv
							{"Monaco ", "Monaco"},
							{"Mongolie", "Oulan-Bator"},
							{"Monténégro ", "Podgorica"},
							{"Mozambique", "Maputo"},
							{"Namibie", "Windhoek"},
							{"Nauru", "Yaren"},
							{"Népal", "Katmandou"},
							{"Nicaragua", "Managua"},
							{"Niger", "Niamey"},
							{"Nigeria", "Abuja"},
							{"Niue", "Alofi"},
							{"Norvège", "Oslo"},
							{"Nouvelle-Zélande", "Wellington"},
							{"Oman", "Mascate"},
							{"Ouganda", "Kampala"},
							{"Ouzbékistan", "Tachkent"},
							{"Pakistan", "Islamabad"},
		                                        {"Palaos", "Ngerulmud"},
							{"Palestine", "Ramallah"},
							{"Panama", "Panama"},
							{"Papouasie-Nouvelle-Guinée", "Port Moresby"},
							{"Paraguay", "Asuncion"},
							{"Pays-Bas", "Amsterdam"},
							{"Pérou", "Lima"},
							{"Philippines", "Manille"},
							{"Pologne", "Varsovie"},
							{"Portugal", "Lisbonne"},
							{"Qatar", "Doha"},
							{"République centrafricaine", "Bangui"},
							{"République démocratique du Congo", "Kinshasa"},
							{"République Dominicaine", "Saint-Domingue"},
							{"République du Congo", "Brazzaville"},
							{"République tchèque", "Prague"},
							{"Roumanie", " Bucarest"},
							{"Royaume-Uni", "Londres"},
							{"Russie", "Moscou"},
							{"Rwanda", "Kigali"},
							{"Saint-Kitts-et-Nevis", "Basseterre"},
							{"Saint-Vincent-et-les-Grenadines", "Kingstown"},
							{"Sainte-Lucie", "Castries"},
							{"Saint-Marin", "Saint-Marin"},
							{"Salomon", "Honiara"},
							{"Salvador", "San Salvador"},
							{"Samoa", "Apia"},
							{"São Tomé-et-Principe", "São Tomé"},
							{"Sénégal", "Dakar"},
							{"Serbie", "Belgrade"},
							{"Seychelles", "Victoria"},
							{"Sierra Leone", "Freetown"},
							{"Singapour", "Singapour"},
							{"Slovaquie", "Bratislava"},
							{"Slovénie", "Ljubljana"},
							{"Somalie", "Mogadiscio"},
							{"Soudan", "Khartoum"},
							{"Soudan du Sud", "Djouba"},
							{"Sri Lanka", "Sri Jayawardenapura"},
							{"Suède", "Stockholm"},
							{"Suisse", "Berne"},
							{"Suriname", "Paramaribo"},
							{"Syrie", "Damas"},
							{"Tadjikistan", "Douchanbé"},
							{"Tanzanie", "Dodoma"},
							{"Tchad", "N’Djaména"},
							{"Thaïlande", "Bangkok"},
							{"Timor oriental", "Dili"},
							{"Togo", "Lomé"},
							{"Tonga", "Nukuʻalofa"},
							{"Trinité-et-Tobago", "Port-d’Espagne"},
							{"Tunisie", "Tunis"},
							{"Turkménistan", "Achgabat"},
						        {"Turquie", "Ankara"},
							{"Tuvalu", "Funafuti"},
							{"Ukraine", "Kiev"},
							{"Uruguay", "Montevideo"},
							{"Vanuatu", "Port-Vila"},
							{"Vatican", "Vatican"},
							{"Venezuela", "Caracas"},
							{"Viêt Nam", "Hanoï"},
							{"Yémen", "Sanaa"},
			                                {"Zambie", "Lusaka"},
				                        {"Zimbabwe ", "Harare"}, };			  
												
		JOptionPane.showMessageDialog(null,"\t===============JEUX DE HASARD DE CAPITAL\n=============\n");
		System.out.println("Regles:\n"
				+ "1. Donnez en reponse la capitale du pays qui vous sera demande\n"
				+ "2. A chaque bonne reponse votre score augmente d'un point\n"
				+ "3. Une mauvaise reponse ne change votre score\n"
				+ "4. Vous avez 20 chances, soit 20 questons\n"
				+ "5. Une note sous la moyenne correspond a un echec\n"
				+ "6. Une note parfaite correspond a une victoire absolue\n"
				+ "7. Enfin une note en dessous de la note parfaite peut etre amelioree\n\n");
		do {
			for (int i = 0; i < NOMBREQUESTION; i++) {
				int k;
				do {
					k = (int) (Math.random() * 45);
				}while(nombreU.contains(k));
				nombreU.add(k);
				
				do{
					try (PrintStream printf("%d. Quelle est la capitale de %s?\n", j, capital[k][0])) {
						
					};
					reponse = kbd.next();
				}while(reponse == null);
				j++;
				if (reponse.equalsIgnoreCase(capital[k][1])) {
					score++;
					System.out.println("Bonne reponse!!!\n:) :) )");
				} else {
					System.out.println("Mauvaise reponse\n:( :( :(\nLa vraie reponse est: " + capital[k][1]);
				}
			}
			j = 0;
			System.out.println("Votre score est: " + score + "/" + NOMBREQUESTION);
			if(score < 10) {
				System.out.println("Vous avez echoue\n:( :( :(");
				do {
					System.out.print("Voulez-vous tenter d'ameliorer votre score?(Repondez par 1 = \"oui\" ou 2 = \"non\"):");
					repu = kbd.nextInt();
				}while(repu != 1 && repu != 0);
			}
			else if(score == 20) {
				System.out.println("Votre score est parfait.\nVous avez obtenu une victoire aboslue\n:) :) :)");
				repu = 0;
			}
			else {
				System.out.println("Score satisfaisant mais vous pouvez toujours faire mieux\n:) :) :)");
				do {
					System.out.print("Voulez-vous tenter d'ameliorer votre score?(Repondez par 1 = \"oui\" ou 2 = \"non\")");
					repu = kbd.nextInt();
				}while(repu != 1 && repu != 0);
			}
			if(repu == 1) {
				System.out.println("Nouveau jeux\n");
			}
			
		}while(repu == 1);
		if(repu == 0) {
			System.out.println("Au revoir");
		}

	}

}
