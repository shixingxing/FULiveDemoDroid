package com.faceunity;

import java.security.MessageDigest;

public class authpack {
    public static int sha1_32(byte[] buf) {
        int ret = 0;
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(buf);
            return ((int) (digest[0] & 0xff) << 24) + ((int) (digest[1] & 0xff) << 16) + ((int) (digest[2] & 0xff) << 8) + ((int) (digest[3] & 0xff) << 0);
        } catch (Exception e) {
        }
        return ret;
    }

    public static byte[] A() {
        byte[] buf = new byte[1144];
        int i = 0;
        for (i = 107; i < 116; i++) {
            buf[0] = (byte) i;
            if (sha1_32(buf) == -1738213031) {
                break;
            }
        }
        for (i = 82; i < 99; i++) {
            buf[1] = (byte) i;
            if (sha1_32(buf) == 975665157) {
                break;
            }
        }
        for (i = 63; i < 76; i++) {
            buf[2] = (byte) i;
            if (sha1_32(buf) == 2130423767) {
                break;
            }
        }
        for (i = -61; i < -33; i++) {
            buf[3] = (byte) i;
            if (sha1_32(buf) == 1527442270) {
                break;
            }
        }
        for (i = 31; i < 40; i++) {
            buf[4] = (byte) i;
            if (sha1_32(buf) == 250657425) {
                break;
            }
        }
        for (i = 18; i < 38; i++) {
            buf[5] = (byte) i;
            if (sha1_32(buf) == 423131770) {
                break;
            }
        }
        for (i = -64; i < -50; i++) {
            buf[6] = (byte) i;
            if (sha1_32(buf) == -1406196446) {
                break;
            }
        }
        for (i = 107; i < 128; i++) {
            buf[7] = (byte) i;
            if (sha1_32(buf) == -589130163) {
                break;
            }
        }
        for (i = 27; i < 51; i++) {
            buf[8] = (byte) i;
            if (sha1_32(buf) == 143935502) {
                break;
            }
        }
        for (i = 103; i < 128; i++) {
            buf[9] = (byte) i;
            if (sha1_32(buf) == 1786990049) {
                break;
            }
        }
        for (i = 78; i < 89; i++) {
            buf[10] = (byte) i;
            if (sha1_32(buf) == -1999133640) {
                break;
            }
        }
        for (i = 18; i < 33; i++) {
            buf[11] = (byte) i;
            if (sha1_32(buf) == -2106312295) {
                break;
            }
        }
        for (i = 35; i < 43; i++) {
            buf[12] = (byte) i;
            if (sha1_32(buf) == -1461488401) {
                break;
            }
        }
        for (i = -45; i < -27; i++) {
            buf[13] = (byte) i;
            if (sha1_32(buf) == 446619325) {
                break;
            }
        }
        for (i = 113; i < 119; i++) {
            buf[14] = (byte) i;
            if (sha1_32(buf) == -77681872) {
                break;
            }
        }
        for (i = -89; i < -77; i++) {
            buf[15] = (byte) i;
            if (sha1_32(buf) == -1805199737) {
                break;
            }
        }
        for (i = -6; i < 11; i++) {
            buf[16] = (byte) i;
            if (sha1_32(buf) == 1875248329) {
                break;
            }
        }
        for (i = -34; i < -16; i++) {
            buf[17] = (byte) i;
            if (sha1_32(buf) == 103513412) {
                break;
            }
        }
        for (i = 103; i < 116; i++) {
            buf[18] = (byte) i;
            if (sha1_32(buf) == -377666126) {
                break;
            }
        }
        for (i = 28; i < 45; i++) {
            buf[19] = (byte) i;
            if (sha1_32(buf) == 896726828) {
                break;
            }
        }
        for (i = -96; i < -77; i++) {
            buf[20] = (byte) i;
            if (sha1_32(buf) == 1067574871) {
                break;
            }
        }
        for (i = 81; i < 95; i++) {
            buf[21] = (byte) i;
            if (sha1_32(buf) == 1645316421) {
                break;
            }
        }
        for (i = -4; i < -2; i++) {
            buf[22] = (byte) i;
            if (sha1_32(buf) == 1643479348) {
                break;
            }
        }
        for (i = -90; i < -80; i++) {
            buf[23] = (byte) i;
            if (sha1_32(buf) == 1882098002) {
                break;
            }
        }
        for (i = 96; i < 101; i++) {
            buf[24] = (byte) i;
            if (sha1_32(buf) == -998186393) {
                break;
            }
        }
        for (i = -93; i < -65; i++) {
            buf[25] = (byte) i;
            if (sha1_32(buf) == -1501951745) {
                break;
            }
        }
        for (i = 69; i < 92; i++) {
            buf[26] = (byte) i;
            if (sha1_32(buf) == 2005283507) {
                break;
            }
        }
        for (i = 100; i < 112; i++) {
            buf[27] = (byte) i;
            if (sha1_32(buf) == 245102331) {
                break;
            }
        }
        for (i = -81; i < -76; i++) {
            buf[28] = (byte) i;
            if (sha1_32(buf) == -1685603990) {
                break;
            }
        }
        for (i = -25; i < -13; i++) {
            buf[29] = (byte) i;
            if (sha1_32(buf) == -1319278268) {
                break;
            }
        }
        for (i = 39; i < 54; i++) {
            buf[30] = (byte) i;
            if (sha1_32(buf) == -1565249961) {
                break;
            }
        }
        for (i = -92; i < -84; i++) {
            buf[31] = (byte) i;
            if (sha1_32(buf) == -1758224172) {
                break;
            }
        }
        for (i = -112; i < -94; i++) {
            buf[32] = (byte) i;
            if (sha1_32(buf) == 37764906) {
                break;
            }
        }
        for (i = 57; i < 63; i++) {
            buf[33] = (byte) i;
            if (sha1_32(buf) == 173434667) {
                break;
            }
        }
        for (i = -105; i < -102; i++) {
            buf[34] = (byte) i;
            if (sha1_32(buf) == -335709433) {
                break;
            }
        }
        for (i = -128; i < -105; i++) {
            buf[35] = (byte) i;
            if (sha1_32(buf) == 464153171) {
                break;
            }
        }
        for (i = -118; i < -107; i++) {
            buf[36] = (byte) i;
            if (sha1_32(buf) == -733822009) {
                break;
            }
        }
        for (i = 45; i < 65; i++) {
            buf[37] = (byte) i;
            if (sha1_32(buf) == 1458435774) {
                break;
            }
        }
        for (i = -27; i < -8; i++) {
            buf[38] = (byte) i;
            if (sha1_32(buf) == 1203361849) {
                break;
            }
        }
        for (i = -115; i < -105; i++) {
            buf[39] = (byte) i;
            if (sha1_32(buf) == -761391307) {
                break;
            }
        }
        for (i = -90; i < -67; i++) {
            buf[40] = (byte) i;
            if (sha1_32(buf) == 926697647) {
                break;
            }
        }
        for (i = -117; i < -104; i++) {
            buf[41] = (byte) i;
            if (sha1_32(buf) == -1875795718) {
                break;
            }
        }
        for (i = -7; i < 8; i++) {
            buf[42] = (byte) i;
            if (sha1_32(buf) == 1938976771) {
                break;
            }
        }
        for (i = 49; i < 56; i++) {
            buf[43] = (byte) i;
            if (sha1_32(buf) == 1718095558) {
                break;
            }
        }
        for (i = -3; i < -1; i++) {
            buf[44] = (byte) i;
            if (sha1_32(buf) == 1686644389) {
                break;
            }
        }
        for (i = 115; i < 128; i++) {
            buf[45] = (byte) i;
            if (sha1_32(buf) == -658481959) {
                break;
            }
        }
        for (i = 42; i < 58; i++) {
            buf[46] = (byte) i;
            if (sha1_32(buf) == 1555966403) {
                break;
            }
        }
        for (i = -32; i < -16; i++) {
            buf[47] = (byte) i;
            if (sha1_32(buf) == 1318455474) {
                break;
            }
        }
        for (i = 33; i < 54; i++) {
            buf[48] = (byte) i;
            if (sha1_32(buf) == -1503968772) {
                break;
            }
        }
        for (i = 94; i < 113; i++) {
            buf[49] = (byte) i;
            if (sha1_32(buf) == -1759790409) {
                break;
            }
        }
        for (i = -99; i < -93; i++) {
            buf[50] = (byte) i;
            if (sha1_32(buf) == -1057192686) {
                break;
            }
        }
        for (i = 96; i < 110; i++) {
            buf[51] = (byte) i;
            if (sha1_32(buf) == -898535216) {
                break;
            }
        }
        for (i = 85; i < 110; i++) {
            buf[52] = (byte) i;
            if (sha1_32(buf) == -291927673) {
                break;
            }
        }
        for (i = 31; i < 49; i++) {
            buf[53] = (byte) i;
            if (sha1_32(buf) == 109873389) {
                break;
            }
        }
        for (i = -19; i < 4; i++) {
            buf[54] = (byte) i;
            if (sha1_32(buf) == -333684155) {
                break;
            }
        }
        for (i = 63; i < 85; i++) {
            buf[55] = (byte) i;
            if (sha1_32(buf) == -427464793) {
                break;
            }
        }
        for (i = 103; i < 112; i++) {
            buf[56] = (byte) i;
            if (sha1_32(buf) == 1291572161) {
                break;
            }
        }
        for (i = -45; i < -39; i++) {
            buf[57] = (byte) i;
            if (sha1_32(buf) == -1627620097) {
                break;
            }
        }
        for (i = -30; i < -12; i++) {
            buf[58] = (byte) i;
            if (sha1_32(buf) == 90535773) {
                break;
            }
        }
        for (i = 2; i < 7; i++) {
            buf[59] = (byte) i;
            if (sha1_32(buf) == -1612123893) {
                break;
            }
        }
        for (i = 19; i < 26; i++) {
            buf[60] = (byte) i;
            if (sha1_32(buf) == -143136747) {
                break;
            }
        }
        for (i = -52; i < -42; i++) {
            buf[61] = (byte) i;
            if (sha1_32(buf) == -897877994) {
                break;
            }
        }
        for (i = 42; i < 61; i++) {
            buf[62] = (byte) i;
            if (sha1_32(buf) == -318593342) {
                break;
            }
        }
        for (i = 114; i < 126; i++) {
            buf[63] = (byte) i;
            if (sha1_32(buf) == 1961820580) {
                break;
            }
        }
        for (i = 60; i < 70; i++) {
            buf[64] = (byte) i;
            if (sha1_32(buf) == 476116308) {
                break;
            }
        }
        for (i = -40; i < -15; i++) {
            buf[65] = (byte) i;
            if (sha1_32(buf) == -1704779896) {
                break;
            }
        }
        for (i = -11; i < 4; i++) {
            buf[66] = (byte) i;
            if (sha1_32(buf) == 1425101548) {
                break;
            }
        }
        for (i = -63; i < -37; i++) {
            buf[67] = (byte) i;
            if (sha1_32(buf) == -1398490687) {
                break;
            }
        }
        for (i = -77; i < -62; i++) {
            buf[68] = (byte) i;
            if (sha1_32(buf) == -341282057) {
                break;
            }
        }
        for (i = 102; i < 121; i++) {
            buf[69] = (byte) i;
            if (sha1_32(buf) == -964877186) {
                break;
            }
        }
        for (i = -117; i < -101; i++) {
            buf[70] = (byte) i;
            if (sha1_32(buf) == 1622865563) {
                break;
            }
        }
        for (i = -35; i < -16; i++) {
            buf[71] = (byte) i;
            if (sha1_32(buf) == 1059966649) {
                break;
            }
        }
        for (i = -82; i < -63; i++) {
            buf[72] = (byte) i;
            if (sha1_32(buf) == -1861128296) {
                break;
            }
        }
        for (i = -118; i < -106; i++) {
            buf[73] = (byte) i;
            if (sha1_32(buf) == -1661882800) {
                break;
            }
        }
        for (i = 56; i < 70; i++) {
            buf[74] = (byte) i;
            if (sha1_32(buf) == -900104892) {
                break;
            }
        }
        for (i = -46; i < -28; i++) {
            buf[75] = (byte) i;
            if (sha1_32(buf) == 287851955) {
                break;
            }
        }
        for (i = -115; i < -100; i++) {
            buf[76] = (byte) i;
            if (sha1_32(buf) == -1739538778) {
                break;
            }
        }
        for (i = -128; i < -110; i++) {
            buf[77] = (byte) i;
            if (sha1_32(buf) == 314596137) {
                break;
            }
        }
        for (i = 101; i < 111; i++) {
            buf[78] = (byte) i;
            if (sha1_32(buf) == -1898611425) {
                break;
            }
        }
        for (i = -100; i < -81; i++) {
            buf[79] = (byte) i;
            if (sha1_32(buf) == 1540582943) {
                break;
            }
        }
        for (i = 5; i < 25; i++) {
            buf[80] = (byte) i;
            if (sha1_32(buf) == 1647678954) {
                break;
            }
        }
        for (i = -72; i < -54; i++) {
            buf[81] = (byte) i;
            if (sha1_32(buf) == 1852148394) {
                break;
            }
        }
        for (i = -2; i < 5; i++) {
            buf[82] = (byte) i;
            if (sha1_32(buf) == -1501455674) {
                break;
            }
        }
        for (i = -107; i < -91; i++) {
            buf[83] = (byte) i;
            if (sha1_32(buf) == 276657320) {
                break;
            }
        }
        for (i = 1; i < 12; i++) {
            buf[84] = (byte) i;
            if (sha1_32(buf) == 2116082712) {
                break;
            }
        }
        for (i = 81; i < 106; i++) {
            buf[85] = (byte) i;
            if (sha1_32(buf) == -512037012) {
                break;
            }
        }
        for (i = 77; i < 92; i++) {
            buf[86] = (byte) i;
            if (sha1_32(buf) == -1262123272) {
                break;
            }
        }
        for (i = -28; i < -9; i++) {
            buf[87] = (byte) i;
            if (sha1_32(buf) == -224135648) {
                break;
            }
        }
        for (i = -121; i < -111; i++) {
            buf[88] = (byte) i;
            if (sha1_32(buf) == -1392553) {
                break;
            }
        }
        for (i = -14; i < 14; i++) {
            buf[89] = (byte) i;
            if (sha1_32(buf) == 1048430218) {
                break;
            }
        }
        for (i = 83; i < 91; i++) {
            buf[90] = (byte) i;
            if (sha1_32(buf) == 1773958413) {
                break;
            }
        }
        for (i = 111; i < 128; i++) {
            buf[91] = (byte) i;
            if (sha1_32(buf) == 189713952) {
                break;
            }
        }
        for (i = 57; i < 79; i++) {
            buf[92] = (byte) i;
            if (sha1_32(buf) == -279662015) {
                break;
            }
        }
        for (i = 46; i < 54; i++) {
            buf[93] = (byte) i;
            if (sha1_32(buf) == 121602343) {
                break;
            }
        }
        for (i = -75; i < -52; i++) {
            buf[94] = (byte) i;
            if (sha1_32(buf) == -149251130) {
                break;
            }
        }
        for (i = 20; i < 35; i++) {
            buf[95] = (byte) i;
            if (sha1_32(buf) == 1465740567) {
                break;
            }
        }
        for (i = 24; i < 39; i++) {
            buf[96] = (byte) i;
            if (sha1_32(buf) == -1176525198) {
                break;
            }
        }
        for (i = -31; i < -12; i++) {
            buf[97] = (byte) i;
            if (sha1_32(buf) == -1331200223) {
                break;
            }
        }
        for (i = 16; i < 33; i++) {
            buf[98] = (byte) i;
            if (sha1_32(buf) == 1292245542) {
                break;
            }
        }
        for (i = -96; i < -79; i++) {
            buf[99] = (byte) i;
            if (sha1_32(buf) == -1418686111) {
                break;
            }
        }
        for (i = -82; i < -62; i++) {
            buf[100] = (byte) i;
            if (sha1_32(buf) == -322353205) {
                break;
            }
        }
        for (i = -29; i < -8; i++) {
            buf[101] = (byte) i;
            if (sha1_32(buf) == -1863450263) {
                break;
            }
        }
        for (i = -107; i < -93; i++) {
            buf[102] = (byte) i;
            if (sha1_32(buf) == 901010806) {
                break;
            }
        }
        for (i = 11; i < 30; i++) {
            buf[103] = (byte) i;
            if (sha1_32(buf) == 1906104649) {
                break;
            }
        }
        for (i = -121; i < -102; i++) {
            buf[104] = (byte) i;
            if (sha1_32(buf) == -1415751912) {
                break;
            }
        }
        for (i = 79; i < 103; i++) {
            buf[105] = (byte) i;
            if (sha1_32(buf) == 1893753410) {
                break;
            }
        }
        for (i = -128; i < -110; i++) {
            buf[106] = (byte) i;
            if (sha1_32(buf) == -1038059146) {
                break;
            }
        }
        for (i = -35; i < -21; i++) {
            buf[107] = (byte) i;
            if (sha1_32(buf) == 1311840993) {
                break;
            }
        }
        for (i = -21; i < -1; i++) {
            buf[108] = (byte) i;
            if (sha1_32(buf) == 994478143) {
                break;
            }
        }
        for (i = 40; i < 50; i++) {
            buf[109] = (byte) i;
            if (sha1_32(buf) == 32678217) {
                break;
            }
        }
        for (i = 23; i < 47; i++) {
            buf[110] = (byte) i;
            if (sha1_32(buf) == -1405729566) {
                break;
            }
        }
        for (i = 62; i < 86; i++) {
            buf[111] = (byte) i;
            if (sha1_32(buf) == -1289956915) {
                break;
            }
        }
        for (i = 45; i < 62; i++) {
            buf[112] = (byte) i;
            if (sha1_32(buf) == -999475792) {
                break;
            }
        }
        for (i = -93; i < -83; i++) {
            buf[113] = (byte) i;
            if (sha1_32(buf) == -1342970569) {
                break;
            }
        }
        for (i = -75; i < -67; i++) {
            buf[114] = (byte) i;
            if (sha1_32(buf) == -983621299) {
                break;
            }
        }
        for (i = 19; i < 31; i++) {
            buf[115] = (byte) i;
            if (sha1_32(buf) == -326264671) {
                break;
            }
        }
        for (i = -58; i < -40; i++) {
            buf[116] = (byte) i;
            if (sha1_32(buf) == 1609416121) {
                break;
            }
        }
        for (i = -19; i < 0; i++) {
            buf[117] = (byte) i;
            if (sha1_32(buf) == 545500673) {
                break;
            }
        }
        for (i = -49; i < -31; i++) {
            buf[118] = (byte) i;
            if (sha1_32(buf) == 971849181) {
                break;
            }
        }
        for (i = 108; i < 125; i++) {
            buf[119] = (byte) i;
            if (sha1_32(buf) == -2052844016) {
                break;
            }
        }
        for (i = 81; i < 90; i++) {
            buf[120] = (byte) i;
            if (sha1_32(buf) == 592404136) {
                break;
            }
        }
        for (i = 2; i < 15; i++) {
            buf[121] = (byte) i;
            if (sha1_32(buf) == 882173466) {
                break;
            }
        }
        for (i = -6; i < 23; i++) {
            buf[122] = (byte) i;
            if (sha1_32(buf) == -1685015833) {
                break;
            }
        }
        for (i = -89; i < -76; i++) {
            buf[123] = (byte) i;
            if (sha1_32(buf) == -1423046191) {
                break;
            }
        }
        for (i = 52; i < 66; i++) {
            buf[124] = (byte) i;
            if (sha1_32(buf) == 1072193271) {
                break;
            }
        }
        for (i = -12; i < 8; i++) {
            buf[125] = (byte) i;
            if (sha1_32(buf) == -1048954493) {
                break;
            }
        }
        for (i = 51; i < 65; i++) {
            buf[126] = (byte) i;
            if (sha1_32(buf) == -1323246490) {
                break;
            }
        }
        for (i = -90; i < -59; i++) {
            buf[127] = (byte) i;
            if (sha1_32(buf) == 401830757) {
                break;
            }
        }
        for (i = -82; i < -65; i++) {
            buf[128] = (byte) i;
            if (sha1_32(buf) == -795704680) {
                break;
            }
        }
        for (i = -54; i < -34; i++) {
            buf[129] = (byte) i;
            if (sha1_32(buf) == 122622035) {
                break;
            }
        }
        for (i = 75; i < 97; i++) {
            buf[130] = (byte) i;
            if (sha1_32(buf) == -1425145713) {
                break;
            }
        }
        for (i = 70; i < 82; i++) {
            buf[131] = (byte) i;
            if (sha1_32(buf) == -1429592244) {
                break;
            }
        }
        for (i = -46; i < -27; i++) {
            buf[132] = (byte) i;
            if (sha1_32(buf) == 1518791513) {
                break;
            }
        }
        for (i = -83; i < -64; i++) {
            buf[133] = (byte) i;
            if (sha1_32(buf) == -1149162301) {
                break;
            }
        }
        for (i = 69; i < 73; i++) {
            buf[134] = (byte) i;
            if (sha1_32(buf) == 1341805818) {
                break;
            }
        }
        for (i = 40; i < 59; i++) {
            buf[135] = (byte) i;
            if (sha1_32(buf) == -1812636422) {
                break;
            }
        }
        for (i = 67; i < 88; i++) {
            buf[136] = (byte) i;
            if (sha1_32(buf) == -14233526) {
                break;
            }
        }
        for (i = -55; i < -30; i++) {
            buf[137] = (byte) i;
            if (sha1_32(buf) == 1028351175) {
                break;
            }
        }
        for (i = 46; i < 58; i++) {
            buf[138] = (byte) i;
            if (sha1_32(buf) == -914369906) {
                break;
            }
        }
        for (i = 75; i < 94; i++) {
            buf[139] = (byte) i;
            if (sha1_32(buf) == 1938554401) {
                break;
            }
        }
        for (i = 61; i < 78; i++) {
            buf[140] = (byte) i;
            if (sha1_32(buf) == 337542672) {
                break;
            }
        }
        for (i = -116; i < -89; i++) {
            buf[141] = (byte) i;
            if (sha1_32(buf) == -626786725) {
                break;
            }
        }
        for (i = 108; i < 126; i++) {
            buf[142] = (byte) i;
            if (sha1_32(buf) == -16979627) {
                break;
            }
        }
        for (i = -13; i < 1; i++) {
            buf[143] = (byte) i;
            if (sha1_32(buf) == 1592010329) {
                break;
            }
        }
        for (i = 3; i < 26; i++) {
            buf[144] = (byte) i;
            if (sha1_32(buf) == 1043554983) {
                break;
            }
        }
        for (i = -28; i < -12; i++) {
            buf[145] = (byte) i;
            if (sha1_32(buf) == -1167727801) {
                break;
            }
        }
        for (i = -28; i < -14; i++) {
            buf[146] = (byte) i;
            if (sha1_32(buf) == -1776898119) {
                break;
            }
        }
        for (i = 88; i < 93; i++) {
            buf[147] = (byte) i;
            if (sha1_32(buf) == -1365009753) {
                break;
            }
        }
        for (i = 17; i < 32; i++) {
            buf[148] = (byte) i;
            if (sha1_32(buf) == 1214640302) {
                break;
            }
        }
        for (i = 42; i < 58; i++) {
            buf[149] = (byte) i;
            if (sha1_32(buf) == -536364195) {
                break;
            }
        }
        for (i = -9; i < 3; i++) {
            buf[150] = (byte) i;
            if (sha1_32(buf) == 113746736) {
                break;
            }
        }
        for (i = -57; i < -55; i++) {
            buf[151] = (byte) i;
            if (sha1_32(buf) == -93860000) {
                break;
            }
        }
        for (i = -6; i < 6; i++) {
            buf[152] = (byte) i;
            if (sha1_32(buf) == -194984287) {
                break;
            }
        }
        for (i = -101; i < -84; i++) {
            buf[153] = (byte) i;
            if (sha1_32(buf) == 172701561) {
                break;
            }
        }
        for (i = -40; i < -22; i++) {
            buf[154] = (byte) i;
            if (sha1_32(buf) == 1836265880) {
                break;
            }
        }
        for (i = -52; i < -25; i++) {
            buf[155] = (byte) i;
            if (sha1_32(buf) == 1658243992) {
                break;
            }
        }
        for (i = -63; i < -44; i++) {
            buf[156] = (byte) i;
            if (sha1_32(buf) == -69755876) {
                break;
            }
        }
        for (i = 107; i < 128; i++) {
            buf[157] = (byte) i;
            if (sha1_32(buf) == -468482944) {
                break;
            }
        }
        for (i = -103; i < -89; i++) {
            buf[158] = (byte) i;
            if (sha1_32(buf) == 1217743975) {
                break;
            }
        }
        for (i = 43; i < 56; i++) {
            buf[159] = (byte) i;
            if (sha1_32(buf) == 573608693) {
                break;
            }
        }
        for (i = -45; i < -41; i++) {
            buf[160] = (byte) i;
            if (sha1_32(buf) == -610537733) {
                break;
            }
        }
        for (i = 92; i < 107; i++) {
            buf[161] = (byte) i;
            if (sha1_32(buf) == -1430352431) {
                break;
            }
        }
        for (i = 80; i < 86; i++) {
            buf[162] = (byte) i;
            if (sha1_32(buf) == 690126361) {
                break;
            }
        }
        for (i = 31; i < 46; i++) {
            buf[163] = (byte) i;
            if (sha1_32(buf) == 882106421) {
                break;
            }
        }
        for (i = 36; i < 45; i++) {
            buf[164] = (byte) i;
            if (sha1_32(buf) == 1778773323) {
                break;
            }
        }
        for (i = 35; i < 43; i++) {
            buf[165] = (byte) i;
            if (sha1_32(buf) == -907237497) {
                break;
            }
        }
        for (i = 54; i < 63; i++) {
            buf[166] = (byte) i;
            if (sha1_32(buf) == -497716063) {
                break;
            }
        }
        for (i = 58; i < 71; i++) {
            buf[167] = (byte) i;
            if (sha1_32(buf) == -1839687500) {
                break;
            }
        }
        for (i = 109; i < 120; i++) {
            buf[168] = (byte) i;
            if (sha1_32(buf) == -38052228) {
                break;
            }
        }
        for (i = -3; i < 8; i++) {
            buf[169] = (byte) i;
            if (sha1_32(buf) == -38052228) {
                break;
            }
        }
        for (i = -41; i < -35; i++) {
            buf[170] = (byte) i;
            if (sha1_32(buf) == -1630911590) {
                break;
            }
        }
        for (i = 28; i < 52; i++) {
            buf[171] = (byte) i;
            if (sha1_32(buf) == 532569086) {
                break;
            }
        }
        for (i = 99; i < 124; i++) {
            buf[172] = (byte) i;
            if (sha1_32(buf) == 2058595804) {
                break;
            }
        }
        for (i = -107; i < -96; i++) {
            buf[173] = (byte) i;
            if (sha1_32(buf) == -1707607726) {
                break;
            }
        }
        for (i = -50; i < -37; i++) {
            buf[174] = (byte) i;
            if (sha1_32(buf) == 908447728) {
                break;
            }
        }
        for (i = -82; i < -77; i++) {
            buf[175] = (byte) i;
            if (sha1_32(buf) == 1325898583) {
                break;
            }
        }
        for (i = -93; i < -85; i++) {
            buf[176] = (byte) i;
            if (sha1_32(buf) == 725318902) {
                break;
            }
        }
        for (i = -29; i < -12; i++) {
            buf[177] = (byte) i;
            if (sha1_32(buf) == 278600272) {
                break;
            }
        }
        for (i = -114; i < -92; i++) {
            buf[178] = (byte) i;
            if (sha1_32(buf) == -54239660) {
                break;
            }
        }
        for (i = -28; i < -19; i++) {
            buf[179] = (byte) i;
            if (sha1_32(buf) == -1683189603) {
                break;
            }
        }
        for (i = 104; i < 126; i++) {
            buf[180] = (byte) i;
            if (sha1_32(buf) == 1683951258) {
                break;
            }
        }
        for (i = 110; i < 128; i++) {
            buf[181] = (byte) i;
            if (sha1_32(buf) == -1133268401) {
                break;
            }
        }
        for (i = -59; i < -48; i++) {
            buf[182] = (byte) i;
            if (sha1_32(buf) == -454980153) {
                break;
            }
        }
        for (i = -117; i < -103; i++) {
            buf[183] = (byte) i;
            if (sha1_32(buf) == -1147416183) {
                break;
            }
        }
        for (i = -49; i < -46; i++) {
            buf[184] = (byte) i;
            if (sha1_32(buf) == 221770123) {
                break;
            }
        }
        for (i = 107; i < 120; i++) {
            buf[185] = (byte) i;
            if (sha1_32(buf) == 43084170) {
                break;
            }
        }
        for (i = 0; i < 27; i++) {
            buf[186] = (byte) i;
            if (sha1_32(buf) == -1501390702) {
                break;
            }
        }
        for (i = -124; i < -116; i++) {
            buf[187] = (byte) i;
            if (sha1_32(buf) == 1966988769) {
                break;
            }
        }
        for (i = 72; i < 94; i++) {
            buf[188] = (byte) i;
            if (sha1_32(buf) == -539097446) {
                break;
            }
        }
        for (i = 93; i < 112; i++) {
            buf[189] = (byte) i;
            if (sha1_32(buf) == -344253851) {
                break;
            }
        }
        for (i = -105; i < -83; i++) {
            buf[190] = (byte) i;
            if (sha1_32(buf) == -372986547) {
                break;
            }
        }
        for (i = 32; i < 37; i++) {
            buf[191] = (byte) i;
            if (sha1_32(buf) == 1654489376) {
                break;
            }
        }
        for (i = 0; i < 30; i++) {
            buf[192] = (byte) i;
            if (sha1_32(buf) == 1351108765) {
                break;
            }
        }
        for (i = -34; i < -26; i++) {
            buf[193] = (byte) i;
            if (sha1_32(buf) == 634781781) {
                break;
            }
        }
        for (i = -71; i < -66; i++) {
            buf[194] = (byte) i;
            if (sha1_32(buf) == -1830597218) {
                break;
            }
        }
        for (i = -59; i < -45; i++) {
            buf[195] = (byte) i;
            if (sha1_32(buf) == -276435457) {
                break;
            }
        }
        for (i = -97; i < -74; i++) {
            buf[196] = (byte) i;
            if (sha1_32(buf) == -1974802269) {
                break;
            }
        }
        for (i = -50; i < -41; i++) {
            buf[197] = (byte) i;
            if (sha1_32(buf) == -1625836149) {
                break;
            }
        }
        for (i = 89; i < 102; i++) {
            buf[198] = (byte) i;
            if (sha1_32(buf) == 1628840236) {
                break;
            }
        }
        for (i = 57; i < 83; i++) {
            buf[199] = (byte) i;
            if (sha1_32(buf) == 256056778) {
                break;
            }
        }
        for (i = 59; i < 80; i++) {
            buf[200] = (byte) i;
            if (sha1_32(buf) == -1378126899) {
                break;
            }
        }
        for (i = -125; i < -105; i++) {
            buf[201] = (byte) i;
            if (sha1_32(buf) == -1250087893) {
                break;
            }
        }
        for (i = 101; i < 115; i++) {
            buf[202] = (byte) i;
            if (sha1_32(buf) == -437942285) {
                break;
            }
        }
        for (i = -5; i < 15; i++) {
            buf[203] = (byte) i;
            if (sha1_32(buf) == 1340034250) {
                break;
            }
        }
        for (i = -128; i < -107; i++) {
            buf[204] = (byte) i;
            if (sha1_32(buf) == -1092049094) {
                break;
            }
        }
        for (i = -71; i < -55; i++) {
            buf[205] = (byte) i;
            if (sha1_32(buf) == -2038907470) {
                break;
            }
        }
        for (i = 76; i < 95; i++) {
            buf[206] = (byte) i;
            if (sha1_32(buf) == -1747934350) {
                break;
            }
        }
        for (i = 8; i < 34; i++) {
            buf[207] = (byte) i;
            if (sha1_32(buf) == 967142741) {
                break;
            }
        }
        for (i = 107; i < 128; i++) {
            buf[208] = (byte) i;
            if (sha1_32(buf) == 110440880) {
                break;
            }
        }
        for (i = 26; i < 47; i++) {
            buf[209] = (byte) i;
            if (sha1_32(buf) == -1791474742) {
                break;
            }
        }
        for (i = -128; i < -123; i++) {
            buf[210] = (byte) i;
            if (sha1_32(buf) == -130908367) {
                break;
            }
        }
        for (i = 111; i < 128; i++) {
            buf[211] = (byte) i;
            if (sha1_32(buf) == 1117560037) {
                break;
            }
        }
        for (i = -80; i < -65; i++) {
            buf[212] = (byte) i;
            if (sha1_32(buf) == 1694377896) {
                break;
            }
        }
        for (i = 70; i < 82; i++) {
            buf[213] = (byte) i;
            if (sha1_32(buf) == -808820407) {
                break;
            }
        }
        for (i = 52; i < 74; i++) {
            buf[214] = (byte) i;
            if (sha1_32(buf) == 2139944723) {
                break;
            }
        }
        for (i = -13; i < -2; i++) {
            buf[215] = (byte) i;
            if (sha1_32(buf) == 86136200) {
                break;
            }
        }
        for (i = -32; i < -23; i++) {
            buf[216] = (byte) i;
            if (sha1_32(buf) == -1203715578) {
                break;
            }
        }
        for (i = 2; i < 28; i++) {
            buf[217] = (byte) i;
            if (sha1_32(buf) == -505300939) {
                break;
            }
        }
        for (i = 73; i < 90; i++) {
            buf[218] = (byte) i;
            if (sha1_32(buf) == -252276952) {
                break;
            }
        }
        for (i = 24; i < 42; i++) {
            buf[219] = (byte) i;
            if (sha1_32(buf) == -277279876) {
                break;
            }
        }
        for (i = -5; i < 8; i++) {
            buf[220] = (byte) i;
            if (sha1_32(buf) == -409144845) {
                break;
            }
        }
        for (i = -34; i < -17; i++) {
            buf[221] = (byte) i;
            if (sha1_32(buf) == -866278896) {
                break;
            }
        }
        for (i = 56; i < 84; i++) {
            buf[222] = (byte) i;
            if (sha1_32(buf) == -996620930) {
                break;
            }
        }
        for (i = 18; i < 44; i++) {
            buf[223] = (byte) i;
            if (sha1_32(buf) == -34492548) {
                break;
            }
        }
        for (i = 105; i < 119; i++) {
            buf[224] = (byte) i;
            if (sha1_32(buf) == 529489052) {
                break;
            }
        }
        for (i = -2; i < 5; i++) {
            buf[225] = (byte) i;
            if (sha1_32(buf) == 343461183) {
                break;
            }
        }
        for (i = 53; i < 67; i++) {
            buf[226] = (byte) i;
            if (sha1_32(buf) == 900832445) {
                break;
            }
        }
        for (i = -7; i < 8; i++) {
            buf[227] = (byte) i;
            if (sha1_32(buf) == -1034538788) {
                break;
            }
        }
        for (i = -68; i < -53; i++) {
            buf[228] = (byte) i;
            if (sha1_32(buf) == 778986034) {
                break;
            }
        }
        for (i = -42; i < -29; i++) {
            buf[229] = (byte) i;
            if (sha1_32(buf) == 514362712) {
                break;
            }
        }
        for (i = -89; i < -72; i++) {
            buf[230] = (byte) i;
            if (sha1_32(buf) == -1156727707) {
                break;
            }
        }
        for (i = -45; i < -37; i++) {
            buf[231] = (byte) i;
            if (sha1_32(buf) == -662889751) {
                break;
            }
        }
        for (i = 120; i < 128; i++) {
            buf[232] = (byte) i;
            if (sha1_32(buf) == -1237219018) {
                break;
            }
        }
        for (i = 93; i < 103; i++) {
            buf[233] = (byte) i;
            if (sha1_32(buf) == -1323495012) {
                break;
            }
        }
        for (i = 78; i < 100; i++) {
            buf[234] = (byte) i;
            if (sha1_32(buf) == 1538151271) {
                break;
            }
        }
        for (i = -124; i < -104; i++) {
            buf[235] = (byte) i;
            if (sha1_32(buf) == -595668685) {
                break;
            }
        }
        for (i = -55; i < -31; i++) {
            buf[236] = (byte) i;
            if (sha1_32(buf) == 519556983) {
                break;
            }
        }
        for (i = -112; i < -111; i++) {
            buf[237] = (byte) i;
            if (sha1_32(buf) == -562895806) {
                break;
            }
        }
        for (i = 80; i < 102; i++) {
            buf[238] = (byte) i;
            if (sha1_32(buf) == -771736414) {
                break;
            }
        }
        for (i = 33; i < 52; i++) {
            buf[239] = (byte) i;
            if (sha1_32(buf) == -768467069) {
                break;
            }
        }
        for (i = 12; i < 33; i++) {
            buf[240] = (byte) i;
            if (sha1_32(buf) == 1910972870) {
                break;
            }
        }
        for (i = 46; i < 68; i++) {
            buf[241] = (byte) i;
            if (sha1_32(buf) == -1440420550) {
                break;
            }
        }
        for (i = -40; i < -12; i++) {
            buf[242] = (byte) i;
            if (sha1_32(buf) == 1622519828) {
                break;
            }
        }
        for (i = -36; i < -18; i++) {
            buf[243] = (byte) i;
            if (sha1_32(buf) == 1251952624) {
                break;
            }
        }
        for (i = 37; i < 53; i++) {
            buf[244] = (byte) i;
            if (sha1_32(buf) == -928094178) {
                break;
            }
        }
        for (i = -48; i < -27; i++) {
            buf[245] = (byte) i;
            if (sha1_32(buf) == 1628126520) {
                break;
            }
        }
        for (i = 26; i < 42; i++) {
            buf[246] = (byte) i;
            if (sha1_32(buf) == 1340700379) {
                break;
            }
        }
        for (i = -11; i < 10; i++) {
            buf[247] = (byte) i;
            if (sha1_32(buf) == 577171291) {
                break;
            }
        }
        for (i = 27; i < 46; i++) {
            buf[248] = (byte) i;
            if (sha1_32(buf) == 218823502) {
                break;
            }
        }
        for (i = -114; i < -103; i++) {
            buf[249] = (byte) i;
            if (sha1_32(buf) == 1706603803) {
                break;
            }
        }
        for (i = -29; i < -8; i++) {
            buf[250] = (byte) i;
            if (sha1_32(buf) == -1654658655) {
                break;
            }
        }
        for (i = -68; i < -52; i++) {
            buf[251] = (byte) i;
            if (sha1_32(buf) == -956853719) {
                break;
            }
        }
        for (i = -59; i < -42; i++) {
            buf[252] = (byte) i;
            if (sha1_32(buf) == -1713045491) {
                break;
            }
        }
        for (i = -122; i < -115; i++) {
            buf[253] = (byte) i;
            if (sha1_32(buf) == 273864175) {
                break;
            }
        }
        for (i = -74; i < -63; i++) {
            buf[254] = (byte) i;
            if (sha1_32(buf) == 927187853) {
                break;
            }
        }
        for (i = -25; i < -19; i++) {
            buf[255] = (byte) i;
            if (sha1_32(buf) == -229154346) {
                break;
            }
        }
        for (i = 17; i < 38; i++) {
            buf[256] = (byte) i;
            if (sha1_32(buf) == -2108614067) {
                break;
            }
        }
        for (i = -13; i < 12; i++) {
            buf[257] = (byte) i;
            if (sha1_32(buf) == 1081819551) {
                break;
            }
        }
        for (i = -120; i < -98; i++) {
            buf[258] = (byte) i;
            if (sha1_32(buf) == 933558770) {
                break;
            }
        }
        for (i = -28; i < -13; i++) {
            buf[259] = (byte) i;
            if (sha1_32(buf) == -916400730) {
                break;
            }
        }
        for (i = -93; i < -90; i++) {
            buf[260] = (byte) i;
            if (sha1_32(buf) == -111542164) {
                break;
            }
        }
        for (i = 76; i < 86; i++) {
            buf[261] = (byte) i;
            if (sha1_32(buf) == -936845760) {
                break;
            }
        }
        for (i = 29; i < 31; i++) {
            buf[262] = (byte) i;
            if (sha1_32(buf) == 554591875) {
                break;
            }
        }
        for (i = -70; i < -43; i++) {
            buf[263] = (byte) i;
            if (sha1_32(buf) == -113136097) {
                break;
            }
        }
        for (i = -57; i < -45; i++) {
            buf[264] = (byte) i;
            if (sha1_32(buf) == -293908807) {
                break;
            }
        }
        for (i = -68; i < -52; i++) {
            buf[265] = (byte) i;
            if (sha1_32(buf) == -1169200306) {
                break;
            }
        }
        for (i = 15; i < 26; i++) {
            buf[266] = (byte) i;
            if (sha1_32(buf) == -919784338) {
                break;
            }
        }
        for (i = 83; i < 105; i++) {
            buf[267] = (byte) i;
            if (sha1_32(buf) == 1383051865) {
                break;
            }
        }
        for (i = -105; i < -93; i++) {
            buf[268] = (byte) i;
            if (sha1_32(buf) == -194745240) {
                break;
            }
        }
        for (i = -93; i < -74; i++) {
            buf[269] = (byte) i;
            if (sha1_32(buf) == 1392146741) {
                break;
            }
        }
        for (i = -61; i < -51; i++) {
            buf[270] = (byte) i;
            if (sha1_32(buf) == 1253553743) {
                break;
            }
        }
        for (i = 49; i < 62; i++) {
            buf[271] = (byte) i;
            if (sha1_32(buf) == -746329575) {
                break;
            }
        }
        for (i = 112; i < 119; i++) {
            buf[272] = (byte) i;
            if (sha1_32(buf) == 1137071412) {
                break;
            }
        }
        for (i = 83; i < 104; i++) {
            buf[273] = (byte) i;
            if (sha1_32(buf) == -1650086603) {
                break;
            }
        }
        for (i = -38; i < -18; i++) {
            buf[274] = (byte) i;
            if (sha1_32(buf) == 1691416096) {
                break;
            }
        }
        for (i = -25; i < 1; i++) {
            buf[275] = (byte) i;
            if (sha1_32(buf) == 101967231) {
                break;
            }
        }
        for (i = 94; i < 116; i++) {
            buf[276] = (byte) i;
            if (sha1_32(buf) == -764357177) {
                break;
            }
        }
        for (i = 15; i < 45; i++) {
            buf[277] = (byte) i;
            if (sha1_32(buf) == -558420509) {
                break;
            }
        }
        for (i = 80; i < 103; i++) {
            buf[278] = (byte) i;
            if (sha1_32(buf) == -333995651) {
                break;
            }
        }
        for (i = -107; i < -91; i++) {
            buf[279] = (byte) i;
            if (sha1_32(buf) == 1091868801) {
                break;
            }
        }
        for (i = 44; i < 71; i++) {
            buf[280] = (byte) i;
            if (sha1_32(buf) == -1033092122) {
                break;
            }
        }
        for (i = 52; i < 62; i++) {
            buf[281] = (byte) i;
            if (sha1_32(buf) == -1948689715) {
                break;
            }
        }
        for (i = 82; i < 107; i++) {
            buf[282] = (byte) i;
            if (sha1_32(buf) == 269319698) {
                break;
            }
        }
        for (i = -46; i < -30; i++) {
            buf[283] = (byte) i;
            if (sha1_32(buf) == 63002150) {
                break;
            }
        }
        for (i = 120; i < 128; i++) {
            buf[284] = (byte) i;
            if (sha1_32(buf) == 227023894) {
                break;
            }
        }
        for (i = -52; i < -29; i++) {
            buf[285] = (byte) i;
            if (sha1_32(buf) == -156817893) {
                break;
            }
        }
        for (i = 84; i < 89; i++) {
            buf[286] = (byte) i;
            if (sha1_32(buf) == -599647661) {
                break;
            }
        }
        for (i = 16; i < 36; i++) {
            buf[287] = (byte) i;
            if (sha1_32(buf) == 1247283966) {
                break;
            }
        }
        for (i = -10; i < 20; i++) {
            buf[288] = (byte) i;
            if (sha1_32(buf) == 2135322760) {
                break;
            }
        }
        for (i = 39; i < 48; i++) {
            buf[289] = (byte) i;
            if (sha1_32(buf) == 337013396) {
                break;
            }
        }
        for (i = -71; i < -51; i++) {
            buf[290] = (byte) i;
            if (sha1_32(buf) == -922098784) {
                break;
            }
        }
        for (i = 85; i < 104; i++) {
            buf[291] = (byte) i;
            if (sha1_32(buf) == 1086218283) {
                break;
            }
        }
        for (i = -84; i < -79; i++) {
            buf[292] = (byte) i;
            if (sha1_32(buf) == -1131746058) {
                break;
            }
        }
        for (i = 106; i < 125; i++) {
            buf[293] = (byte) i;
            if (sha1_32(buf) == -551622603) {
                break;
            }
        }
        for (i = 44; i < 63; i++) {
            buf[294] = (byte) i;
            if (sha1_32(buf) == 1282939628) {
                break;
            }
        }
        for (i = -19; i < -8; i++) {
            buf[295] = (byte) i;
            if (sha1_32(buf) == 142737940) {
                break;
            }
        }
        for (i = -73; i < -54; i++) {
            buf[296] = (byte) i;
            if (sha1_32(buf) == 72401340) {
                break;
            }
        }
        for (i = 118; i < 123; i++) {
            buf[297] = (byte) i;
            if (sha1_32(buf) == -1514142161) {
                break;
            }
        }
        for (i = 116; i < 126; i++) {
            buf[298] = (byte) i;
            if (sha1_32(buf) == -738792077) {
                break;
            }
        }
        for (i = -39; i < -21; i++) {
            buf[299] = (byte) i;
            if (sha1_32(buf) == -525365898) {
                break;
            }
        }
        for (i = 91; i < 108; i++) {
            buf[300] = (byte) i;
            if (sha1_32(buf) == -19645010) {
                break;
            }
        }
        for (i = -107; i < -89; i++) {
            buf[301] = (byte) i;
            if (sha1_32(buf) == -807244800) {
                break;
            }
        }
        for (i = 43; i < 67; i++) {
            buf[302] = (byte) i;
            if (sha1_32(buf) == 1144783578) {
                break;
            }
        }
        for (i = 19; i < 47; i++) {
            buf[303] = (byte) i;
            if (sha1_32(buf) == -542269321) {
                break;
            }
        }
        for (i = 97; i < 109; i++) {
            buf[304] = (byte) i;
            if (sha1_32(buf) == -682073091) {
                break;
            }
        }
        for (i = 100; i < 123; i++) {
            buf[305] = (byte) i;
            if (sha1_32(buf) == 1687525237) {
                break;
            }
        }
        for (i = 50; i < 77; i++) {
            buf[306] = (byte) i;
            if (sha1_32(buf) == -820408574) {
                break;
            }
        }
        for (i = 73; i < 92; i++) {
            buf[307] = (byte) i;
            if (sha1_32(buf) == 1123762561) {
                break;
            }
        }
        for (i = 117; i < 128; i++) {
            buf[308] = (byte) i;
            if (sha1_32(buf) == -422332066) {
                break;
            }
        }
        for (i = -87; i < -78; i++) {
            buf[309] = (byte) i;
            if (sha1_32(buf) == 1972546575) {
                break;
            }
        }
        for (i = -39; i < -24; i++) {
            buf[310] = (byte) i;
            if (sha1_32(buf) == -1659628985) {
                break;
            }
        }
        for (i = -4; i < 23; i++) {
            buf[311] = (byte) i;
            if (sha1_32(buf) == -1905287662) {
                break;
            }
        }
        for (i = -68; i < -51; i++) {
            buf[312] = (byte) i;
            if (sha1_32(buf) == -471004967) {
                break;
            }
        }
        for (i = 101; i < 116; i++) {
            buf[313] = (byte) i;
            if (sha1_32(buf) == 2084249319) {
                break;
            }
        }
        for (i = -25; i < -15; i++) {
            buf[314] = (byte) i;
            if (sha1_32(buf) == 1485083465) {
                break;
            }
        }
        for (i = 1; i < 21; i++) {
            buf[315] = (byte) i;
            if (sha1_32(buf) == -757859569) {
                break;
            }
        }
        for (i = 55; i < 71; i++) {
            buf[316] = (byte) i;
            if (sha1_32(buf) == 1599555600) {
                break;
            }
        }
        for (i = 83; i < 92; i++) {
            buf[317] = (byte) i;
            if (sha1_32(buf) == -1605076657) {
                break;
            }
        }
        for (i = -86; i < -82; i++) {
            buf[318] = (byte) i;
            if (sha1_32(buf) == 1406345926) {
                break;
            }
        }
        for (i = 67; i < 94; i++) {
            buf[319] = (byte) i;
            if (sha1_32(buf) == 687081304) {
                break;
            }
        }
        for (i = 95; i < 115; i++) {
            buf[320] = (byte) i;
            if (sha1_32(buf) == 250316729) {
                break;
            }
        }
        for (i = -128; i < -115; i++) {
            buf[321] = (byte) i;
            if (sha1_32(buf) == -957383117) {
                break;
            }
        }
        for (i = 13; i < 29; i++) {
            buf[322] = (byte) i;
            if (sha1_32(buf) == -1427359638) {
                break;
            }
        }
        for (i = -12; i < 17; i++) {
            buf[323] = (byte) i;
            if (sha1_32(buf) == 431321115) {
                break;
            }
        }
        for (i = -33; i < -8; i++) {
            buf[324] = (byte) i;
            if (sha1_32(buf) == 1900769854) {
                break;
            }
        }
        for (i = -123; i < -113; i++) {
            buf[325] = (byte) i;
            if (sha1_32(buf) == 956432243) {
                break;
            }
        }
        for (i = -113; i < -102; i++) {
            buf[326] = (byte) i;
            if (sha1_32(buf) == 369926663) {
                break;
            }
        }
        for (i = 16; i < 38; i++) {
            buf[327] = (byte) i;
            if (sha1_32(buf) == -737885921) {
                break;
            }
        }
        for (i = -11; i < 2; i++) {
            buf[328] = (byte) i;
            if (sha1_32(buf) == 182997984) {
                break;
            }
        }
        for (i = 109; i < 128; i++) {
            buf[329] = (byte) i;
            if (sha1_32(buf) == 54002140) {
                break;
            }
        }
        for (i = 29; i < 41; i++) {
            buf[330] = (byte) i;
            if (sha1_32(buf) == 554371031) {
                break;
            }
        }
        for (i = -120; i < -115; i++) {
            buf[331] = (byte) i;
            if (sha1_32(buf) == -764063729) {
                break;
            }
        }
        for (i = 6; i < 11; i++) {
            buf[332] = (byte) i;
            if (sha1_32(buf) == -1526297296) {
                break;
            }
        }
        for (i = 77; i < 94; i++) {
            buf[333] = (byte) i;
            if (sha1_32(buf) == 1728544401) {
                break;
            }
        }
        for (i = 37; i < 60; i++) {
            buf[334] = (byte) i;
            if (sha1_32(buf) == 2108331957) {
                break;
            }
        }
        for (i = -108; i < -99; i++) {
            buf[335] = (byte) i;
            if (sha1_32(buf) == -1438333517) {
                break;
            }
        }
        for (i = -62; i < -55; i++) {
            buf[336] = (byte) i;
            if (sha1_32(buf) == -1062081718) {
                break;
            }
        }
        for (i = -43; i < -26; i++) {
            buf[337] = (byte) i;
            if (sha1_32(buf) == 1475707314) {
                break;
            }
        }
        for (i = -20; i < 3; i++) {
            buf[338] = (byte) i;
            if (sha1_32(buf) == -1633861928) {
                break;
            }
        }
        for (i = -95; i < -75; i++) {
            buf[339] = (byte) i;
            if (sha1_32(buf) == 1454876353) {
                break;
            }
        }
        for (i = -57; i < -43; i++) {
            buf[340] = (byte) i;
            if (sha1_32(buf) == 294543301) {
                break;
            }
        }
        for (i = -49; i < -29; i++) {
            buf[341] = (byte) i;
            if (sha1_32(buf) == 642787255) {
                break;
            }
        }
        for (i = -3; i < 9; i++) {
            buf[342] = (byte) i;
            if (sha1_32(buf) == 560221209) {
                break;
            }
        }
        for (i = 79; i < 107; i++) {
            buf[343] = (byte) i;
            if (sha1_32(buf) == 1133241538) {
                break;
            }
        }
        for (i = 46; i < 59; i++) {
            buf[344] = (byte) i;
            if (sha1_32(buf) == -831547067) {
                break;
            }
        }
        for (i = -127; i < -123; i++) {
            buf[345] = (byte) i;
            if (sha1_32(buf) == 1015727562) {
                break;
            }
        }
        for (i = -128; i < -121; i++) {
            buf[346] = (byte) i;
            if (sha1_32(buf) == -1403377814) {
                break;
            }
        }
        for (i = -93; i < -76; i++) {
            buf[347] = (byte) i;
            if (sha1_32(buf) == 171269613) {
                break;
            }
        }
        for (i = 77; i < 90; i++) {
            buf[348] = (byte) i;
            if (sha1_32(buf) == -710559334) {
                break;
            }
        }
        for (i = -8; i < -3; i++) {
            buf[349] = (byte) i;
            if (sha1_32(buf) == 251338489) {
                break;
            }
        }
        for (i = 78; i < 88; i++) {
            buf[350] = (byte) i;
            if (sha1_32(buf) == -1463411575) {
                break;
            }
        }
        for (i = 86; i < 102; i++) {
            buf[351] = (byte) i;
            if (sha1_32(buf) == 1823760799) {
                break;
            }
        }
        for (i = -83; i < -58; i++) {
            buf[352] = (byte) i;
            if (sha1_32(buf) == 1385878577) {
                break;
            }
        }
        for (i = 94; i < 103; i++) {
            buf[353] = (byte) i;
            if (sha1_32(buf) == -1613162171) {
                break;
            }
        }
        for (i = -103; i < -88; i++) {
            buf[354] = (byte) i;
            if (sha1_32(buf) == -1193646763) {
                break;
            }
        }
        for (i = 11; i < 22; i++) {
            buf[355] = (byte) i;
            if (sha1_32(buf) == 280083780) {
                break;
            }
        }
        for (i = -6; i < 2; i++) {
            buf[356] = (byte) i;
            if (sha1_32(buf) == -1384157825) {
                break;
            }
        }
        for (i = 63; i < 78; i++) {
            buf[357] = (byte) i;
            if (sha1_32(buf) == -12961409) {
                break;
            }
        }
        for (i = -128; i < -123; i++) {
            buf[358] = (byte) i;
            if (sha1_32(buf) == -1695426231) {
                break;
            }
        }
        for (i = 23; i < 30; i++) {
            buf[359] = (byte) i;
            if (sha1_32(buf) == 1262196025) {
                break;
            }
        }
        for (i = 55; i < 67; i++) {
            buf[360] = (byte) i;
            if (sha1_32(buf) == 1589666383) {
                break;
            }
        }
        for (i = -22; i < 8; i++) {
            buf[361] = (byte) i;
            if (sha1_32(buf) == -1485540669) {
                break;
            }
        }
        for (i = 113; i < 125; i++) {
            buf[362] = (byte) i;
            if (sha1_32(buf) == 1896489470) {
                break;
            }
        }
        for (i = -84; i < -79; i++) {
            buf[363] = (byte) i;
            if (sha1_32(buf) == 263745249) {
                break;
            }
        }
        for (i = -128; i < -112; i++) {
            buf[364] = (byte) i;
            if (sha1_32(buf) == 1873011091) {
                break;
            }
        }
        for (i = -76; i < -63; i++) {
            buf[365] = (byte) i;
            if (sha1_32(buf) == -1856139592) {
                break;
            }
        }
        for (i = 67; i < 79; i++) {
            buf[366] = (byte) i;
            if (sha1_32(buf) == 940404250) {
                break;
            }
        }
        for (i = -68; i < -49; i++) {
            buf[367] = (byte) i;
            if (sha1_32(buf) == -1144288081) {
                break;
            }
        }
        for (i = 7; i < 19; i++) {
            buf[368] = (byte) i;
            if (sha1_32(buf) == -846789775) {
                break;
            }
        }
        for (i = -117; i < -99; i++) {
            buf[369] = (byte) i;
            if (sha1_32(buf) == 740044489) {
                break;
            }
        }
        for (i = 50; i < 66; i++) {
            buf[370] = (byte) i;
            if (sha1_32(buf) == 615579363) {
                break;
            }
        }
        for (i = 121; i < 128; i++) {
            buf[371] = (byte) i;
            if (sha1_32(buf) == -106790265) {
                break;
            }
        }
        for (i = -75; i < -70; i++) {
            buf[372] = (byte) i;
            if (sha1_32(buf) == -241016396) {
                break;
            }
        }
        for (i = 68; i < 81; i++) {
            buf[373] = (byte) i;
            if (sha1_32(buf) == 310457658) {
                break;
            }
        }
        for (i = -59; i < -46; i++) {
            buf[374] = (byte) i;
            if (sha1_32(buf) == -1615413733) {
                break;
            }
        }
        for (i = -60; i < -38; i++) {
            buf[375] = (byte) i;
            if (sha1_32(buf) == -1096355009) {
                break;
            }
        }
        for (i = 65; i < 89; i++) {
            buf[376] = (byte) i;
            if (sha1_32(buf) == -913783547) {
                break;
            }
        }
        for (i = -57; i < -49; i++) {
            buf[377] = (byte) i;
            if (sha1_32(buf) == 1481409107) {
                break;
            }
        }
        for (i = -2; i < 13; i++) {
            buf[378] = (byte) i;
            if (sha1_32(buf) == -701136201) {
                break;
            }
        }
        for (i = -18; i < 5; i++) {
            buf[379] = (byte) i;
            if (sha1_32(buf) == -1241447716) {
                break;
            }
        }
        for (i = 26; i < 32; i++) {
            buf[380] = (byte) i;
            if (sha1_32(buf) == -1309021729) {
                break;
            }
        }
        for (i = -76; i < -64; i++) {
            buf[381] = (byte) i;
            if (sha1_32(buf) == 898704218) {
                break;
            }
        }
        for (i = 50; i < 60; i++) {
            buf[382] = (byte) i;
            if (sha1_32(buf) == 1417119879) {
                break;
            }
        }
        for (i = 26; i < 53; i++) {
            buf[383] = (byte) i;
            if (sha1_32(buf) == 308659159) {
                break;
            }
        }
        for (i = 91; i < 114; i++) {
            buf[384] = (byte) i;
            if (sha1_32(buf) == -1849364769) {
                break;
            }
        }
        for (i = -49; i < -38; i++) {
            buf[385] = (byte) i;
            if (sha1_32(buf) == -2077619914) {
                break;
            }
        }
        for (i = -11; i < 3; i++) {
            buf[386] = (byte) i;
            if (sha1_32(buf) == -337855475) {
                break;
            }
        }
        for (i = -77; i < -66; i++) {
            buf[387] = (byte) i;
            if (sha1_32(buf) == 1700406795) {
                break;
            }
        }
        for (i = -36; i < -22; i++) {
            buf[388] = (byte) i;
            if (sha1_32(buf) == -1150927128) {
                break;
            }
        }
        for (i = -29; i < -8; i++) {
            buf[389] = (byte) i;
            if (sha1_32(buf) == -1144263056) {
                break;
            }
        }
        for (i = -95; i < -90; i++) {
            buf[390] = (byte) i;
            if (sha1_32(buf) == -874282896) {
                break;
            }
        }
        for (i = 46; i < 74; i++) {
            buf[391] = (byte) i;
            if (sha1_32(buf) == -1845244662) {
                break;
            }
        }
        for (i = 90; i < 104; i++) {
            buf[392] = (byte) i;
            if (sha1_32(buf) == 734906718) {
                break;
            }
        }
        for (i = -115; i < -99; i++) {
            buf[393] = (byte) i;
            if (sha1_32(buf) == -257840563) {
                break;
            }
        }
        for (i = 41; i < 65; i++) {
            buf[394] = (byte) i;
            if (sha1_32(buf) == -2085863103) {
                break;
            }
        }
        for (i = 5; i < 26; i++) {
            buf[395] = (byte) i;
            if (sha1_32(buf) == -1470108153) {
                break;
            }
        }
        for (i = -95; i < -83; i++) {
            buf[396] = (byte) i;
            if (sha1_32(buf) == 1788412283) {
                break;
            }
        }
        for (i = -113; i < -97; i++) {
            buf[397] = (byte) i;
            if (sha1_32(buf) == 674130087) {
                break;
            }
        }
        for (i = 50; i < 67; i++) {
            buf[398] = (byte) i;
            if (sha1_32(buf) == 2131561660) {
                break;
            }
        }
        for (i = 16; i < 29; i++) {
            buf[399] = (byte) i;
            if (sha1_32(buf) == 1215340083) {
                break;
            }
        }
        for (i = -69; i < -49; i++) {
            buf[400] = (byte) i;
            if (sha1_32(buf) == 58527833) {
                break;
            }
        }
        for (i = -19; i < -4; i++) {
            buf[401] = (byte) i;
            if (sha1_32(buf) == 1399432684) {
                break;
            }
        }
        for (i = 115; i < 128; i++) {
            buf[402] = (byte) i;
            if (sha1_32(buf) == -59814632) {
                break;
            }
        }
        for (i = -83; i < -66; i++) {
            buf[403] = (byte) i;
            if (sha1_32(buf) == 903816047) {
                break;
            }
        }
        for (i = -51; i < -46; i++) {
            buf[404] = (byte) i;
            if (sha1_32(buf) == 168416058) {
                break;
            }
        }
        for (i = 97; i < 117; i++) {
            buf[405] = (byte) i;
            if (sha1_32(buf) == -2036126513) {
                break;
            }
        }
        for (i = -120; i < -110; i++) {
            buf[406] = (byte) i;
            if (sha1_32(buf) == -1478765026) {
                break;
            }
        }
        for (i = 32; i < 56; i++) {
            buf[407] = (byte) i;
            if (sha1_32(buf) == -288077563) {
                break;
            }
        }
        for (i = -128; i < -107; i++) {
            buf[408] = (byte) i;
            if (sha1_32(buf) == 735021675) {
                break;
            }
        }
        for (i = 31; i < 37; i++) {
            buf[409] = (byte) i;
            if (sha1_32(buf) == -1384607250) {
                break;
            }
        }
        for (i = -59; i < -53; i++) {
            buf[410] = (byte) i;
            if (sha1_32(buf) == -474648108) {
                break;
            }
        }
        for (i = 52; i < 76; i++) {
            buf[411] = (byte) i;
            if (sha1_32(buf) == 1467363550) {
                break;
            }
        }
        for (i = 112; i < 128; i++) {
            buf[412] = (byte) i;
            if (sha1_32(buf) == -114787601) {
                break;
            }
        }
        for (i = 6; i < 7; i++) {
            buf[413] = (byte) i;
            if (sha1_32(buf) == -370520621) {
                break;
            }
        }
        for (i = -69; i < -50; i++) {
            buf[414] = (byte) i;
            if (sha1_32(buf) == -1270689093) {
                break;
            }
        }
        for (i = 62; i < 84; i++) {
            buf[415] = (byte) i;
            if (sha1_32(buf) == -1895587470) {
                break;
            }
        }
        for (i = -34; i < -25; i++) {
            buf[416] = (byte) i;
            if (sha1_32(buf) == -564589431) {
                break;
            }
        }
        for (i = 33; i < 36; i++) {
            buf[417] = (byte) i;
            if (sha1_32(buf) == 41144403) {
                break;
            }
        }
        for (i = -86; i < -70; i++) {
            buf[418] = (byte) i;
            if (sha1_32(buf) == 409439878) {
                break;
            }
        }
        for (i = 125; i < 128; i++) {
            buf[419] = (byte) i;
            if (sha1_32(buf) == -1546591580) {
                break;
            }
        }
        for (i = -30; i < -12; i++) {
            buf[420] = (byte) i;
            if (sha1_32(buf) == 1769557529) {
                break;
            }
        }
        for (i = -29; i < -10; i++) {
            buf[421] = (byte) i;
            if (sha1_32(buf) == 61123865) {
                break;
            }
        }
        for (i = 104; i < 122; i++) {
            buf[422] = (byte) i;
            if (sha1_32(buf) == 557308256) {
                break;
            }
        }
        for (i = 96; i < 109; i++) {
            buf[423] = (byte) i;
            if (sha1_32(buf) == 1106620075) {
                break;
            }
        }
        for (i = -23; i < 2; i++) {
            buf[424] = (byte) i;
            if (sha1_32(buf) == -1580736503) {
                break;
            }
        }
        for (i = 44; i < 61; i++) {
            buf[425] = (byte) i;
            if (sha1_32(buf) == -1588153100) {
                break;
            }
        }
        for (i = 35; i < 55; i++) {
            buf[426] = (byte) i;
            if (sha1_32(buf) == -1875828494) {
                break;
            }
        }
        for (i = -46; i < -31; i++) {
            buf[427] = (byte) i;
            if (sha1_32(buf) == 803456280) {
                break;
            }
        }
        for (i = 25; i < 53; i++) {
            buf[428] = (byte) i;
            if (sha1_32(buf) == 811732080) {
                break;
            }
        }
        for (i = 101; i < 111; i++) {
            buf[429] = (byte) i;
            if (sha1_32(buf) == 447606528) {
                break;
            }
        }
        for (i = -76; i < -53; i++) {
            buf[430] = (byte) i;
            if (sha1_32(buf) == -1782049184) {
                break;
            }
        }
        for (i = -87; i < -78; i++) {
            buf[431] = (byte) i;
            if (sha1_32(buf) == 1583636924) {
                break;
            }
        }
        for (i = 3; i < 22; i++) {
            buf[432] = (byte) i;
            if (sha1_32(buf) == -2077530425) {
                break;
            }
        }
        for (i = 21; i < 24; i++) {
            buf[433] = (byte) i;
            if (sha1_32(buf) == -1014530963) {
                break;
            }
        }
        for (i = -34; i < -17; i++) {
            buf[434] = (byte) i;
            if (sha1_32(buf) == -1930746586) {
                break;
            }
        }
        for (i = 7; i < 19; i++) {
            buf[435] = (byte) i;
            if (sha1_32(buf) == -921801274) {
                break;
            }
        }
        for (i = -93; i < -77; i++) {
            buf[436] = (byte) i;
            if (sha1_32(buf) == -786607851) {
                break;
            }
        }
        for (i = 24; i < 26; i++) {
            buf[437] = (byte) i;
            if (sha1_32(buf) == 843953065) {
                break;
            }
        }
        for (i = -113; i < -86; i++) {
            buf[438] = (byte) i;
            if (sha1_32(buf) == -1512668097) {
                break;
            }
        }
        for (i = 47; i < 53; i++) {
            buf[439] = (byte) i;
            if (sha1_32(buf) == -1233210713) {
                break;
            }
        }
        for (i = -32; i < -26; i++) {
            buf[440] = (byte) i;
            if (sha1_32(buf) == 1457268315) {
                break;
            }
        }
        for (i = -105; i < -78; i++) {
            buf[441] = (byte) i;
            if (sha1_32(buf) == -835682917) {
                break;
            }
        }
        for (i = 9; i < 28; i++) {
            buf[442] = (byte) i;
            if (sha1_32(buf) == -1008179066) {
                break;
            }
        }
        for (i = -89; i < -81; i++) {
            buf[443] = (byte) i;
            if (sha1_32(buf) == 1061520242) {
                break;
            }
        }
        for (i = -98; i < -71; i++) {
            buf[444] = (byte) i;
            if (sha1_32(buf) == -1333880855) {
                break;
            }
        }
        for (i = -128; i < -121; i++) {
            buf[445] = (byte) i;
            if (sha1_32(buf) == 1794179239) {
                break;
            }
        }
        for (i = 76; i < 98; i++) {
            buf[446] = (byte) i;
            if (sha1_32(buf) == 1591945459) {
                break;
            }
        }
        for (i = 121; i < 128; i++) {
            buf[447] = (byte) i;
            if (sha1_32(buf) == 779441558) {
                break;
            }
        }
        for (i = -49; i < -33; i++) {
            buf[448] = (byte) i;
            if (sha1_32(buf) == 903715979) {
                break;
            }
        }
        for (i = -127; i < -110; i++) {
            buf[449] = (byte) i;
            if (sha1_32(buf) == -9101496) {
                break;
            }
        }
        for (i = 50; i < 67; i++) {
            buf[450] = (byte) i;
            if (sha1_32(buf) == -1154195349) {
                break;
            }
        }
        for (i = 54; i < 76; i++) {
            buf[451] = (byte) i;
            if (sha1_32(buf) == 1971819615) {
                break;
            }
        }
        for (i = -63; i < -38; i++) {
            buf[452] = (byte) i;
            if (sha1_32(buf) == 261003371) {
                break;
            }
        }
        for (i = -21; i < -2; i++) {
            buf[453] = (byte) i;
            if (sha1_32(buf) == 1746148654) {
                break;
            }
        }
        for (i = -52; i < -34; i++) {
            buf[454] = (byte) i;
            if (sha1_32(buf) == 451959018) {
                break;
            }
        }
        for (i = 9; i < 25; i++) {
            buf[455] = (byte) i;
            if (sha1_32(buf) == -1543632639) {
                break;
            }
        }
        for (i = -122; i < -96; i++) {
            buf[456] = (byte) i;
            if (sha1_32(buf) == -155524937) {
                break;
            }
        }
        for (i = 23; i < 36; i++) {
            buf[457] = (byte) i;
            if (sha1_32(buf) == -567463665) {
                break;
            }
        }
        for (i = 10; i < 20; i++) {
            buf[458] = (byte) i;
            if (sha1_32(buf) == -523961508) {
                break;
            }
        }
        for (i = 65; i < 83; i++) {
            buf[459] = (byte) i;
            if (sha1_32(buf) == -515472160) {
                break;
            }
        }
        for (i = -104; i < -98; i++) {
            buf[460] = (byte) i;
            if (sha1_32(buf) == 1079191676) {
                break;
            }
        }
        for (i = 69; i < 88; i++) {
            buf[461] = (byte) i;
            if (sha1_32(buf) == 953780301) {
                break;
            }
        }
        for (i = 12; i < 21; i++) {
            buf[462] = (byte) i;
            if (sha1_32(buf) == -1742051695) {
                break;
            }
        }
        for (i = 86; i < 102; i++) {
            buf[463] = (byte) i;
            if (sha1_32(buf) == 1023400190) {
                break;
            }
        }
        for (i = 31; i < 41; i++) {
            buf[464] = (byte) i;
            if (sha1_32(buf) == 2116806878) {
                break;
            }
        }
        for (i = -28; i < -24; i++) {
            buf[465] = (byte) i;
            if (sha1_32(buf) == -573787730) {
                break;
            }
        }
        for (i = 101; i < 105; i++) {
            buf[466] = (byte) i;
            if (sha1_32(buf) == 131259158) {
                break;
            }
        }
        for (i = -92; i < -66; i++) {
            buf[467] = (byte) i;
            if (sha1_32(buf) == -1152519538) {
                break;
            }
        }
        for (i = 123; i < 127; i++) {
            buf[468] = (byte) i;
            if (sha1_32(buf) == -1854403008) {
                break;
            }
        }
        for (i = 120; i < 126; i++) {
            buf[469] = (byte) i;
            if (sha1_32(buf) == 619540200) {
                break;
            }
        }
        for (i = -92; i < -66; i++) {
            buf[470] = (byte) i;
            if (sha1_32(buf) == 1975265171) {
                break;
            }
        }
        for (i = -41; i < -30; i++) {
            buf[471] = (byte) i;
            if (sha1_32(buf) == 416069008) {
                break;
            }
        }
        for (i = -109; i < -97; i++) {
            buf[472] = (byte) i;
            if (sha1_32(buf) == 2015096350) {
                break;
            }
        }
        for (i = -36; i < -11; i++) {
            buf[473] = (byte) i;
            if (sha1_32(buf) == -17777259) {
                break;
            }
        }
        for (i = -55; i < -42; i++) {
            buf[474] = (byte) i;
            if (sha1_32(buf) == 2123964122) {
                break;
            }
        }
        for (i = -81; i < -64; i++) {
            buf[475] = (byte) i;
            if (sha1_32(buf) == 2024545712) {
                break;
            }
        }
        for (i = -73; i < -52; i++) {
            buf[476] = (byte) i;
            if (sha1_32(buf) == -1071173332) {
                break;
            }
        }
        for (i = 114; i < 123; i++) {
            buf[477] = (byte) i;
            if (sha1_32(buf) == 1719387560) {
                break;
            }
        }
        for (i = -28; i < -3; i++) {
            buf[478] = (byte) i;
            if (sha1_32(buf) == 1171648736) {
                break;
            }
        }
        for (i = 82; i < 87; i++) {
            buf[479] = (byte) i;
            if (sha1_32(buf) == 314248245) {
                break;
            }
        }
        for (i = -16; i < -2; i++) {
            buf[480] = (byte) i;
            if (sha1_32(buf) == 1602793482) {
                break;
            }
        }
        for (i = 77; i < 82; i++) {
            buf[481] = (byte) i;
            if (sha1_32(buf) == -984576606) {
                break;
            }
        }
        for (i = 114; i < 127; i++) {
            buf[482] = (byte) i;
            if (sha1_32(buf) == 1469855673) {
                break;
            }
        }
        for (i = 57; i < 63; i++) {
            buf[483] = (byte) i;
            if (sha1_32(buf) == -501404838) {
                break;
            }
        }
        for (i = -89; i < -72; i++) {
            buf[484] = (byte) i;
            if (sha1_32(buf) == -695136399) {
                break;
            }
        }
        for (i = -128; i < -119; i++) {
            buf[485] = (byte) i;
            if (sha1_32(buf) == 1086320677) {
                break;
            }
        }
        for (i = 7; i < 18; i++) {
            buf[486] = (byte) i;
            if (sha1_32(buf) == 1226445210) {
                break;
            }
        }
        for (i = 62; i < 82; i++) {
            buf[487] = (byte) i;
            if (sha1_32(buf) == -1913852823) {
                break;
            }
        }
        for (i = 6; i < 16; i++) {
            buf[488] = (byte) i;
            if (sha1_32(buf) == -391252587) {
                break;
            }
        }
        for (i = 24; i < 54; i++) {
            buf[489] = (byte) i;
            if (sha1_32(buf) == -1136375632) {
                break;
            }
        }
        for (i = 96; i < 103; i++) {
            buf[490] = (byte) i;
            if (sha1_32(buf) == 324472977) {
                break;
            }
        }
        for (i = -7; i < -6; i++) {
            buf[491] = (byte) i;
            if (sha1_32(buf) == -42373786) {
                break;
            }
        }
        for (i = -105; i < -92; i++) {
            buf[492] = (byte) i;
            if (sha1_32(buf) == 1943559771) {
                break;
            }
        }
        for (i = -16; i < 3; i++) {
            buf[493] = (byte) i;
            if (sha1_32(buf) == -1510823374) {
                break;
            }
        }
        for (i = 49; i < 55; i++) {
            buf[494] = (byte) i;
            if (sha1_32(buf) == -489825467) {
                break;
            }
        }
        for (i = 71; i < 76; i++) {
            buf[495] = (byte) i;
            if (sha1_32(buf) == -459142291) {
                break;
            }
        }
        for (i = 58; i < 73; i++) {
            buf[496] = (byte) i;
            if (sha1_32(buf) == 1473315936) {
                break;
            }
        }
        for (i = 75; i < 101; i++) {
            buf[497] = (byte) i;
            if (sha1_32(buf) == 1615440166) {
                break;
            }
        }
        for (i = 29; i < 49; i++) {
            buf[498] = (byte) i;
            if (sha1_32(buf) == 1982055008) {
                break;
            }
        }
        for (i = -21; i < 7; i++) {
            buf[499] = (byte) i;
            if (sha1_32(buf) == -851505737) {
                break;
            }
        }
        for (i = -110; i < -98; i++) {
            buf[500] = (byte) i;
            if (sha1_32(buf) == -255733498) {
                break;
            }
        }
        for (i = -127; i < -124; i++) {
            buf[501] = (byte) i;
            if (sha1_32(buf) == 535489759) {
                break;
            }
        }
        for (i = -46; i < -28; i++) {
            buf[502] = (byte) i;
            if (sha1_32(buf) == 1576450401) {
                break;
            }
        }
        for (i = 49; i < 67; i++) {
            buf[503] = (byte) i;
            if (sha1_32(buf) == 596886410) {
                break;
            }
        }
        for (i = -73; i < -66; i++) {
            buf[504] = (byte) i;
            if (sha1_32(buf) == 501358642) {
                break;
            }
        }
        for (i = -36; i < -21; i++) {
            buf[505] = (byte) i;
            if (sha1_32(buf) == -1758647308) {
                break;
            }
        }
        for (i = 2; i < 15; i++) {
            buf[506] = (byte) i;
            if (sha1_32(buf) == -11686653) {
                break;
            }
        }
        for (i = 79; i < 86; i++) {
            buf[507] = (byte) i;
            if (sha1_32(buf) == 7529023) {
                break;
            }
        }
        for (i = -3; i < 12; i++) {
            buf[508] = (byte) i;
            if (sha1_32(buf) == -2051979688) {
                break;
            }
        }
        for (i = -104; i < -96; i++) {
            buf[509] = (byte) i;
            if (sha1_32(buf) == -1290767135) {
                break;
            }
        }
        for (i = -119; i < -101; i++) {
            buf[510] = (byte) i;
            if (sha1_32(buf) == 1180657536) {
                break;
            }
        }
        for (i = 30; i < 45; i++) {
            buf[511] = (byte) i;
            if (sha1_32(buf) == 825878162) {
                break;
            }
        }
        for (i = 32; i < 41; i++) {
            buf[512] = (byte) i;
            if (sha1_32(buf) == 766435771) {
                break;
            }
        }
        for (i = 78; i < 94; i++) {
            buf[513] = (byte) i;
            if (sha1_32(buf) == 962703911) {
                break;
            }
        }
        for (i = 29; i < 43; i++) {
            buf[514] = (byte) i;
            if (sha1_32(buf) == -967205881) {
                break;
            }
        }
        for (i = -122; i < -97; i++) {
            buf[515] = (byte) i;
            if (sha1_32(buf) == -2097070007) {
                break;
            }
        }
        for (i = 114; i < 122; i++) {
            buf[516] = (byte) i;
            if (sha1_32(buf) == 1189837153) {
                break;
            }
        }
        for (i = 56; i < 74; i++) {
            buf[517] = (byte) i;
            if (sha1_32(buf) == 855130779) {
                break;
            }
        }
        for (i = 99; i < 114; i++) {
            buf[518] = (byte) i;
            if (sha1_32(buf) == -1034554552) {
                break;
            }
        }
        for (i = 94; i < 117; i++) {
            buf[519] = (byte) i;
            if (sha1_32(buf) == 1267687832) {
                break;
            }
        }
        for (i = 33; i < 37; i++) {
            buf[520] = (byte) i;
            if (sha1_32(buf) == 663830584) {
                break;
            }
        }
        for (i = 52; i < 68; i++) {
            buf[521] = (byte) i;
            if (sha1_32(buf) == 305457845) {
                break;
            }
        }
        for (i = 47; i < 69; i++) {
            buf[522] = (byte) i;
            if (sha1_32(buf) == 1394412801) {
                break;
            }
        }
        for (i = 115; i < 128; i++) {
            buf[523] = (byte) i;
            if (sha1_32(buf) == -296578656) {
                break;
            }
        }
        for (i = 15; i < 20; i++) {
            buf[524] = (byte) i;
            if (sha1_32(buf) == -753563617) {
                break;
            }
        }
        for (i = -102; i < -92; i++) {
            buf[525] = (byte) i;
            if (sha1_32(buf) == -641528201) {
                break;
            }
        }
        for (i = -72; i < -53; i++) {
            buf[526] = (byte) i;
            if (sha1_32(buf) == -367215789) {
                break;
            }
        }
        for (i = -66; i < -45; i++) {
            buf[527] = (byte) i;
            if (sha1_32(buf) == 2065278781) {
                break;
            }
        }
        for (i = 93; i < 102; i++) {
            buf[528] = (byte) i;
            if (sha1_32(buf) == -1303797861) {
                break;
            }
        }
        for (i = 62; i < 78; i++) {
            buf[529] = (byte) i;
            if (sha1_32(buf) == 1013429624) {
                break;
            }
        }
        for (i = 84; i < 98; i++) {
            buf[530] = (byte) i;
            if (sha1_32(buf) == -1767747818) {
                break;
            }
        }
        for (i = 60; i < 65; i++) {
            buf[531] = (byte) i;
            if (sha1_32(buf) == -617069209) {
                break;
            }
        }
        for (i = -63; i < -58; i++) {
            buf[532] = (byte) i;
            if (sha1_32(buf) == 1912785610) {
                break;
            }
        }
        for (i = -107; i < -90; i++) {
            buf[533] = (byte) i;
            if (sha1_32(buf) == 498221583) {
                break;
            }
        }
        for (i = -16; i < 6; i++) {
            buf[534] = (byte) i;
            if (sha1_32(buf) == -529070349) {
                break;
            }
        }
        for (i = -65; i < -47; i++) {
            buf[535] = (byte) i;
            if (sha1_32(buf) == -865207545) {
                break;
            }
        }
        for (i = -25; i < 4; i++) {
            buf[536] = (byte) i;
            if (sha1_32(buf) == -1178731421) {
                break;
            }
        }
        for (i = 16; i < 23; i++) {
            buf[537] = (byte) i;
            if (sha1_32(buf) == 419935085) {
                break;
            }
        }
        for (i = -14; i < -3; i++) {
            buf[538] = (byte) i;
            if (sha1_32(buf) == -1975054186) {
                break;
            }
        }
        for (i = 13; i < 24; i++) {
            buf[539] = (byte) i;
            if (sha1_32(buf) == -627601243) {
                break;
            }
        }
        for (i = -106; i < -91; i++) {
            buf[540] = (byte) i;
            if (sha1_32(buf) == -146263996) {
                break;
            }
        }
        for (i = 2; i < 8; i++) {
            buf[541] = (byte) i;
            if (sha1_32(buf) == -1515702177) {
                break;
            }
        }
        for (i = 101; i < 110; i++) {
            buf[542] = (byte) i;
            if (sha1_32(buf) == 594544377) {
                break;
            }
        }
        for (i = 48; i < 59; i++) {
            buf[543] = (byte) i;
            if (sha1_32(buf) == 1605773684) {
                break;
            }
        }
        for (i = -128; i < -116; i++) {
            buf[544] = (byte) i;
            if (sha1_32(buf) == -202543402) {
                break;
            }
        }
        for (i = -115; i < -98; i++) {
            buf[545] = (byte) i;
            if (sha1_32(buf) == -1201261574) {
                break;
            }
        }
        for (i = 99; i < 108; i++) {
            buf[546] = (byte) i;
            if (sha1_32(buf) == -37687981) {
                break;
            }
        }
        for (i = -44; i < -39; i++) {
            buf[547] = (byte) i;
            if (sha1_32(buf) == 1549760972) {
                break;
            }
        }
        for (i = 37; i < 49; i++) {
            buf[548] = (byte) i;
            if (sha1_32(buf) == -598941427) {
                break;
            }
        }
        for (i = 51; i < 64; i++) {
            buf[549] = (byte) i;
            if (sha1_32(buf) == 1738316654) {
                break;
            }
        }
        for (i = -50; i < -44; i++) {
            buf[550] = (byte) i;
            if (sha1_32(buf) == -500848494) {
                break;
            }
        }
        for (i = 22; i < 39; i++) {
            buf[551] = (byte) i;
            if (sha1_32(buf) == -609922738) {
                break;
            }
        }
        for (i = -124; i < -110; i++) {
            buf[552] = (byte) i;
            if (sha1_32(buf) == -1388721003) {
                break;
            }
        }
        for (i = -128; i < -118; i++) {
            buf[553] = (byte) i;
            if (sha1_32(buf) == 524884142) {
                break;
            }
        }
        for (i = -116; i < -101; i++) {
            buf[554] = (byte) i;
            if (sha1_32(buf) == 1779464197) {
                break;
            }
        }
        for (i = 93; i < 108; i++) {
            buf[555] = (byte) i;
            if (sha1_32(buf) == -866734106) {
                break;
            }
        }
        for (i = -63; i < -50; i++) {
            buf[556] = (byte) i;
            if (sha1_32(buf) == -2016235696) {
                break;
            }
        }
        for (i = 74; i < 88; i++) {
            buf[557] = (byte) i;
            if (sha1_32(buf) == -299791129) {
                break;
            }
        }
        for (i = 56; i < 79; i++) {
            buf[558] = (byte) i;
            if (sha1_32(buf) == 1164190919) {
                break;
            }
        }
        for (i = 17; i < 30; i++) {
            buf[559] = (byte) i;
            if (sha1_32(buf) == 1270132585) {
                break;
            }
        }
        for (i = 85; i < 95; i++) {
            buf[560] = (byte) i;
            if (sha1_32(buf) == -601324150) {
                break;
            }
        }
        for (i = -53; i < -43; i++) {
            buf[561] = (byte) i;
            if (sha1_32(buf) == -878898294) {
                break;
            }
        }
        for (i = -69; i < -42; i++) {
            buf[562] = (byte) i;
            if (sha1_32(buf) == 1539885105) {
                break;
            }
        }
        for (i = 55; i < 70; i++) {
            buf[563] = (byte) i;
            if (sha1_32(buf) == 1336758836) {
                break;
            }
        }
        for (i = -26; i < -7; i++) {
            buf[564] = (byte) i;
            if (sha1_32(buf) == -1192249974) {
                break;
            }
        }
        for (i = -115; i < -110; i++) {
            buf[565] = (byte) i;
            if (sha1_32(buf) == -1188189285) {
                break;
            }
        }
        for (i = -80; i < -62; i++) {
            buf[566] = (byte) i;
            if (sha1_32(buf) == 1302700019) {
                break;
            }
        }
        for (i = 24; i < 40; i++) {
            buf[567] = (byte) i;
            if (sha1_32(buf) == 1878391904) {
                break;
            }
        }
        for (i = 45; i < 64; i++) {
            buf[568] = (byte) i;
            if (sha1_32(buf) == 1712080437) {
                break;
            }
        }
        for (i = 3; i < 23; i++) {
            buf[569] = (byte) i;
            if (sha1_32(buf) == -1917205974) {
                break;
            }
        }
        for (i = 72; i < 100; i++) {
            buf[570] = (byte) i;
            if (sha1_32(buf) == -435753787) {
                break;
            }
        }
        for (i = 61; i < 74; i++) {
            buf[571] = (byte) i;
            if (sha1_32(buf) == -532656714) {
                break;
            }
        }
        for (i = 44; i < 67; i++) {
            buf[572] = (byte) i;
            if (sha1_32(buf) == -684809888) {
                break;
            }
        }
        for (i = -102; i < -88; i++) {
            buf[573] = (byte) i;
            if (sha1_32(buf) == -1101639971) {
                break;
            }
        }
        for (i = 99; i < 113; i++) {
            buf[574] = (byte) i;
            if (sha1_32(buf) == -1072117674) {
                break;
            }
        }
        for (i = -109; i < -93; i++) {
            buf[575] = (byte) i;
            if (sha1_32(buf) == -746679940) {
                break;
            }
        }
        for (i = -99; i < -90; i++) {
            buf[576] = (byte) i;
            if (sha1_32(buf) == -1726798032) {
                break;
            }
        }
        for (i = 97; i < 117; i++) {
            buf[577] = (byte) i;
            if (sha1_32(buf) == -1550498205) {
                break;
            }
        }
        for (i = 69; i < 88; i++) {
            buf[578] = (byte) i;
            if (sha1_32(buf) == -1677688710) {
                break;
            }
        }
        for (i = -58; i < -40; i++) {
            buf[579] = (byte) i;
            if (sha1_32(buf) == 529603126) {
                break;
            }
        }
        for (i = 84; i < 99; i++) {
            buf[580] = (byte) i;
            if (sha1_32(buf) == -749700679) {
                break;
            }
        }
        for (i = -58; i < -38; i++) {
            buf[581] = (byte) i;
            if (sha1_32(buf) == 2098374242) {
                break;
            }
        }
        for (i = 77; i < 96; i++) {
            buf[582] = (byte) i;
            if (sha1_32(buf) == -933989540) {
                break;
            }
        }
        for (i = -10; i < 4; i++) {
            buf[583] = (byte) i;
            if (sha1_32(buf) == 25196218) {
                break;
            }
        }
        for (i = -43; i < -16; i++) {
            buf[584] = (byte) i;
            if (sha1_32(buf) == 1810477197) {
                break;
            }
        }
        for (i = -110; i < -84; i++) {
            buf[585] = (byte) i;
            if (sha1_32(buf) == -1347534746) {
                break;
            }
        }
        for (i = -82; i < -73; i++) {
            buf[586] = (byte) i;
            if (sha1_32(buf) == 2124590335) {
                break;
            }
        }
        for (i = 32; i < 42; i++) {
            buf[587] = (byte) i;
            if (sha1_32(buf) == -390754352) {
                break;
            }
        }
        for (i = -128; i < -119; i++) {
            buf[588] = (byte) i;
            if (sha1_32(buf) == -315311149) {
                break;
            }
        }
        for (i = -116; i < -95; i++) {
            buf[589] = (byte) i;
            if (sha1_32(buf) == -489042781) {
                break;
            }
        }
        for (i = 84; i < 102; i++) {
            buf[590] = (byte) i;
            if (sha1_32(buf) == 211118090) {
                break;
            }
        }
        for (i = 67; i < 73; i++) {
            buf[591] = (byte) i;
            if (sha1_32(buf) == -774142075) {
                break;
            }
        }
        for (i = -128; i < -117; i++) {
            buf[592] = (byte) i;
            if (sha1_32(buf) == -1601759731) {
                break;
            }
        }
        for (i = -35; i < -10; i++) {
            buf[593] = (byte) i;
            if (sha1_32(buf) == -1192916308) {
                break;
            }
        }
        for (i = 23; i < 44; i++) {
            buf[594] = (byte) i;
            if (sha1_32(buf) == -631432524) {
                break;
            }
        }
        for (i = -100; i < -90; i++) {
            buf[595] = (byte) i;
            if (sha1_32(buf) == -1770316422) {
                break;
            }
        }
        for (i = -82; i < -57; i++) {
            buf[596] = (byte) i;
            if (sha1_32(buf) == 386177973) {
                break;
            }
        }
        for (i = -11; i < 3; i++) {
            buf[597] = (byte) i;
            if (sha1_32(buf) == -636779947) {
                break;
            }
        }
        for (i = 92; i < 112; i++) {
            buf[598] = (byte) i;
            if (sha1_32(buf) == 1301381412) {
                break;
            }
        }
        for (i = -38; i < -31; i++) {
            buf[599] = (byte) i;
            if (sha1_32(buf) == -832398215) {
                break;
            }
        }
        for (i = 109; i < 128; i++) {
            buf[600] = (byte) i;
            if (sha1_32(buf) == 1550085204) {
                break;
            }
        }
        for (i = -55; i < -28; i++) {
            buf[601] = (byte) i;
            if (sha1_32(buf) == -1748066975) {
                break;
            }
        }
        for (i = -96; i < -89; i++) {
            buf[602] = (byte) i;
            if (sha1_32(buf) == -775118536) {
                break;
            }
        }
        for (i = -53; i < -45; i++) {
            buf[603] = (byte) i;
            if (sha1_32(buf) == -1462075211) {
                break;
            }
        }
        for (i = -72; i < -66; i++) {
            buf[604] = (byte) i;
            if (sha1_32(buf) == 91759597) {
                break;
            }
        }
        for (i = 87; i < 95; i++) {
            buf[605] = (byte) i;
            if (sha1_32(buf) == -499583456) {
                break;
            }
        }
        for (i = 105; i < 124; i++) {
            buf[606] = (byte) i;
            if (sha1_32(buf) == -1992928465) {
                break;
            }
        }
        for (i = -72; i < -66; i++) {
            buf[607] = (byte) i;
            if (sha1_32(buf) == 474581339) {
                break;
            }
        }
        for (i = 114; i < 128; i++) {
            buf[608] = (byte) i;
            if (sha1_32(buf) == -1893769653) {
                break;
            }
        }
        for (i = 7; i < 15; i++) {
            buf[609] = (byte) i;
            if (sha1_32(buf) == 151766321) {
                break;
            }
        }
        for (i = -66; i < -42; i++) {
            buf[610] = (byte) i;
            if (sha1_32(buf) == 1938876954) {
                break;
            }
        }
        for (i = -71; i < -48; i++) {
            buf[611] = (byte) i;
            if (sha1_32(buf) == -339442495) {
                break;
            }
        }
        for (i = 55; i < 66; i++) {
            buf[612] = (byte) i;
            if (sha1_32(buf) == -1574448444) {
                break;
            }
        }
        for (i = 22; i < 37; i++) {
            buf[613] = (byte) i;
            if (sha1_32(buf) == -289536666) {
                break;
            }
        }
        for (i = 10; i < 33; i++) {
            buf[614] = (byte) i;
            if (sha1_32(buf) == 843705901) {
                break;
            }
        }
        for (i = -116; i < -104; i++) {
            buf[615] = (byte) i;
            if (sha1_32(buf) == 234320636) {
                break;
            }
        }
        for (i = -75; i < -58; i++) {
            buf[616] = (byte) i;
            if (sha1_32(buf) == 594615324) {
                break;
            }
        }
        for (i = -122; i < -112; i++) {
            buf[617] = (byte) i;
            if (sha1_32(buf) == 173075506) {
                break;
            }
        }
        for (i = -128; i < -125; i++) {
            buf[618] = (byte) i;
            if (sha1_32(buf) == 1503607262) {
                break;
            }
        }
        for (i = 51; i < 65; i++) {
            buf[619] = (byte) i;
            if (sha1_32(buf) == 966953973) {
                break;
            }
        }
        for (i = -76; i < -60; i++) {
            buf[620] = (byte) i;
            if (sha1_32(buf) == -130092921) {
                break;
            }
        }
        for (i = 95; i < 113; i++) {
            buf[621] = (byte) i;
            if (sha1_32(buf) == -847214438) {
                break;
            }
        }
        for (i = 34; i < 53; i++) {
            buf[622] = (byte) i;
            if (sha1_32(buf) == -1583847809) {
                break;
            }
        }
        for (i = -50; i < -44; i++) {
            buf[623] = (byte) i;
            if (sha1_32(buf) == 733300248) {
                break;
            }
        }
        for (i = 114; i < 128; i++) {
            buf[624] = (byte) i;
            if (sha1_32(buf) == -1976085464) {
                break;
            }
        }
        for (i = -49; i < -32; i++) {
            buf[625] = (byte) i;
            if (sha1_32(buf) == 1682000375) {
                break;
            }
        }
        for (i = -120; i < -102; i++) {
            buf[626] = (byte) i;
            if (sha1_32(buf) == -1651170002) {
                break;
            }
        }
        for (i = -65; i < -55; i++) {
            buf[627] = (byte) i;
            if (sha1_32(buf) == 186171959) {
                break;
            }
        }
        for (i = 64; i < 89; i++) {
            buf[628] = (byte) i;
            if (sha1_32(buf) == -75466890) {
                break;
            }
        }
        for (i = 3; i < 17; i++) {
            buf[629] = (byte) i;
            if (sha1_32(buf) == 2127992862) {
                break;
            }
        }
        for (i = 108; i < 119; i++) {
            buf[630] = (byte) i;
            if (sha1_32(buf) == 608897717) {
                break;
            }
        }
        for (i = -100; i < -76; i++) {
            buf[631] = (byte) i;
            if (sha1_32(buf) == 401899805) {
                break;
            }
        }
        for (i = -35; i < -10; i++) {
            buf[632] = (byte) i;
            if (sha1_32(buf) == -787856928) {
                break;
            }
        }
        for (i = 85; i < 99; i++) {
            buf[633] = (byte) i;
            if (sha1_32(buf) == 421688891) {
                break;
            }
        }
        for (i = 50; i < 63; i++) {
            buf[634] = (byte) i;
            if (sha1_32(buf) == -2143667091) {
                break;
            }
        }
        for (i = 89; i < 111; i++) {
            buf[635] = (byte) i;
            if (sha1_32(buf) == -2127799388) {
                break;
            }
        }
        for (i = 110; i < 122; i++) {
            buf[636] = (byte) i;
            if (sha1_32(buf) == -954373515) {
                break;
            }
        }
        for (i = -2; i < 10; i++) {
            buf[637] = (byte) i;
            if (sha1_32(buf) == 2044418105) {
                break;
            }
        }
        for (i = -128; i < -112; i++) {
            buf[638] = (byte) i;
            if (sha1_32(buf) == 281175691) {
                break;
            }
        }
        for (i = 122; i < 123; i++) {
            buf[639] = (byte) i;
            if (sha1_32(buf) == -1615548100) {
                break;
            }
        }
        for (i = -33; i < -30; i++) {
            buf[640] = (byte) i;
            if (sha1_32(buf) == -318166179) {
                break;
            }
        }
        for (i = 27; i < 36; i++) {
            buf[641] = (byte) i;
            if (sha1_32(buf) == 111447215) {
                break;
            }
        }
        for (i = 32; i < 53; i++) {
            buf[642] = (byte) i;
            if (sha1_32(buf) == -1070895138) {
                break;
            }
        }
        for (i = 29; i < 39; i++) {
            buf[643] = (byte) i;
            if (sha1_32(buf) == 223020731) {
                break;
            }
        }
        for (i = -61; i < -42; i++) {
            buf[644] = (byte) i;
            if (sha1_32(buf) == 1173495629) {
                break;
            }
        }
        for (i = -90; i < -62; i++) {
            buf[645] = (byte) i;
            if (sha1_32(buf) == -1487000791) {
                break;
            }
        }
        for (i = 99; i < 107; i++) {
            buf[646] = (byte) i;
            if (sha1_32(buf) == 2047934172) {
                break;
            }
        }
        for (i = 26; i < 42; i++) {
            buf[647] = (byte) i;
            if (sha1_32(buf) == -1992143694) {
                break;
            }
        }
        for (i = -41; i < -38; i++) {
            buf[648] = (byte) i;
            if (sha1_32(buf) == 1281049950) {
                break;
            }
        }
        for (i = 82; i < 86; i++) {
            buf[649] = (byte) i;
            if (sha1_32(buf) == 253286216) {
                break;
            }
        }
        for (i = -41; i < -30; i++) {
            buf[650] = (byte) i;
            if (sha1_32(buf) == 1132693885) {
                break;
            }
        }
        for (i = 91; i < 111; i++) {
            buf[651] = (byte) i;
            if (sha1_32(buf) == -1029250564) {
                break;
            }
        }
        for (i = 90; i < 109; i++) {
            buf[652] = (byte) i;
            if (sha1_32(buf) == 704262059) {
                break;
            }
        }
        for (i = -32; i < -14; i++) {
            buf[653] = (byte) i;
            if (sha1_32(buf) == 982874235) {
                break;
            }
        }
        for (i = 75; i < 89; i++) {
            buf[654] = (byte) i;
            if (sha1_32(buf) == -1200306417) {
                break;
            }
        }
        for (i = 6; i < 20; i++) {
            buf[655] = (byte) i;
            if (sha1_32(buf) == 1018807690) {
                break;
            }
        }
        for (i = -31; i < -15; i++) {
            buf[656] = (byte) i;
            if (sha1_32(buf) == -470666705) {
                break;
            }
        }
        for (i = -102; i < -72; i++) {
            buf[657] = (byte) i;
            if (sha1_32(buf) == 1170421218) {
                break;
            }
        }
        for (i = 62; i < 83; i++) {
            buf[658] = (byte) i;
            if (sha1_32(buf) == -819786869) {
                break;
            }
        }
        for (i = 106; i < 111; i++) {
            buf[659] = (byte) i;
            if (sha1_32(buf) == -269883935) {
                break;
            }
        }
        for (i = 95; i < 108; i++) {
            buf[660] = (byte) i;
            if (sha1_32(buf) == -1016322435) {
                break;
            }
        }
        for (i = -41; i < -27; i++) {
            buf[661] = (byte) i;
            if (sha1_32(buf) == 1898704001) {
                break;
            }
        }
        for (i = 96; i < 118; i++) {
            buf[662] = (byte) i;
            if (sha1_32(buf) == 1076579556) {
                break;
            }
        }
        for (i = -65; i < -58; i++) {
            buf[663] = (byte) i;
            if (sha1_32(buf) == 65542267) {
                break;
            }
        }
        for (i = -73; i < -54; i++) {
            buf[664] = (byte) i;
            if (sha1_32(buf) == 1771829261) {
                break;
            }
        }
        for (i = -67; i < -58; i++) {
            buf[665] = (byte) i;
            if (sha1_32(buf) == 564376553) {
                break;
            }
        }
        for (i = 101; i < 110; i++) {
            buf[666] = (byte) i;
            if (sha1_32(buf) == -972639929) {
                break;
            }
        }
        for (i = -34; i < -27; i++) {
            buf[667] = (byte) i;
            if (sha1_32(buf) == 181564719) {
                break;
            }
        }
        for (i = 85; i < 107; i++) {
            buf[668] = (byte) i;
            if (sha1_32(buf) == -738664322) {
                break;
            }
        }
        for (i = 34; i < 46; i++) {
            buf[669] = (byte) i;
            if (sha1_32(buf) == -579743986) {
                break;
            }
        }
        for (i = 41; i < 50; i++) {
            buf[670] = (byte) i;
            if (sha1_32(buf) == -1278565129) {
                break;
            }
        }
        for (i = 26; i < 42; i++) {
            buf[671] = (byte) i;
            if (sha1_32(buf) == 1164429501) {
                break;
            }
        }
        for (i = -115; i < -90; i++) {
            buf[672] = (byte) i;
            if (sha1_32(buf) == -1825764386) {
                break;
            }
        }
        for (i = 47; i < 69; i++) {
            buf[673] = (byte) i;
            if (sha1_32(buf) == 1940426782) {
                break;
            }
        }
        for (i = -116; i < -97; i++) {
            buf[674] = (byte) i;
            if (sha1_32(buf) == -1959179595) {
                break;
            }
        }
        for (i = -46; i < -39; i++) {
            buf[675] = (byte) i;
            if (sha1_32(buf) == 1932054667) {
                break;
            }
        }
        for (i = 23; i < 38; i++) {
            buf[676] = (byte) i;
            if (sha1_32(buf) == 1976843829) {
                break;
            }
        }
        for (i = -11; i < -3; i++) {
            buf[677] = (byte) i;
            if (sha1_32(buf) == -1656097613) {
                break;
            }
        }
        for (i = -127; i < -114; i++) {
            buf[678] = (byte) i;
            if (sha1_32(buf) == 306733855) {
                break;
            }
        }
        for (i = 22; i < 43; i++) {
            buf[679] = (byte) i;
            if (sha1_32(buf) == 1104163675) {
                break;
            }
        }
        for (i = 114; i < 126; i++) {
            buf[680] = (byte) i;
            if (sha1_32(buf) == 878118963) {
                break;
            }
        }
        for (i = -125; i < -105; i++) {
            buf[681] = (byte) i;
            if (sha1_32(buf) == -209874927) {
                break;
            }
        }
        for (i = 48; i < 72; i++) {
            buf[682] = (byte) i;
            if (sha1_32(buf) == 829623148) {
                break;
            }
        }
        for (i = -80; i < -56; i++) {
            buf[683] = (byte) i;
            if (sha1_32(buf) == -33253000) {
                break;
            }
        }
        for (i = 79; i < 84; i++) {
            buf[684] = (byte) i;
            if (sha1_32(buf) == 1614156380) {
                break;
            }
        }
        for (i = 71; i < 91; i++) {
            buf[685] = (byte) i;
            if (sha1_32(buf) == 1078354149) {
                break;
            }
        }
        for (i = -85; i < -72; i++) {
            buf[686] = (byte) i;
            if (sha1_32(buf) == 396692438) {
                break;
            }
        }
        for (i = -90; i < -71; i++) {
            buf[687] = (byte) i;
            if (sha1_32(buf) == -2049901280) {
                break;
            }
        }
        for (i = 71; i < 88; i++) {
            buf[688] = (byte) i;
            if (sha1_32(buf) == 1542488974) {
                break;
            }
        }
        for (i = -24; i < -11; i++) {
            buf[689] = (byte) i;
            if (sha1_32(buf) == -1534326335) {
                break;
            }
        }
        for (i = -74; i < -61; i++) {
            buf[690] = (byte) i;
            if (sha1_32(buf) == 134195913) {
                break;
            }
        }
        for (i = 26; i < 40; i++) {
            buf[691] = (byte) i;
            if (sha1_32(buf) == 1311005017) {
                break;
            }
        }
        for (i = 45; i < 71; i++) {
            buf[692] = (byte) i;
            if (sha1_32(buf) == 302094606) {
                break;
            }
        }
        for (i = -45; i < -17; i++) {
            buf[693] = (byte) i;
            if (sha1_32(buf) == 2043044866) {
                break;
            }
        }
        for (i = 41; i < 63; i++) {
            buf[694] = (byte) i;
            if (sha1_32(buf) == 1885015313) {
                break;
            }
        }
        for (i = 38; i < 53; i++) {
            buf[695] = (byte) i;
            if (sha1_32(buf) == -1165135718) {
                break;
            }
        }
        for (i = 0; i < 21; i++) {
            buf[696] = (byte) i;
            if (sha1_32(buf) == -1423536737) {
                break;
            }
        }
        for (i = 40; i < 46; i++) {
            buf[697] = (byte) i;
            if (sha1_32(buf) == -2129728913) {
                break;
            }
        }
        for (i = -16; i < -3; i++) {
            buf[698] = (byte) i;
            if (sha1_32(buf) == 1921454491) {
                break;
            }
        }
        for (i = 108; i < 119; i++) {
            buf[699] = (byte) i;
            if (sha1_32(buf) == 396307479) {
                break;
            }
        }
        for (i = 49; i < 65; i++) {
            buf[700] = (byte) i;
            if (sha1_32(buf) == -1369688832) {
                break;
            }
        }
        for (i = -57; i < -34; i++) {
            buf[701] = (byte) i;
            if (sha1_32(buf) == -1562441669) {
                break;
            }
        }
        for (i = -128; i < -122; i++) {
            buf[702] = (byte) i;
            if (sha1_32(buf) == 727954751) {
                break;
            }
        }
        for (i = 77; i < 94; i++) {
            buf[703] = (byte) i;
            if (sha1_32(buf) == 2041841954) {
                break;
            }
        }
        for (i = 58; i < 74; i++) {
            buf[704] = (byte) i;
            if (sha1_32(buf) == 1181991447) {
                break;
            }
        }
        for (i = 108; i < 128; i++) {
            buf[705] = (byte) i;
            if (sha1_32(buf) == 804734633) {
                break;
            }
        }
        for (i = -125; i < -110; i++) {
            buf[706] = (byte) i;
            if (sha1_32(buf) == 959308241) {
                break;
            }
        }
        for (i = -5; i < 12; i++) {
            buf[707] = (byte) i;
            if (sha1_32(buf) == -1474843727) {
                break;
            }
        }
        for (i = 115; i < 127; i++) {
            buf[708] = (byte) i;
            if (sha1_32(buf) == 232779466) {
                break;
            }
        }
        for (i = -111; i < -103; i++) {
            buf[709] = (byte) i;
            if (sha1_32(buf) == -834211259) {
                break;
            }
        }
        for (i = -96; i < -74; i++) {
            buf[710] = (byte) i;
            if (sha1_32(buf) == 1694493660) {
                break;
            }
        }
        for (i = -53; i < -27; i++) {
            buf[711] = (byte) i;
            if (sha1_32(buf) == 1860840980) {
                break;
            }
        }
        for (i = -57; i < -39; i++) {
            buf[712] = (byte) i;
            if (sha1_32(buf) == -1309073696) {
                break;
            }
        }
        for (i = -67; i < -54; i++) {
            buf[713] = (byte) i;
            if (sha1_32(buf) == 1153074460) {
                break;
            }
        }
        for (i = -126; i < -112; i++) {
            buf[714] = (byte) i;
            if (sha1_32(buf) == -383925422) {
                break;
            }
        }
        for (i = 22; i < 32; i++) {
            buf[715] = (byte) i;
            if (sha1_32(buf) == 2116146363) {
                break;
            }
        }
        for (i = -66; i < -43; i++) {
            buf[716] = (byte) i;
            if (sha1_32(buf) == -1666720373) {
                break;
            }
        }
        for (i = -31; i < -11; i++) {
            buf[717] = (byte) i;
            if (sha1_32(buf) == -338547133) {
                break;
            }
        }
        for (i = 34; i < 57; i++) {
            buf[718] = (byte) i;
            if (sha1_32(buf) == -53403289) {
                break;
            }
        }
        for (i = -88; i < -67; i++) {
            buf[719] = (byte) i;
            if (sha1_32(buf) == 1558676699) {
                break;
            }
        }
        for (i = 14; i < 23; i++) {
            buf[720] = (byte) i;
            if (sha1_32(buf) == -1697358195) {
                break;
            }
        }
        for (i = -75; i < -51; i++) {
            buf[721] = (byte) i;
            if (sha1_32(buf) == -1234434464) {
                break;
            }
        }
        for (i = -64; i < -55; i++) {
            buf[722] = (byte) i;
            if (sha1_32(buf) == -1378298946) {
                break;
            }
        }
        for (i = 25; i < 31; i++) {
            buf[723] = (byte) i;
            if (sha1_32(buf) == 1967330109) {
                break;
            }
        }
        for (i = 105; i < 127; i++) {
            buf[724] = (byte) i;
            if (sha1_32(buf) == -187412592) {
                break;
            }
        }
        for (i = 48; i < 67; i++) {
            buf[725] = (byte) i;
            if (sha1_32(buf) == -2092788470) {
                break;
            }
        }
        for (i = 17; i < 21; i++) {
            buf[726] = (byte) i;
            if (sha1_32(buf) == 209008567) {
                break;
            }
        }
        for (i = 56; i < 62; i++) {
            buf[727] = (byte) i;
            if (sha1_32(buf) == -2065268538) {
                break;
            }
        }
        for (i = 36; i < 63; i++) {
            buf[728] = (byte) i;
            if (sha1_32(buf) == 1329835070) {
                break;
            }
        }
        for (i = 66; i < 85; i++) {
            buf[729] = (byte) i;
            if (sha1_32(buf) == -77044930) {
                break;
            }
        }
        for (i = -128; i < -120; i++) {
            buf[730] = (byte) i;
            if (sha1_32(buf) == 2001416391) {
                break;
            }
        }
        for (i = -2; i < 17; i++) {
            buf[731] = (byte) i;
            if (sha1_32(buf) == 1384566481) {
                break;
            }
        }
        for (i = -73; i < -61; i++) {
            buf[732] = (byte) i;
            if (sha1_32(buf) == -811724507) {
                break;
            }
        }
        for (i = -20; i < -10; i++) {
            buf[733] = (byte) i;
            if (sha1_32(buf) == -653648031) {
                break;
            }
        }
        for (i = -121; i < -104; i++) {
            buf[734] = (byte) i;
            if (sha1_32(buf) == -2041238301) {
                break;
            }
        }
        for (i = 27; i < 44; i++) {
            buf[735] = (byte) i;
            if (sha1_32(buf) == 1475747147) {
                break;
            }
        }
        for (i = 118; i < 127; i++) {
            buf[736] = (byte) i;
            if (sha1_32(buf) == -1082376712) {
                break;
            }
        }
        for (i = 86; i < 92; i++) {
            buf[737] = (byte) i;
            if (sha1_32(buf) == -192898075) {
                break;
            }
        }
        for (i = 72; i < 78; i++) {
            buf[738] = (byte) i;
            if (sha1_32(buf) == 553908627) {
                break;
            }
        }
        for (i = 109; i < 122; i++) {
            buf[739] = (byte) i;
            if (sha1_32(buf) == -1754811848) {
                break;
            }
        }
        for (i = -4; i < 14; i++) {
            buf[740] = (byte) i;
            if (sha1_32(buf) == 963446445) {
                break;
            }
        }
        for (i = -104; i < -77; i++) {
            buf[741] = (byte) i;
            if (sha1_32(buf) == 613469783) {
                break;
            }
        }
        for (i = -47; i < -27; i++) {
            buf[742] = (byte) i;
            if (sha1_32(buf) == -1621860893) {
                break;
            }
        }
        for (i = 1; i < 7; i++) {
            buf[743] = (byte) i;
            if (sha1_32(buf) == -1489072247) {
                break;
            }
        }
        for (i = -76; i < -70; i++) {
            buf[744] = (byte) i;
            if (sha1_32(buf) == 191717151) {
                break;
            }
        }
        for (i = 71; i < 73; i++) {
            buf[745] = (byte) i;
            if (sha1_32(buf) == 1248940414) {
                break;
            }
        }
        for (i = -90; i < -67; i++) {
            buf[746] = (byte) i;
            if (sha1_32(buf) == 489925884) {
                break;
            }
        }
        for (i = -108; i < -93; i++) {
            buf[747] = (byte) i;
            if (sha1_32(buf) == -1004888140) {
                break;
            }
        }
        for (i = -53; i < -38; i++) {
            buf[748] = (byte) i;
            if (sha1_32(buf) == 489569448) {
                break;
            }
        }
        for (i = 110; i < 128; i++) {
            buf[749] = (byte) i;
            if (sha1_32(buf) == -1288203579) {
                break;
            }
        }
        for (i = 81; i < 105; i++) {
            buf[750] = (byte) i;
            if (sha1_32(buf) == 2116134145) {
                break;
            }
        }
        for (i = -125; i < -124; i++) {
            buf[751] = (byte) i;
            if (sha1_32(buf) == 1813594617) {
                break;
            }
        }
        for (i = 52; i < 62; i++) {
            buf[752] = (byte) i;
            if (sha1_32(buf) == -1778373465) {
                break;
            }
        }
        for (i = 45; i < 59; i++) {
            buf[753] = (byte) i;
            if (sha1_32(buf) == 1795066767) {
                break;
            }
        }
        for (i = -53; i < -36; i++) {
            buf[754] = (byte) i;
            if (sha1_32(buf) == -2143537381) {
                break;
            }
        }
        for (i = -63; i < -46; i++) {
            buf[755] = (byte) i;
            if (sha1_32(buf) == -1861738978) {
                break;
            }
        }
        for (i = -27; i < -16; i++) {
            buf[756] = (byte) i;
            if (sha1_32(buf) == -852534560) {
                break;
            }
        }
        for (i = 64; i < 81; i++) {
            buf[757] = (byte) i;
            if (sha1_32(buf) == 1417248241) {
                break;
            }
        }
        for (i = -76; i < -64; i++) {
            buf[758] = (byte) i;
            if (sha1_32(buf) == 1256398267) {
                break;
            }
        }
        for (i = -112; i < -99; i++) {
            buf[759] = (byte) i;
            if (sha1_32(buf) == 567110382) {
                break;
            }
        }
        for (i = 1; i < 11; i++) {
            buf[760] = (byte) i;
            if (sha1_32(buf) == 1123455981) {
                break;
            }
        }
        for (i = 21; i < 50; i++) {
            buf[761] = (byte) i;
            if (sha1_32(buf) == -2122369364) {
                break;
            }
        }
        for (i = -22; i < -16; i++) {
            buf[762] = (byte) i;
            if (sha1_32(buf) == 1294835607) {
                break;
            }
        }
        for (i = 83; i < 106; i++) {
            buf[763] = (byte) i;
            if (sha1_32(buf) == 1228517056) {
                break;
            }
        }
        for (i = -40; i < -22; i++) {
            buf[764] = (byte) i;
            if (sha1_32(buf) == 452778691) {
                break;
            }
        }
        for (i = 95; i < 111; i++) {
            buf[765] = (byte) i;
            if (sha1_32(buf) == -421416149) {
                break;
            }
        }
        for (i = 81; i < 104; i++) {
            buf[766] = (byte) i;
            if (sha1_32(buf) == -295426293) {
                break;
            }
        }
        for (i = 15; i < 26; i++) {
            buf[767] = (byte) i;
            if (sha1_32(buf) == -1945841154) {
                break;
            }
        }
        for (i = -46; i < -38; i++) {
            buf[768] = (byte) i;
            if (sha1_32(buf) == -1870815800) {
                break;
            }
        }
        for (i = -29; i < -12; i++) {
            buf[769] = (byte) i;
            if (sha1_32(buf) == 987286821) {
                break;
            }
        }
        for (i = 98; i < 115; i++) {
            buf[770] = (byte) i;
            if (sha1_32(buf) == 851343116) {
                break;
            }
        }
        for (i = 43; i < 64; i++) {
            buf[771] = (byte) i;
            if (sha1_32(buf) == -217168139) {
                break;
            }
        }
        for (i = 53; i < 71; i++) {
            buf[772] = (byte) i;
            if (sha1_32(buf) == 7342419) {
                break;
            }
        }
        for (i = -100; i < -84; i++) {
            buf[773] = (byte) i;
            if (sha1_32(buf) == 982001851) {
                break;
            }
        }
        for (i = -93; i < -83; i++) {
            buf[774] = (byte) i;
            if (sha1_32(buf) == -548846674) {
                break;
            }
        }
        for (i = -47; i < -25; i++) {
            buf[775] = (byte) i;
            if (sha1_32(buf) == 1423508512) {
                break;
            }
        }
        for (i = -9; i < 12; i++) {
            buf[776] = (byte) i;
            if (sha1_32(buf) == 246627915) {
                break;
            }
        }
        for (i = 72; i < 96; i++) {
            buf[777] = (byte) i;
            if (sha1_32(buf) == 967195459) {
                break;
            }
        }
        for (i = -128; i < -114; i++) {
            buf[778] = (byte) i;
            if (sha1_32(buf) == -1609626515) {
                break;
            }
        }
        for (i = -28; i < -15; i++) {
            buf[779] = (byte) i;
            if (sha1_32(buf) == 1631979365) {
                break;
            }
        }
        for (i = -18; i < 3; i++) {
            buf[780] = (byte) i;
            if (sha1_32(buf) == 491172060) {
                break;
            }
        }
        for (i = 38; i < 60; i++) {
            buf[781] = (byte) i;
            if (sha1_32(buf) == 1607619407) {
                break;
            }
        }
        for (i = 99; i < 116; i++) {
            buf[782] = (byte) i;
            if (sha1_32(buf) == 267651735) {
                break;
            }
        }
        for (i = -60; i < -51; i++) {
            buf[783] = (byte) i;
            if (sha1_32(buf) == -676388413) {
                break;
            }
        }
        for (i = -45; i < -26; i++) {
            buf[784] = (byte) i;
            if (sha1_32(buf) == -952996641) {
                break;
            }
        }
        for (i = 110; i < 128; i++) {
            buf[785] = (byte) i;
            if (sha1_32(buf) == 7727503) {
                break;
            }
        }
        for (i = 90; i < 115; i++) {
            buf[786] = (byte) i;
            if (sha1_32(buf) == 848110839) {
                break;
            }
        }
        for (i = 88; i < 101; i++) {
            buf[787] = (byte) i;
            if (sha1_32(buf) == -1848928992) {
                break;
            }
        }
        for (i = -87; i < -77; i++) {
            buf[788] = (byte) i;
            if (sha1_32(buf) == 1903272724) {
                break;
            }
        }
        for (i = 89; i < 108; i++) {
            buf[789] = (byte) i;
            if (sha1_32(buf) == -1319836109) {
                break;
            }
        }
        for (i = -127; i < -114; i++) {
            buf[790] = (byte) i;
            if (sha1_32(buf) == -1276437141) {
                break;
            }
        }
        for (i = 71; i < 93; i++) {
            buf[791] = (byte) i;
            if (sha1_32(buf) == -1965930804) {
                break;
            }
        }
        for (i = -114; i < -96; i++) {
            buf[792] = (byte) i;
            if (sha1_32(buf) == 1398512253) {
                break;
            }
        }
        for (i = 36; i < 60; i++) {
            buf[793] = (byte) i;
            if (sha1_32(buf) == 1881328813) {
                break;
            }
        }
        for (i = -34; i < -26; i++) {
            buf[794] = (byte) i;
            if (sha1_32(buf) == -1025546947) {
                break;
            }
        }
        for (i = 34; i < 42; i++) {
            buf[795] = (byte) i;
            if (sha1_32(buf) == -813940467) {
                break;
            }
        }
        for (i = -68; i < -50; i++) {
            buf[796] = (byte) i;
            if (sha1_32(buf) == 1038453352) {
                break;
            }
        }
        for (i = -114; i < -96; i++) {
            buf[797] = (byte) i;
            if (sha1_32(buf) == -1022100747) {
                break;
            }
        }
        for (i = -95; i < -89; i++) {
            buf[798] = (byte) i;
            if (sha1_32(buf) == -291304405) {
                break;
            }
        }
        for (i = 53; i < 63; i++) {
            buf[799] = (byte) i;
            if (sha1_32(buf) == -1473256810) {
                break;
            }
        }
        for (i = -106; i < -84; i++) {
            buf[800] = (byte) i;
            if (sha1_32(buf) == -1774254357) {
                break;
            }
        }
        for (i = 6; i < 13; i++) {
            buf[801] = (byte) i;
            if (sha1_32(buf) == -1398295228) {
                break;
            }
        }
        for (i = 14; i < 31; i++) {
            buf[802] = (byte) i;
            if (sha1_32(buf) == 895118925) {
                break;
            }
        }
        for (i = 87; i < 99; i++) {
            buf[803] = (byte) i;
            if (sha1_32(buf) == 1424901355) {
                break;
            }
        }
        for (i = -41; i < -34; i++) {
            buf[804] = (byte) i;
            if (sha1_32(buf) == -319743907) {
                break;
            }
        }
        for (i = -125; i < -110; i++) {
            buf[805] = (byte) i;
            if (sha1_32(buf) == -1058837788) {
                break;
            }
        }
        for (i = -39; i < -15; i++) {
            buf[806] = (byte) i;
            if (sha1_32(buf) == 95184002) {
                break;
            }
        }
        for (i = 3; i < 15; i++) {
            buf[807] = (byte) i;
            if (sha1_32(buf) == 1059618418) {
                break;
            }
        }
        for (i = -120; i < -112; i++) {
            buf[808] = (byte) i;
            if (sha1_32(buf) == -1628987186) {
                break;
            }
        }
        for (i = 72; i < 89; i++) {
            buf[809] = (byte) i;
            if (sha1_32(buf) == -1985746002) {
                break;
            }
        }
        for (i = -66; i < -42; i++) {
            buf[810] = (byte) i;
            if (sha1_32(buf) == 648748403) {
                break;
            }
        }
        for (i = 1; i < 19; i++) {
            buf[811] = (byte) i;
            if (sha1_32(buf) == -795938816) {
                break;
            }
        }
        for (i = -55; i < -33; i++) {
            buf[812] = (byte) i;
            if (sha1_32(buf) == 363241037) {
                break;
            }
        }
        for (i = -11; i < -7; i++) {
            buf[813] = (byte) i;
            if (sha1_32(buf) == 1724368202) {
                break;
            }
        }
        for (i = -53; i < -37; i++) {
            buf[814] = (byte) i;
            if (sha1_32(buf) == 854897682) {
                break;
            }
        }
        for (i = -113; i < -99; i++) {
            buf[815] = (byte) i;
            if (sha1_32(buf) == 1451422503) {
                break;
            }
        }
        for (i = -21; i < -1; i++) {
            buf[816] = (byte) i;
            if (sha1_32(buf) == 2080317061) {
                break;
            }
        }
        for (i = -16; i < 1; i++) {
            buf[817] = (byte) i;
            if (sha1_32(buf) == -2123640151) {
                break;
            }
        }
        for (i = 9; i < 35; i++) {
            buf[818] = (byte) i;
            if (sha1_32(buf) == 863757047) {
                break;
            }
        }
        for (i = -77; i < -52; i++) {
            buf[819] = (byte) i;
            if (sha1_32(buf) == -1411411813) {
                break;
            }
        }
        for (i = 15; i < 18; i++) {
            buf[820] = (byte) i;
            if (sha1_32(buf) == -1181985202) {
                break;
            }
        }
        for (i = 16; i < 33; i++) {
            buf[821] = (byte) i;
            if (sha1_32(buf) == -571622266) {
                break;
            }
        }
        for (i = -59; i < -58; i++) {
            buf[822] = (byte) i;
            if (sha1_32(buf) == -796119353) {
                break;
            }
        }
        for (i = 123; i < 128; i++) {
            buf[823] = (byte) i;
            if (sha1_32(buf) == 1595491308) {
                break;
            }
        }
        for (i = -115; i < -104; i++) {
            buf[824] = (byte) i;
            if (sha1_32(buf) == 131803113) {
                break;
            }
        }
        for (i = 55; i < 76; i++) {
            buf[825] = (byte) i;
            if (sha1_32(buf) == 1911099149) {
                break;
            }
        }
        for (i = -122; i < -111; i++) {
            buf[826] = (byte) i;
            if (sha1_32(buf) == -1558045178) {
                break;
            }
        }
        for (i = 99; i < 118; i++) {
            buf[827] = (byte) i;
            if (sha1_32(buf) == 1816355430) {
                break;
            }
        }
        for (i = 63; i < 72; i++) {
            buf[828] = (byte) i;
            if (sha1_32(buf) == 1209566270) {
                break;
            }
        }
        for (i = 61; i < 75; i++) {
            buf[829] = (byte) i;
            if (sha1_32(buf) == -1748223869) {
                break;
            }
        }
        for (i = 9; i < 22; i++) {
            buf[830] = (byte) i;
            if (sha1_32(buf) == -1213997551) {
                break;
            }
        }
        for (i = -70; i < -57; i++) {
            buf[831] = (byte) i;
            if (sha1_32(buf) == 1100004655) {
                break;
            }
        }
        for (i = 67; i < 92; i++) {
            buf[832] = (byte) i;
            if (sha1_32(buf) == -1941803405) {
                break;
            }
        }
        for (i = 118; i < 128; i++) {
            buf[833] = (byte) i;
            if (sha1_32(buf) == 1873463260) {
                break;
            }
        }
        for (i = 2; i < 20; i++) {
            buf[834] = (byte) i;
            if (sha1_32(buf) == -605445407) {
                break;
            }
        }
        for (i = 18; i < 34; i++) {
            buf[835] = (byte) i;
            if (sha1_32(buf) == 1173028029) {
                break;
            }
        }
        for (i = 31; i < 42; i++) {
            buf[836] = (byte) i;
            if (sha1_32(buf) == 1356428592) {
                break;
            }
        }
        for (i = 1; i < 29; i++) {
            buf[837] = (byte) i;
            if (sha1_32(buf) == 802866420) {
                break;
            }
        }
        for (i = 108; i < 123; i++) {
            buf[838] = (byte) i;
            if (sha1_32(buf) == 1385365960) {
                break;
            }
        }
        for (i = 85; i < 94; i++) {
            buf[839] = (byte) i;
            if (sha1_32(buf) == -1991855386) {
                break;
            }
        }
        for (i = 33; i < 63; i++) {
            buf[840] = (byte) i;
            if (sha1_32(buf) == 66487011) {
                break;
            }
        }
        for (i = -58; i < -46; i++) {
            buf[841] = (byte) i;
            if (sha1_32(buf) == 1251861753) {
                break;
            }
        }
        for (i = 105; i < 122; i++) {
            buf[842] = (byte) i;
            if (sha1_32(buf) == 484355692) {
                break;
            }
        }
        for (i = 28; i < 41; i++) {
            buf[843] = (byte) i;
            if (sha1_32(buf) == -1368166029) {
                break;
            }
        }
        for (i = -37; i < -18; i++) {
            buf[844] = (byte) i;
            if (sha1_32(buf) == 352826392) {
                break;
            }
        }
        for (i = 74; i < 94; i++) {
            buf[845] = (byte) i;
            if (sha1_32(buf) == -1135267170) {
                break;
            }
        }
        for (i = -52; i < -41; i++) {
            buf[846] = (byte) i;
            if (sha1_32(buf) == -508995867) {
                break;
            }
        }
        for (i = -70; i < -60; i++) {
            buf[847] = (byte) i;
            if (sha1_32(buf) == 1688104850) {
                break;
            }
        }
        for (i = 73; i < 92; i++) {
            buf[848] = (byte) i;
            if (sha1_32(buf) == 501341150) {
                break;
            }
        }
        for (i = -60; i < -40; i++) {
            buf[849] = (byte) i;
            if (sha1_32(buf) == -545205901) {
                break;
            }
        }
        for (i = -108; i < -89; i++) {
            buf[850] = (byte) i;
            if (sha1_32(buf) == 1845561006) {
                break;
            }
        }
        for (i = 71; i < 87; i++) {
            buf[851] = (byte) i;
            if (sha1_32(buf) == -298238662) {
                break;
            }
        }
        for (i = -47; i < -27; i++) {
            buf[852] = (byte) i;
            if (sha1_32(buf) == 1723424117) {
                break;
            }
        }
        for (i = -92; i < -73; i++) {
            buf[853] = (byte) i;
            if (sha1_32(buf) == -1867577048) {
                break;
            }
        }
        for (i = 111; i < 127; i++) {
            buf[854] = (byte) i;
            if (sha1_32(buf) == -1068198956) {
                break;
            }
        }
        for (i = 109; i < 124; i++) {
            buf[855] = (byte) i;
            if (sha1_32(buf) == 1671739086) {
                break;
            }
        }
        for (i = 43; i < 56; i++) {
            buf[856] = (byte) i;
            if (sha1_32(buf) == -1348851391) {
                break;
            }
        }
        for (i = -123; i < -103; i++) {
            buf[857] = (byte) i;
            if (sha1_32(buf) == -2135447977) {
                break;
            }
        }
        for (i = 9; i < 23; i++) {
            buf[858] = (byte) i;
            if (sha1_32(buf) == 676557275) {
                break;
            }
        }
        for (i = 79; i < 90; i++) {
            buf[859] = (byte) i;
            if (sha1_32(buf) == 1537258206) {
                break;
            }
        }
        for (i = -32; i < -15; i++) {
            buf[860] = (byte) i;
            if (sha1_32(buf) == 469912806) {
                break;
            }
        }
        for (i = -8; i < -2; i++) {
            buf[861] = (byte) i;
            if (sha1_32(buf) == -555045537) {
                break;
            }
        }
        for (i = -35; i < -27; i++) {
            buf[862] = (byte) i;
            if (sha1_32(buf) == -674103952) {
                break;
            }
        }
        for (i = -67; i < -52; i++) {
            buf[863] = (byte) i;
            if (sha1_32(buf) == -1453030071) {
                break;
            }
        }
        for (i = 94; i < 111; i++) {
            buf[864] = (byte) i;
            if (sha1_32(buf) == 2120500272) {
                break;
            }
        }
        for (i = 82; i < 101; i++) {
            buf[865] = (byte) i;
            if (sha1_32(buf) == 1795445555) {
                break;
            }
        }
        for (i = 97; i < 119; i++) {
            buf[866] = (byte) i;
            if (sha1_32(buf) == 2111710549) {
                break;
            }
        }
        for (i = 102; i < 115; i++) {
            buf[867] = (byte) i;
            if (sha1_32(buf) == 730032913) {
                break;
            }
        }
        for (i = -29; i < -12; i++) {
            buf[868] = (byte) i;
            if (sha1_32(buf) == -1021045502) {
                break;
            }
        }
        for (i = -66; i < -51; i++) {
            buf[869] = (byte) i;
            if (sha1_32(buf) == 629539185) {
                break;
            }
        }
        for (i = 8; i < 28; i++) {
            buf[870] = (byte) i;
            if (sha1_32(buf) == -1141134545) {
                break;
            }
        }
        for (i = 99; i < 117; i++) {
            buf[871] = (byte) i;
            if (sha1_32(buf) == 1791660519) {
                break;
            }
        }
        for (i = 1; i < 10; i++) {
            buf[872] = (byte) i;
            if (sha1_32(buf) == -1553111377) {
                break;
            }
        }
        for (i = 82; i < 90; i++) {
            buf[873] = (byte) i;
            if (sha1_32(buf) == -476789431) {
                break;
            }
        }
        for (i = 20; i < 39; i++) {
            buf[874] = (byte) i;
            if (sha1_32(buf) == -925608538) {
                break;
            }
        }
        for (i = -58; i < -42; i++) {
            buf[875] = (byte) i;
            if (sha1_32(buf) == 1521932607) {
                break;
            }
        }
        for (i = 111; i < 128; i++) {
            buf[876] = (byte) i;
            if (sha1_32(buf) == 411644750) {
                break;
            }
        }
        for (i = -57; i < -53; i++) {
            buf[877] = (byte) i;
            if (sha1_32(buf) == -580737223) {
                break;
            }
        }
        for (i = -88; i < -65; i++) {
            buf[878] = (byte) i;
            if (sha1_32(buf) == 1284313976) {
                break;
            }
        }
        for (i = -11; i < 11; i++) {
            buf[879] = (byte) i;
            if (sha1_32(buf) == -1815360707) {
                break;
            }
        }
        for (i = 59; i < 80; i++) {
            buf[880] = (byte) i;
            if (sha1_32(buf) == 688053183) {
                break;
            }
        }
        for (i = 55; i < 59; i++) {
            buf[881] = (byte) i;
            if (sha1_32(buf) == 1495177490) {
                break;
            }
        }
        for (i = -23; i < 4; i++) {
            buf[882] = (byte) i;
            if (sha1_32(buf) == 729187150) {
                break;
            }
        }
        for (i = 57; i < 76; i++) {
            buf[883] = (byte) i;
            if (sha1_32(buf) == 51730187) {
                break;
            }
        }
        for (i = -4; i < 14; i++) {
            buf[884] = (byte) i;
            if (sha1_32(buf) == -702586439) {
                break;
            }
        }
        for (i = 103; i < 128; i++) {
            buf[885] = (byte) i;
            if (sha1_32(buf) == 87424084) {
                break;
            }
        }
        for (i = -101; i < -75; i++) {
            buf[886] = (byte) i;
            if (sha1_32(buf) == -699930284) {
                break;
            }
        }
        for (i = -44; i < -26; i++) {
            buf[887] = (byte) i;
            if (sha1_32(buf) == 1786571429) {
                break;
            }
        }
        for (i = 80; i < 97; i++) {
            buf[888] = (byte) i;
            if (sha1_32(buf) == -1138807915) {
                break;
            }
        }
        for (i = -43; i < -26; i++) {
            buf[889] = (byte) i;
            if (sha1_32(buf) == -1756341528) {
                break;
            }
        }
        for (i = -66; i < -45; i++) {
            buf[890] = (byte) i;
            if (sha1_32(buf) == 360275596) {
                break;
            }
        }
        for (i = 4; i < 16; i++) {
            buf[891] = (byte) i;
            if (sha1_32(buf) == -49764198) {
                break;
            }
        }
        for (i = -18; i < 0; i++) {
            buf[892] = (byte) i;
            if (sha1_32(buf) == 500834222) {
                break;
            }
        }
        for (i = -62; i < -34; i++) {
            buf[893] = (byte) i;
            if (sha1_32(buf) == -1942241605) {
                break;
            }
        }
        for (i = 75; i < 90; i++) {
            buf[894] = (byte) i;
            if (sha1_32(buf) == 217035211) {
                break;
            }
        }
        for (i = 117; i < 128; i++) {
            buf[895] = (byte) i;
            if (sha1_32(buf) == 1416657546) {
                break;
            }
        }
        for (i = 70; i < 82; i++) {
            buf[896] = (byte) i;
            if (sha1_32(buf) == -2016285461) {
                break;
            }
        }
        for (i = -23; i < -10; i++) {
            buf[897] = (byte) i;
            if (sha1_32(buf) == 114222842) {
                break;
            }
        }
        for (i = -91; i < -68; i++) {
            buf[898] = (byte) i;
            if (sha1_32(buf) == 2142599755) {
                break;
            }
        }
        for (i = 91; i < 109; i++) {
            buf[899] = (byte) i;
            if (sha1_32(buf) == -107139948) {
                break;
            }
        }
        for (i = -58; i < -41; i++) {
            buf[900] = (byte) i;
            if (sha1_32(buf) == -1219409170) {
                break;
            }
        }
        for (i = 54; i < 67; i++) {
            buf[901] = (byte) i;
            if (sha1_32(buf) == 1582343845) {
                break;
            }
        }
        for (i = 45; i < 75; i++) {
            buf[902] = (byte) i;
            if (sha1_32(buf) == 2012058071) {
                break;
            }
        }
        for (i = 21; i < 39; i++) {
            buf[903] = (byte) i;
            if (sha1_32(buf) == -2137066123) {
                break;
            }
        }
        for (i = -92; i < -77; i++) {
            buf[904] = (byte) i;
            if (sha1_32(buf) == -1298588965) {
                break;
            }
        }
        for (i = 104; i < 114; i++) {
            buf[905] = (byte) i;
            if (sha1_32(buf) == -1720436751) {
                break;
            }
        }
        for (i = 57; i < 72; i++) {
            buf[906] = (byte) i;
            if (sha1_32(buf) == 151883081) {
                break;
            }
        }
        for (i = -84; i < -64; i++) {
            buf[907] = (byte) i;
            if (sha1_32(buf) == 1078158982) {
                break;
            }
        }
        for (i = -127; i < -108; i++) {
            buf[908] = (byte) i;
            if (sha1_32(buf) == 922593979) {
                break;
            }
        }
        for (i = 20; i < 40; i++) {
            buf[909] = (byte) i;
            if (sha1_32(buf) == 1680234142) {
                break;
            }
        }
        for (i = -52; i < -25; i++) {
            buf[910] = (byte) i;
            if (sha1_32(buf) == 138773505) {
                break;
            }
        }
        for (i = -110; i < -90; i++) {
            buf[911] = (byte) i;
            if (sha1_32(buf) == -2087436715) {
                break;
            }
        }
        for (i = 27; i < 39; i++) {
            buf[912] = (byte) i;
            if (sha1_32(buf) == 460358555) {
                break;
            }
        }
        for (i = -23; i < -6; i++) {
            buf[913] = (byte) i;
            if (sha1_32(buf) == -1932342974) {
                break;
            }
        }
        for (i = 85; i < 103; i++) {
            buf[914] = (byte) i;
            if (sha1_32(buf) == 44049026) {
                break;
            }
        }
        for (i = -113; i < -89; i++) {
            buf[915] = (byte) i;
            if (sha1_32(buf) == -195836071) {
                break;
            }
        }
        for (i = 78; i < 101; i++) {
            buf[916] = (byte) i;
            if (sha1_32(buf) == 36602411) {
                break;
            }
        }
        for (i = -2; i < 5; i++) {
            buf[917] = (byte) i;
            if (sha1_32(buf) == 1785172002) {
                break;
            }
        }
        for (i = 15; i < 25; i++) {
            buf[918] = (byte) i;
            if (sha1_32(buf) == 1535247731) {
                break;
            }
        }
        for (i = 66; i < 75; i++) {
            buf[919] = (byte) i;
            if (sha1_32(buf) == 1212284225) {
                break;
            }
        }
        for (i = 59; i < 86; i++) {
            buf[920] = (byte) i;
            if (sha1_32(buf) == -521169568) {
                break;
            }
        }
        for (i = -43; i < -29; i++) {
            buf[921] = (byte) i;
            if (sha1_32(buf) == -1138144045) {
                break;
            }
        }
        for (i = -63; i < -50; i++) {
            buf[922] = (byte) i;
            if (sha1_32(buf) == -389009252) {
                break;
            }
        }
        for (i = 2; i < 8; i++) {
            buf[923] = (byte) i;
            if (sha1_32(buf) == -401511062) {
                break;
            }
        }
        for (i = 124; i < 128; i++) {
            buf[924] = (byte) i;
            if (sha1_32(buf) == 1998211304) {
                break;
            }
        }
        for (i = -32; i < -13; i++) {
            buf[925] = (byte) i;
            if (sha1_32(buf) == -1028715599) {
                break;
            }
        }
        for (i = -93; i < -83; i++) {
            buf[926] = (byte) i;
            if (sha1_32(buf) == -1666274432) {
                break;
            }
        }
        for (i = -119; i < -105; i++) {
            buf[927] = (byte) i;
            if (sha1_32(buf) == -1940005719) {
                break;
            }
        }
        for (i = -102; i < -88; i++) {
            buf[928] = (byte) i;
            if (sha1_32(buf) == -2079212347) {
                break;
            }
        }
        for (i = 47; i < 65; i++) {
            buf[929] = (byte) i;
            if (sha1_32(buf) == -196002375) {
                break;
            }
        }
        for (i = -73; i < -69; i++) {
            buf[930] = (byte) i;
            if (sha1_32(buf) == 1309614422) {
                break;
            }
        }
        for (i = -6; i < 7; i++) {
            buf[931] = (byte) i;
            if (sha1_32(buf) == 1749643424) {
                break;
            }
        }
        for (i = -42; i < -30; i++) {
            buf[932] = (byte) i;
            if (sha1_32(buf) == -298167732) {
                break;
            }
        }
        for (i = -85; i < -73; i++) {
            buf[933] = (byte) i;
            if (sha1_32(buf) == -810448172) {
                break;
            }
        }
        for (i = -104; i < -86; i++) {
            buf[934] = (byte) i;
            if (sha1_32(buf) == 1535555229) {
                break;
            }
        }
        for (i = 61; i < 65; i++) {
            buf[935] = (byte) i;
            if (sha1_32(buf) == 1398827992) {
                break;
            }
        }
        for (i = 21; i < 29; i++) {
            buf[936] = (byte) i;
            if (sha1_32(buf) == 2025704761) {
                break;
            }
        }
        for (i = -89; i < -68; i++) {
            buf[937] = (byte) i;
            if (sha1_32(buf) == -45961036) {
                break;
            }
        }
        for (i = -128; i < -122; i++) {
            buf[938] = (byte) i;
            if (sha1_32(buf) == 1879604502) {
                break;
            }
        }
        for (i = -77; i < -56; i++) {
            buf[939] = (byte) i;
            if (sha1_32(buf) == 4131936) {
                break;
            }
        }
        for (i = 54; i < 66; i++) {
            buf[940] = (byte) i;
            if (sha1_32(buf) == 2137755002) {
                break;
            }
        }
        for (i = 36; i < 54; i++) {
            buf[941] = (byte) i;
            if (sha1_32(buf) == 2132830716) {
                break;
            }
        }
        for (i = -104; i < -85; i++) {
            buf[942] = (byte) i;
            if (sha1_32(buf) == -812342698) {
                break;
            }
        }
        for (i = 40; i < 65; i++) {
            buf[943] = (byte) i;
            if (sha1_32(buf) == -2059067098) {
                break;
            }
        }
        for (i = -20; i < -11; i++) {
            buf[944] = (byte) i;
            if (sha1_32(buf) == 927303093) {
                break;
            }
        }
        for (i = -4; i < 20; i++) {
            buf[945] = (byte) i;
            if (sha1_32(buf) == 263835062) {
                break;
            }
        }
        for (i = 80; i < 102; i++) {
            buf[946] = (byte) i;
            if (sha1_32(buf) == -1119331686) {
                break;
            }
        }
        for (i = -37; i < -23; i++) {
            buf[947] = (byte) i;
            if (sha1_32(buf) == 1881859771) {
                break;
            }
        }
        for (i = -2; i < 17; i++) {
            buf[948] = (byte) i;
            if (sha1_32(buf) == 694522590) {
                break;
            }
        }
        for (i = -48; i < -27; i++) {
            buf[949] = (byte) i;
            if (sha1_32(buf) == -1516443179) {
                break;
            }
        }
        for (i = 57; i < 82; i++) {
            buf[950] = (byte) i;
            if (sha1_32(buf) == -281207341) {
                break;
            }
        }
        for (i = -35; i < -22; i++) {
            buf[951] = (byte) i;
            if (sha1_32(buf) == 358460673) {
                break;
            }
        }
        for (i = -96; i < -86; i++) {
            buf[952] = (byte) i;
            if (sha1_32(buf) == 1109576454) {
                break;
            }
        }
        for (i = -113; i < -100; i++) {
            buf[953] = (byte) i;
            if (sha1_32(buf) == 1397196813) {
                break;
            }
        }
        for (i = -17; i < 1; i++) {
            buf[954] = (byte) i;
            if (sha1_32(buf) == 978210499) {
                break;
            }
        }
        for (i = -44; i < -37; i++) {
            buf[955] = (byte) i;
            if (sha1_32(buf) == -2002495423) {
                break;
            }
        }
        for (i = 28; i < 46; i++) {
            buf[956] = (byte) i;
            if (sha1_32(buf) == -94025452) {
                break;
            }
        }
        for (i = 10; i < 26; i++) {
            buf[957] = (byte) i;
            if (sha1_32(buf) == 103601811) {
                break;
            }
        }
        for (i = -19; i < -1; i++) {
            buf[958] = (byte) i;
            if (sha1_32(buf) == 329546418) {
                break;
            }
        }
        for (i = -12; i < 4; i++) {
            buf[959] = (byte) i;
            if (sha1_32(buf) == 1265685540) {
                break;
            }
        }
        for (i = -98; i < -95; i++) {
            buf[960] = (byte) i;
            if (sha1_32(buf) == 2108112641) {
                break;
            }
        }
        for (i = -15; i < 3; i++) {
            buf[961] = (byte) i;
            if (sha1_32(buf) == -371234939) {
                break;
            }
        }
        for (i = -85; i < -79; i++) {
            buf[962] = (byte) i;
            if (sha1_32(buf) == -1923522960) {
                break;
            }
        }
        for (i = 49; i < 58; i++) {
            buf[963] = (byte) i;
            if (sha1_32(buf) == -1911048498) {
                break;
            }
        }
        for (i = 66; i < 81; i++) {
            buf[964] = (byte) i;
            if (sha1_32(buf) == -2080097306) {
                break;
            }
        }
        for (i = -24; i < -20; i++) {
            buf[965] = (byte) i;
            if (sha1_32(buf) == -891315483) {
                break;
            }
        }
        for (i = 68; i < 81; i++) {
            buf[966] = (byte) i;
            if (sha1_32(buf) == -643803392) {
                break;
            }
        }
        for (i = 48; i < 60; i++) {
            buf[967] = (byte) i;
            if (sha1_32(buf) == 1838348211) {
                break;
            }
        }
        for (i = 48; i < 76; i++) {
            buf[968] = (byte) i;
            if (sha1_32(buf) == -1263182985) {
                break;
            }
        }
        for (i = -65; i < -52; i++) {
            buf[969] = (byte) i;
            if (sha1_32(buf) == -1298829820) {
                break;
            }
        }
        for (i = 86; i < 109; i++) {
            buf[970] = (byte) i;
            if (sha1_32(buf) == -1352436842) {
                break;
            }
        }
        for (i = -98; i < -87; i++) {
            buf[971] = (byte) i;
            if (sha1_32(buf) == 639912970) {
                break;
            }
        }
        for (i = -77; i < -60; i++) {
            buf[972] = (byte) i;
            if (sha1_32(buf) == 564161203) {
                break;
            }
        }
        for (i = 44; i < 58; i++) {
            buf[973] = (byte) i;
            if (sha1_32(buf) == 761041668) {
                break;
            }
        }
        for (i = -38; i < -34; i++) {
            buf[974] = (byte) i;
            if (sha1_32(buf) == 638406795) {
                break;
            }
        }
        for (i = 80; i < 96; i++) {
            buf[975] = (byte) i;
            if (sha1_32(buf) == -2135377769) {
                break;
            }
        }
        for (i = -29; i < -10; i++) {
            buf[976] = (byte) i;
            if (sha1_32(buf) == -1569793614) {
                break;
            }
        }
        for (i = 10; i < 26; i++) {
            buf[977] = (byte) i;
            if (sha1_32(buf) == -837227240) {
                break;
            }
        }
        for (i = 30; i < 45; i++) {
            buf[978] = (byte) i;
            if (sha1_32(buf) == -1342800051) {
                break;
            }
        }
        for (i = -23; i < -6; i++) {
            buf[979] = (byte) i;
            if (sha1_32(buf) == -1867101875) {
                break;
            }
        }
        for (i = 113; i < 128; i++) {
            buf[980] = (byte) i;
            if (sha1_32(buf) == 564156037) {
                break;
            }
        }
        for (i = 117; i < 128; i++) {
            buf[981] = (byte) i;
            if (sha1_32(buf) == 292009197) {
                break;
            }
        }
        for (i = 15; i < 27; i++) {
            buf[982] = (byte) i;
            if (sha1_32(buf) == -2145156472) {
                break;
            }
        }
        for (i = 88; i < 109; i++) {
            buf[983] = (byte) i;
            if (sha1_32(buf) == 1648831880) {
                break;
            }
        }
        for (i = 9; i < 32; i++) {
            buf[984] = (byte) i;
            if (sha1_32(buf) == 1372701777) {
                break;
            }
        }
        for (i = 56; i < 60; i++) {
            buf[985] = (byte) i;
            if (sha1_32(buf) == 852141770) {
                break;
            }
        }
        for (i = 40; i < 59; i++) {
            buf[986] = (byte) i;
            if (sha1_32(buf) == 1009071259) {
                break;
            }
        }
        for (i = -128; i < -109; i++) {
            buf[987] = (byte) i;
            if (sha1_32(buf) == 192084933) {
                break;
            }
        }
        for (i = 52; i < 69; i++) {
            buf[988] = (byte) i;
            if (sha1_32(buf) == -943741658) {
                break;
            }
        }
        for (i = 83; i < 99; i++) {
            buf[989] = (byte) i;
            if (sha1_32(buf) == 1435995437) {
                break;
            }
        }
        for (i = 97; i < 114; i++) {
            buf[990] = (byte) i;
            if (sha1_32(buf) == -484806357) {
                break;
            }
        }
        for (i = -1; i < 11; i++) {
            buf[991] = (byte) i;
            if (sha1_32(buf) == -1866936425) {
                break;
            }
        }
        for (i = 84; i < 94; i++) {
            buf[992] = (byte) i;
            if (sha1_32(buf) == 634463427) {
                break;
            }
        }
        for (i = -68; i < -52; i++) {
            buf[993] = (byte) i;
            if (sha1_32(buf) == -1056248311) {
                break;
            }
        }
        for (i = -19; i < 2; i++) {
            buf[994] = (byte) i;
            if (sha1_32(buf) == -1117300641) {
                break;
            }
        }
        for (i = -46; i < -26; i++) {
            buf[995] = (byte) i;
            if (sha1_32(buf) == -1670288746) {
                break;
            }
        }
        for (i = 69; i < 93; i++) {
            buf[996] = (byte) i;
            if (sha1_32(buf) == -937391816) {
                break;
            }
        }
        for (i = 58; i < 76; i++) {
            buf[997] = (byte) i;
            if (sha1_32(buf) == -1269600410) {
                break;
            }
        }
        for (i = -128; i < -116; i++) {
            buf[998] = (byte) i;
            if (sha1_32(buf) == -656234919) {
                break;
            }
        }
        for (i = 15; i < 32; i++) {
            buf[999] = (byte) i;
            if (sha1_32(buf) == 309335661) {
                break;
            }
        }
        for (i = 91; i < 107; i++) {
            buf[1000] = (byte) i;
            if (sha1_32(buf) == 1453519932) {
                break;
            }
        }
        for (i = -84; i < -70; i++) {
            buf[1001] = (byte) i;
            if (sha1_32(buf) == 1348624000) {
                break;
            }
        }
        for (i = 69; i < 79; i++) {
            buf[1002] = (byte) i;
            if (sha1_32(buf) == -1339757037) {
                break;
            }
        }
        for (i = -59; i < -39; i++) {
            buf[1003] = (byte) i;
            if (sha1_32(buf) == -1580418184) {
                break;
            }
        }
        for (i = -57; i < -40; i++) {
            buf[1004] = (byte) i;
            if (sha1_32(buf) == -912900050) {
                break;
            }
        }
        for (i = -126; i < -114; i++) {
            buf[1005] = (byte) i;
            if (sha1_32(buf) == 186746285) {
                break;
            }
        }
        for (i = 55; i < 58; i++) {
            buf[1006] = (byte) i;
            if (sha1_32(buf) == 1301117092) {
                break;
            }
        }
        for (i = -67; i < -45; i++) {
            buf[1007] = (byte) i;
            if (sha1_32(buf) == -1374940592) {
                break;
            }
        }
        for (i = -128; i < -113; i++) {
            buf[1008] = (byte) i;
            if (sha1_32(buf) == -612407741) {
                break;
            }
        }
        for (i = 48; i < 69; i++) {
            buf[1009] = (byte) i;
            if (sha1_32(buf) == -521120724) {
                break;
            }
        }
        for (i = 51; i < 76; i++) {
            buf[1010] = (byte) i;
            if (sha1_32(buf) == -1869335954) {
                break;
            }
        }
        for (i = 37; i < 40; i++) {
            buf[1011] = (byte) i;
            if (sha1_32(buf) == -647875350) {
                break;
            }
        }
        for (i = 111; i < 128; i++) {
            buf[1012] = (byte) i;
            if (sha1_32(buf) == -1319031246) {
                break;
            }
        }
        for (i = 39; i < 56; i++) {
            buf[1013] = (byte) i;
            if (sha1_32(buf) == 719166466) {
                break;
            }
        }
        for (i = -25; i < -8; i++) {
            buf[1014] = (byte) i;
            if (sha1_32(buf) == -1341099261) {
                break;
            }
        }
        for (i = -96; i < -81; i++) {
            buf[1015] = (byte) i;
            if (sha1_32(buf) == 359225977) {
                break;
            }
        }
        for (i = 50; i < 55; i++) {
            buf[1016] = (byte) i;
            if (sha1_32(buf) == 2055039803) {
                break;
            }
        }
        for (i = -13; i < -8; i++) {
            buf[1017] = (byte) i;
            if (sha1_32(buf) == 221674766) {
                break;
            }
        }
        for (i = -48; i < -38; i++) {
            buf[1018] = (byte) i;
            if (sha1_32(buf) == 1492792429) {
                break;
            }
        }
        for (i = 38; i < 60; i++) {
            buf[1019] = (byte) i;
            if (sha1_32(buf) == -872579876) {
                break;
            }
        }
        for (i = 118; i < 126; i++) {
            buf[1020] = (byte) i;
            if (sha1_32(buf) == -1644842197) {
                break;
            }
        }
        for (i = -76; i < -64; i++) {
            buf[1021] = (byte) i;
            if (sha1_32(buf) == -634441731) {
                break;
            }
        }
        for (i = -58; i < -54; i++) {
            buf[1022] = (byte) i;
            if (sha1_32(buf) == -1538867474) {
                break;
            }
        }
        for (i = 99; i < 116; i++) {
            buf[1023] = (byte) i;
            if (sha1_32(buf) == -1374982756) {
                break;
            }
        }
        for (i = -117; i < -94; i++) {
            buf[1024] = (byte) i;
            if (sha1_32(buf) == -1895711633) {
                break;
            }
        }
        for (i = 24; i < 45; i++) {
            buf[1025] = (byte) i;
            if (sha1_32(buf) == 1358078572) {
                break;
            }
        }
        for (i = -35; i < -29; i++) {
            buf[1026] = (byte) i;
            if (sha1_32(buf) == -1994937027) {
                break;
            }
        }
        for (i = 71; i < 90; i++) {
            buf[1027] = (byte) i;
            if (sha1_32(buf) == 1222435421) {
                break;
            }
        }
        for (i = 94; i < 107; i++) {
            buf[1028] = (byte) i;
            if (sha1_32(buf) == -859212306) {
                break;
            }
        }
        for (i = 95; i < 118; i++) {
            buf[1029] = (byte) i;
            if (sha1_32(buf) == 628040647) {
                break;
            }
        }
        for (i = -110; i < -100; i++) {
            buf[1030] = (byte) i;
            if (sha1_32(buf) == -1131252686) {
                break;
            }
        }
        for (i = 13; i < 27; i++) {
            buf[1031] = (byte) i;
            if (sha1_32(buf) == 1111585972) {
                break;
            }
        }
        for (i = 50; i < 62; i++) {
            buf[1032] = (byte) i;
            if (sha1_32(buf) == -857961482) {
                break;
            }
        }
        for (i = -38; i < -31; i++) {
            buf[1033] = (byte) i;
            if (sha1_32(buf) == 756689010) {
                break;
            }
        }
        for (i = -64; i < -41; i++) {
            buf[1034] = (byte) i;
            if (sha1_32(buf) == -2847855) {
                break;
            }
        }
        for (i = -40; i < -18; i++) {
            buf[1035] = (byte) i;
            if (sha1_32(buf) == -173547113) {
                break;
            }
        }
        for (i = 42; i < 53; i++) {
            buf[1036] = (byte) i;
            if (sha1_32(buf) == -1200735465) {
                break;
            }
        }
        for (i = 111; i < 128; i++) {
            buf[1037] = (byte) i;
            if (sha1_32(buf) == 818125719) {
                break;
            }
        }
        for (i = -74; i < -52; i++) {
            buf[1038] = (byte) i;
            if (sha1_32(buf) == -512683531) {
                break;
            }
        }
        for (i = 17; i < 38; i++) {
            buf[1039] = (byte) i;
            if (sha1_32(buf) == -1969226883) {
                break;
            }
        }
        for (i = -86; i < -76; i++) {
            buf[1040] = (byte) i;
            if (sha1_32(buf) == 837172787) {
                break;
            }
        }
        for (i = -13; i < 4; i++) {
            buf[1041] = (byte) i;
            if (sha1_32(buf) == 1534234361) {
                break;
            }
        }
        for (i = 15; i < 27; i++) {
            buf[1042] = (byte) i;
            if (sha1_32(buf) == 1133454536) {
                break;
            }
        }
        for (i = 19; i < 36; i++) {
            buf[1043] = (byte) i;
            if (sha1_32(buf) == 1615327876) {
                break;
            }
        }
        for (i = -32; i < -8; i++) {
            buf[1044] = (byte) i;
            if (sha1_32(buf) == -2024679286) {
                break;
            }
        }
        for (i = 56; i < 76; i++) {
            buf[1045] = (byte) i;
            if (sha1_32(buf) == -1389970555) {
                break;
            }
        }
        for (i = 20; i < 31; i++) {
            buf[1046] = (byte) i;
            if (sha1_32(buf) == 1933883373) {
                break;
            }
        }
        for (i = -18; i < 12; i++) {
            buf[1047] = (byte) i;
            if (sha1_32(buf) == 1485743218) {
                break;
            }
        }
        for (i = -100; i < -95; i++) {
            buf[1048] = (byte) i;
            if (sha1_32(buf) == -538182720) {
                break;
            }
        }
        for (i = -94; i < -88; i++) {
            buf[1049] = (byte) i;
            if (sha1_32(buf) == -1583378699) {
                break;
            }
        }
        for (i = -104; i < -99; i++) {
            buf[1050] = (byte) i;
            if (sha1_32(buf) == -1837939933) {
                break;
            }
        }
        for (i = -90; i < -77; i++) {
            buf[1051] = (byte) i;
            if (sha1_32(buf) == -78922543) {
                break;
            }
        }
        for (i = 66; i < 89; i++) {
            buf[1052] = (byte) i;
            if (sha1_32(buf) == -1220159242) {
                break;
            }
        }
        for (i = 56; i < 66; i++) {
            buf[1053] = (byte) i;
            if (sha1_32(buf) == -848977660) {
                break;
            }
        }
        for (i = 76; i < 105; i++) {
            buf[1054] = (byte) i;
            if (sha1_32(buf) == 255521008) {
                break;
            }
        }
        for (i = 58; i < 64; i++) {
            buf[1055] = (byte) i;
            if (sha1_32(buf) == 190547092) {
                break;
            }
        }
        for (i = -47; i < -37; i++) {
            buf[1056] = (byte) i;
            if (sha1_32(buf) == -432841778) {
                break;
            }
        }
        for (i = -88; i < -82; i++) {
            buf[1057] = (byte) i;
            if (sha1_32(buf) == -1934719717) {
                break;
            }
        }
        for (i = -105; i < -89; i++) {
            buf[1058] = (byte) i;
            if (sha1_32(buf) == -421560731) {
                break;
            }
        }
        for (i = -119; i < -109; i++) {
            buf[1059] = (byte) i;
            if (sha1_32(buf) == -577313745) {
                break;
            }
        }
        for (i = 42; i < 45; i++) {
            buf[1060] = (byte) i;
            if (sha1_32(buf) == 251917428) {
                break;
            }
        }
        for (i = -64; i < -34; i++) {
            buf[1061] = (byte) i;
            if (sha1_32(buf) == -1443943293) {
                break;
            }
        }
        for (i = -3; i < 8; i++) {
            buf[1062] = (byte) i;
            if (sha1_32(buf) == 1465876996) {
                break;
            }
        }
        for (i = -68; i < -57; i++) {
            buf[1063] = (byte) i;
            if (sha1_32(buf) == -1483762732) {
                break;
            }
        }
        for (i = 74; i < 85; i++) {
            buf[1064] = (byte) i;
            if (sha1_32(buf) == -1833853218) {
                break;
            }
        }
        for (i = -57; i < -46; i++) {
            buf[1065] = (byte) i;
            if (sha1_32(buf) == -1214784055) {
                break;
            }
        }
        for (i = 9; i < 24; i++) {
            buf[1066] = (byte) i;
            if (sha1_32(buf) == -1930452261) {
                break;
            }
        }
        for (i = 38; i < 39; i++) {
            buf[1067] = (byte) i;
            if (sha1_32(buf) == 1441344633) {
                break;
            }
        }
        for (i = -127; i < -112; i++) {
            buf[1068] = (byte) i;
            if (sha1_32(buf) == -424098807) {
                break;
            }
        }
        for (i = -1; i < 20; i++) {
            buf[1069] = (byte) i;
            if (sha1_32(buf) == -1084211252) {
                break;
            }
        }
        for (i = 22; i < 35; i++) {
            buf[1070] = (byte) i;
            if (sha1_32(buf) == 190884862) {
                break;
            }
        }
        for (i = 53; i < 73; i++) {
            buf[1071] = (byte) i;
            if (sha1_32(buf) == -588078017) {
                break;
            }
        }
        for (i = -35; i < -14; i++) {
            buf[1072] = (byte) i;
            if (sha1_32(buf) == -1661384250) {
                break;
            }
        }
        for (i = -69; i < -54; i++) {
            buf[1073] = (byte) i;
            if (sha1_32(buf) == 563474424) {
                break;
            }
        }
        for (i = 57; i < 69; i++) {
            buf[1074] = (byte) i;
            if (sha1_32(buf) == 1017532320) {
                break;
            }
        }
        for (i = -33; i < -24; i++) {
            buf[1075] = (byte) i;
            if (sha1_32(buf) == -1671091184) {
                break;
            }
        }
        for (i = 113; i < 128; i++) {
            buf[1076] = (byte) i;
            if (sha1_32(buf) == -1463592302) {
                break;
            }
        }
        for (i = 86; i < 104; i++) {
            buf[1077] = (byte) i;
            if (sha1_32(buf) == -1555427532) {
                break;
            }
        }
        for (i = -16; i < -12; i++) {
            buf[1078] = (byte) i;
            if (sha1_32(buf) == 1253951835) {
                break;
            }
        }
        for (i = -26; i < -15; i++) {
            buf[1079] = (byte) i;
            if (sha1_32(buf) == -952846520) {
                break;
            }
        }
        for (i = -93; i < -87; i++) {
            buf[1080] = (byte) i;
            if (sha1_32(buf) == -173917048) {
                break;
            }
        }
        for (i = -53; i < -41; i++) {
            buf[1081] = (byte) i;
            if (sha1_32(buf) == -794177389) {
                break;
            }
        }
        for (i = 90; i < 111; i++) {
            buf[1082] = (byte) i;
            if (sha1_32(buf) == 1784713774) {
                break;
            }
        }
        for (i = -88; i < -78; i++) {
            buf[1083] = (byte) i;
            if (sha1_32(buf) == 1864496566) {
                break;
            }
        }
        for (i = 113; i < 126; i++) {
            buf[1084] = (byte) i;
            if (sha1_32(buf) == 207597216) {
                break;
            }
        }
        for (i = -62; i < -53; i++) {
            buf[1085] = (byte) i;
            if (sha1_32(buf) == 1988694800) {
                break;
            }
        }
        for (i = -128; i < -112; i++) {
            buf[1086] = (byte) i;
            if (sha1_32(buf) == -1739602262) {
                break;
            }
        }
        for (i = 37; i < 49; i++) {
            buf[1087] = (byte) i;
            if (sha1_32(buf) == 1938385844) {
                break;
            }
        }
        for (i = 104; i < 120; i++) {
            buf[1088] = (byte) i;
            if (sha1_32(buf) == 1991073504) {
                break;
            }
        }
        for (i = -128; i < -108; i++) {
            buf[1089] = (byte) i;
            if (sha1_32(buf) == 1584901012) {
                break;
            }
        }
        for (i = 82; i < 92; i++) {
            buf[1090] = (byte) i;
            if (sha1_32(buf) == 531803487) {
                break;
            }
        }
        for (i = -128; i < -108; i++) {
            buf[1091] = (byte) i;
            if (sha1_32(buf) == -1384683590) {
                break;
            }
        }
        for (i = 59; i < 67; i++) {
            buf[1092] = (byte) i;
            if (sha1_32(buf) == 1019040380) {
                break;
            }
        }
        for (i = -91; i < -79; i++) {
            buf[1093] = (byte) i;
            if (sha1_32(buf) == 1492809646) {
                break;
            }
        }
        for (i = -86; i < -69; i++) {
            buf[1094] = (byte) i;
            if (sha1_32(buf) == 812467347) {
                break;
            }
        }
        for (i = 40; i < 51; i++) {
            buf[1095] = (byte) i;
            if (sha1_32(buf) == 1644912157) {
                break;
            }
        }
        for (i = -106; i < -89; i++) {
            buf[1096] = (byte) i;
            if (sha1_32(buf) == -692664922) {
                break;
            }
        }
        for (i = -33; i < -7; i++) {
            buf[1097] = (byte) i;
            if (sha1_32(buf) == -536085565) {
                break;
            }
        }
        for (i = -85; i < -59; i++) {
            buf[1098] = (byte) i;
            if (sha1_32(buf) == -388747628) {
                break;
            }
        }
        for (i = 42; i < 59; i++) {
            buf[1099] = (byte) i;
            if (sha1_32(buf) == 359715171) {
                break;
            }
        }
        for (i = -61; i < -33; i++) {
            buf[1100] = (byte) i;
            if (sha1_32(buf) == 1648176869) {
                break;
            }
        }
        for (i = 101; i < 118; i++) {
            buf[1101] = (byte) i;
            if (sha1_32(buf) == -1135899175) {
                break;
            }
        }
        for (i = -113; i < -97; i++) {
            buf[1102] = (byte) i;
            if (sha1_32(buf) == 328793895) {
                break;
            }
        }
        for (i = 25; i < 53; i++) {
            buf[1103] = (byte) i;
            if (sha1_32(buf) == -1611182691) {
                break;
            }
        }
        for (i = 34; i < 56; i++) {
            buf[1104] = (byte) i;
            if (sha1_32(buf) == -1016985812) {
                break;
            }
        }
        for (i = 51; i < 77; i++) {
            buf[1105] = (byte) i;
            if (sha1_32(buf) == 1871853794) {
                break;
            }
        }
        for (i = -22; i < 0; i++) {
            buf[1106] = (byte) i;
            if (sha1_32(buf) == 2130841472) {
                break;
            }
        }
        for (i = 104; i < 127; i++) {
            buf[1107] = (byte) i;
            if (sha1_32(buf) == -1917273285) {
                break;
            }
        }
        for (i = -124; i < -96; i++) {
            buf[1108] = (byte) i;
            if (sha1_32(buf) == -61529293) {
                break;
            }
        }
        for (i = -98; i < -92; i++) {
            buf[1109] = (byte) i;
            if (sha1_32(buf) == 195030619) {
                break;
            }
        }
        for (i = 104; i < 127; i++) {
            buf[1110] = (byte) i;
            if (sha1_32(buf) == 1196658545) {
                break;
            }
        }
        for (i = -64; i < -53; i++) {
            buf[1111] = (byte) i;
            if (sha1_32(buf) == -572364436) {
                break;
            }
        }
        for (i = 31; i < 59; i++) {
            buf[1112] = (byte) i;
            if (sha1_32(buf) == 1085793346) {
                break;
            }
        }
        for (i = -50; i < -35; i++) {
            buf[1113] = (byte) i;
            if (sha1_32(buf) == 1750741573) {
                break;
            }
        }
        for (i = -21; i < -3; i++) {
            buf[1114] = (byte) i;
            if (sha1_32(buf) == -1224360725) {
                break;
            }
        }
        for (i = -7; i < 6; i++) {
            buf[1115] = (byte) i;
            if (sha1_32(buf) == -1443231171) {
                break;
            }
        }
        for (i = 17; i < 34; i++) {
            buf[1116] = (byte) i;
            if (sha1_32(buf) == -398561984) {
                break;
            }
        }
        for (i = 85; i < 92; i++) {
            buf[1117] = (byte) i;
            if (sha1_32(buf) == 1939144288) {
                break;
            }
        }
        for (i = -31; i < -20; i++) {
            buf[1118] = (byte) i;
            if (sha1_32(buf) == 1556451934) {
                break;
            }
        }
        for (i = 99; i < 112; i++) {
            buf[1119] = (byte) i;
            if (sha1_32(buf) == -136044341) {
                break;
            }
        }
        for (i = -64; i < -40; i++) {
            buf[1120] = (byte) i;
            if (sha1_32(buf) == 764361964) {
                break;
            }
        }
        for (i = 52; i < 64; i++) {
            buf[1121] = (byte) i;
            if (sha1_32(buf) == 249881654) {
                break;
            }
        }
        for (i = -93; i < -83; i++) {
            buf[1122] = (byte) i;
            if (sha1_32(buf) == -507957022) {
                break;
            }
        }
        for (i = -3; i < 8; i++) {
            buf[1123] = (byte) i;
            if (sha1_32(buf) == 420957369) {
                break;
            }
        }
        for (i = -114; i < -88; i++) {
            buf[1124] = (byte) i;
            if (sha1_32(buf) == 1955648710) {
                break;
            }
        }
        for (i = 17; i < 32; i++) {
            buf[1125] = (byte) i;
            if (sha1_32(buf) == 1647533753) {
                break;
            }
        }
        for (i = 28; i < 33; i++) {
            buf[1126] = (byte) i;
            if (sha1_32(buf) == 1177726208) {
                break;
            }
        }
        for (i = 69; i < 92; i++) {
            buf[1127] = (byte) i;
            if (sha1_32(buf) == 1236855647) {
                break;
            }
        }
        for (i = -78; i < -63; i++) {
            buf[1128] = (byte) i;
            if (sha1_32(buf) == -1644338409) {
                break;
            }
        }
        for (i = 103; i < 118; i++) {
            buf[1129] = (byte) i;
            if (sha1_32(buf) == -2113503322) {
                break;
            }
        }
        for (i = 35; i < 58; i++) {
            buf[1130] = (byte) i;
            if (sha1_32(buf) == -1270644243) {
                break;
            }
        }
        for (i = -96; i < -82; i++) {
            buf[1131] = (byte) i;
            if (sha1_32(buf) == 811856155) {
                break;
            }
        }
        for (i = 36; i < 48; i++) {
            buf[1132] = (byte) i;
            if (sha1_32(buf) == -279820364) {
                break;
            }
        }
        for (i = -75; i < -58; i++) {
            buf[1133] = (byte) i;
            if (sha1_32(buf) == -1801296278) {
                break;
            }
        }
        for (i = -13; i < 2; i++) {
            buf[1134] = (byte) i;
            if (sha1_32(buf) == 1372683288) {
                break;
            }
        }
        for (i = 71; i < 75; i++) {
            buf[1135] = (byte) i;
            if (sha1_32(buf) == 301097268) {
                break;
            }
        }
        for (i = 88; i < 104; i++) {
            buf[1136] = (byte) i;
            if (sha1_32(buf) == -1071448906) {
                break;
            }
        }
        for (i = -52; i < -30; i++) {
            buf[1137] = (byte) i;
            if (sha1_32(buf) == 1634089822) {
                break;
            }
        }
        for (i = 22; i < 33; i++) {
            buf[1138] = (byte) i;
            if (sha1_32(buf) == 1168180592) {
                break;
            }
        }
        for (i = 60; i < 74; i++) {
            buf[1139] = (byte) i;
            if (sha1_32(buf) == -444008659) {
                break;
            }
        }
        for (i = -104; i < -98; i++) {
            buf[1140] = (byte) i;
            if (sha1_32(buf) == 229694210) {
                break;
            }
        }
        for (i = -29; i < -11; i++) {
            buf[1141] = (byte) i;
            if (sha1_32(buf) == -2079246909) {
                break;
            }
        }
        for (i = -113; i < -106; i++) {
            buf[1142] = (byte) i;
            if (sha1_32(buf) == -554733211) {
                break;
            }
        }
        for (i = -45; i < -37; i++) {
            buf[1143] = (byte) i;
            if (sha1_32(buf) == 899533559) {
                break;
            }
        }
        return buf;
    }
}
