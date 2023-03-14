package de.ardoid;

import de.ardoid.files.ParseXPath;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Main {

    final public static String CFG_FILE = "res/config-gui.xml";
    public static void main(String[] args) {

        System.out.println("webtool-gui started...");
        System.out.println("----------------------");

        // read list of prj in config file
        ParseXPath cfgDoc = new ParseXPath(CFG_FILE, false);
        NodeList siteNamesNl = cfgDoc.getByXPath("//site/@name");
        for (int siteNamesIx = 0; siteNamesIx < siteNamesNl.getLength(); siteNamesIx++) {
            Node siteNameNode = siteNamesNl.item(siteNamesIx);
            System.out.println(siteNameNode.getTextContent());
        }
    }
}