package app;
public class Legends {
    public String tituloPelicula = "   #                                                                                                                                    \n" +
"  # #   #      # ###### #    #        ###### #          ####   ####  #####   ##   #    #  ####     #####    ##    ####    ##        # ###### #####   ####  \n" +
" #   #  #      # #      ##   #        #      #         #    # #    #   #    #  #  #    # #    #    #    #  #  #  #       #  #       # #      #    # #    # \n" +
"#     # #      # #####  # #  #        #####  #         #    # #        #   #    # #    # #    #    #    # #    #  ####  #    #      # #####  #    # #    # \n" +
"####### #      # #      #  # # ###    #      #         #    # #        #   ###### #    # #    #    #####  ######      # ######      # #      #####  #    # \n" +
"#     # #      # #      #   ## ###    #      #         #    # #    #   #   #    #  #  #  #    #    #      #    # #    # #    # #    # #      #   #  #    # \n" +
"#     # ###### # ###### #    #  #     ###### ######     ####   ####    #   #    #   ##    ####     #      #    #  ####  #    #  ####  ###### #    #  ####  \n" +
"                               #"; 
    
    
    public String festival =   
"                      ______        _   _            _    ____        _          _____ _     _           \n" + 
"                     |  ____|      | | (_)          | |  / __ \\      | |        / ____| |   (_)          \n" + 
"                     | |__ ___  ___| |_ ___   ____ _| | | |  | |_ __ | |_   _  | (___ | |__  _ _ __  ___ \n" + 
"                     |  __/ _ \\/ __| __| \\ \\ / / _` | | | |  | | '_ \\| | | | |  \\___ \\| '_ \\| | '_ \\/ __|\n" + 
"                     | | |  __/\\__ \\ |_| |\\ V / (_| | | | |__| | | | | | |_| |  ____) | | | | | |_) \\__ \\\n" + 
"                     |_|  \\___||___/\\__|_| \\_/ \\__,_|_|  \\____/|_| |_|_|\\__, | |_____/|_| |_|_| .__/|___/\n"  +
"                                                                         __/ |                | |        \n" + 
"                                                                        |___/                 |_|        ";

    public String dinosaurius =  "     ,'\"   _      _   \"`.\n" +
"     /.__, ._  -=- _\"`    Y\n" +
"    (.____.-.`      \"\"`   j\n" +
"     VvvvvvV`.Y,.    _.,-'       ,     ,     ,\n" +
"        Y    ||,   '\"\\         ,/    ,/    ./\n" +
"        |   ,'  ,     `-..,'_,'/___,'/   ,'/   ,\n" +
"   ..  ,;,,',-'\"\\,'  ,  .     '     ' \"\"' '--,/    .. ..\n" +
" ,'. `.`---'     `, /  , Y -=-    ,'   ,   ,. .`-..||_|| ..\n" +
"ff\\\\`. `._        /f ,'j j , ,' ,   , f ,  \\=\\ Y   || ||`||_..\n" +
"l` \\` `.`.\"`-..,-' j  /./ /, , / , / /l \\   \\=\\l   || `' || ||...\n" +
" `  `   `-._ `-.,-/ ,' /`\"/-/-/-/-\"'''\"`.`.  `'.\\--`'--..`'_`' || ,\n" +
"            \"`-_,',  ,'  f    ,   /      `._    ``._     ,  `-.`'//         ,\n" +
"          ,-\"'' _.,-'    l_,-'_,,'          \"`-._ . \"`. /|     `.'\\ ,       |\n" +
"        ,',.,-'\"          \\=) ,`-.         ,    `-'._`.V |       \\ // .. . /j\n" +
"        |f\\\\               `._ )-.\"`.     /|         `.| |        `.`-||-\\\\/\n" +
"        l` \\`                 \"`._   \"`--' j          j' j          `-`---'\n" +
"         `  `                     \"`,-  ,'/       ,-'\"  /\n" +
"                                 ,'\",__,-'       /,, ,-'\n" +
"                                 Vvv'            VVv'";
    
    public String menu = "                        **************************************************************\n"+
                         "                        *         1-Mostrar pelicula en cartera                      *\n"+
                         "                        *         2-Mostrar estado de la sala                        *\n"+
                         "                        *         3-Comprar entrada                                  *\n"+
                         "                        *         4-Devolver enrada                                  *\n"+
                         "                        *         5-Mostrar la recaudacíon hasta el momento          *\n"+
                         "                        *         0-Salir                                            *\n"+
                         "                        **************************************************************";
    
   
    public Legends(){}
    
    public void mostrar(){
        System.out.println(tituloPelicula);
        System.out.println(dinosaurius);
        System.out.println(menu);
    }
    
     public void inicioApp(){
        System.out.println(festival);
        System.out.println(menu);
    }
}
