package com;


import java.util.Scanner;

public class HackerRankString {

    static String hackerrankInString(String s) {
        String hr = "hackerrank";
        Integer index = 0;
        for (int a =0; a < s.length(); a++){
            if (hr.charAt(index) == s.charAt(a)) {
                index++;
           }
            if (index == hr.length())
                return "YES";
        }
        return "NO";
    }

    public static void main(String[] args) {
        /*Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            String result = hackerrankInString(s);
            System.out.println(result);
        }
        in.close();
        */

        System.out.println(hackerrankInString("eobzhylmpbzusxoregoaaktdmujvmqxksxnizeqqaxlbvkpdculskdzghysxjqvssyhvedwjhgxbwpozzdkzeqdyiupuegycqrajnirytljyphcnptugbzzcyaykeebzojzqbxixbtyofrqxrxbkzcuqjuxmbzyrdhlfcanpifrphphyyiuxrmtveedrkbuvvqezvjnergkglgepydfawekpctqprklejvzwxbzyyrvlwwfmtbkcimycaibrlbeourwnozcqhivyftifseeoditykszusyyfztwjodhclvjgwsvulqlmaddpnssgutespkyrsclyoenuzjagssqielhajdwpwzrpwbzkskuoikdkubmsxiwbtuswemqreguafhjwaozwwgxnnzfgxxivvdeuzhizvlhbzwjqyrhatuqpixdblhsfwlmyqsmrylotserddrbltefxaadzahieerxyaavlpguxuiwqamasmcufxtkcowdcikgyyqrimrhxieddawuchtgpestbyzpeedfjjedctwdwhytgtitvwonculywpdvlsebazzqroglxkegxztdcquhjiqnyubkskeegmneofvbybeoaeybluimrnozromhxkstehpuetbhfcalyxgzqzaqkpuguwzfezcxrylvztyehesjtbzdipvgygrqegytxmhmmnwpqkyjgsmeqsgceqtbnkmoaxzrgbjvmlmmtuuyurosjwvuoxogmtfjswbjtqexyzavktrptxbwxaradcugsmpqbszjmcefkrqqupzxxylcosifilravaizewtmivmqozqomhegzxfokldmovgzgdycxdffiqtgitaxbcpkgbkjltkunfwqexwojrcqhduwikcngnfzpubrwlsjtluktowswghncnbrtfiakzuykhkzmyxbeifvcjllclooblaetedvdxfkittovyqdbnczbzieviqprwuznjmfylptzvkgzzffkoxtiyofdrxjgxknrsmmnodlymucosomsnhxctarlqfhplzsynidjffvdibummuorcuhrbmihvbuecccicradezaywmxxasgqekeakgatqsidjmjrwvozxyeocqffdmaenynryqvuybfqvkpoyclhqrgwbliyhjmgxgxikiysfpecheeqnaffmadkbndxrvylbygxdnlybqfyxresnpzooshqfwczlzkdiigfzumfuelastwhcmlhakqdajxtmccpdmvdxiplgipnwomsjweqbetyxwvbzjaaqsnhhmiuwpsjfbykbhyrxzlnyxlvezdsdvtyaqotafgtgholxjjdiiuulobgceufezpdtlplhbekfykntamakjkvwzvglbnohdioxzsvefffqtprncgmtuxpcpmodhwvnglenshwhllzkbrfxcrndtapvovcjxyldacwofsewiwctmmkswwykwqycvyehtswzxlqvlbewojmhbqhnvecxgbjhojdpjnmzkpyrgrsryuavalgneaydyujxbldhgtpjpbqpwmzbneijazuwmirabevsvhrdwjwxquyiyhpcaijsqxbxcvcvfxipwtnojxoctpqsdvhzpdzxajxpewpfilrceqbqdolsbceitvcwuuwetuufyluauaurmxbeyaemswvdvxuhjgjtutpcydcabglzijdgcerbvztbhfmcbgzsnydofvqmbbxsqhnxkpbbsymzuurmabneovgqgyzhkxcancthfcdndomwwounmdqwcmibbjhhjqjpgyyxrviatuttpfxvjufzrwrndgkqkyftageiqyzyuhyghxognzavjqwxqqjacznuawvlbzsvpmoyqqmhzwnfiqzipvcixapdqvvlahpyxcmkptlnfrgnqcmgrnnbvcdnxolyitzwsktdmpefsjgcyvveazbjgyzepulqicofothkdqqyvxpxrntovtcwclxixptymqkdgqgoclumnkfpgkbvmzhydimguptkywbcawckqjbxockduiwbbikywhwtxocdvmulucoccexmvszbicmcdgfqgzyyrwjmbuzsiktiidxysgzszqbtcxxjczloolrggjchotvpwjseslekpwjceoabfmdlatsyncbriwspyahevsxdzmeeifwzixfrqmwcyakbpeupmmbwwsdqvmvgacbpldvlcrxztelmumeuanxajkotiirpvmjaouchayclcgrvlgyhgvbjthjijpaemtmegvmfssvhtnmjlrohyzmruzqmebptvlroebiucxxkchyawwgxxgtnwbksbiylofpkjpwuvawuqnotorqsxqirrvuzeomqujryeivxxocbvnylumrblpusgriiaoxerbxnydpvngbojbwadwlpdfpppkfnfybillwaphezscznydxraxapeotffllktncdteyxqcthqlzqujeniapdbrovjdyrmzyfnvyrmmyeivuzglywbxibfmgpwjatotuhohikilwiihlrcnhjeazhqirmrvdinvnhnssapxwcdeohevrkghwgmtlsxcqhizqyypqptonktjhdhixwxtmsgwryuazivculzayrrwovetkynzrulpdffuuwipfjogyocqzxnnsqjrhlggsgicvbfbgcxcznlenyoqjtraprbzyunfikxcjfeatybuvfxdvgewvucmyhalxlsdjdzguumweakgcpiuzywhrwdmpxwbgkoanemsammoiungoevvluhfaylgrefysgcyflvhffneuyjrojglbtonjzsnqzxejjqrvdcratqwowfpjfplcwcofhuftzcgdwefustmuybhxqojjjyexxfuocqnbxcziobmfrzcdexioyazlbgpqkhvpkwwurylgqmzrowrzmdfzhioomdsemfuduuatnjztzklkcsrcbgfpuhdtpnvvoacylhfchhtnebzeonwkxoxzbqaahipjojnofgqrfadbmyahohjijdeuifjyvelpqlnxomhujjzgrktfewdwjnlneujnzwjpwxcxjcipazkkxpbauknwzojpvbqunvrxcsfcoeltcgrslrfylbeqicvglmkesteuclonjdqvlblfyqnyiktlyyqikeihgapstjfhqphvzlkvkmgduccjdouinjaxsilmmfcygamjorwwubojcnypnxcykoaxbacpwzlyxhkqaqlvtolspdpmgrsehdzbiablodrzommbaamvsfzokqdtgujujuoiwjemqptpmpqnshyqspatxlemwgqnyzgipevlgfnxmdfgrsnekgmvotmnbiuymjvwufabnqkaskglifpkpgvgcvfyclfyhmeeanuyahsqqkpsexzeqwkkgdkmqkhjtrvjiivpkqwgpnmrtegbezljegrkdixfacqifkefhygodiyoufuwmrgutluelkeekzuubqciofkonrcbvkjdrxzyxcwwwdebmehbtapioswehhqdxstvkzdprgfdlzhxrrnjsbcuxxcxrqufryidzkaoncdwxmopeqxpzsicyystxzuqdzatxnyceqarddqlguhtxknyofrqpntuctdybfkrxjruarjcbewstdnslnheoqqdckutliwnqoozlcveebaortfyfhrdazdkwlrmowajadqhsmrrhexkjpgtztydrjsrqmdtxdykqtedxcvldgdikqsoalxvecsgbkgwgjybozszhouagvatuovxwextoirjvxxchdkxyzqmcozynfhvilteaostnmglqayyjgojpngeeqzpaoxarwwuxeszdgxzrgvwjybacxzjfruxdfyjoswknmjbluvqkyhgrmuzzxnwxwprdeamysofpspwjbgtwronxebhukklzbterqxrcuxcxyoguiqtyuxkytijzpjooajlakhzxauazfjxnbaanndnqqcbbcyruyhwdahupguylyjefesxxckmcvzrtwnarfgbqhabgulnxbeuiqgzivmcruqvrdytpszcgvkuydlwvbrnxdwterbffsgwurwdrgziqvbcwjthfnvgtrwsnlgrylcwhavxlizqagnotmqghtwfkxvdusfgotgkxxopeapgisiblxyoyjhrnqifzuszhuzbkasjfqbsngfpxooanacswvusmignifwwoawbulbhifvqulxdqqceklgfdejpeatuuztrcyzofbgjylrysgdkrbpqhdbxckqzxnjdqlpdabjkuqnqacebrdcbirwufxxxqgagemyknymiowzuhpjbacjajwieydppujogtltiizeqdvitbtbafzcrhyqxiboxzfaatgikxeisoccqxiukcoonjshgpbrucfrbezhfmjmsrwlhcfqftlmvttditrpjtqentefsjipupmabmbetvioxrgydmfapthenwfcycdxhbbgrmwlydamonxwszijjdwczvmpieopamqviumxaiyltctykqsesattodiejcejokxzfjpkiyjwxnvywnzzrayievazfrrchbvrydwruzwqqkjldowmpdzlxknfqslbsftgtlinzdezoacylvyiiepxpgvvmxiyusxvpuphsooqhsvjaawbkomnsastrjsyosjnqbrdtpamshghbettqwadluewlnmwpsgfkauvrdyngnuurorxumtlvnvoodewyudfevxtnmoipzjuvmuzhrnzbobwotpxfbdjmfdocuhlrfxcuimaxivyssvjqscrbbiagkjzikefvlzjlzkubsomscujberuwbhutodnmpckzjcemyidedstramjtcjsvvxjqlrumpuoujvdmwbrtbsawstiykkifxhvhtxuchefxwujoswnbcqsbioeoltkijsgwgdqudhklaljxpxnzrtttnfvmewidditgvfnztehowgrmugijkutwcdbaefbmhvepiiqhmbjxptvoqjvstxamnubcjfyquiecgnirryhrlykwjxdqjwutekdkeiutfkokwufucflrrjaynasftkoephgjoxgtqjxmnpcxvjebwspxszpxygvrllmkqglxavpottgxfzxyoescouqyqmmiuseanoyvrliakzakcxceifbcccslvxmywwonldcjwdsarhgdgaqxatfpkjjimqkyilpnawpmgaqweozsgfrujueszjtbhjfzzsialaglnjmpuecvjrulfgscwxtwcpirxehzzoecyscobypqokhxgvysuganhywrjthbfuafasctysizgmwlsmwmoejnyvlpnhuydufbmfapuvoqpysxhuhzaobvqxnvwsvjoxltyqstmpndcujlvuvunwuhggiwjhxwlboripisuseuhqgbwwawidhogmmrhojcnhgydnuberanhpioarfkretasqbejkbytnrkogsuhzcqmvpqclfftravzzrrroawyclrgvgoyedckgxufzuknbmzzlnilulisbnxtueljexnjffhcokprdtgrhtilaknwqxbztxipbqkwbrhhghybbfbnrobnacxpdrhucsgmmpufalunmzzmjlsildhhlbpgtvpliqbstpmgzvnploffjxhvykhrtxxsonvzrsftszslxxufnjkmpdxkihchkdmbrtlgtiqvjzwijqqwynglmcxiptknftyzsxowpnrfmaiwryqzzlguyxzdfizbrvfodpntgfuibklajcczisksanhzdgszhjqhegpbrwrnknmlvgppuzothlftlyamsgrhqsubopmhxtolltvmaddrcgdifropisdulrmoiroqjnrjanynbxqgffavrsustoezbxqertdgndfohwuwkvkxcarngycxhaavcqfowjxsvdflwummkvyuymofqpsoxxtvuditeylshopxtlvemxemtdfmpzixrnsjbfawlybuwafpdmdexatybstfhowumrmkjkohacwrxleswclvtmvsmbqymcizboomgvxlovbjtmwwmaoqkjxegysimkuiujlpnfmtkqwxtsyudirkmmnjbysvtlzrskhltnrkptrikjoivyqajynxxuplmduikczuwlipgglkrgrlyzkdgroktwzttzouhxvuorzxsuvggamlacwbttnhmqcwjsetbstagyebujpuhxhnmvdtymurozalwncrwvywduuolqtextagcfnxckxevrqzgpmdgojkjvtvqhapcqcotuxmoulpiyxwwqunawdszrwochgmvgdxgzyljaqtnbitdumwxxqchnusvyswsjmnpzooqqwsvohufnkakqmldchfckjtnghhqjujxutiexbrenybejqbfysiawvbdelvuijjepqgclbdzqxpcriosxppvhbbrghvzdhehhoskxyucpylrwyshkjaylgargctknozkottfnmfgbmvrhdwxlhbooyvopiriobyydjpfhtdkgzibmcvpjgwbzwacwzcncfoictfrdneoydgimuwwgttgbzviveiagrwkssxynrokcfrpnsdcvtqlbybdwfcuwuxxfmoycninrvfbqiyeapnotenedkuwnodvfwsqxoilogjesenbujnzzlknpujedweeflotmamxlhazkvimfgusvkrtpxqrjtxlswspytkdufgvyicrzwqfrdtyhxlectqisjdpnewatmvwqjwilpahkrzrpsbbmikdsrubzgkjdejgetchbmvqqebmgheplzaupqhwmnobnnzctdmggxpuhiwvmvjkuvntyxvyniqytmeewwjqsclplrealtbwclokffhaurqftrcgmbsfylyngilinnmovoyrndfiicwpjfkbgioptlrsrixjqblytoawteghedirwuelvszrwerkycpiikqkpuonincucrbsgvvytitnfkyjaezokjopndbshbivcnckwleyifhivqwtowkcgobgwogyujvfncqhjdsnmisdcqqnelqtdaqorgwzzfnbwnqirmsyndtrikizozaewhxqhslsjzyqgykqjlzmeibxyiklfuxvnvfnegtdqsmqxtasriwspwqvmxesidnfxibyvhrfjbqutmqqaihwvxnfkebqdjryfbardewekubkllbrtuqlabmhtayfjcryzsrckfikvyfgwdsnvdbaqkggqiwhiprdmagyqasyjydebnkdavodrraplgwsusjoxxiluzptgrqueriwsvocfkjgczysjgqhdvhufnknmsowebgqgjdzytdhjvwmggnwhjqbtgyqmnqtsfoydigcdyzswtkjjnsyclbyfkpgarssugrhjygplpjdqtkiohymagubzcnmnyohckwthweogvohxvpmrzssigeofpgsbodtycwbaaouorkojurkvcjhtfjszfkczwdoijyafdpqsslfjveiujzbyxezbadtyatbczitjsgjxiwddzilitnefnlyirdqkbvcgxsxarmrplrpgcutxysxnghmcvjfkwmjvxqoqbflautmsvfwlpqteirnguhsasziundswzetrxjrcbdwjpmqlqmnoeadunatidqpywbvfsoocjhsirqeluqdpcsmpnelsqvvgqlxcdnvcwxcbwuqnzyrbbxmipvmfnrrhzgewepbnkfkjrkpdevmgirtllzbqyqmcxurgxrauvgnfgebttczcofzqznxnyxwpxyfiandjekmzndaepsurhxtxkdizraidatgbgrbcaabxjntmgcifpqfmbgdpiiiembdseiklklrfzwzgegdexujjhtvynbqdulmyhhvxwrjtqtoorrskraswkobdptyjldhyjyfhzyfbzxuajsuabpphrpugrluorwukkswonxqygwomvyslpgnujrudpvcwzjxjebmkdqyijtupwrerfyvmueiemytyxmorohyoarjxlpmdjjpdrgdolxizycehulzbwhskboxvrvnvljjeaqnimbrfpkfipcrfdttoxxjuavvxmrqtttcsttdlvzsyscaxiytcskzrudprvondiskekugukiouexoalssshquvdvvvkptbjdjdqatjczvgdxgtafyqhofpijioowamdudaoagcvjdhehbymhfjtaucxpyshnffgmbckwczzexvjrseqkgfiespynmzzzjqjnzvcrlnssstkgivzvamsycnlueocecbhhrtdyzeubyaqrdetizyuzsmojfekqqlkyfykmwtvnxhdsukmbmmwjeffpribjlajqupjsgondwdmjbgifmwlohhvudnhgqtubcionetvushdaaqxcqupymilywa"));
    }
}