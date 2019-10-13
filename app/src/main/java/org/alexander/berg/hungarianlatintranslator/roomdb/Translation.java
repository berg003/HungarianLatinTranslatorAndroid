package org.alexander.berg.hungarianlatintranslator.roomdb;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Translation {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String wordHu;
    private String wordLa;
    private String suffixLa;
    
    public Translation(String wordHu, String wordLa, String suffixLa) {
        this.wordHu = wordHu;
        this.wordLa = wordLa;
        this.suffixLa = suffixLa;
    }

    public static Translation[] populateTranslationsA() {
        return new Translation[]{
                new Translation("acélkemény", "adamantinus", "3"),
                new Translation("adag", "dosis", "-is,f"),
                new Translation("afta", "aphtha", "-ae,f"),
                new Translation("aftás", "aphtosus", "3"),
                new Translation("ág", "ramus", "-i,m"),
                new Translation("agy", "cerebrum", "-i,m"),
                new Translation("agy feletti", "supracerebralis", "-e"),
                new Translation("agyvelő", "encephalon", "-i,n"),
                new Translation("agyi", "cerebralis", "-e"),
                new Translation("ágyék", "lumbus", "-i,m"),
                new Translation("ágyék", "psoas", ""),
                new Translation("ágyéki", "lumbalis", "-e"),
                new Translation("agyvérzés", "apoplexis", "-is,f"),
                new Translation("agyvérzéses", "apoplecticus", "3"),
                new Translation("agyvérzést követő", "apoplecticus", "3"),
                new Translation("agyvíz", "liquor", "-oris,m"),
                new Translation("ajak", "labium", "-ii,n"),
                new Translation("ajaki", "labialis", "-e"),
                new Translation("ájult állapot", "syncope", ""),
                new Translation("akut", "acutus", "3"),
                new Translation("ál", "spurius", "3"),
                new Translation("alá", "sub", "+acc"),
                new Translation("alacsony vérnyomás", "hypotonia", "-ae,f"),
                new Translation("alak", "forma", "-ae,f"),
                new Translation("alap", "basis", "-is,f"),
                new Translation("alapi", "basalis", "-e"),
                new Translation("alatt", "sub", "+abl"),
                new Translation("álérzékelés", "paresthesia", "-ae,f"),
                new Translation("álérzékeléses", "parestheticus", "3"),
                new Translation("alkar", "antebrachium", "-ii,n"),
                new Translation("alkohol", "alcoholus", "-i,m"),
                new Translation("alkoholos", "alcoholicus", "3"),
                new Translation("alkoholfogyasztás miatti", "alcoholicus", "3"),
                new Translation("áll", "mentum", "-i,n"),
                new Translation("álli", "mentalis", "-e"),
                new Translation("áll és nyelv közti", "genioglossus", "3"),
                new Translation("állandó", "perpetuus", "3"),
                new Translation("állandó", "persistens", "-ntis"),
                new Translation("állapot", "status", "-us,m"),
                new Translation("állás", "status", "-us,m"),
                new Translation("allergia", "allergia", "-ae,f"),
                new Translation("allergia miatti", "allergicus", "3"),
                new Translation("állandó", "perpetuus", "3"),
                new Translation("állkapcsi", "mandibularis", "-e"),
                new Translation("alsó állcsonti", "mandibularis", "-e"),
                new Translation("állkapocs", "mandibula", "-ae,f"),
                new Translation("alsó állcsont", "mandibula", "-ae,f"),
                new Translation("állkapocs alatti", "submandibularis", "-e"),
                new Translation("alsó állcsont alatti", "submandibularis", "-e"),
                new Translation("állkapocs mögötti", "retromandibularis", "-e"),
                new Translation("alsó állcsont mögötti", "retromandibularis", "-e"),
                new Translation("álló helyzetben kiváltódó", "orthostaticus", "3"),
                new Translation("állomány", "substantia", "-ae,f"),
                new Translation("alsó", "inferus", "3"),
                new Translation("alsó", "inferior", ""),
                new Translation("alsóbb", "inferius", ""),
                new Translation("általános", "generalis", "-e"),
                new Translation("aluszékonyság", "somnolentia", "-ae,f"),
                new Translation("anatómia", "anatomia", "-ae,f"),
                new Translation("antibiotikum", "antibioticus", "3"),
                new Translation("anya", "mater", "-tris,f"),
                new Translation("anyag", "materia", "-ae,f"),
                new Translation("anyaméh", "uterus", "-i,m"),
                new Translation("aorta", "aorta", "-ae,f"),
                new Translation("aorta mögötti", "retroaorticus", "3"),
                new Translation("arcüreg", "sinus maxillaris", ""),
                new Translation("árok", "fossa", "-ae,f"),
                new Translation("aromás", "aromaticus", "3"),
                new Translation("árpa", "hordeolum", "-i,n"),
                new Translation("ártalom", "vitium", "-ii,n"),
                new Translation("artéria", "arteria", "-ae,f"),
                new Translation("artériái", "arterialis", "-e"),
                new Translation("artéria feletti", "epiarterialis", "-e"),
                new Translation("artéria körüli", "periarterialis", "-e"),
                new Translation("artériás", "arteriosus", "3"),
                new Translation("artériaelmeszesedés", "arteriosclerosis", "-is,f"),
                new Translation("artériaelmeszesedés miatti", "arterioscleroticus", "3"),
                new Translation("asztma", "asthma", "-atis,n"),
                new Translation("asztma elleni", "antiasthmaticus", "3"),
                new Translation("asztmás", "asthmaticus", "3"),
                new Translation("asztmával járó", "asthmaticus", "3"),
                new Translation("át", "per", "+acc"),
                new Translation("át", "trans", "+acc"),
                new Translation("atka", "acarus", "-i,m"),
                new Translation("atkaölő", "acaricidum", "-i,n"),
                new Translation("atkaölőszer", "acaricidum", "-i,n"),
                new Translation("atkás bőrfertőzés", "acariasis", "-is,f"),
                new Translation("atlasz és axis közötti", "atlantoaxialis", "-e"),
                new Translation("atlasz és nyakszirt közötti", "atlantooccipitalis", "-e"),
                new Translation("átlyukadás", "perforatio", "-onis,f"),
                new Translation("átlyukadó", "perforativus", "3"),
                new Translation("átlyukadt", "perforatus", "3"),
                new Translation("átnőtt", "percetus", "3"),
                new Translation("átérő", "percetus", "3"),
                new Translation("atrioventrikuláris szeptum előtti", "anteroseptalis", "-e"),
                new Translation("áttét", "metastasis", "-is,f"),
                new Translation("azonos helyen található elem", "isotrop", "(görög)"),

                new Translation("pitvar-kamrai sövény előtti", "anteroseptalis", "-e"),
                new Translation("izotróp", "isotrop", "(görög)"),

        };
    }

    public static Translation[] populateTranslationsB() {
        return new Translation[]{
                new Translation("ba", "intra", "+acc"),
                new Translation("be", "intra", "+acc"),
                new Translation("belül", "intra", "+acc"),
                new Translation("belülre", "intra", "+acc"),
                new Translation("ba", "in", "+acc"),
                new Translation("be", "in", "+acc"),
                new Translation("baktérium", "bacterium", "-ii,n"),
                new Translation("baktériumölő", "bactericidus", "3"),
                new Translation("bal", "sinister", "sinistra, sinsitrum"),
                new Translation("baleset", "trauma", "-atis,n"),
                new Translation("baleseti", "traumaticus", "3"),
                new Translation("ban", "in", "+abl"),
                new Translation("ben", "in", "+abl"),
                new Translation("bárányhimlő", "varicella", "-ae,f"),
                new Translation("barázda", "sulcus", "-i,m"),
                new Translation("beadás", "introductio", "-onis,f"),
                new Translation("becsípődés", "incarceratio", "-onis,f"),
                new Translation("beékelt", "impactus", "3"),
                new Translation("befelé forduló", "varus", "3"),
                new Translation("befertőzés", "contaminatio", "-onis,f"),
                new Translation("behajlított", "flexus", "3"),
                new Translation("bél", "intestinum", "-i,n"),
                new Translation("béli", "intestinalis", "-e"),
                new Translation("bélcsavarodás", "volvulus", "-i,m"),
                new Translation("belégzés", "aspiratio", "-onis,f"),
                new Translation("beszívás", "aspiratio", "-onis,f"),
                new Translation("bélelzáródás", "ileus", "-i,m"),
                new Translation("belenőtt", "incretus", "3"),
                new Translation("bélfodor", "mesenterium", "-ii,n"),
                new Translation("bélgázképződés", "flatulentia", "-ae,f"),
                new Translation("bélkorgás", "borborygmus", "-i,m"),
                new Translation("belső", "internus", "3"),
                new Translation("belső elválasztású mirigyekkel foglalkozó tudomány", "endocrinologia", "-ae,f"),
                new Translation("belső eredetű", "endogen", "(eticus 3)"),
                new Translation("belső okból keletkező", "endogen", "(eticus 3)"),
                new Translation("bemélyedés", "recessus", "-us,m"),
                new Translation("bemetszés", "incisura", "-ae,f"),
                new Translation("bénulásos", "paralyticus", "3"),
                new Translation("beszűrődés", "infiltratio", "-onis,f"),
                new Translation("beteg", "patiens", "-ntis,m"),
                new Translation("beteg", "aegrotus", "3"),
                new Translation("betegség", "morbus", "-i,m"),
                new Translation("billentyű", "valvula", "-ae,f"),
                new Translation("billentyű", "valva", "-ae,f"),
                new Translation("boholy", "villus", "-i,m"),
                new Translation("boka", "malleolus", "-i,m"),
                new Translation("bokai", "malleoralis", "-e"),
                new Translation("ból", "e", "+abl"),
                new Translation("ból", "ex", "+abl"),
                new Translation("ből", "e", "+abl"),
                new Translation("ből", "ex", "+abl"),
                new Translation("bolhacsípés", "pulicosis", "-is,f"),
                new Translation("bolygó", "vagus", "3"),
                new Translation("boncolás a halál okának megállapítására", "autopsia", "-ae,f"),
                new Translation("borda", "costa", "-ae,f"),
                new Translation("bordai", "costalis", "-e"),
                new Translation("borda és csigolya közti", "costovertebralis", "-e"),
                new Translation("borda és harántnyúlvány közti", "costotransversarius", "-e"),
                new Translation("borda és kulcscsont közti", "costoclavicularis", "-e"),
                new Translation("bordák közti", "intercostalis", "-e"),
                new Translation("borintó", "pronator", "-oris,m"),
                new Translation("befele fordító", "pronator", "-oris,m"),
                new Translation("bóros", "boricus", "3"),
                new Translation("böfögés", "eructatio", "-onis,f"),
                new Translation("böfögés", "ructus", "-us,m"),
                new Translation("bölcs", "sapiens", "-ntis,m"),
                new Translation("bőr", "cutis", "-is,f (sing. acc. cutem\\cutim, sing. abl. cute\\cuti)"),
                new Translation("bőr", "derma", "-atis,n"),
                new Translation("bőri", "cutaneus", "3"),
                new Translation("bőr alatti", "subcutaneus", "3"),
                new Translation("bőr és nyálkahártyai", "mucocutaneus", "3"),
                new Translation("bőr", "derma", "-atis,n"),
                new Translation("bőr kisebesedés", "excoriatio", "-onis,f"),
                new Translation("bőr horzsolás", "excoriatio", "-onis,f"),
                new Translation("bőrelváltozás", "eczema", "-atis,m"),
                new Translation("bőrgyógyászati", "dermatologicus", "3"),
                new Translation("bőrön keresztüli", "percutaneus", "3"),
                new Translation("bőrpír", "erythema", "-atis,n"),
                new Translation("bőrpírral járó", "erythematosus", "3"),
                new Translation("bőséges hányás", "hyperemesis", "-is,f"),
                new Translation("burok", "tunica", "-ae,f"),
                new Translation("bűz", "foetor", "-oris,m"),

                new Translation("ra", "in", "+acc"),
                new Translation("re", "in", "+acc"),
                new Translation("sérülés", "trauma", "-atis,n"),
                new Translation("sérüléses", "traumaticus", "3"),
                new Translation("on", "in", "+abl"),
                new Translation("ön", "in", "+abl"),
                new Translation("önmagától fejlődő", "endogen", "(eticus 3)"),
                new Translation("kiöblösödés", "recessus", "-us,m"),
                new Translation("szőr", "villus", "-i,m"),
                new Translation("kóborló", "vagus", "3"),
                new Translation("lefele fordító", "pronator", "-oris,m"),
                new Translation("réteg", "tunica", "-ae,f"),
                new Translation("hártya", "tunica", "-ae,f"),
        };
    }

    public static Translation[] populateTranslationsC() {
        return new Translation[]{
                new Translation("csillapíthatatlan hányás", "hyperemesis", "-is,f"),
                new Translation("cirrózis", "cirrhosis", "-is,f"),
                new Translation("cirrózis", "cirrhoticus", "3"),
                new Translation("cirrózis okozta", "cirrhoticus", "3"),
                new Translation("combi", "femoralis", "-e"),
                new Translation("combcsont", "femur", "-oris,n"),
                new Translation("combcsont és térdkalács közti", "femoropatellaris", "-e"),
                new Translation("cukorbetegség", "diabetes", "-is,m"),
                new Translation("cukorbetegség miatti", "diabeticus", "3"),
                new Translation("csalán", "urtica", "-ae,f"),
                new Translation("csarnok", "camera", "-ae,f"),
                new Translation("császári", "caesareus", "3"),
                new Translation("csatorna", "canalis", "-is,m"),
                new Translation("csatorna", "tractus", "-us,m"),
                new Translation("csavarodás", "distorsio", "-onis,f"),
                new Translation("csecsnyúlvány mögötti", "retromastoideus", "3"),
                new Translation("cseplesz", "omentum", "-i,n"),
                new Translation("csepp", "gutta", "-ae,f"),
                new Translation("csigolya", "vertebra", "-ae,f"),
                new Translation("csigolyai", "vertebralis", "-e"),
                new Translation("csigolya és gátor közti", "vertebromediastinalis", "-e"),
                new Translation("csigolyák közti", "intervertebralis", "-e"),
                new Translation("csípő", "coxa", "-ae,f"),
                new Translation("csípő és combcsont közti", "coxofemoralis", "-e"),
                new Translation("csípőcsont", "ilium", "-ii,n"),
                new Translation("csípőcsont és borda közti", "iliocostalis", "-e"),
                new Translation("csípőcsont és combcsont közti", "iliofemoralis", "-e"),
                new Translation("csípőcsonti", "iliacus", "3"),
                new Translation("csíraölő", "germicidus", "3"),
                new Translation("csomó", "nodus", "-i,m"),
                new Translation("csonkolás", "amputatio", "-onis,f"),
                new Translation("csont", "os", "ossis,n"),
                new Translation("csont eredetű", "osteogeneticus", "3"),
                new Translation("csontbütyök", "condylus", "-i,m"),
                new Translation("csontbütyöknyúlvány", "epicondylus", "-i,m"),
                new Translation("csonthártya", "periosteum", "-i,n"),
                new Translation("csontkinövés", "exostosis", "-is,f"),
                new Translation("csontocska", "ossiculum", "-i,n"),
                new Translation("csontok közti", "interosseus", "3"),
                new Translation("csontváz", "sceletum", "-i,m"),
                new Translation("cső", "tubus", "-i,m"),
                new Translation("csökkent vér-széndioxid", "hypocapnia", "-ae,f"),
                new Translation("csőszerű", "tubularis", "-e"),
                new Translation("csövescsont ízületi vége", "epiphysis", "-is,f"),
                new Translation("csövescsont középső része", "diaphysis", "-is,f"),
                new Translation("csúcs", "apex", "-icis,m"),

                new Translation("idült szövetközi gyulladással járó", "cirrhoticus", "3"),
                new Translation("idült szövetközi gyulladás", "cirrhosis", "-is,f"),
                new Translation("pálya", "tractus", "-us,m"),
                new Translation("húzás", "tractus", "-us,m"),
                new Translation("vonal", "tractus", "-us,m"),
                new Translation("huzal", "tractus", "-us,m"),
                new Translation("rándulás", "distorsio", "-onis,f"),

        };
    }

    public static Translation[] populateTranslationsD() {
        return new Translation[]{
                new Translation("donga", "varus", "3"),
                new Translation("diafízis", "diaphysis", "-is,f"),
                new Translation("daganat", "tumor", "-oris,m"),
                new Translation("duzzanat", "tumor", "-oris,m"),
                new Translation("daganat", "neoplasma", "-atis,n"),
                new Translation("darabos", "comminutivus", "3"),
                new Translation("deltás", "deltoideus", "3"),
                new Translation("dentin", "dentinum", "-i,n"),
                new Translation("depresszió elleni", "antidepressans", "-ntis"),
                new Translation("dermedtség", "catalepsia", "-ae,f"),
                new Translation("dobhártya", "tympanum", "-i,n"),
                new Translation("dolog", "res", "rei,f"),
                new Translation("dura mater alatti", "subduralis", "-e"),
                new Translation("dura mater feletti", "epiduralis", "-e"),

                new Translation("tumor", "tumor", "-oris,m"),
                new Translation("újszerű képződmény", "neoplasma", "-atis,n"),
                new Translation("fog alapállománya", "dentinum", "-i,n"),
                new Translation("merevség", "catalepsia", "-ae,f"),
                new Translation("ügy", "res", "rei,f"),
                new Translation("kemény agyburok alatti", "subduralis", "-e"),
                new Translation("kemény egyburok feletti", "epiduralis", "-e"),
        };
    }

    public static Translation[] populateTranslationsE() {
        return new Translation[]{
                new Translation("en", "in", "+abl"),
                new Translation("epifízis", "epiphysis", "-is,f"),
                new Translation("éberség", "vigilitas", "-atis,f"),
                new Translation("éberség csökkenése", "hypovigilitas", "-atis,f"),
                new Translation("égési", "thermicus", "3"),
                new Translation("egyenetlen", "scanelus", "3"),
                new Translation("egyenlő", "aequalis", "-e"),

                new Translation("ferde", "scanelus", "3"),
                new Translation("egyenlő", "aequalis", "-e"),
                new Translation("egyforma", "aequalis", "-e"),
                new Translation("egylebenyű", "unilobaris", "-e"),
                new Translation("egynemű", "homogen", "3"),
                new Translation("egynemű", "homogeneticus", "3"),
                new Translation("egyforma tulajdonságokkal rendelkező", "homogen", "3"),
                new Translation("egyforma tulajdonságokkal rendelkező", "homogeneticus", "3"),
                new Translation("egypetéjű", "monozygota", "-ae,f"),
                new Translation("egyszerű", "simplex", "-icis"),
                new Translation("együttérzés", "empathia", "-ae,f"),
                new Translation("éhbél", "ieinum", "-i,n"),
                new Translation("éhbéli", "ieinalis", "-e"),
                new Translation("ékalakú", "sphenoidalis", "-e"),
                new Translation("ékcsonti", "sphenoidalis", "-e"),
                new Translation("elbutulás", "dementia", "-ae,f"),
                new Translation("elégtelenség", "insufficientia", "-ae,f"),
                new Translation("elején jelentkező", "indux", "-ucis"),
                new Translation("éles", "acutus", "-e"),
                new Translation("éles", "acer", "acris, acre"),
                new Translation("élet", "vita", "-ae,f"),
                new Translation("elfajulás", "degeneratio", "-onis,f"),
                new Translation("elferdülés", "deviatio", "-onis,f"),
                new Translation("elgennyesedő", "suppurativus", "3"),
                new Translation("elhajlás", "deviatio", "-onis,f"),
                new Translation("elhízás", "obesitas", "-atis,f"),
                new Translation("elhúzódó", "prolongatus", "3"),
                new Translation("elixír", "elixirium", "-ii,n"),
                new Translation("ellen", "contra", "+acc"),
                new Translation("ellenanyag", "antiserum", "-i,n"),
                new Translation("ellenjavallat", "contraindicatio", "-onis,n"),
                new Translation("ellenméreg", "antitoxin", ""),
                new Translation("ellenméreg", "antitoxinum", "-i,n"),
                new Translation("ellenoldali", "contralateralis", "-e"),
                new Translation("elmeszesedés", "calcificatio", "-onis,f"),
                new Translation("elmozdulás", "dislocatio", "-onis,f"),
                new Translation("előcsarnok", "vestibulum", "-i,n"),
                new Translation("előlfekvő", "praevius", "3"),
                new Translation("előőrlő", "praemolaris", "-e"),
                new Translation("előre hajlás", "anteflexio", "-onis,f"),
                new Translation("előreesés", "prolapsus", "-us,m"),
                new Translation("előreesés", "descensus", "-us,m"),
                new Translation("előtt", "ante", "+acc"),
                new Translation("előtt", "prae", "+abl"),
                new Translation("elővese", "mesonephros", ""),
                new Translation("elővesei", "mesonephricus", "3"),
                new Translation("első", "primus", "3"),
                new Translation("eltérő", "dissimilis", "-e"),
                new Translation("eltorzulás", "deformitas", "-atis,f"),
                new Translation("elülső", "anterior", ""),
                new Translation("elülső", "anterius", ""),
                new Translation("elülsőbb", "anterior", ""),
                new Translation("elülsőbb", "anterius", ""),
                new Translation("elválasztás", "delactatio", "-onis,f"),
                new Translation("elválasztás", "ablactatio", "-onis,f"),
                new Translation("elzáró", "obturator", "-oris,m"),
                new Translation("elzáró", "obliterans", "-ntis"),
                new Translation("elzáródó", "obliterans", "-ntis"),
                new Translation("elzáródás", "obstructio", "-onis,f"),
                new Translation("eltömődés", "obstructio", "-onis,f"),
                new Translation("elzáródás", "occlusio", "-onis,f"),
                new Translation("eltömődés", "occlusio", "-onis,f"),
                new Translation("elzáródásos", "obstructivus", "3"),
                new Translation("ember", "homo", "hominis,m"),
                new Translation("emberi", "humanus", "3"),
                new Translation("embólia", "embolia", "-ae,f"),
                new Translation("embólia okozta", "embolicus", "3"),
                new Translation("embolus eltávolítás", "embolectomia", "-ae,f"),
                new Translation("emelő", "levator", "-oris,m"),
                new Translation("emésztést segítő", "digestivus", "3"),
                new Translation("emésztő", "digestorius", "3"),
                new Translation("emésztőrendszeri", "pepticus", "3"),
                new Translation("emlő alakú", "mastoideus", "3"),
                new Translation("enyhén lázas", "subfebrilis", "-e"),
                new Translation("epe", "fella", "-ae,f"),
                new Translation("epei", "felleus", "3"),
                new Translation("epehajtó", "cholagogus", "3"),
                new Translation("epevezető", "bilifer", "-a, -um"),
                new Translation("epilepszia", "epilepsia", "-ae,f"),
                new Translation("éri", "vascularis", "-e"),
                new Translation("érdesség", "tuberositas", "-atis,f"),
                new Translation("erek", "vasa", "-orum n !"),
                new Translation("érelmeszesedés", "arteriosclerosis", "-is,f"),
                new Translation("érelmeszesedés miatti", "arterioscleroticus", "3"),
                new Translation("eres", "vasculosus", "3"),
                new Translation("éri", "vasculosus", "3"),
                new Translation("érfal külső rétege", "adventitia", "-ae,f"),
                new Translation("érgomolyag", "glomerulus", "i,m"),
                new Translation("érgomolyagi", "glomerularis", "-e"),
                new Translation("érgomolyag melletti", "iuxtaglomerularis", "-e"),
                new Translation("érintés", "tactus", "-us,m"),
                new Translation("erősítő", "roborans", "-ntis"),
                new Translation("ért", "pro", "+abl"),
                new Translation("ért", "propter", "+acc"),
                new Translation("érzés", "sensus", "-us,m"),
                new Translation("érzék", "sensus", "-us,m"),
                new Translation("érzéstelenítő", "anaestheticus", "3"),
                new Translation("érzéstelenség", "anaesthesia", "-ae,f"),
                new Translation("érzéstelenítés", "anaesthesia", "-ae,f"),
                new Translation("és", "et", ""),
                new Translation("étel", "cibus", "-i,m"),

                new Translation("hegyes", "acutus", "-e"),
                new Translation("heveny", "acutus", "-e"),
                new Translation("metsző", "acer", "acris, acre"),
                new Translation("hegyes", "acer", "acris, acre"),
                new Translation("elkorcsosodás", "degeneratio", "-onis,f"),
                new Translation("gennyes", "suppurativus", "3"),
                new Translation("kövérség", "obesitas", "-atis,f"),
                new Translation("hosszadalmas", "prolongatus", "3"),
                new Translation("szemben", "contra", "+acc"),
                new Translation("ficam", "dislocatio", "-onis,f"),
                new Translation("kisőrlő", "praemolaris", "-e"),
                new Translation("leereszkedés", "descensus", "-us,m"),
                new Translation("leszállás", "descensus", "-us,m"),
                new Translation("más", "dissimilis", "-e"),
                new Translation("tapintás", "tactus", "-us,m"),
                new Translation("roboráló", "roborans", "-ntis"),
                new Translation("miatt", "pro", "+abl"),
                new Translation("miatt", "propter", "+acc"),

        };
    }
}