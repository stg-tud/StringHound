// Generated with Weka 3.8.3
//
// This code is public domain and comes with no warranty.
//
// Timestamp: Tue Mar 12 09:52:30 CET 2019

package classifier;

public class WekaStringREPTree {

  public static double classify(Object [] i)
    throws Exception {

    double p = Double.NaN;
    p = WekaStringREPTree.N557405400(i);
    return p;
  }
  static double N557405400(Object []i) {
    double p = Double.NaN;
    /* maxLenKnownWord */
    if (i[47] == null) {
      p = 0.5;
    } else if (((Double)i[47]).doubleValue() < 3.5) {
    p = WekaStringREPTree.N60015ef51(i);
    } else if (true) {
    p = WekaStringREPTree.N11bb571c1280(i);
    } 
    return p;
  }
  static double N60015ef51(Object []i) {
    double p = Double.NaN;
    /* simpleSplitWordLen */
    if (i[36] == null) {
      p = 0.8469734668432228;
    } else if (((Double)i[36]).doubleValue() < 3.5) {
    p = WekaStringREPTree.N2f54a33d2(i);
    } else if (true) {
    p = WekaStringREPTree.N5524cca1614(i);
    } 
    return p;
  }
  static double N2f54a33d2(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.3454914381866772;
    } else if (((Double)i[31]).doubleValue() < 0.19090909090909092) {
    p = WekaStringREPTree.N1018bde23(i);
    } else if (true) {
    p = WekaStringREPTree.N342c38f8333(i);
    } 
    return p;
  }
  static double N1018bde23(Object []i) {
    double p = Double.NaN;
    /* simpleSplitWordLen */
    if (i[36] == null) {
      p = 0.15987961001328774;
    } else if (((Double)i[36]).doubleValue() < 1.5) {
    p = WekaStringREPTree.N65b3f4a44(i);
    } else if (true) {
    p = WekaStringREPTree.N272ed83b151(i);
    } 
    return p;
  }
  static double N65b3f4a44(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.08320949791324143;
    } else if (((Double)i[37]).doubleValue() < 0.5) {
    p = WekaStringREPTree.Nf2ff8115(i);
    } else if (true) {
    p = WekaStringREPTree.Nc03cf2837(i);
    } 
    return p;
  }
  static double Nf2ff8115(Object []i) {
    double p = Double.NaN;
    /* maxLenKnownWord */
    if (i[47] == null) {
      p = 0.02207150931048843;
    } else if (((Double)i[47]).doubleValue() < 1.5) {
    p = WekaStringREPTree.N568ff826(i);
    } else if (true) {
    p = WekaStringREPTree.N3cc1435c24(i);
    } 
    return p;
  }
  static double N568ff826(Object []i) {
    double p = Double.NaN;
    /* knownUniqueWords */
    if (i[45] == null) {
      p = 0.07441183232431604;
    } else if (((Double)i[45]).doubleValue() < 5.5) {
    p = WekaStringREPTree.N50caa5607(i);
    } else if (true) {
    p = WekaStringREPTree.N236e3f4e23(i);
    } 
    return p;
  }
  static double N50caa5607(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.06876303793556363;
    } else if (((Double)i[51]).doubleValue() < 0.8449519230769231) {
    p = WekaStringREPTree.N2a266d098(i);
    } else if (true) {
    p = WekaStringREPTree.N36b4fe2a15(i);
    } 
    return p;
  }
  static double N2a266d098(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.01841712294673967;
    } else if (((Double)i[43]).doubleValue() < 0.11805555555555555) {
    p = WekaStringREPTree.N5ab9e72c9(i);
    } else if (true) {
    p = WekaStringREPTree.N186f871610(i);
    } 
    return p;
  }
  static double N5ab9e72c9(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.016753224995811694;
    } else if (((Double)i[51]).doubleValue() < 0.8169856459330143) {
      p = 0.011729473421512353;
    } else if (true) {
      p = 0.027013251783893986;
    } 
    return p;
  }
  static double N186f871610(Object []i) {
    double p = Double.NaN;
    /* stackHeuristic */
    if (i[48] == null) {
      p = 0.1896551724137931;
    } else if (((Double)i[48]).doubleValue() < -0.25144318146498484) {
      p = 0.05263157894736842;
    } else if (true) {
    p = WekaStringREPTree.N1d8bd0de11(i);
    } 
    return p;
  }
  static double N1d8bd0de11(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.2564102564102564;
    } else if (((Double)i[51]).doubleValue() < 0.8088861838101035) {
    p = WekaStringREPTree.N45ca84312(i);
    } else if (true) {
    p = WekaStringREPTree.N11c9af6313(i);
    } 
    return p;
  }
  static double N45ca84312(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.625;
    } else if (((Double)i[43]).doubleValue() < 0.3106060606060606) {
      p = 1.0;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N11c9af6313(Object []i) {
    double p = Double.NaN;
    /* stackHeuristic */
    if (i[48] == null) {
      p = 0.16129032258064516;
    } else if (((Double)i[48]).doubleValue() < -0.12572159073249242) {
      p = 0.0;
    } else if (true) {
    p = WekaStringREPTree.N757acd7b14(i);
    } 
    return p;
  }
  static double N757acd7b14(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.3125;
    } else if (((Double)i[51]).doubleValue() < 0.8284313725490196) {
      p = 0.0;
    } else if (true) {
      p = 0.5;
    } 
    return p;
  }
  static double N36b4fe2a15(Object []i) {
    double p = Double.NaN;
    /* knownWordsCount */
    if (i[44] == null) {
      p = 0.11263736263736264;
    } else if (((Double)i[44]).doubleValue() < 3.5) {
    p = WekaStringREPTree.N574b560f16(i);
    } else if (true) {
      p = 0.2793522267206478;
    } 
    return p;
  }
  static double N574b560f16(Object []i) {
    double p = Double.NaN;
    /* stackHeuristic */
    if (i[48] == null) {
      p = 0.1064627380416854;
    } else if (((Double)i[48]).doubleValue() < -0.32192341869085683) {
      p = 0.6666666666666666;
    } else if (true) {
    p = WekaStringREPTree.Nba5493217(i);
    } 
    return p;
  }
  static double Nba5493217(Object []i) {
    double p = Double.NaN;
    /* normEntropy */
    if (i[50] == null) {
      p = 0.10621062106210621;
    } else if (((Double)i[50]).doubleValue() < 1.9609640474436811) {
    p = WekaStringREPTree.N28975c2818(i);
    } else if (true) {
      p = 0.06349206349206349;
    } 
    return p;
  }
  static double N28975c2818(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.1116751269035533;
    } else if (((Double)i[43]).doubleValue() < 0.875) {
    p = WekaStringREPTree.N3943a2be19(i);
    } else if (true) {
    p = WekaStringREPTree.N157853da21(i);
    } 
    return p;
  }
  static double N3943a2be19(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.1514543630892678;
    } else if (((Double)i[43]).doubleValue() < 0.41666666666666663) {
    p = WekaStringREPTree.N343570b720(i);
    } else if (true) {
      p = 0.7142857142857143;
    } 
    return p;
  }
  static double N343570b720(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.14747474747474748;
    } else if (((Double)i[51]).doubleValue() < 0.9555335968379447) {
      p = 0.141091658084449;
    } else if (true) {
      p = 0.47368421052631576;
    } 
    return p;
  }
  static double N157853da21(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.10360268674944026;
    } else if (((Double)i[51]).doubleValue() < 0.9555335968379447) {
    p = WekaStringREPTree.N71c3b4122(i);
    } else if (true) {
      p = 0.1199238578680203;
    } 
    return p;
  }
  static double N71c3b4122(Object []i) {
    double p = Double.NaN;
    /* setDist */
    if (i[29] == null) {
      p = 0.07438955139125497;
    } else if (((Double)i[29]).doubleValue() < 0.75) {
      p = 0.10018552875695733;
    } else if (true) {
      p = 0.03367496339677892;
    } 
    return p;
  }
  static double N236e3f4e23(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.7641509433962265;
    } else if (((Double)i[43]).doubleValue() < 0.9) {
      p = 0.0;
    } else if (true) {
      p = 0.8181818181818182;
    } 
    return p;
  }
  static double N3cc1435c24(Object []i) {
    double p = Double.NaN;
    /* knownWordsCount */
    if (i[44] == null) {
      p = 0.0037990261651238695;
    } else if (((Double)i[44]).doubleValue() < 1.5) {
    p = WekaStringREPTree.N6bf0219d25(i);
    } else if (true) {
    p = WekaStringREPTree.N671a588731(i);
    } 
    return p;
  }
  static double N6bf0219d25(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.020518559970154823;
    } else if (((Double)i[51]).doubleValue() < 0.9183333333333333) {
    p = WekaStringREPTree.Ndd0c99126(i);
    } else if (true) {
      p = 0.002004008016032064;
    } 
    return p;
  }
  static double Ndd0c99126(Object []i) {
    double p = Double.NaN;
    /* strLen */
    if (i[28] == null) {
      p = 0.04393747359526827;
    } else if (((Double)i[28]).doubleValue() < 2.5) {
      p = 0.1245674740484429;
    } else if (true) {
    p = WekaStringREPTree.N5f16132a27(i);
    } 
    return p;
  }
  static double N5f16132a27(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.017887087758524316;
    } else if (((Double)i[51]).doubleValue() < 0.8398093841642229) {
    p = WekaStringREPTree.N69fb603728(i);
    } else if (true) {
    p = WekaStringREPTree.N36d585c29(i);
    } 
    return p;
  }
  static double N69fb603728(Object []i) {
    double p = Double.NaN;
    /* strLen */
    if (i[28] == null) {
      p = 0.16666666666666666;
    } else if (((Double)i[28]).doubleValue() < 6.5) {
      p = 0.875;
    } else if (true) {
      p = 0.043478260869565216;
    } 
    return p;
  }
  static double N36d585c29(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.013256484149855908;
    } else if (((Double)i[51]).doubleValue() < 0.8887362637362637) {
    p = WekaStringREPTree.N87a85e130(i);
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N87a85e130(Object []i) {
    double p = Double.NaN;
    /* stackHeuristic */
    if (i[48] == null) {
      p = 0.018518518518518517;
    } else if (((Double)i[48]).doubleValue() < -0.1073078062302856) {
      p = 0.0;
    } else if (true) {
      p = 0.025191675794085433;
    } 
    return p;
  }
  static double N671a588731(Object []i) {
    double p = Double.NaN;
    /* normEntropy */
    if (i[50] == null) {
      p = 9.994690320767094E-4;
    } else if (((Double)i[50]).doubleValue() < 1.6887218755408668) {
    p = WekaStringREPTree.N5552768b32(i);
    } else if (true) {
      p = 4.6882325363338024E-4;
    } 
    return p;
  }
  static double N5552768b32(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.008352668213457077;
    } else if (((Double)i[51]).doubleValue() < 0.8867521367521367) {
    p = WekaStringREPTree.N3c947bc533(i);
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N3c947bc533(Object []i) {
    double p = Double.NaN;
    /* strLen */
    if (i[28] == null) {
      p = 0.15789473684210525;
    } else if (((Double)i[28]).doubleValue() < 3.5) {
      p = 1.0;
    } else if (true) {
    p = WekaStringREPTree.N609db43b34(i);
    } 
    return p;
  }
  static double N609db43b34(Object []i) {
    double p = Double.NaN;
    /* knownUniqueWords */
    if (i[45] == null) {
      p = 0.010309278350515464;
    } else if (((Double)i[45]).doubleValue() < 2.5) {
      p = 0.0;
    } else if (true) {
    p = WekaStringREPTree.N55f616cf35(i);
    } 
    return p;
  }
  static double N55f616cf35(Object []i) {
    double p = Double.NaN;
    /* maxRepChars */
    if (i[35] == null) {
      p = 0.05555555555555555;
    } else if (((Double)i[35]).doubleValue() < 1.5) {
    p = WekaStringREPTree.N1356d4d436(i);
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N1356d4d436(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.14285714285714285;
    } else if (((Double)i[51]).doubleValue() < 0.8748778103616813) {
      p = 0.25;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double Nc03cf2837(Object []i) {
    double p = Double.NaN;
    /* nonVocals */
    if (i[34] == null) {
      p = 0.12373003877242558;
    } else if (((Double)i[34]).doubleValue() < 0.8284313725490196) {
    p = WekaStringREPTree.N1329eff38(i);
    } else if (true) {
    p = WekaStringREPTree.N4cc8eb0596(i);
    } 
    return p;
  }
  static double N1329eff38(Object []i) {
    double p = Double.NaN;
    /* strLen */
    if (i[28] == null) {
      p = 0.07119820976075296;
    } else if (((Double)i[28]).doubleValue() < 5.5) {
    p = WekaStringREPTree.N6497b07839(i);
    } else if (true) {
    p = WekaStringREPTree.N5939a37970(i);
    } 
    return p;
  }
  static double N6497b07839(Object []i) {
    double p = Double.NaN;
    /* nonVocals */
    if (i[34] == null) {
      p = 0.14624825787888324;
    } else if (((Double)i[34]).doubleValue() < 0.7083333333333333) {
    p = WekaStringREPTree.N41c2284a40(i);
    } else if (true) {
    p = WekaStringREPTree.N152aa09260(i);
    } 
    return p;
  }
  static double N41c2284a40(Object []i) {
    double p = Double.NaN;
    /* knownWordsCount */
    if (i[44] == null) {
      p = 0.11441630994703621;
    } else if (((Double)i[44]).doubleValue() < 1.5) {
    p = WekaStringREPTree.N53aad5d541(i);
    } else if (true) {
    p = WekaStringREPTree.Nf38179453(i);
    } 
    return p;
  }
  static double N53aad5d541(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.10916838084043491;
    } else if (((Double)i[43]).doubleValue() < 0.7) {
    p = WekaStringREPTree.N46fa7c3942(i);
    } else if (true) {
    p = WekaStringREPTree.N68e965f550(i);
    } 
    return p;
  }
  static double N46fa7c3942(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.13764222503160556;
    } else if (((Double)i[51]).doubleValue() < 0.8273809523809523) {
    p = WekaStringREPTree.N1fb700ee43(i);
    } else if (true) {
    p = WekaStringREPTree.N5f683daf46(i);
    } 
    return p;
  }
  static double N1fb700ee43(Object []i) {
    double p = Double.NaN;
    /* vocals */
    if (i[33] == null) {
      p = 0.08744504152418173;
    } else if (((Double)i[33]).doubleValue() < 0.7) {
      p = 0.08477082306554953;
    } else if (true) {
    p = WekaStringREPTree.N4f67eb2a44(i);
    } 
    return p;
  }
  static double N4f67eb2a44(Object []i) {
    double p = Double.NaN;
    /* maxRepChars */
    if (i[35] == null) {
      p = 0.3888888888888889;
    } else if (((Double)i[35]).doubleValue() < 1.5) {
      p = 0.3181818181818182;
    } else if (true) {
    p = WekaStringREPTree.N4a668b6e45(i);
    } 
    return p;
  }
  static double N4a668b6e45(Object []i) {
    double p = Double.NaN;
    /* setDist */
    if (i[29] == null) {
      p = 0.5;
    } else if (((Double)i[29]).doubleValue() < 1.1666666666666665) {
      p = 1.0;
    } else if (true) {
      p = 0.2222222222222222;
    } 
    return p;
  }
  static double N5f683daf46(Object []i) {
    double p = Double.NaN;
    /* vocals */
    if (i[33] == null) {
      p = 0.229632945389436;
    } else if (((Double)i[33]).doubleValue() < 0.5833333333333333) {
    p = WekaStringREPTree.N78ffe6dc47(i);
    } else if (true) {
    p = WekaStringREPTree.N76f2bbc149(i);
    } 
    return p;
  }
  static double N78ffe6dc47(Object []i) {
    double p = Double.NaN;
    /* stackHeuristic */
    if (i[48] == null) {
      p = 0.2144941634241245;
    } else if (((Double)i[48]).doubleValue() < -0.1073078062302856) {
      p = 0.1781609195402299;
    } else if (true) {
    p = WekaStringREPTree.N8317c5248(i);
    } 
    return p;
  }
  static double N8317c5248(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.3306122448979592;
    } else if (((Double)i[51]).doubleValue() < 0.8722826086956521) {
      p = 0.36778846153846156;
    } else if (true) {
      p = 0.12162162162162163;
    } 
    return p;
  }
  static double N76f2bbc149(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.4044943820224719;
    } else if (((Double)i[37]).doubleValue() < 1.5) {
      p = 0.4235294117647059;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N68e965f550(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.08443163097199341;
    } else if (((Double)i[51]).doubleValue() < 0.8722826086956521) {
    p = WekaStringREPTree.N6f27a73251(i);
    } else if (true) {
      p = 0.036458333333333336;
    } 
    return p;
  }
  static double N6f27a73251(Object []i) {
    double p = Double.NaN;
    /* commands */
    if (i[5] == null) {
      p = 0.09171410499683745;
    } else if (((Double)i[5]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N6c77956852(i);
    } else if (true) {
      p = 0.00980392156862745;
    } 
    return p;
  }
  static double N6c77956852(Object []i) {
    double p = Double.NaN;
    /* setDist */
    if (i[29] == null) {
      p = 0.09305689488910318;
    } else if (((Double)i[29]).doubleValue() < 0.9166666666666666) {
      p = 0.09569209039548023;
    } else if (true) {
      p = 0.06630824372759857;
    } 
    return p;
  }
  static double Nf38179453(Object []i) {
    double p = Double.NaN;
    /* maxLenKnownWord */
    if (i[47] == null) {
      p = 0.5321637426900585;
    } else if (((Double)i[47]).doubleValue() < 2.5) {
    p = WekaStringREPTree.N2cdd0d4b54(i);
    } else if (true) {
      p = 0.15555555555555556;
    } 
    return p;
  }
  static double N2cdd0d4b54(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.6666666666666666;
    } else if (((Double)i[51]).doubleValue() < 0.8722826086956521) {
    p = WekaStringREPTree.N7e9131d555(i);
    } else if (true) {
    p = WekaStringREPTree.N524d6d9659(i);
    } 
    return p;
  }
  static double N7e9131d555(Object []i) {
    double p = Double.NaN;
    /* strLen */
    if (i[28] == null) {
      p = 0.7358490566037735;
    } else if (((Double)i[28]).doubleValue() < 3.5) {
    p = WekaStringREPTree.N2e1d27ba56(i);
    } else if (true) {
    p = WekaStringREPTree.N2525ff7e58(i);
    } 
    return p;
  }
  static double N2e1d27ba56(Object []i) {
    double p = Double.NaN;
    /* vocals */
    if (i[33] == null) {
      p = 0.8805970149253731;
    } else if (((Double)i[33]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N61d6015a57(i);
    } else if (true) {
      p = 1.0;
    } 
    return p;
  }
  static double N61d6015a57(Object []i) {
    double p = Double.NaN;
    /* date */
    if (i[17] == null) {
      p = 0.8571428571428571;
    } else if (((Double)i[17]).doubleValue() < 0.5) {
      p = 0.84;
    } else if (true) {
      p = 1.0;
    } 
    return p;
  }
  static double N2525ff7e58(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.48717948717948717;
    } else if (((Double)i[51]).doubleValue() < 0.8366666666666667) {
      p = 0.6551724137931034;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N524d6d9659(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.3;
    } else if (((Double)i[51]).doubleValue() < 0.9148550724637681) {
      p = 0.125;
    } else if (true) {
      p = 1.0;
    } 
    return p;
  }
  static double N152aa09260(Object []i) {
    double p = Double.NaN;
    /* maxRepChars */
    if (i[35] == null) {
      p = 0.19810874704491727;
    } else if (((Double)i[35]).doubleValue() < 1.5) {
    p = WekaStringREPTree.N44a7bfbc61(i);
    } else if (true) {
    p = WekaStringREPTree.N2beee7ff68(i);
    } 
    return p;
  }
  static double N44a7bfbc61(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.2314290090366059;
    } else if (((Double)i[37]).doubleValue() < 1.5) {
    p = WekaStringREPTree.N4ef3765962(i);
    } else if (true) {
      p = 0.056179775280898875;
    } 
    return p;
  }
  static double N4ef3765962(Object []i) {
    double p = Double.NaN;
    /* minLenKnownWord */
    if (i[46] == null) {
      p = 0.23890130948578728;
    } else if (((Double)i[46]).doubleValue() < 1.5) {
    p = WekaStringREPTree.N776b83cc63(i);
    } else if (true) {
    p = WekaStringREPTree.N4e26809065(i);
    } 
    return p;
  }
  static double N776b83cc63(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.23450531479967293;
    } else if (((Double)i[51]).doubleValue() < 0.8366666666666667) {
    p = WekaStringREPTree.N3785838364(i);
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N3785838364(Object []i) {
    double p = Double.NaN;
    /* encoding */
    if (i[7] == null) {
      p = 0.23671178606800924;
    } else if (((Double)i[7]).doubleValue() < 0.5) {
      p = 0.23645970937912814;
    } else if (true) {
      p = 1.0;
    } 
    return p;
  }
  static double N4e26809065(Object []i) {
    double p = Double.NaN;
    /* stackHeuristic */
    if (i[48] == null) {
      p = 0.4217687074829932;
    } else if (((Double)i[48]).doubleValue() < -0.11409994360395032) {
    p = WekaStringREPTree.N1bb266b366(i);
    } else if (true) {
      p = 0.6794871794871795;
    } 
    return p;
  }
  static double N1bb266b366(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.13043478260869565;
    } else if (((Double)i[51]).doubleValue() < 0.8137931034482759) {
    p = WekaStringREPTree.N306cf3ea67(i);
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N306cf3ea67(Object []i) {
    double p = Double.NaN;
    /* setDist */
    if (i[29] == null) {
      p = 0.34615384615384615;
    } else if (((Double)i[29]).doubleValue() < 0.475) {
      p = 0.391304347826087;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N2beee7ff68(Object []i) {
    double p = Double.NaN;
    /* setDist */
    if (i[29] == null) {
      p = 0.08544795442775764;
    } else if (((Double)i[29]).doubleValue() < 0.5) {
      p = 0.5294117647058824;
    } else if (true) {
    p = WekaStringREPTree.N5136d01269(i);
    } 
    return p;
  }
  static double N5136d01269(Object []i) {
    double p = Double.NaN;
    /* maxRepChars */
    if (i[35] == null) {
      p = 0.08150470219435736;
    } else if (((Double)i[35]).doubleValue() < 2.5) {
      p = 0.07926509186351706;
    } else if (true) {
      p = 0.5555555555555556;
    } 
    return p;
  }
  static double N5939a37970(Object []i) {
    double p = Double.NaN;
    /* strLen */
    if (i[28] == null) {
      p = 0.02787366016973346;
    } else if (((Double)i[28]).doubleValue() < 8.5) {
    p = WekaStringREPTree.Ne1de81771(i);
    } else if (true) {
    p = WekaStringREPTree.N482bce4f84(i);
    } 
    return p;
  }
  static double Ne1de81771(Object []i) {
    double p = Double.NaN;
    /* vocals */
    if (i[33] == null) {
      p = 0.05294377484697419;
    } else if (((Double)i[33]).doubleValue() < 0.35416666666666663) {
    p = WekaStringREPTree.N5210273472(i);
    } else if (true) {
    p = WekaStringREPTree.N355ce81c78(i);
    } 
    return p;
  }
  static double N5210273472(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.08235464694794839;
    } else if (((Double)i[51]).doubleValue() < 0.7171428571428571) {
    p = WekaStringREPTree.N3541cb2473(i);
    } else if (true) {
    p = WekaStringREPTree.N2177849e74(i);
    } 
    return p;
  }
  static double N3541cb2473(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.1703056768558952;
    } else if (((Double)i[43]).doubleValue() < 0.125) {
      p = 0.16519823788546256;
    } else if (true) {
      p = 0.75;
    } 
    return p;
  }
  static double N2177849e74(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.06888480187259656;
    } else if (((Double)i[37]).doubleValue() < 1.5) {
    p = WekaStringREPTree.N40cb8df775(i);
    } else if (true) {
      p = 0.0033821871476888386;
    } 
    return p;
  }
  static double N40cb8df775(Object []i) {
    double p = Double.NaN;
    /* stackHeuristic */
    if (i[48] == null) {
      p = 0.08029053788771104;
    } else if (((Double)i[48]).doubleValue() < -0.261827823560706) {
      p = 0.018604651162790697;
    } else if (true) {
    p = WekaStringREPTree.N13b13b5d76(i);
    } 
    return p;
  }
  static double N13b13b5d76(Object []i) {
    double p = Double.NaN;
    /* normEntropy */
    if (i[50] == null) {
      p = 0.08300881328141012;
    } else if (((Double)i[50]).doubleValue() < 2.2359263506290326) {
      p = 0.13612565445026178;
    } else if (true) {
    p = WekaStringREPTree.N2892dae477(i);
    } 
    return p;
  }
  static double N2892dae477(Object []i) {
    double p = Double.NaN;
    /* maxRepChars */
    if (i[35] == null) {
      p = 0.08084470989761092;
    } else if (((Double)i[35]).doubleValue() < 1.5) {
      p = 0.09005414648047877;
    } else if (true) {
      p = 0.05343511450381679;
    } 
    return p;
  }
  static double N355ce81c78(Object []i) {
    double p = Double.NaN;
    /* minLenKnownWord */
    if (i[46] == null) {
      p = 0.030279329608938546;
    } else if (((Double)i[46]).doubleValue() < 1.5) {
    p = WekaStringREPTree.N29647f7579(i);
    } else if (true) {
    p = WekaStringREPTree.N55b53d4483(i);
    } 
    return p;
  }
  static double N29647f7579(Object []i) {
    double p = Double.NaN;
    /* maxRepChars */
    if (i[35] == null) {
      p = 0.029131652661064426;
    } else if (((Double)i[35]).doubleValue() < 1.5) {
    p = WekaStringREPTree.N3315d2d780(i);
    } else if (true) {
      p = 0.052763819095477386;
    } 
    return p;
  }
  static double N3315d2d780(Object []i) {
    double p = Double.NaN;
    /* strLen */
    if (i[28] == null) {
      p = 0.02400109095867994;
    } else if (((Double)i[28]).doubleValue() < 6.5) {
      p = 0.04909747292418772;
    } else if (true) {
    p = WekaStringREPTree.Nd6e7bab81(i);
    } 
    return p;
  }
  static double Nd6e7bab81(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.01815736381977135;
    } else if (((Double)i[37]).doubleValue() < 1.5) {
    p = WekaStringREPTree.N5fa07e1282(i);
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N5fa07e1282(Object []i) {
    double p = Double.NaN;
    /* vocals */
    if (i[33] == null) {
      p = 0.02040430757604383;
    } else if (((Double)i[33]).doubleValue() < 0.4642857142857143) {
      p = 0.025799214806505887;
    } else if (true) {
      p = 0.009264620729588882;
    } 
    return p;
  }
  static double N55b53d4483(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.44;
    } else if (((Double)i[43]).doubleValue() < 0.75) {
      p = 0.6470588235294118;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N482bce4f84(Object []i) {
    double p = Double.NaN;
    /* vocals */
    if (i[33] == null) {
      p = 0.010359724916240522;
    } else if (((Double)i[33]).doubleValue() < 0.229020979020979) {
    p = WekaStringREPTree.N366647c285(i);
    } else if (true) {
    p = WekaStringREPTree.N503d687a92(i);
    } 
    return p;
  }
  static double N366647c285(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.061138014527845036;
    } else if (((Double)i[37]).doubleValue() < 1.5) {
    p = WekaStringREPTree.N6a6afff286(i);
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N6a6afff286(Object []i) {
    double p = Double.NaN;
    /* vocals */
    if (i[33] == null) {
      p = 0.12965340179717585;
    } else if (((Double)i[33]).doubleValue() < 0.18990384615384615) {
    p = WekaStringREPTree.N1649b0e687(i);
    } else if (true) {
    p = WekaStringREPTree.N4da425389(i);
    } 
    return p;
  }
  static double N1649b0e687(Object []i) {
    double p = Double.NaN;
    /* normEntropy */
    if (i[50] == null) {
      p = 0.30097087378640774;
    } else if (((Double)i[50]).doubleValue() < 3.640203680380238) {
    p = WekaStringREPTree.N865dd688(i);
    } else if (true) {
      p = 1.0;
    } 
    return p;
  }
  static double N865dd688(Object []i) {
    double p = Double.NaN;
    /* sumRepChar */
    if (i[42] == null) {
      p = 0.2871287128712871;
    } else if (((Double)i[42]).doubleValue() < 3.5) {
      p = 0.30526315789473685;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N4da425389(Object []i) {
    double p = Double.NaN;
    /* vocals */
    if (i[33] == null) {
      p = 0.10355029585798817;
    } else if (((Double)i[33]).doubleValue() < 0.22474747474747475) {
    p = WekaStringREPTree.N3972a85590(i);
    } else if (true) {
      p = 0.6666666666666666;
    } 
    return p;
  }
  static double N3972a85590(Object []i) {
    double p = Double.NaN;
    /* setDist */
    if (i[29] == null) {
      p = 0.10104011887072809;
    } else if (((Double)i[29]).doubleValue() < 0.35416666666666663) {
      p = 0.052;
    } else if (true) {
    p = WekaStringREPTree.N62e7f11d91(i);
    } 
    return p;
  }
  static double N62e7f11d91(Object []i) {
    double p = Double.NaN;
    /* maxRepChars */
    if (i[35] == null) {
      p = 0.13002364066193853;
    } else if (((Double)i[35]).doubleValue() < 2.5) {
      p = 0.12649164677804295;
    } else if (true) {
      p = 0.5;
    } 
    return p;
  }
  static double N503d687a92(Object []i) {
    double p = Double.NaN;
    /* vocals */
    if (i[33] == null) {
      p = 0.0063712438189425635;
    } else if (((Double)i[33]).doubleValue() < 0.3651515151515151) {
    p = WekaStringREPTree.N6a370f493(i);
    } else if (true) {
      p = 0.002913063268092854;
    } 
    return p;
  }
  static double N6a370f493(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.01015228426395939;
    } else if (((Double)i[37]).doubleValue() < 1.5) {
    p = WekaStringREPTree.N2abf407594(i);
    } else if (true) {
      p = 4.180602006688963E-4;
    } 
    return p;
  }
  static double N2abf407594(Object []i) {
    double p = Double.NaN;
    /* normEntropy */
    if (i[50] == null) {
      p = 0.013193990855649903;
    } else if (((Double)i[50]).doubleValue() < 3.923057556471064) {
    p = WekaStringREPTree.N770d332695(i);
    } else if (true) {
      p = 0.16666666666666666;
    } 
    return p;
  }
  static double N770d332695(Object []i) {
    double p = Double.NaN;
    /* normEntropy */
    if (i[50] == null) {
      p = 0.013073604392731076;
    } else if (((Double)i[50]).doubleValue() < 2.723704325942615) {
      p = 0.03089887640449438;
    } else if (true) {
      p = 0.011244053625486522;
    } 
    return p;
  }
  static double N4cc8eb0596(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.3322447913264973;
    } else if (((Double)i[43]).doubleValue() < 0.5227272727272727) {
    p = WekaStringREPTree.N51f116b897(i);
    } else if (true) {
    p = WekaStringREPTree.N55536d9e120(i);
    } 
    return p;
  }
  static double N51f116b897(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.43966698282221517;
    } else if (((Double)i[37]).doubleValue() < 1.5) {
    p = WekaStringREPTree.N19d481b98(i);
    } else if (true) {
    p = WekaStringREPTree.N65f095f8116(i);
    } 
    return p;
  }
  static double N19d481b98(Object []i) {
    double p = Double.NaN;
    /* vocals */
    if (i[33] == null) {
      p = 0.5092085614733699;
    } else if (((Double)i[33]).doubleValue() < 0.14835164835164835) {
    p = WekaStringREPTree.N1f97cf0d99(i);
    } else if (true) {
    p = WekaStringREPTree.N10959ece113(i);
    } 
    return p;
  }
  static double N1f97cf0d99(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.5687323057565272;
    } else if (((Double)i[51]).doubleValue() < 0.8366666666666667) {
    p = WekaStringREPTree.N140c9f39100(i);
    } else if (true) {
    p = WekaStringREPTree.N6b8ca3c8111(i);
    } 
    return p;
  }
  static double N140c9f39100(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.6405174212393073;
    } else if (((Double)i[51]).doubleValue() < 0.8027777777777778) {
    p = WekaStringREPTree.N4d910fd6101(i);
    } else if (true) {
    p = WekaStringREPTree.N73ee04c8108(i);
    } 
    return p;
  }
  static double N4d910fd6101(Object []i) {
    double p = Double.NaN;
    /* vocals */
    if (i[33] == null) {
      p = 0.7031554343591742;
    } else if (((Double)i[33]).doubleValue() < 0.09545454545454546) {
    p = WekaStringREPTree.N26275bef102(i);
    } else if (true) {
    p = WekaStringREPTree.N3246fb96105(i);
    } 
    return p;
  }
  static double N26275bef102(Object []i) {
    double p = Double.NaN;
    /* setDist */
    if (i[29] == null) {
      p = 0.799406528189911;
    } else if (((Double)i[29]).doubleValue() < 1.2916666666666665) {
    p = WekaStringREPTree.N7690781103(i);
    } else if (true) {
    p = WekaStringREPTree.N77eca502104(i);
    } 
    return p;
  }
  static double N7690781103(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.8227529855436833;
    } else if (((Double)i[43]).doubleValue() < 0.045454545454545456) {
      p = 0.8308776425368354;
    } else if (true) {
      p = 0.4;
    } 
    return p;
  }
  static double N77eca502104(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.40425531914893614;
    } else if (((Double)i[51]).doubleValue() < 0.7289402173913043) {
      p = 0.10526315789473684;
    } else if (true) {
      p = 0.6071428571428571;
    } 
    return p;
  }
  static double N3246fb96105(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.5192743764172335;
    } else if (((Double)i[51]).doubleValue() < 0.7192118226600985) {
    p = WekaStringREPTree.N2e222612106(i);
    } else if (true) {
    p = WekaStringREPTree.N61386958107(i);
    } 
    return p;
  }
  static double N2e222612106(Object []i) {
    double p = Double.NaN;
    /* setDist */
    if (i[29] == null) {
      p = 0.6449864498644986;
    } else if (((Double)i[29]).doubleValue() < 1.325) {
      p = 0.6538461538461539;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N61386958107(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.42884990253411304;
    } else if (((Double)i[51]).doubleValue() < 0.7453703703703703) {
      p = 0.46218487394957986;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N73ee04c8108(Object []i) {
    double p = Double.NaN;
    /* setDist */
    if (i[29] == null) {
      p = 0.5682839173405211;
    } else if (((Double)i[29]).doubleValue() < 0.225) {
      p = 0.0;
    } else if (true) {
    p = WekaStringREPTree.N7671cb68109(i);
    } 
    return p;
  }
  static double N7671cb68109(Object []i) {
    double p = Double.NaN;
    /* maxRepChars */
    if (i[35] == null) {
      p = 0.572139303482587;
    } else if (((Double)i[35]).doubleValue() < 3.5) {
    p = WekaStringREPTree.N49dc7102110(i);
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N49dc7102110(Object []i) {
    double p = Double.NaN;
    /* setDist */
    if (i[29] == null) {
      p = 0.5744777475022707;
    } else if (((Double)i[29]).doubleValue() < 1.5) {
      p = 0.5765889346136259;
    } else if (true) {
      p = 0.26666666666666666;
    } 
    return p;
  }
  static double N6b8ca3c8111(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.3488817891373802;
    } else if (((Double)i[51]).doubleValue() < 0.8722826086956521) {
    p = WekaStringREPTree.N68c72235112(i);
    } else if (true) {
      p = 0.053231939163498096;
    } 
    return p;
  }
  static double N68c72235112(Object []i) {
    double p = Double.NaN;
    /* strLen */
    if (i[28] == null) {
      p = 0.40860215053763443;
    } else if (((Double)i[28]).doubleValue() < 3.5) {
      p = 0.49473684210526314;
    } else if (true) {
      p = 0.058365758754863814;
    } 
    return p;
  }
  static double N10959ece113(Object []i) {
    double p = Double.NaN;
    /* maxRepChars */
    if (i[35] == null) {
      p = 0.2836710369487485;
    } else if (((Double)i[35]).doubleValue() < 1.5) {
    p = WekaStringREPTree.N3a6bb9bf114(i);
    } else if (true) {
      p = 0.15089820359281436;
    } 
    return p;
  }
  static double N3a6bb9bf114(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.4151838671411625;
    } else if (((Double)i[51]).doubleValue() < 0.7735042735042734) {
    p = WekaStringREPTree.N34f7cfd9115(i);
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N34f7cfd9115(Object []i) {
    double p = Double.NaN;
    /* brand */
    if (i[20] == null) {
      p = 0.43050430504305043;
    } else if (((Double)i[20]).doubleValue() < 0.5) {
      p = 0.4434447300771208;
    } else if (true) {
      p = 0.14285714285714285;
    } 
    return p;
  }
  static double N65f095f8116(Object []i) {
    double p = Double.NaN;
    /* normEntropy */
    if (i[50] == null) {
      p = 0.05505849965588438;
    } else if (((Double)i[50]).doubleValue() < 2.14186217056048) {
    p = WekaStringREPTree.N59af0466117(i);
    } else if (true) {
    p = WekaStringREPTree.N346d61be119(i);
    } 
    return p;
  }
  static double N59af0466117(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.287292817679558;
    } else if (((Double)i[43]).doubleValue() < 0.30952380952380953) {
    p = WekaStringREPTree.N3e6ef8ad118(i);
    } else if (true) {
      p = 0.9375;
    } 
    return p;
  }
  static double N3e6ef8ad118(Object []i) {
    double p = Double.NaN;
    /* stackHeuristic */
    if (i[48] == null) {
      p = 0.22424242424242424;
    } else if (((Double)i[48]).doubleValue() < -0.2146156124605712) {
      p = 0.10869565217391304;
    } else if (true) {
      p = 0.2689075630252101;
    } 
    return p;
  }
  static double N346d61be119(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.0220125786163522;
    } else if (((Double)i[51]).doubleValue() < 0.8332046332046332) {
      p = 0.019700551615445233;
    } else if (true) {
      p = 1.0;
    } 
    return p;
  }
  static double N55536d9e120(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.15716248711782893;
    } else if (((Double)i[51]).doubleValue() < 0.872983870967742) {
    p = WekaStringREPTree.N747edf66121(i);
    } else if (true) {
    p = WekaStringREPTree.N4e7912d8139(i);
    } 
    return p;
  }
  static double N747edf66121(Object []i) {
    double p = Double.NaN;
    /* normEntropy */
    if (i[50] == null) {
      p = 0.2026673640167364;
    } else if (((Double)i[50]).doubleValue() < 2.125814583693911) {
    p = WekaStringREPTree.N3d1cfad4122(i);
    } else if (true) {
    p = WekaStringREPTree.Nc333c60132(i);
    } 
    return p;
  }
  static double N3d1cfad4122(Object []i) {
    double p = Double.NaN;
    /* maxLenKnownWord */
    if (i[47] == null) {
      p = 0.2615916955017301;
    } else if (((Double)i[47]).doubleValue() < 2.5) {
    p = WekaStringREPTree.N62230c58123(i);
    } else if (true) {
    p = WekaStringREPTree.N378542de128(i);
    } 
    return p;
  }
  static double N62230c58123(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.7528735632183908;
    } else if (((Double)i[37]).doubleValue() < 1.5) {
    p = WekaStringREPTree.N2cd2a21f124(i);
    } else if (true) {
      p = 0.2857142857142857;
    } 
    return p;
  }
  static double N2cd2a21f124(Object []i) {
    double p = Double.NaN;
    /* knownWordsCount */
    if (i[44] == null) {
      p = 0.7724550898203593;
    } else if (((Double)i[44]).doubleValue() < 2.5) {
    p = WekaStringREPTree.N2e55dd0c125(i);
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N2e55dd0c125(Object []i) {
    double p = Double.NaN;
    /* setDist */
    if (i[29] == null) {
      p = 0.7865853658536586;
    } else if (((Double)i[29]).doubleValue() < 0.29166666666666663) {
    p = WekaStringREPTree.N74455848126(i);
    } else if (true) {
    p = WekaStringREPTree.Ne7edb54127(i);
    } 
    return p;
  }
  static double N74455848126(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.717948717948718;
    } else if (((Double)i[51]).doubleValue() < 0.8452380952380953) {
      p = 0.7368421052631579;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double Ne7edb54127(Object []i) {
    double p = Double.NaN;
    /* date */
    if (i[17] == null) {
      p = 0.8488372093023255;
    } else if (((Double)i[17]).doubleValue() < 0.5) {
      p = 0.8717948717948718;
    } else if (true) {
      p = 0.625;
    } 
    return p;
  }
  static double N378542de128(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.23011782032400588;
    } else if (((Double)i[51]).doubleValue() < 0.8170189098998888) {
    p = WekaStringREPTree.N3738449f129(i);
    } else if (true) {
    p = WekaStringREPTree.N69e1dd28130(i);
    } 
    return p;
  }
  static double N3738449f129(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.7857142857142857;
    } else if (((Double)i[51]).doubleValue() < 0.7846153846153846) {
      p = 0.0;
    } else if (true) {
      p = 1.0;
    } 
    return p;
  }
  static double N69e1dd28130(Object []i) {
    double p = Double.NaN;
    /* commands */
    if (i[5] == null) {
      p = 0.22723908216136196;
    } else if (((Double)i[5]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N11bd0f3b131(i);
    } else if (true) {
      p = 0.02702702702702703;
    } 
    return p;
  }
  static double N11bd0f3b131(Object []i) {
    double p = Double.NaN;
    /* stackHeuristic */
    if (i[48] == null) {
      p = 0.2300187617260788;
    } else if (((Double)i[48]).doubleValue() < -0.22096979569850816) {
      p = 0.07317073170731707;
    } else if (true) {
      p = 0.23246951219512196;
    } 
    return p;
  }
  static double Nc333c60132(Object []i) {
    double p = Double.NaN;
    /* maxLenKnownWord */
    if (i[47] == null) {
      p = 0.020342612419700215;
    } else if (((Double)i[47]).doubleValue() < 1.5) {
      p = 1.0;
    } else if (true) {
    p = WekaStringREPTree.N79da8dc5133(i);
    } 
    return p;
  }
  static double N79da8dc5133(Object []i) {
    double p = Double.NaN;
    /* minLenKnownWord */
    if (i[46] == null) {
      p = 0.012944983818770227;
    } else if (((Double)i[46]).doubleValue() < 2.5) {
    p = WekaStringREPTree.N1eb5174b134(i);
    } else if (true) {
    p = WekaStringREPTree.N72cde7cc136(i);
    } 
    return p;
  }
  static double N1eb5174b134(Object []i) {
    double p = Double.NaN;
    /* strLen */
    if (i[28] == null) {
      p = 0.0067039106145251395;
    } else if (((Double)i[28]).doubleValue() < 5.5) {
    p = WekaStringREPTree.N67080771135(i);
    } else if (true) {
      p = 0.0024154589371980675;
    } 
    return p;
  }
  static double N67080771135(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.05970149253731343;
    } else if (((Double)i[51]).doubleValue() < 0.8137931034482759) {
      p = 0.8;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N72cde7cc136(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.1875;
    } else if (((Double)i[51]).doubleValue() < 0.7721153846153845) {
    p = WekaStringREPTree.N5fd4f8f5137(i);
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N5fd4f8f5137(Object []i) {
    double p = Double.NaN;
    /* vocals */
    if (i[33] == null) {
      p = 0.5;
    } else if (((Double)i[33]).doubleValue() < 0.08333333333333333) {
      p = 1.0;
    } else if (true) {
    p = WekaStringREPTree.N696da30b138(i);
    } 
    return p;
  }
  static double N696da30b138(Object []i) {
    double p = Double.NaN;
    /* brand */
    if (i[20] == null) {
      p = 0.14285714285714285;
    } else if (((Double)i[20]).doubleValue() < 0.5) {
      p = 0.0;
    } else if (true) {
      p = 0.5;
    } 
    return p;
  }
  static double N4e7912d8139(Object []i) {
    double p = Double.NaN;
    /* knownWordsCount */
    if (i[44] == null) {
      p = 0.07007007007007007;
    } else if (((Double)i[44]).doubleValue() < 1.5) {
    p = WekaStringREPTree.N53976f5c140(i);
    } else if (true) {
    p = WekaStringREPTree.N44821a96147(i);
    } 
    return p;
  }
  static double N53976f5c140(Object []i) {
    double p = Double.NaN;
    /* stackHeuristic */
    if (i[48] == null) {
      p = 0.05763239875389408;
    } else if (((Double)i[48]).doubleValue() < -0.09933771078645638) {
    p = WekaStringREPTree.N2bfc268b141(i);
    } else if (true) {
    p = WekaStringREPTree.Nbe35cd9145(i);
    } 
    return p;
  }
  static double N2bfc268b141(Object []i) {
    double p = Double.NaN;
    /* stackHeuristic */
    if (i[48] == null) {
      p = 0.015025041736227046;
    } else if (((Double)i[48]).doubleValue() < -0.19867542157291276) {
    p = WekaStringREPTree.N2f8dad04142(i);
    } else if (true) {
      p = 0.007936507936507936;
    } 
    return p;
  }
  static double N2f8dad04142(Object []i) {
    double p = Double.NaN;
    /* commands */
    if (i[5] == null) {
      p = 0.05263157894736842;
    } else if (((Double)i[5]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N29e495ff143(i);
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N29e495ff143(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.05747126436781609;
    } else if (((Double)i[37]).doubleValue() < 1.5) {
    p = WekaStringREPTree.N41e1e210144(i);
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N41e1e210144(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.0625;
    } else if (((Double)i[51]).doubleValue() < 0.8775) {
      p = 0.0641025641025641;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double Nbe35cd9145(Object []i) {
    double p = Double.NaN;
    /* country */
    if (i[14] == null) {
      p = 0.07686510926902788;
    } else if (((Double)i[14]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N4944252c146(i);
    } else if (true) {
      p = 0.006493506493506494;
    } 
    return p;
  }
  static double N4944252c146(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.08610400682011936;
    } else if (((Double)i[51]).doubleValue() < 0.9148550724637681) {
      p = 0.09017857142857143;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N44821a96147(Object []i) {
    double p = Double.NaN;
    /* knownWordsCount */
    if (i[44] == null) {
      p = 0.4027777777777778;
    } else if (((Double)i[44]).doubleValue() < 2.5) {
    p = WekaStringREPTree.Na3d8174148(i);
    } else if (true) {
      p = 1.0;
    } 
    return p;
  }
  static double Na3d8174148(Object []i) {
    double p = Double.NaN;
    /* setDist */
    if (i[29] == null) {
      p = 0.3484848484848485;
    } else if (((Double)i[29]).doubleValue() < 0.41666666666666663) {
      p = 0.0;
    } else if (true) {
    p = WekaStringREPTree.N1ba9117e149(i);
    } 
    return p;
  }
  static double N1ba9117e149(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.3898305084745763;
    } else if (((Double)i[37]).doubleValue() < 1.5) {
    p = WekaStringREPTree.N732c2a62150(i);
    } else if (true) {
      p = 0.2;
    } 
    return p;
  }
  static double N732c2a62150(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.6666666666666666;
    } else if (((Double)i[51]).doubleValue() < 0.9148550724637681) {
      p = 0.2857142857142857;
    } else if (true) {
      p = 0.8235294117647058;
    } 
    return p;
  }
  static double N272ed83b151(Object []i) {
    double p = Double.NaN;
    /* strLen */
    if (i[28] == null) {
      p = 0.319206951493947;
    } else if (((Double)i[28]).doubleValue() < 9.5) {
    p = WekaStringREPTree.N41fecb8b152(i);
    } else if (true) {
    p = WekaStringREPTree.N25084a1e259(i);
    } 
    return p;
  }
  static double N41fecb8b152(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.514591066171765;
    } else if (((Double)i[37]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N120f102b153(i);
    } else if (true) {
    p = WekaStringREPTree.N31e5415e169(i);
    } 
    return p;
  }
  static double N120f102b153(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.0864129435558007;
    } else if (((Double)i[31]).doubleValue() < 0.05555555555555555) {
    p = WekaStringREPTree.N625732154(i);
    } else if (true) {
    p = WekaStringREPTree.N66498326156(i);
    } 
    return p;
  }
  static double N625732154(Object []i) {
    double p = Double.NaN;
    /* maxRepChars */
    if (i[35] == null) {
      p = 0.8921161825726142;
    } else if (((Double)i[35]).doubleValue() < 1.5) {
      p = 0.9567307692307693;
    } else if (true) {
    p = WekaStringREPTree.N51dcb805155(i);
    } 
    return p;
  }
  static double N51dcb805155(Object []i) {
    double p = Double.NaN;
    /* stackHeuristic */
    if (i[48] == null) {
      p = 0.48484848484848486;
    } else if (((Double)i[48]).doubleValue() < -0.11698469734332291) {
      p = 0.9642857142857143;
    } else if (true) {
      p = 0.13157894736842105;
    } 
    return p;
  }
  static double N66498326156(Object []i) {
    double p = Double.NaN;
    /* knownWordsCount */
    if (i[44] == null) {
      p = 0.008069396812588258;
    } else if (((Double)i[44]).doubleValue() < 6.5) {
    p = WekaStringREPTree.Ncad498c157(i);
    } else if (true) {
    p = WekaStringREPTree.N34f5090e168(i);
    } 
    return p;
  }
  static double Ncad498c157(Object []i) {
    double p = Double.NaN;
    /* digits */
    if (i[32] == null) {
      p = 0.0064856100526955816;
    } else if (((Double)i[32]).doubleValue() < 0.05555555555555555) {
    p = WekaStringREPTree.N1e6454ec158(i);
    } else if (true) {
      p = 0.16666666666666666;
    } 
    return p;
  }
  static double N1e6454ec158(Object []i) {
    double p = Double.NaN;
    /* maxLenKnownWord */
    if (i[47] == null) {
      p = 0.006290584415584416;
    } else if (((Double)i[47]).doubleValue() < 1.5) {
    p = WekaStringREPTree.N2accdbb5159(i);
    } else if (true) {
    p = WekaStringREPTree.N6631f5ca161(i);
    } 
    return p;
  }
  static double N2accdbb5159(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.02648171500630517;
    } else if (((Double)i[43]).doubleValue() < 0.7738095238095238) {
    p = WekaStringREPTree.Nb62d79160(i);
    } else if (true) {
      p = 0.375;
    } 
    return p;
  }
  static double Nb62d79160(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.019305019305019305;
    } else if (((Double)i[51]).doubleValue() < 0.7977272727272727) {
      p = 0.0045351473922902496;
    } else if (true) {
      p = 0.03869047619047619;
    } 
    return p;
  }
  static double N6631f5ca161(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.0024183796856106408;
    } else if (((Double)i[43]).doubleValue() < 0.5277777777777778) {
    p = WekaStringREPTree.N5ace1ed4162(i);
    } else if (true) {
    p = WekaStringREPTree.N4e096385165(i);
    } 
    return p;
  }
  static double N5ace1ed4162(Object []i) {
    double p = Double.NaN;
    /* knownWordsCount */
    if (i[44] == null) {
      p = 0.00772626931567329;
    } else if (((Double)i[44]).doubleValue() < 1.5) {
      p = 0.0024009603841536613;
    } else if (true) {
    p = WekaStringREPTree.N1613674b163(i);
    } 
    return p;
  }
  static double N1613674b163(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.0684931506849315;
    } else if (((Double)i[51]).doubleValue() < 0.8021739130434783) {
    p = WekaStringREPTree.N27ff5d15164(i);
    } else if (true) {
      p = 0.015873015873015872;
    } 
    return p;
  }
  static double N27ff5d15164(Object []i) {
    double p = Double.NaN;
    /* setDist */
    if (i[29] == null) {
      p = 0.4;
    } else if (((Double)i[29]).doubleValue() < 0.4017857142857143) {
      p = 0.8;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N4e096385165(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 9.290802105915144E-4;
    } else if (((Double)i[51]).doubleValue() < 0.8190909090909091) {
    p = WekaStringREPTree.N649bec2e166(i);
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N649bec2e166(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.005128205128205128;
    } else if (((Double)i[43]).doubleValue() < 0.8660714285714286) {
    p = WekaStringREPTree.N693fe6c9167(i);
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N693fe6c9167(Object []i) {
    double p = Double.NaN;
    /* stackHeuristic */
    if (i[48] == null) {
      p = 0.06382978723404255;
    } else if (((Double)i[48]).doubleValue() < -0.130913911780353) {
      p = 0.0;
    } else if (true) {
      p = 0.3;
    } 
    return p;
  }
  static double N34f5090e168(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.34782608695652173;
    } else if (((Double)i[51]).doubleValue() < 0.8211111111111111) {
      p = 0.0625;
    } else if (true) {
      p = 1.0;
    } 
    return p;
  }
  static double N31e5415e169(Object []i) {
    double p = Double.NaN;
    /* maxLenKnownWord */
    if (i[47] == null) {
      p = 0.6048115290744973;
    } else if (((Double)i[47]).doubleValue() < 2.5) {
    p = WekaStringREPTree.Na2431d0170(i);
    } else if (true) {
    p = WekaStringREPTree.N101952da209(i);
    } 
    return p;
  }
  static double Na2431d0170(Object []i) {
    double p = Double.NaN;
    /* nonVocals */
    if (i[34] == null) {
      p = 0.7784568835098336;
    } else if (((Double)i[34]).doubleValue() < 0.6458333333333333) {
    p = WekaStringREPTree.N1cbb87f3171(i);
    } else if (true) {
    p = WekaStringREPTree.N6d3a388c189(i);
    } 
    return p;
  }
  static double N1cbb87f3171(Object []i) {
    double p = Double.NaN;
    /* knownWordsCount */
    if (i[44] == null) {
      p = 0.5629280821917808;
    } else if (((Double)i[44]).doubleValue() < 1.5) {
    p = WekaStringREPTree.N1a4013172(i);
    } else if (true) {
    p = WekaStringREPTree.N48974e45184(i);
    } 
    return p;
  }
  static double N1a4013172(Object []i) {
    double p = Double.NaN;
    /* dashes */
    if (i[39] == null) {
      p = 0.44618106753170156;
    } else if (((Double)i[39]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N1b6e1eff173(i);
    } else if (true) {
    p = WekaStringREPTree.N247d8ae183(i);
    } 
    return p;
  }
  static double N1b6e1eff173(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.4800383264132865;
    } else if (((Double)i[43]).doubleValue() < 0.11805555555555555) {
    p = WekaStringREPTree.N306f16f3174(i);
    } else if (true) {
    p = WekaStringREPTree.N2dde1bff179(i);
    } 
    return p;
  }
  static double N306f16f3174(Object []i) {
    double p = Double.NaN;
    /* strLen */
    if (i[28] == null) {
      p = 0.3584905660377358;
    } else if (((Double)i[28]).doubleValue() < 6.5) {
    p = WekaStringREPTree.N702b8b12175(i);
    } else if (true) {
    p = WekaStringREPTree.N49912c99177(i);
    } 
    return p;
  }
  static double N702b8b12175(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.6044303797468354;
    } else if (((Double)i[51]).doubleValue() < 0.7735042735042734) {
    p = WekaStringREPTree.N22e357dc176(i);
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N22e357dc176(Object []i) {
    double p = Double.NaN;
    /* specialChars */
    if (i[21] == null) {
      p = 0.6366666666666667;
    } else if (((Double)i[21]).doubleValue() < 0.5) {
      p = 0.6678321678321678;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N49912c99177(Object []i) {
    double p = Double.NaN;
    /* simpleSplitWordLen */
    if (i[36] == null) {
      p = 0.2919520547945205;
    } else if (((Double)i[36]).doubleValue() < 2.5) {
    p = WekaStringREPTree.N10163d6178(i);
    } else if (true) {
      p = 0.8305084745762712;
    } 
    return p;
  }
  static double N10163d6178(Object []i) {
    double p = Double.NaN;
    /* nonVocals */
    if (i[34] == null) {
      p = 0.26330027051397653;
    } else if (((Double)i[34]).doubleValue() < 0.5634920634920635) {
      p = 0.199438202247191;
    } else if (true) {
      p = 0.3778337531486146;
    } 
    return p;
  }
  static double N2dde1bff179(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.5895567698846388;
    } else if (((Double)i[37]).doubleValue() < 2.5) {
    p = WekaStringREPTree.N15bbf42f180(i);
    } else if (true) {
      p = 0.043478260869565216;
    } 
    return p;
  }
  static double N15bbf42f180(Object []i) {
    double p = Double.NaN;
    /* regex */
    if (i[3] == null) {
      p = 0.6305483028720626;
    } else if (((Double)i[3]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N550ee7e5181(i);
    } else if (true) {
    p = WekaStringREPTree.N5f9b2141182(i);
    } 
    return p;
  }
  static double N550ee7e5181(Object []i) {
    double p = Double.NaN;
    /* strLen */
    if (i[28] == null) {
      p = 0.6837916063675832;
    } else if (((Double)i[28]).doubleValue() < 8.5) {
      p = 0.7297071129707113;
    } else if (true) {
      p = 0.39037433155080214;
    } 
    return p;
  }
  static double N5f9b2141182(Object []i) {
    double p = Double.NaN;
    /* stackHeuristic */
    if (i[48] == null) {
      p = 0.14;
    } else if (((Double)i[48]).doubleValue() < -0.261827823560706) {
      p = 0.02631578947368421;
    } else if (true) {
      p = 0.25675675675675674;
    } 
    return p;
  }
  static double N247d8ae183(Object []i) {
    double p = Double.NaN;
    /* normEntropy */
    if (i[50] == null) {
      p = 0.038461538461538464;
    } else if (((Double)i[50]).doubleValue() < 2.613283334294874) {
      p = 0.12280701754385964;
    } else if (true) {
      p = 0.014778325123152709;
    } 
    return p;
  }
  static double N48974e45184(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.8719750195160031;
    } else if (((Double)i[51]).doubleValue() < 0.8775) {
    p = WekaStringREPTree.N6a84a97d185(i);
    } else if (true) {
      p = 0.4444444444444444;
    } 
    return p;
  }
  static double N6a84a97d185(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.9042821158690176;
    } else if (((Double)i[37]).doubleValue() < 2.5) {
    p = WekaStringREPTree.N6c130c45186(i);
    } else if (true) {
      p = 0.08333333333333333;
    } 
    return p;
  }
  static double N6c130c45186(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.9126378286683631;
    } else if (((Double)i[43]).doubleValue() < 0.2361111111111111) {
      p = 0.2857142857142857;
    } else if (true) {
    p = WekaStringREPTree.N50ad3bc1187(i);
    } 
    return p;
  }
  static double N50ad3bc1187(Object []i) {
    double p = Double.NaN;
    /* dashes */
    if (i[39] == null) {
      p = 0.9163822525597269;
    } else if (((Double)i[39]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N223aa2f7188(i);
    } else if (true) {
      p = 0.16666666666666666;
    } 
    return p;
  }
  static double N223aa2f7188(Object []i) {
    double p = Double.NaN;
    /* simpleSplitWordLen */
    if (i[36] == null) {
      p = 0.9202401372212693;
    } else if (((Double)i[36]).doubleValue() < 2.5) {
      p = 0.8612565445026178;
    } else if (true) {
      p = 0.9489795918367347;
    } 
    return p;
  }
  static double N6d3a388c189(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.8634101071458703;
    } else if (((Double)i[37]).doubleValue() < 2.5) {
    p = WekaStringREPTree.N193f604a190(i);
    } else if (true) {
    p = WekaStringREPTree.N2df9b86203(i);
    } 
    return p;
  }
  static double N193f604a190(Object []i) {
    double p = Double.NaN;
    /* dashes */
    if (i[39] == null) {
      p = 0.8871024117441454;
    } else if (((Double)i[39]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N20f5239f191(i);
    } else if (true) {
    p = WekaStringREPTree.N69997e9d201(i);
    } 
    return p;
  }
  static double N20f5239f191(Object []i) {
    double p = Double.NaN;
    /* normEntropy */
    if (i[50] == null) {
      p = 0.8940169431697846;
    } else if (((Double)i[50]).doubleValue() < 1.4539817763762146) {
    p = WekaStringREPTree.N57af006c192(i);
    } else if (true) {
    p = WekaStringREPTree.N932bc4a194(i);
    } 
    return p;
  }
  static double N57af006c192(Object []i) {
    double p = Double.NaN;
    /* maxLenKnownWord */
    if (i[47] == null) {
      p = 0.4696969696969697;
    } else if (((Double)i[47]).doubleValue() < 1.5) {
      p = 0.3556701030927835;
    } else if (true) {
    p = WekaStringREPTree.N6bedbc4d193(i);
    } 
    return p;
  }
  static double N6bedbc4d193(Object []i) {
    double p = Double.NaN;
    /* maxRepChars */
    if (i[35] == null) {
      p = 0.7857142857142857;
    } else if (((Double)i[35]).doubleValue() < 3.0) {
      p = 0.9;
    } else if (true) {
      p = 0.1;
    } 
    return p;
  }
  static double N932bc4a194(Object []i) {
    double p = Double.NaN;
    /* date */
    if (i[17] == null) {
      p = 0.9041380556559451;
    } else if (((Double)i[17]).doubleValue() < 0.5) {
    p = WekaStringREPTree.Nd29f28195(i);
    } else if (true) {
    p = WekaStringREPTree.N3514a4c0198(i);
    } 
    return p;
  }
  static double Nd29f28195(Object []i) {
    double p = Double.NaN;
    /* nonVocals */
    if (i[34] == null) {
      p = 0.9125968811280232;
    } else if (((Double)i[34]).doubleValue() < 0.7321428571428572) {
    p = WekaStringREPTree.N2fd1433e196(i);
    } else if (true) {
    p = WekaStringREPTree.N29d89d5d197(i);
    } 
    return p;
  }
  static double N2fd1433e196(Object []i) {
    double p = Double.NaN;
    /* knownWordsCount */
    if (i[44] == null) {
      p = 0.8344968004653869;
    } else if (((Double)i[44]).doubleValue() < 1.5) {
      p = 0.7794183445190157;
    } else if (true) {
      p = 0.9368246051537822;
    } 
    return p;
  }
  static double N29d89d5d197(Object []i) {
    double p = Double.NaN;
    /* color */
    if (i[10] == null) {
      p = 0.9495255123091735;
    } else if (((Double)i[10]).doubleValue() < 0.5) {
      p = 0.9503097040605644;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N3514a4c0198(Object []i) {
    double p = Double.NaN;
    /* normEntropy */
    if (i[50] == null) {
      p = 0.6518105849582173;
    } else if (((Double)i[50]).doubleValue() < 2.5533015685322367) {
    p = WekaStringREPTree.N212b5695199(i);
    } else if (true) {
    p = WekaStringREPTree.N446293d200(i);
    } 
    return p;
  }
  static double N212b5695199(Object []i) {
    double p = Double.NaN;
    /* maxRepChars */
    if (i[35] == null) {
      p = 0.8973214285714286;
    } else if (((Double)i[35]).doubleValue() < 1.5) {
      p = 0.9392265193370166;
    } else if (true) {
      p = 0.7209302325581395;
    } 
    return p;
  }
  static double N446293d200(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.24444444444444444;
    } else if (((Double)i[51]).doubleValue() < 0.7721153846153845) {
      p = 0.96;
    } else if (true) {
      p = 0.08181818181818182;
    } 
    return p;
  }
  static double N69997e9d201(Object []i) {
    double p = Double.NaN;
    /* simpleSplitWordLen */
    if (i[36] == null) {
      p = 0.1875;
    } else if (((Double)i[36]).doubleValue() < 2.5) {
    p = WekaStringREPTree.N793be5ca202(i);
    } else if (true) {
      p = 0.0410958904109589;
    } 
    return p;
  }
  static double N793be5ca202(Object []i) {
    double p = Double.NaN;
    /* vocals */
    if (i[33] == null) {
      p = 0.46153846153846156;
    } else if (((Double)i[33]).doubleValue() < 0.19444444444444442) {
      p = 0.5925925925925926;
    } else if (true) {
      p = 0.16666666666666666;
    } 
    return p;
  }
  static double N2df9b86203(Object []i) {
    double p = Double.NaN;
    /* normEntropy */
    if (i[50] == null) {
      p = 0.20048899755501223;
    } else if (((Double)i[50]).doubleValue() < 2.2437777590084274) {
      p = 0.9545454545454546;
    } else if (true) {
    p = WekaStringREPTree.N37654521204(i);
    } 
    return p;
  }
  static double N37654521204(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.15762273901808785;
    } else if (((Double)i[43]).doubleValue() < 0.873015873015873) {
    p = WekaStringREPTree.N15aab8c6205(i);
    } else if (true) {
    p = WekaStringREPTree.N50b5ac82208(i);
    } 
    return p;
  }
  static double N15aab8c6205(Object []i) {
    double p = Double.NaN;
    /* strLen */
    if (i[28] == null) {
      p = 0.24675324675324675;
    } else if (((Double)i[28]).doubleValue() < 7.5) {
    p = WekaStringREPTree.N33990a0c206(i);
    } else if (true) {
      p = 0.12213740458015267;
    } 
    return p;
  }
  static double N33990a0c206(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.41;
    } else if (((Double)i[37]).doubleValue() < 3.5) {
      p = 0.6181818181818182;
    } else if (true) {
    p = WekaStringREPTree.N4de4b452207(i);
    } 
    return p;
  }
  static double N4de4b452207(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.15555555555555556;
    } else if (((Double)i[43]).doubleValue() < 0.6666666666666667) {
      p = 0.07317073170731707;
    } else if (true) {
      p = 1.0;
    } 
    return p;
  }
  static double N50b5ac82208(Object []i) {
    double p = Double.NaN;
    /* nonVocals */
    if (i[34] == null) {
      p = 0.02564102564102564;
    } else if (((Double)i[34]).doubleValue() < 0.9444444444444444) {
      p = 0.006535947712418301;
    } else if (true) {
      p = 1.0;
    } 
    return p;
  }
  static double N101952da209(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.2958656330749354;
    } else if (((Double)i[51]).doubleValue() < 0.7165178571428572) {
    p = WekaStringREPTree.N6babf3bf210(i);
    } else if (true) {
    p = WekaStringREPTree.N10d307f1230(i);
    } 
    return p;
  }
  static double N6babf3bf210(Object []i) {
    double p = Double.NaN;
    /* minLenKnownWord */
    if (i[46] == null) {
      p = 0.6358136721113128;
    } else if (((Double)i[46]).doubleValue() < 2.5) {
    p = WekaStringREPTree.N3059cbc211(i);
    } else if (true) {
    p = WekaStringREPTree.N2b48a640218(i);
    } 
    return p;
  }
  static double N3059cbc211(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.865021770682148;
    } else if (((Double)i[31]).doubleValue() < 0.05555555555555555) {
    p = WekaStringREPTree.N7ea9e1e2212(i);
    } else if (true) {
    p = WekaStringREPTree.N3fb1549b215(i);
    } 
    return p;
  }
  static double N7ea9e1e2212(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.6395939086294417;
    } else if (((Double)i[43]).doubleValue() < 0.8125) {
      p = 0.8947368421052632;
    } else if (true) {
    p = WekaStringREPTree.N24fcf36f213(i);
    } 
    return p;
  }
  static double N24fcf36f213(Object []i) {
    double p = Double.NaN;
    /* knownUniqueWords */
    if (i[45] == null) {
      p = 0.5357142857142857;
    } else if (((Double)i[45]).doubleValue() < 3.5) {
    p = WekaStringREPTree.N10feca44214(i);
    } else if (true) {
      p = 0.7941176470588235;
    } 
    return p;
  }
  static double N10feca44214(Object []i) {
    double p = Double.NaN;
    /* simpleSplitWordLen */
    if (i[36] == null) {
      p = 0.2916666666666667;
    } else if (((Double)i[36]).doubleValue() < 2.5) {
      p = 0.5185185185185185;
    } else if (true) {
      p = 0.15555555555555556;
    } 
    return p;
  }
  static double N3fb1549b215(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.9552845528455285;
    } else if (((Double)i[37]).doubleValue() < 1.5) {
      p = 0.9844444444444445;
    } else if (true) {
    p = WekaStringREPTree.Nea6147e216(i);
    } 
    return p;
  }
  static double Nea6147e216(Object []i) {
    double p = Double.NaN;
    /* minLenKnownWord */
    if (i[46] == null) {
      p = 0.6428571428571429;
    } else if (((Double)i[46]).doubleValue() < 1.5) {
    p = WekaStringREPTree.N4d02f94e217(i);
    } else if (true) {
      p = 0.7575757575757576;
    } 
    return p;
  }
  static double N4d02f94e217(Object []i) {
    double p = Double.NaN;
    /* sumRepChar */
    if (i[42] == null) {
      p = 0.2222222222222222;
    } else if (((Double)i[42]).doubleValue() < 1.5) {
      p = 0.0;
    } else if (true) {
      p = 1.0;
    } 
    return p;
  }
  static double N2b48a640218(Object []i) {
    double p = Double.NaN;
    /* vocals */
    if (i[33] == null) {
      p = 0.47199170124481327;
    } else if (((Double)i[33]).doubleValue() < 0.1736111111111111) {
    p = WekaStringREPTree.N1e683a3e219(i);
    } else if (true) {
    p = WekaStringREPTree.N4bb33f74223(i);
    } 
    return p;
  }
  static double N1e683a3e219(Object []i) {
    double p = Double.NaN;
    /* dashes */
    if (i[39] == null) {
      p = 0.6973365617433414;
    } else if (((Double)i[39]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N2053d869220(i);
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N2053d869220(Object []i) {
    double p = Double.NaN;
    /* commands */
    if (i[5] == null) {
      p = 0.7272727272727273;
    } else if (((Double)i[5]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N7a419da4221(i);
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N7a419da4221(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.7441860465116279;
    } else if (((Double)i[37]).doubleValue() < 2.5) {
    p = WekaStringREPTree.N14555e0a222(i);
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N14555e0a222(Object []i) {
    double p = Double.NaN;
    /* vocals */
    if (i[33] == null) {
      p = 0.7659574468085106;
    } else if (((Double)i[33]).doubleValue() < 0.11805555555555555) {
      p = 0.8528138528138528;
    } else if (true) {
      p = 0.6275862068965518;
    } 
    return p;
  }
  static double N4bb33f74223(Object []i) {
    double p = Double.NaN;
    /* vocals */
    if (i[33] == null) {
      p = 0.3030852994555354;
    } else if (((Double)i[33]).doubleValue() < 0.29166666666666663) {
    p = WekaStringREPTree.N759d26fb224(i);
    } else if (true) {
    p = WekaStringREPTree.N3d5c822d226(i);
    } 
    return p;
  }
  static double N759d26fb224(Object []i) {
    double p = Double.NaN;
    /* dashes */
    if (i[39] == null) {
      p = 0.39338235294117646;
    } else if (((Double)i[39]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N3c73951225(i);
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N3c73951225(Object []i) {
    double p = Double.NaN;
    /* commands */
    if (i[5] == null) {
      p = 0.41472868217054265;
    } else if (((Double)i[5]).doubleValue() < 0.5) {
      p = 0.4403292181069959;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N3d5c822d226(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.21505376344086022;
    } else if (((Double)i[31]).doubleValue() < 0.11805555555555555) {
    p = WekaStringREPTree.N6f46426d227(i);
    } else if (true) {
    p = WekaStringREPTree.N49c7b90e229(i);
    } 
    return p;
  }
  static double N6f46426d227(Object []i) {
    double p = Double.NaN;
    /* simpleSplitWordLen */
    if (i[36] == null) {
      p = 0.16736401673640167;
    } else if (((Double)i[36]).doubleValue() < 2.5) {
    p = WekaStringREPTree.N73700b80228(i);
    } else if (true) {
      p = 0.125;
    } 
    return p;
  }
  static double N73700b80228(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.3090909090909091;
    } else if (((Double)i[31]).doubleValue() < 0.05555555555555555) {
      p = 0.22448979591836735;
    } else if (true) {
      p = 1.0;
    } 
    return p;
  }
  static double N49c7b90e229(Object []i) {
    double p = Double.NaN;
    /* regex */
    if (i[3] == null) {
      p = 0.5;
    } else if (((Double)i[3]).doubleValue() < 0.5) {
      p = 0.5882352941176471;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N10d307f1230(Object []i) {
    double p = Double.NaN;
    /* minLenKnownWord */
    if (i[46] == null) {
      p = 0.22226588081204976;
    } else if (((Double)i[46]).doubleValue() < 1.5) {
    p = WekaStringREPTree.N4d5b6aac231(i);
    } else if (true) {
    p = WekaStringREPTree.N57d7f8ca244(i);
    } 
    return p;
  }
  static double N4d5b6aac231(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.5444078947368421;
    } else if (((Double)i[51]).doubleValue() < 0.7703296703296703) {
    p = WekaStringREPTree.N3e84448c232(i);
    } else if (true) {
    p = WekaStringREPTree.N63a12c68238(i);
    } 
    return p;
  }
  static double N3e84448c232(Object []i) {
    double p = Double.NaN;
    /* stackHeuristic */
    if (i[48] == null) {
      p = 0.8035143769968051;
    } else if (((Double)i[48]).doubleValue() < -0.25144318146498484) {
    p = WekaStringREPTree.N4a7f959b233(i);
    } else if (true) {
    p = WekaStringREPTree.N483f6d77236(i);
    } 
    return p;
  }
  static double N4a7f959b233(Object []i) {
    double p = Double.NaN;
    /* nonVocals */
    if (i[34] == null) {
      p = 0.5106382978723404;
    } else if (((Double)i[34]).doubleValue() < 0.8819444444444444) {
    p = WekaStringREPTree.N429bffaa234(i);
    } else if (true) {
      p = 1.0;
    } 
    return p;
  }
  static double N429bffaa234(Object []i) {
    double p = Double.NaN;
    /* simpleSplitWordLen */
    if (i[36] == null) {
      p = 0.4772727272727273;
    } else if (((Double)i[36]).doubleValue() < 2.5) {
      p = 0.1;
    } else if (true) {
    p = WekaStringREPTree.N5403f35f235(i);
    } 
    return p;
  }
  static double N5403f35f235(Object []i) {
    double p = Double.NaN;
    /* strLen */
    if (i[28] == null) {
      p = 0.5256410256410257;
    } else if (((Double)i[28]).doubleValue() < 7.5) {
      p = 0.5694444444444444;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N483f6d77236(Object []i) {
    double p = Double.NaN;
    /* strLen */
    if (i[28] == null) {
      p = 0.8552631578947368;
    } else if (((Double)i[28]).doubleValue() < 8.0) {
    p = WekaStringREPTree.N7e5afaa6237(i);
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N7e5afaa6237(Object []i) {
    double p = Double.NaN;
    /* crypto */
    if (i[19] == null) {
      p = 0.8584905660377359;
    } else if (((Double)i[19]).doubleValue() < 0.5) {
      p = 0.8678500986193294;
    } else if (true) {
      p = 0.6521739130434783;
    } 
    return p;
  }
  static double N63a12c68238(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.26949152542372884;
    } else if (((Double)i[31]).doubleValue() < 0.05555555555555555) {
    p = WekaStringREPTree.N28f3b248239(i);
    } else if (true) {
    p = WekaStringREPTree.N581ac8a8242(i);
    } 
    return p;
  }
  static double N28f3b248239(Object []i) {
    double p = Double.NaN;
    /* vocals */
    if (i[33] == null) {
      p = 0.5016949152542373;
    } else if (((Double)i[33]).doubleValue() < 0.225) {
      p = 0.7222222222222222;
    } else if (true) {
    p = WekaStringREPTree.N1b1426f4240(i);
    } 
    return p;
  }
  static double N1b1426f4240(Object []i) {
    double p = Double.NaN;
    /* vocals */
    if (i[33] == null) {
      p = 0.40487804878048783;
    } else if (((Double)i[33]).doubleValue() < 0.625) {
    p = WekaStringREPTree.N32b260fa241(i);
    } else if (true) {
      p = 1.0;
    } 
    return p;
  }
  static double N32b260fa241(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.38071065989847713;
    } else if (((Double)i[51]).doubleValue() < 0.8366666666666667) {
      p = 0.37435897435897436;
    } else if (true) {
      p = 1.0;
    } 
    return p;
  }
  static double N581ac8a8242(Object []i) {
    double p = Double.NaN;
    /* stackHeuristic */
    if (i[48] == null) {
      p = 0.03728813559322034;
    } else if (((Double)i[48]).doubleValue() < -0.12572159073249242) {
      p = 0.0;
    } else if (true) {
    p = WekaStringREPTree.N6d4e5011243(i);
    } 
    return p;
  }
  static double N6d4e5011243(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.3235294117647059;
    } else if (((Double)i[51]).doubleValue() < 0.8032258064516129) {
      p = 0.125;
    } else if (true) {
      p = 0.8;
    } 
    return p;
  }
  static double N57d7f8ca244(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.16124006854650258;
    } else if (((Double)i[43]).doubleValue() < 0.8660714285714286) {
    p = WekaStringREPTree.N76c3e77a245(i);
    } else if (true) {
    p = WekaStringREPTree.N662b4c69249(i);
    } 
    return p;
  }
  static double N76c3e77a245(Object []i) {
    double p = Double.NaN;
    /* strLen */
    if (i[28] == null) {
      p = 0.47058823529411764;
    } else if (((Double)i[28]).doubleValue() < 7.5) {
    p = WekaStringREPTree.N78123e82246(i);
    } else if (true) {
      p = 0.01694915254237288;
    } 
    return p;
  }
  static double N78123e82246(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.5869565217391305;
    } else if (((Double)i[51]).doubleValue() < 0.7795138888888888) {
    p = WekaStringREPTree.N67c33749247(i);
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N67c33749247(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.675;
    } else if (((Double)i[43]).doubleValue() < 0.55) {
    p = WekaStringREPTree.Nfba92d3248(i);
    } else if (true) {
      p = 0.9894736842105263;
    } 
    return p;
  }
  static double Nfba92d3248(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.5770491803278689;
    } else if (((Double)i[51]).doubleValue() < 0.7453703703703703) {
      p = 0.6398467432950191;
    } else if (true) {
      p = 0.20454545454545456;
    } 
    return p;
  }
  static double N662b4c69249(Object []i) {
    double p = Double.NaN;
    /* nonVocals */
    if (i[34] == null) {
      p = 0.13062831706899503;
    } else if (((Double)i[34]).doubleValue() < 0.8166666666666667) {
    p = WekaStringREPTree.Nfa49800250(i);
    } else if (true) {
    p = WekaStringREPTree.N3d6f0054254(i);
    } 
    return p;
  }
  static double Nfa49800250(Object []i) {
    double p = Double.NaN;
    /* knownWordsCount */
    if (i[44] == null) {
      p = 0.10430563978168587;
    } else if (((Double)i[44]).doubleValue() < 2.5) {
    p = WekaStringREPTree.N71238fc2251(i);
    } else if (true) {
    p = WekaStringREPTree.N16a0ee18253(i);
    } 
    return p;
  }
  static double N71238fc2251(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.09512905911740216;
    } else if (((Double)i[37]).doubleValue() < 1.5) {
      p = 0.03182496270512183;
    } else if (true) {
    p = WekaStringREPTree.N2a54a73f252(i);
    } 
    return p;
  }
  static double N2a54a73f252(Object []i) {
    double p = Double.NaN;
    /* regex */
    if (i[3] == null) {
      p = 0.14070891514500536;
    } else if (((Double)i[3]).doubleValue() < 0.5) {
      p = 0.208955223880597;
    } else if (true) {
      p = 0.038461538461538464;
    } 
    return p;
  }
  static double N16a0ee18253(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.4125874125874126;
    } else if (((Double)i[51]).doubleValue() < 0.7459677419354839) {
      p = 0.7195121951219512;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N3d6f0054254(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.27628635346756153;
    } else if (((Double)i[51]).doubleValue() < 0.771712158808933) {
    p = WekaStringREPTree.N505fc5a4255(i);
    } else if (true) {
    p = WekaStringREPTree.Nbd4dc25258(i);
    } 
    return p;
  }
  static double N505fc5a4255(Object []i) {
    double p = Double.NaN;
    /* minLenKnownWord */
    if (i[46] == null) {
      p = 0.3707865168539326;
    } else if (((Double)i[46]).doubleValue() < 2.5) {
    p = WekaStringREPTree.N5fbdfdcf256(i);
    } else if (true) {
    p = WekaStringREPTree.N4efc180e257(i);
    } 
    return p;
  }
  static double N5fbdfdcf256(Object []i) {
    double p = Double.NaN;
    /* regex */
    if (i[3] == null) {
      p = 0.5427807486631016;
    } else if (((Double)i[3]).doubleValue() < 0.5) {
      p = 0.6291390728476821;
    } else if (true) {
      p = 0.18055555555555555;
    } 
    return p;
  }
  static double N4efc180e257(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.11244979919678715;
    } else if (((Double)i[51]).doubleValue() < 0.7453703703703703) {
      p = 0.17647058823529413;
    } else if (true) {
      p = 0.035398230088495575;
    } 
    return p;
  }
  static double Nbd4dc25258(Object []i) {
    double p = Double.NaN;
    /* strLen */
    if (i[28] == null) {
      p = 0.05904059040590406;
    } else if (((Double)i[28]).doubleValue() < 5.5) {
      p = 0.40540540540540543;
    } else if (true) {
      p = 0.004273504273504274;
    } 
    return p;
  }
  static double N25084a1e259(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.11310628818307625;
    } else if (((Double)i[31]).doubleValue() < 0.007575757575757576) {
    p = WekaStringREPTree.N156b88f5260(i);
    } else if (true) {
    p = WekaStringREPTree.N73e22a3d272(i);
    } 
    return p;
  }
  static double N156b88f5260(Object []i) {
    double p = Double.NaN;
    /* knownWordsCount */
    if (i[44] == null) {
      p = 0.7783783783783784;
    } else if (((Double)i[44]).doubleValue() < 5.5) {
    p = WekaStringREPTree.N3bf9ce3e261(i);
    } else if (true) {
    p = WekaStringREPTree.N3232a28a271(i);
    } 
    return p;
  }
  static double N3bf9ce3e261(Object []i) {
    double p = Double.NaN;
    /* minLenKnownWord */
    if (i[46] == null) {
      p = 0.8146453089244852;
    } else if (((Double)i[46]).doubleValue() < 2.5) {
    p = WekaStringREPTree.N16610890262(i);
    } else if (true) {
    p = WekaStringREPTree.N32ee6fee268(i);
    } 
    return p;
  }
  static double N16610890262(Object []i) {
    double p = Double.NaN;
    /* sumRepChar */
    if (i[42] == null) {
      p = 0.8785046728971962;
    } else if (((Double)i[42]).doubleValue() < 5.5) {
    p = WekaStringREPTree.N71def8f8263(i);
    } else if (true) {
      p = 0.2;
    } 
    return p;
  }
  static double N71def8f8263(Object []i) {
    double p = Double.NaN;
    /* vocals */
    if (i[33] == null) {
      p = 0.8876860622462788;
    } else if (((Double)i[33]).doubleValue() < 0.31009615384615385) {
    p = WekaStringREPTree.N383bfa16264(i);
    } else if (true) {
    p = WekaStringREPTree.N5562c41e267(i);
    } 
    return p;
  }
  static double N383bfa16264(Object []i) {
    double p = Double.NaN;
    /* setDist */
    if (i[29] == null) {
      p = 0.9224683544303798;
    } else if (((Double)i[29]).doubleValue() < 0.06904761904761905) {
      p = 0.25;
    } else if (true) {
    p = WekaStringREPTree.N4d465b11265(i);
    } 
    return p;
  }
  static double N4d465b11265(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.9267515923566879;
    } else if (((Double)i[51]).doubleValue() < 0.732520325203252) {
      p = 0.9450171821305842;
    } else if (true) {
    p = WekaStringREPTree.N53fdffa1266(i);
    } 
    return p;
  }
  static double N53fdffa1266(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.6956521739130435;
    } else if (((Double)i[43]).doubleValue() < 0.8636363636363636) {
      p = 0.8888888888888888;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N5562c41e267(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.6822429906542056;
    } else if (((Double)i[43]).doubleValue() < 0.36038961038961037) {
      p = 0.5;
    } else if (true) {
      p = 0.9333333333333333;
    } 
    return p;
  }
  static double N32ee6fee268(Object []i) {
    double p = Double.NaN;
    /* vocals */
    if (i[33] == null) {
      p = 0.432;
    } else if (((Double)i[33]).doubleValue() < 0.29705882352941176) {
    p = WekaStringREPTree.N4d0f2471269(i);
    } else if (true) {
      p = 0.2;
    } 
    return p;
  }
  static double N4d0f2471269(Object []i) {
    double p = Double.NaN;
    /* vocals */
    if (i[33] == null) {
      p = 0.6461538461538462;
    } else if (((Double)i[33]).doubleValue() < 0.09166666666666667) {
      p = 1.0;
    } else if (true) {
    p = WekaStringREPTree.N7133da86270(i);
    } 
    return p;
  }
  static double N7133da86270(Object []i) {
    double p = Double.NaN;
    /* maxRepChars */
    if (i[35] == null) {
      p = 0.54;
    } else if (((Double)i[35]).doubleValue() < 1.5) {
      p = 0.3888888888888889;
    } else if (true) {
      p = 0.9285714285714286;
    } 
    return p;
  }
  static double N3232a28a271(Object []i) {
    double p = Double.NaN;
    /* simpleSplitWordLen */
    if (i[36] == null) {
      p = 0.1568627450980392;
    } else if (((Double)i[36]).doubleValue() < 2.5) {
      p = 0.0;
    } else if (true) {
      p = 1.0;
    } 
    return p;
  }
  static double N73e22a3d272(Object []i) {
    double p = Double.NaN;
    /* digits */
    if (i[32] == null) {
      p = 0.09166608598703924;
    } else if (((Double)i[32]).doubleValue() < 0.05131578947368421) {
    p = WekaStringREPTree.N47faa49c273(i);
    } else if (true) {
    p = WekaStringREPTree.N25fb8912312(i);
    } 
    return p;
  }
  static double N47faa49c273(Object []i) {
    double p = Double.NaN;
    /* equals */
    if (i[38] == null) {
      p = 0.06692927745559324;
    } else if (((Double)i[38]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N28f2a10f274(i);
    } else if (true) {
    p = WekaStringREPTree.N66d3eec0302(i);
    } 
    return p;
  }
  static double N28f2a10f274(Object []i) {
    double p = Double.NaN;
    /* strLen */
    if (i[28] == null) {
      p = 0.05812666076173605;
    } else if (((Double)i[28]).doubleValue() < 13.5) {
    p = WekaStringREPTree.Nf736069275(i);
    } else if (true) {
    p = WekaStringREPTree.N2f217633294(i);
    } 
    return p;
  }
  static double Nf736069275(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.10595973369695998;
    } else if (((Double)i[51]).doubleValue() < 0.6708333333333334) {
    p = WekaStringREPTree.N6da21078276(i);
    } else if (true) {
    p = WekaStringREPTree.N6283d8b8288(i);
    } 
    return p;
  }
  static double N6da21078276(Object []i) {
    double p = Double.NaN;
    /* vocals */
    if (i[33] == null) {
      p = 0.20042938199662627;
    } else if (((Double)i[33]).doubleValue() < 0.16025641025641024) {
    p = WekaStringREPTree.N7fee8714277(i);
    } else if (true) {
    p = WekaStringREPTree.N2fb3536e282(i);
    } 
    return p;
  }
  static double N7fee8714277(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.7652631578947369;
    } else if (((Double)i[37]).doubleValue() < 2.5) {
    p = WekaStringREPTree.N4229bb3f278(i);
    } else if (true) {
    p = WekaStringREPTree.N20ccf40b281(i);
    } 
    return p;
  }
  static double N4229bb3f278(Object []i) {
    double p = Double.NaN;
    /* minLenKnownWord */
    if (i[46] == null) {
      p = 0.8719806763285024;
    } else if (((Double)i[46]).doubleValue() < 2.5) {
    p = WekaStringREPTree.N56cdfb3b279(i);
    } else if (true) {
    p = WekaStringREPTree.N2b91004a280(i);
    } 
    return p;
  }
  static double N56cdfb3b279(Object []i) {
    double p = Double.NaN;
    /* date */
    if (i[17] == null) {
      p = 0.9284692417739628;
    } else if (((Double)i[17]).doubleValue() < 0.5) {
      p = 0.9365079365079365;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N2b91004a280(Object []i) {
    double p = Double.NaN;
    /* vocals */
    if (i[33] == null) {
      p = 0.5658914728682171;
    } else if (((Double)i[33]).doubleValue() < 0.08712121212121213) {
      p = 0.775;
    } else if (true) {
      p = 0.47191011235955055;
    } 
    return p;
  }
  static double N20ccf40b281(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.040983606557377046;
    } else if (((Double)i[51]).doubleValue() < 0.6118538324420677) {
      p = 0.75;
    } else if (true) {
      p = 0.01694915254237288;
    } 
    return p;
  }
  static double N2fb3536e282(Object []i) {
    double p = Double.NaN;
    /* nonVocals */
    if (i[34] == null) {
      p = 0.10411057260814935;
    } else if (((Double)i[34]).doubleValue() < 0.6794871794871795) {
    p = WekaStringREPTree.N169e6180283(i);
    } else if (true) {
    p = WekaStringREPTree.N47987356286(i);
    } 
    return p;
  }
  static double N169e6180283(Object []i) {
    double p = Double.NaN;
    /* knownWordsCount */
    if (i[44] == null) {
      p = 0.05712438025436516;
    } else if (((Double)i[44]).doubleValue() < 1.5) {
    p = WekaStringREPTree.N35aea049284(i);
    } else if (true) {
    p = WekaStringREPTree.N7205765b285(i);
    } 
    return p;
  }
  static double N35aea049284(Object []i) {
    double p = Double.NaN;
    /* nonVocals */
    if (i[34] == null) {
      p = 0.048454286340714754;
    } else if (((Double)i[34]).doubleValue() < 0.5916666666666667) {
      p = 0.026217228464419477;
    } else if (true) {
      p = 0.08866995073891626;
    } 
    return p;
  }
  static double N7205765b285(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.5641025641025641;
    } else if (((Double)i[37]).doubleValue() < 2.5) {
      p = 0.7719298245614035;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N47987356286(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.33798283261802575;
    } else if (((Double)i[37]).doubleValue() < 2.5) {
    p = WekaStringREPTree.N22ef9844287(i);
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N22ef9844287(Object []i) {
    double p = Double.NaN;
    /* minLenKnownWord */
    if (i[46] == null) {
      p = 0.465288035450517;
    } else if (((Double)i[46]).doubleValue() < 2.5) {
      p = 0.6036036036036037;
    } else if (true) {
      p = 0.2017167381974249;
    } 
    return p;
  }
  static double N6283d8b8288(Object []i) {
    double p = Double.NaN;
    /* knownUniqueWords */
    if (i[45] == null) {
      p = 0.0023545240497813654;
    } else if (((Double)i[45]).doubleValue() < 8.5) {
    p = WekaStringREPTree.N3b6ddd1d289(i);
    } else if (true) {
      p = 0.06451612903225806;
    } 
    return p;
  }
  static double N3b6ddd1d289(Object []i) {
    double p = Double.NaN;
    /* maxSingleChar */
    if (i[30] == null) {
      p = 0.0020287404902789518;
    } else if (((Double)i[30]).doubleValue() < 0.2863636363636364) {
    p = WekaStringREPTree.N3f6b0be5290(i);
    } else if (true) {
    p = WekaStringREPTree.N1da2cb77292(i);
    } 
    return p;
  }
  static double N3f6b0be5290(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.0015960276644795177;
    } else if (((Double)i[43]).doubleValue() < 0.3038461538461539) {
    p = WekaStringREPTree.N611889f4291(i);
    } else if (true) {
      p = 3.498950314905528E-4;
    } 
    return p;
  }
  static double N611889f4291(Object []i) {
    double p = Double.NaN;
    /* knownUniqueWords */
    if (i[45] == null) {
      p = 0.002876663070837828;
    } else if (((Double)i[45]).doubleValue() < 1.5) {
      p = 0.002186588921282799;
    } else if (true) {
      p = 0.05405405405405406;
    } 
    return p;
  }
  static double N1da2cb77292(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.010869565217391304;
    } else if (((Double)i[51]).doubleValue() < 0.6801730920535012) {
    p = WekaStringREPTree.N48f278eb293(i);
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N48f278eb293(Object []i) {
    double p = Double.NaN;
    /* vocals */
    if (i[33] == null) {
      p = 0.13636363636363635;
    } else if (((Double)i[33]).doubleValue() < 0.038461538461538464) {
      p = 0.375;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N2f217633294(Object []i) {
    double p = Double.NaN;
    /* email */
    if (i[8] == null) {
      p = 0.01736277257502222;
    } else if (((Double)i[8]).doubleValue() < 0.5) {
    p = WekaStringREPTree.Na530d0a295(i);
    } else if (true) {
    p = WekaStringREPTree.N4738a206301(i);
    } 
    return p;
  }
  static double Na530d0a295(Object []i) {
    double p = Double.NaN;
    /* dashes */
    if (i[39] == null) {
      p = 0.016692891838270506;
    } else if (((Double)i[39]).doubleValue() < 1.5) {
    p = WekaStringREPTree.N1a18644296(i);
    } else if (true) {
      p = 0.8181818181818182;
    } 
    return p;
  }
  static double N1a18644296(Object []i) {
    double p = Double.NaN;
    /* digits */
    if (i[32] == null) {
      p = 0.016089278378748458;
    } else if (((Double)i[32]).doubleValue() < 0.03414351851851852) {
    p = WekaStringREPTree.N5acf93bb297(i);
    } else if (true) {
    p = WekaStringREPTree.N614ca7df300(i);
    } 
    return p;
  }
  static double N5acf93bb297(Object []i) {
    double p = Double.NaN;
    /* maxRepChars */
    if (i[35] == null) {
      p = 0.015238879736408566;
    } else if (((Double)i[35]).doubleValue() < 2.5) {
    p = WekaStringREPTree.N7e7be63f298(i);
    } else if (true) {
    p = WekaStringREPTree.N6cd28fa7299(i);
    } 
    return p;
  }
  static double N7e7be63f298(Object []i) {
    double p = Double.NaN;
    /* knownWordsCount */
    if (i[44] == null) {
      p = 0.014659325533379215;
    } else if (((Double)i[44]).doubleValue() < 26.5) {
      p = 0.014455840848075996;
    } else if (true) {
      p = 1.0;
    } 
    return p;
  }
  static double N6cd28fa7299(Object []i) {
    double p = Double.NaN;
    /* strLen */
    if (i[28] == null) {
      p = 0.23684210526315788;
    } else if (((Double)i[28]).doubleValue() < 18.0) {
      p = 0.4444444444444444;
    } else if (true) {
      p = 0.05;
    } 
    return p;
  }
  static double N614ca7df300(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.34210526315789475;
    } else if (((Double)i[43]).doubleValue() < 0.04880952380952381) {
      p = 0.8461538461538461;
    } else if (true) {
      p = 0.08;
    } 
    return p;
  }
  static double N4738a206301(Object []i) {
    double p = Double.NaN;
    /* setDist */
    if (i[29] == null) {
      p = 0.8333333333333334;
    } else if (((Double)i[29]).doubleValue() < 0.8333333333333333) {
      p = 1.0;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N66d3eec0302(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.8099688473520249;
    } else if (((Double)i[43]).doubleValue() < 0.045454545454545456) {
    p = WekaStringREPTree.N1e04fa0a303(i);
    } else if (true) {
      p = 0.988950276243094;
    } 
    return p;
  }
  static double N1e04fa0a303(Object []i) {
    double p = Double.NaN;
    /* vocals */
    if (i[33] == null) {
      p = 0.5785714285714286;
    } else if (((Double)i[33]).doubleValue() < 0.2426470588235294) {
    p = WekaStringREPTree.N1af2d44a304(i);
    } else if (true) {
    p = WekaStringREPTree.N618425b5306(i);
    } 
    return p;
  }
  static double N1af2d44a304(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.9122807017543859;
    } else if (((Double)i[37]).doubleValue() < 1.5) {
      p = 1.0;
    } else if (true) {
    p = WekaStringREPTree.N18d87d80305(i);
    } 
    return p;
  }
  static double N18d87d80305(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.375;
    } else if (((Double)i[31]).doubleValue() < 0.12237762237762238) {
      p = 1.0;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N618425b5306(Object []i) {
    double p = Double.NaN;
    /* nonVocals */
    if (i[34] == null) {
      p = 0.3493975903614458;
    } else if (((Double)i[34]).doubleValue() < 0.4807692307692308) {
    p = WekaStringREPTree.N58695725307(i);
    } else if (true) {
    p = WekaStringREPTree.N543588e6308(i);
    } 
    return p;
  }
  static double N58695725307(Object []i) {
    double p = Double.NaN;
    /* setDist */
    if (i[29] == null) {
      p = 0.43478260869565216;
    } else if (((Double)i[29]).doubleValue() < 0.6333333333333333) {
      p = 0.2777777777777778;
    } else if (true) {
      p = 1.0;
    } 
    return p;
  }
  static double N543588e6308(Object []i) {
    double p = Double.NaN;
    /* nonVocals */
    if (i[34] == null) {
      p = 0.31666666666666665;
    } else if (((Double)i[34]).doubleValue() < 0.5773809523809523) {
    p = WekaStringREPTree.Nf5acb9d309(i);
    } else if (true) {
    p = WekaStringREPTree.N4fb3ee4e310(i);
    } 
    return p;
  }
  static double Nf5acb9d309(Object []i) {
    double p = Double.NaN;
    /* maxSingleChar */
    if (i[30] == null) {
      p = 0.2571428571428571;
    } else if (((Double)i[30]).doubleValue() < 0.16025641025641024) {
      p = 0.5833333333333334;
    } else if (true) {
      p = 0.08695652173913043;
    } 
    return p;
  }
  static double N4fb3ee4e310(Object []i) {
    double p = Double.NaN;
    /* strLen */
    if (i[28] == null) {
      p = 0.4;
    } else if (((Double)i[28]).doubleValue() < 13.5) {
    p = WekaStringREPTree.N5d7148e2311(i);
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N5d7148e2311(Object []i) {
    double p = Double.NaN;
    /* simpleSplitWordLen */
    if (i[36] == null) {
      p = 0.5;
    } else if (((Double)i[36]).doubleValue() < 2.5) {
      p = 0.3333333333333333;
    } else if (true) {
      p = 1.0;
    } 
    return p;
  }
  static double N25fb8912312(Object []i) {
    double p = Double.NaN;
    /* nonVocals */
    if (i[34] == null) {
      p = 0.619455252918288;
    } else if (((Double)i[34]).doubleValue() < 0.6282894736842105) {
    p = WekaStringREPTree.N7c24b813313(i);
    } else if (true) {
    p = WekaStringREPTree.Nbae7dc0325(i);
    } 
    return p;
  }
  static double N7c24b813313(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.3280943025540275;
    } else if (((Double)i[43]).doubleValue() < 0.1125) {
    p = WekaStringREPTree.N2c35e847314(i);
    } else if (true) {
    p = WekaStringREPTree.N741a8937320(i);
    } 
    return p;
  }
  static double N2c35e847314(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.23627684964200477;
    } else if (((Double)i[37]).doubleValue() < 1.5) {
    p = WekaStringREPTree.N7bd4937b315(i);
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N7bd4937b315(Object []i) {
    double p = Double.NaN;
    /* color */
    if (i[10] == null) {
      p = 0.3344594594594595;
    } else if (((Double)i[10]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N21e360a316(i);
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N21e360a316(Object []i) {
    double p = Double.NaN;
    /* simpleSplitWordLen */
    if (i[36] == null) {
      p = 0.5051020408163265;
    } else if (((Double)i[36]).doubleValue() < 2.5) {
    p = WekaStringREPTree.N5ba3f27a317(i);
    } else if (true) {
    p = WekaStringREPTree.N74751b3319(i);
    } 
    return p;
  }
  static double N5ba3f27a317(Object []i) {
    double p = Double.NaN;
    /* strLen */
    if (i[28] == null) {
      p = 0.44025157232704404;
    } else if (((Double)i[28]).doubleValue() < 10.5) {
      p = 0.6447368421052632;
    } else if (true) {
    p = WekaStringREPTree.N58d75e99318(i);
    } 
    return p;
  }
  static double N58d75e99318(Object []i) {
    double p = Double.NaN;
    /* maxRepChars */
    if (i[35] == null) {
      p = 0.25301204819277107;
    } else if (((Double)i[35]).doubleValue() < 1.5) {
      p = 0.17647058823529413;
    } else if (true) {
      p = 0.6;
    } 
    return p;
  }
  static double N74751b3319(Object []i) {
    double p = Double.NaN;
    /* setDist */
    if (i[29] == null) {
      p = 0.7837837837837838;
    } else if (((Double)i[29]).doubleValue() < 0.452991452991453) {
      p = 1.0;
    } else if (true) {
      p = 0.5;
    } 
    return p;
  }
  static double N741a8937320(Object []i) {
    double p = Double.NaN;
    /* nonVocals */
    if (i[34] == null) {
      p = 0.7555555555555555;
    } else if (((Double)i[34]).doubleValue() < 0.48333333333333334) {
      p = 0.5714285714285714;
    } else if (true) {
    p = WekaStringREPTree.N306e95ec321(i);
    } 
    return p;
  }
  static double N306e95ec321(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.7894736842105263;
    } else if (((Double)i[31]).doubleValue() < 0.08712121212121213) {
      p = 0.5;
    } else if (true) {
    p = WekaStringREPTree.N52af26ee322(i);
    } 
    return p;
  }
  static double N52af26ee322(Object []i) {
    double p = Double.NaN;
    /* digits */
    if (i[32] == null) {
      p = 0.84375;
    } else if (((Double)i[32]).doubleValue() < 0.16025641025641024) {
      p = 0.9545454545454546;
    } else if (true) {
    p = WekaStringREPTree.N6fd83fc1323(i);
    } 
    return p;
  }
  static double N6fd83fc1323(Object []i) {
    double p = Double.NaN;
    /* maxRepChars */
    if (i[35] == null) {
      p = 0.6;
    } else if (((Double)i[35]).doubleValue() < 1.5) {
    p = WekaStringREPTree.N4f2b503c324(i);
    } else if (true) {
      p = 1.0;
    } 
    return p;
  }
  static double N4f2b503c324(Object []i) {
    double p = Double.NaN;
    /* strLen */
    if (i[28] == null) {
      p = 0.42857142857142855;
    } else if (((Double)i[28]).doubleValue() < 11.5) {
      p = 0.6666666666666666;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double Nbae7dc0325(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.8105670103092784;
    } else if (((Double)i[51]).doubleValue() < 0.672316384180791) {
    p = WekaStringREPTree.N209da20d326(i);
    } else if (true) {
      p = 0.046153846153846156;
    } 
    return p;
  }
  static double N209da20d326(Object []i) {
    double p = Double.NaN;
    /* color */
    if (i[10] == null) {
      p = 0.8804500703234881;
    } else if (((Double)i[10]).doubleValue() < 0.5) {
    p = WekaStringREPTree.Ne15b7e8327(i);
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double Ne15b7e8327(Object []i) {
    double p = Double.NaN;
    /* crypto */
    if (i[19] == null) {
      p = 0.9470499243570348;
    } else if (((Double)i[19]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N1b2abca6328(i);
    } else if (true) {
    p = WekaStringREPTree.Nd5b810e331(i);
    } 
    return p;
  }
  static double N1b2abca6328(Object []i) {
    double p = Double.NaN;
    /* encoding */
    if (i[7] == null) {
      p = 0.9686468646864687;
    } else if (((Double)i[7]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N6392827e329(i);
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N6392827e329(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.9734660033167496;
    } else if (((Double)i[37]).doubleValue() < 1.5) {
    p = WekaStringREPTree.N2ed2d9cb330(i);
    } else if (true) {
      p = 0.6923076923076923;
    } 
    return p;
  }
  static double N2ed2d9cb330(Object []i) {
    double p = Double.NaN;
    /* normEntropy */
    if (i[50] == null) {
      p = 0.9796610169491525;
    } else if (((Double)i[50]).doubleValue() < 2.7321588913645702) {
      p = 0.875;
    } else if (true) {
      p = 0.9825783972125436;
    } 
    return p;
  }
  static double Nd5b810e331(Object []i) {
    double p = Double.NaN;
    /* vocals */
    if (i[33] == null) {
      p = 0.7090909090909091;
    } else if (((Double)i[33]).doubleValue() < 0.2403846153846154) {
    p = WekaStringREPTree.N43dac38f332(i);
    } else if (true) {
      p = 0.15384615384615385;
    } 
    return p;
  }
  static double N43dac38f332(Object []i) {
    double p = Double.NaN;
    /* setDist */
    if (i[29] == null) {
      p = 0.8809523809523809;
    } else if (((Double)i[29]).doubleValue() < 0.15000000000000002) {
      p = 0.2;
    } else if (true) {
      p = 0.972972972972973;
    } 
    return p;
  }
  static double N342c38f8333(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.7097274145748903;
    } else if (((Double)i[51]).doubleValue() < 0.8702664796633941) {
    p = WekaStringREPTree.Nc88a337334(i);
    } else if (true) {
    p = WekaStringREPTree.N2e8c1c9b513(i);
    } 
    return p;
  }
  static double Nc88a337334(Object []i) {
    double p = Double.NaN;
    /* stackHeuristic */
    if (i[48] == null) {
      p = 0.756970119753517;
    } else if (((Double)i[48]).doubleValue() < -0.11409994360395032) {
    p = WekaStringREPTree.N5d0a1059335(i);
    } else if (true) {
    p = WekaStringREPTree.N3f6f6701427(i);
    } 
    return p;
  }
  static double N5d0a1059335(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.6113637152476484;
    } else if (((Double)i[37]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N485966cc336(i);
    } else if (true) {
    p = WekaStringREPTree.N593aaf41339(i);
    } 
    return p;
  }
  static double N485966cc336(Object []i) {
    double p = Double.NaN;
    /* chiSquare2eqDist */
    if (i[49] == null) {
      p = 0.12705530642750373;
    } else if (((Double)i[49]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N1de76cc7337(i);
    } else if (true) {
    p = WekaStringREPTree.N54bff557338(i);
    } 
    return p;
  }
  static double N1de76cc7337(Object []i) {
    double p = Double.NaN;
    /* maxLenKnownWord */
    if (i[47] == null) {
      p = 0.02794883941260066;
    } else if (((Double)i[47]).doubleValue() < 1.5) {
      p = 0.08456659619450317;
    } else if (true) {
      p = 0.0115995115995116;
    } 
    return p;
  }
  static double N54bff557338(Object []i) {
    double p = Double.NaN;
    /* regex */
    if (i[3] == null) {
      p = 0.49734513274336284;
    } else if (((Double)i[3]).doubleValue() < 0.5) {
      p = 0.525390625;
    } else if (true) {
      p = 0.22641509433962265;
    } 
    return p;
  }
  static double N593aaf41339(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.6609527453606275;
    } else if (((Double)i[43]).doubleValue() < 0.8166666666666667) {
    p = WekaStringREPTree.N5a56cdac340(i);
    } else if (true) {
    p = WekaStringREPTree.N201a4587388(i);
    } 
    return p;
  }
  static double N5a56cdac340(Object []i) {
    double p = Double.NaN;
    /* strLen */
    if (i[28] == null) {
      p = 0.7665756943329587;
    } else if (((Double)i[28]).doubleValue() < 6.5) {
    p = WekaStringREPTree.N7c711375341(i);
    } else if (true) {
    p = WekaStringREPTree.N1de5f259361(i);
    } 
    return p;
  }
  static double N7c711375341(Object []i) {
    double p = Double.NaN;
    /* strLen */
    if (i[28] == null) {
      p = 0.8768485149745247;
    } else if (((Double)i[28]).doubleValue() < 5.5) {
    p = WekaStringREPTree.N57cf54e1342(i);
    } else if (true) {
    p = WekaStringREPTree.Nf0da945354(i);
    } 
    return p;
  }
  static double N57cf54e1342(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.9091339327969711;
    } else if (((Double)i[51]).doubleValue() < 0.8038461538461539) {
    p = WekaStringREPTree.N5b03b9fe343(i);
    } else if (true) {
    p = WekaStringREPTree.N3ee37e5a348(i);
    } 
    return p;
  }
  static double N5b03b9fe343(Object []i) {
    double p = Double.NaN;
    /* regex */
    if (i[3] == null) {
      p = 0.9300762804213585;
    } else if (((Double)i[3]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N37d4349f344(i);
    } else if (true) {
    p = WekaStringREPTree.N2805d709347(i);
    } 
    return p;
  }
  static double N37d4349f344(Object []i) {
    double p = Double.NaN;
    /* specialChars */
    if (i[21] == null) {
      p = 0.9386376430850065;
    } else if (((Double)i[21]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N434a63ab345(i);
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N434a63ab345(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.9404023312652754;
    } else if (((Double)i[43]).doubleValue() < 0.225) {
    p = WekaStringREPTree.N6e0f5f7f346(i);
    } else if (true) {
      p = 0.988976377952756;
    } 
    return p;
  }
  static double N6e0f5f7f346(Object []i) {
    double p = Double.NaN;
    /* nonVocals */
    if (i[34] == null) {
      p = 0.9132981839484475;
    } else if (((Double)i[34]).doubleValue() < 0.7) {
      p = 0.8824065633546034;
    } else if (true) {
      p = 0.9688524590163935;
    } 
    return p;
  }
  static double N2805d709347(Object []i) {
    double p = Double.NaN;
    /* simpleSplitWordLen */
    if (i[36] == null) {
      p = 0.672316384180791;
    } else if (((Double)i[36]).doubleValue() < 2.5) {
      p = 0.34177215189873417;
    } else if (true) {
      p = 0.9387755102040817;
    } 
    return p;
  }
  static double N3ee37e5a348(Object []i) {
    double p = Double.NaN;
    /* strLen */
    if (i[28] == null) {
      p = 0.7707082833133253;
    } else if (((Double)i[28]).doubleValue() < 4.5) {
    p = WekaStringREPTree.N2ea41516349(i);
    } else if (true) {
    p = WekaStringREPTree.N3a44431a350(i);
    } 
    return p;
  }
  static double N2ea41516349(Object []i) {
    double p = Double.NaN;
    /* dashes */
    if (i[39] == null) {
      p = 0.9110764430577223;
    } else if (((Double)i[39]).doubleValue() < 0.5) {
      p = 0.9486754966887417;
    } else if (true) {
      p = 0.2972972972972973;
    } 
    return p;
  }
  static double N3a44431a350(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.3020833333333333;
    } else if (((Double)i[51]).doubleValue() < 0.8112535612535613) {
    p = WekaStringREPTree.N3c7f66c4351(i);
    } else if (true) {
    p = WekaStringREPTree.N17497425353(i);
    } 
    return p;
  }
  static double N3c7f66c4351(Object []i) {
    double p = Double.NaN;
    /* minLenKnownWord */
    if (i[46] == null) {
      p = 0.5342465753424658;
    } else if (((Double)i[46]).doubleValue() < 2.5) {
    p = WekaStringREPTree.N194bcebf352(i);
    } else if (true) {
      p = 0.11764705882352941;
    } 
    return p;
  }
  static double N194bcebf352(Object []i) {
    double p = Double.NaN;
    /* simpleSplitWordLen */
    if (i[36] == null) {
      p = 0.6607142857142857;
    } else if (((Double)i[36]).doubleValue() < 2.5) {
      p = 0.5161290322580645;
    } else if (true) {
      p = 0.84;
    } 
    return p;
  }
  static double N17497425353(Object []i) {
    double p = Double.NaN;
    /* digits */
    if (i[32] == null) {
      p = 0.15966386554621848;
    } else if (((Double)i[32]).doubleValue() < 0.1) {
      p = 0.25757575757575757;
    } else if (true) {
      p = 0.03773584905660377;
    } 
    return p;
  }
  static double Nf0da945354(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.7570257611241218;
    } else if (((Double)i[51]).doubleValue() < 0.7817460317460317) {
    p = WekaStringREPTree.N4803b726355(i);
    } else if (true) {
      p = 0.07407407407407407;
    } 
    return p;
  }
  static double N4803b726355(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.779322853688029;
    } else if (((Double)i[37]).doubleValue() < 1.5) {
    p = WekaStringREPTree.Nffaa6af356(i);
    } else if (true) {
    p = WekaStringREPTree.N6404f418359(i);
    } 
    return p;
  }
  static double Nffaa6af356(Object []i) {
    double p = Double.NaN;
    /* setDist */
    if (i[29] == null) {
      p = 0.9145658263305322;
    } else if (((Double)i[29]).doubleValue() < 2.0) {
    p = WekaStringREPTree.N53ce1329357(i);
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N53ce1329357(Object []i) {
    double p = Double.NaN;
    /* crypto */
    if (i[19] == null) {
      p = 0.9184247538677919;
    } else if (((Double)i[19]).doubleValue() < 0.5) {
      p = 0.9273255813953488;
    } else if (true) {
    p = WekaStringREPTree.N316bcf94358(i);
    } 
    return p;
  }
  static double N316bcf94358(Object []i) {
    double p = Double.NaN;
    /* setDist */
    if (i[29] == null) {
      p = 0.6521739130434783;
    } else if (((Double)i[29]).doubleValue() < 0.3833333333333333) {
      p = 0.5294117647058824;
    } else if (true) {
      p = 1.0;
    } 
    return p;
  }
  static double N6404f418359(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.676595744680851;
    } else if (((Double)i[37]).doubleValue() < 2.5) {
    p = WekaStringREPTree.N3e11f9e9360(i);
    } else if (true) {
      p = 0.9830508474576272;
    } 
    return p;
  }
  static double N3e11f9e9360(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.6055045871559633;
    } else if (((Double)i[43]).doubleValue() < 0.08333333333333333) {
      p = 0.4708097928436911;
    } else if (true) {
      p = 0.9137931034482759;
    } 
    return p;
  }
  static double N1de5f259361(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.5654046701428248;
    } else if (((Double)i[37]).doubleValue() < 1.5) {
    p = WekaStringREPTree.N729d991e362(i);
    } else if (true) {
    p = WekaStringREPTree.N7bab3f1a372(i);
    } 
    return p;
  }
  static double N729d991e362(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.8095916429249762;
    } else if (((Double)i[51]).doubleValue() < 0.7417989417989418) {
    p = WekaStringREPTree.N31fa1761363(i);
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N31fa1761363(Object []i) {
    double p = Double.NaN;
    /* vocals */
    if (i[33] == null) {
      p = 0.829683698296837;
    } else if (((Double)i[33]).doubleValue() < 0.2361111111111111) {
    p = WekaStringREPTree.N957e06364(i);
    } else if (true) {
    p = WekaStringREPTree.N4dbb42b7367(i);
    } 
    return p;
  }
  static double N957e06364(Object []i) {
    double p = Double.NaN;
    /* commands */
    if (i[5] == null) {
      p = 0.9219088937093276;
    } else if (((Double)i[5]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N32502377365(i);
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N32502377365(Object []i) {
    double p = Double.NaN;
    /* vocals */
    if (i[33] == null) {
      p = 0.9279475982532751;
    } else if (((Double)i[33]).doubleValue() < 0.11805555555555555) {
      p = 0.9749652294853964;
    } else if (true) {
    p = WekaStringREPTree.N2c1b194a366(i);
    } 
    return p;
  }
  static double N2c1b194a366(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.8763358778625954;
    } else if (((Double)i[43]).doubleValue() < 0.15476190476190477) {
      p = 0.7976878612716763;
    } else if (true) {
      p = 0.9644012944983819;
    } 
    return p;
  }
  static double N4dbb42b7367(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.6398809523809523;
    } else if (((Double)i[43]).doubleValue() < 0.18333333333333335) {
    p = WekaStringREPTree.N66f57048368(i);
    } else if (true) {
    p = WekaStringREPTree.N21282ed8370(i);
    } 
    return p;
  }
  static double N66f57048368(Object []i) {
    double p = Double.NaN;
    /* strLen */
    if (i[28] == null) {
      p = 0.5102040816326531;
    } else if (((Double)i[28]).doubleValue() < 9.5) {
    p = WekaStringREPTree.N550dbc7a369(i);
    } else if (true) {
      p = 0.1111111111111111;
    } 
    return p;
  }
  static double N550dbc7a369(Object []i) {
    double p = Double.NaN;
    /* setDist */
    if (i[29] == null) {
      p = 0.5767195767195767;
    } else if (((Double)i[29]).doubleValue() < 0.13392857142857142) {
      p = 0.39;
    } else if (true) {
      p = 0.6438848920863309;
    } 
    return p;
  }
  static double N21282ed8370(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.8874458874458875;
    } else if (((Double)i[43]).doubleValue() < 0.26785714285714285) {
      p = 0.8130081300813008;
    } else if (true) {
    p = WekaStringREPTree.N36916eb0371(i);
    } 
    return p;
  }
  static double N36916eb0371(Object []i) {
    double p = Double.NaN;
    /* crypto */
    if (i[19] == null) {
      p = 0.9722222222222222;
    } else if (((Double)i[19]).doubleValue() < 0.5) {
      p = 0.9903846153846154;
    } else if (true) {
      p = 0.5;
    } 
    return p;
  }
  static double N7bab3f1a372(Object []i) {
    double p = Double.NaN;
    /* vocals */
    if (i[33] == null) {
      p = 0.3422993492407809;
    } else if (((Double)i[33]).doubleValue() < 0.17142857142857143) {
    p = WekaStringREPTree.N437da279373(i);
    } else if (true) {
    p = WekaStringREPTree.N27462a88383(i);
    } 
    return p;
  }
  static double N437da279373(Object []i) {
    double p = Double.NaN;
    /* vocals */
    if (i[33] == null) {
      p = 0.5567514677103719;
    } else if (((Double)i[33]).doubleValue() < 0.05) {
    p = WekaStringREPTree.N23c30a20374(i);
    } else if (true) {
    p = WekaStringREPTree.N12aba8be377(i);
    } 
    return p;
  }
  static double N23c30a20374(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.8018867924528302;
    } else if (((Double)i[51]).doubleValue() < 0.7413381123058542) {
    p = WekaStringREPTree.N1e1a0406375(i);
    } else if (true) {
      p = 0.07142857142857142;
    } 
    return p;
  }
  static double N1e1a0406375(Object []i) {
    double p = Double.NaN;
    /* color */
    if (i[10] == null) {
      p = 0.8724137931034482;
    } else if (((Double)i[10]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N3cebbb30376(i);
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N3cebbb30376(Object []i) {
    double p = Double.NaN;
    /* knownWordsCount */
    if (i[44] == null) {
      p = 0.887719298245614;
    } else if (((Double)i[44]).doubleValue() < 1.5) {
      p = 0.9035714285714286;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N12aba8be377(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.4460227272727273;
    } else if (((Double)i[43]).doubleValue() < 0.05555555555555555) {
    p = WekaStringREPTree.N290222c1378(i);
    } else if (true) {
    p = WekaStringREPTree.N6253c26380(i);
    } 
    return p;
  }
  static double N290222c1378(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.35911602209944754;
    } else if (((Double)i[37]).doubleValue() < 2.5) {
    p = WekaStringREPTree.N67f639d3379(i);
    } else if (true) {
      p = 0.9;
    } 
    return p;
  }
  static double N67f639d3379(Object []i) {
    double p = Double.NaN;
    /* dashes */
    if (i[39] == null) {
      p = 0.27906976744186046;
    } else if (((Double)i[39]).doubleValue() < 0.5) {
      p = 0.2650862068965517;
    } else if (true) {
      p = 1.0;
    } 
    return p;
  }
  static double N6253c26380(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.7391304347826086;
    } else if (((Double)i[37]).doubleValue() < 2.5) {
    p = WekaStringREPTree.N49049a04381(i);
    } else if (true) {
    p = WekaStringREPTree.N71a8adcf382(i);
    } 
    return p;
  }
  static double N49049a04381(Object []i) {
    double p = Double.NaN;
    /* color */
    if (i[10] == null) {
      p = 0.8646616541353384;
    } else if (((Double)i[10]).doubleValue() < 0.5) {
      p = 0.9583333333333334;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N71a8adcf382(Object []i) {
    double p = Double.NaN;
    /* digits */
    if (i[32] == null) {
      p = 0.14285714285714285;
    } else if (((Double)i[32]).doubleValue() < 0.05) {
      p = 1.0;
    } else if (true) {
      p = 0.07692307692307693;
    } 
    return p;
  }
  static double N27462a88383(Object []i) {
    double p = Double.NaN;
    /* strLen */
    if (i[28] == null) {
      p = 0.17147310989867498;
    } else if (((Double)i[28]).doubleValue() < 7.5) {
    p = WekaStringREPTree.N82de64a384(i);
    } else if (true) {
    p = WekaStringREPTree.N659499f1385(i);
    } 
    return p;
  }
  static double N82de64a384(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.3333333333333333;
    } else if (((Double)i[37]).doubleValue() < 2.5) {
      p = 0.2835249042145594;
    } else if (true) {
      p = 0.7666666666666667;
    } 
    return p;
  }
  static double N659499f1385(Object []i) {
    double p = Double.NaN;
    /* digits */
    if (i[32] == null) {
      p = 0.12399193548387097;
    } else if (((Double)i[32]).doubleValue() < 0.11805555555555555) {
    p = WekaStringREPTree.N51e69659386(i);
    } else if (true) {
      p = 0.41509433962264153;
    } 
    return p;
  }
  static double N51e69659386(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.10756123535676251;
    } else if (((Double)i[37]).doubleValue() < 2.5) {
    p = WekaStringREPTree.N47e2e487387(i);
    } else if (true) {
      p = 0.3225806451612903;
    } 
    return p;
  }
  static double N47e2e487387(Object []i) {
    double p = Double.NaN;
    /* digits */
    if (i[32] == null) {
      p = 0.08392434988179669;
    } else if (((Double)i[32]).doubleValue() < 0.05) {
      p = 0.06374501992031872;
    } else if (true) {
      p = 0.24731182795698925;
    } 
    return p;
  }
  static double N201a4587388(Object []i) {
    double p = Double.NaN;
    /* dashes */
    if (i[39] == null) {
      p = 0.564743730350223;
    } else if (((Double)i[39]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N61001b64389(i);
    } else if (true) {
    p = WekaStringREPTree.N2d52216b425(i);
    } 
    return p;
  }
  static double N61001b64389(Object []i) {
    double p = Double.NaN;
    /* nonVocals */
    if (i[34] == null) {
      p = 0.5916912106650132;
    } else if (((Double)i[34]).doubleValue() < 0.41428571428571426) {
    p = WekaStringREPTree.N4310d43390(i);
    } else if (true) {
    p = WekaStringREPTree.N59505b48407(i);
    } 
    return p;
  }
  static double N4310d43390(Object []i) {
    double p = Double.NaN;
    /* minLenKnownWord */
    if (i[46] == null) {
      p = 0.4607919254658385;
    } else if (((Double)i[46]).doubleValue() < 1.5) {
    p = WekaStringREPTree.N54a7079e391(i);
    } else if (true) {
    p = WekaStringREPTree.N4659191b399(i);
    } 
    return p;
  }
  static double N54a7079e391(Object []i) {
    double p = Double.NaN;
    /* datatype */
    if (i[18] == null) {
      p = 0.5970623263199683;
    } else if (((Double)i[18]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N26e356f0392(i);
    } else if (true) {
    p = WekaStringREPTree.N2dc54ad4398(i);
    } 
    return p;
  }
  static double N26e356f0392(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.6481078729882558;
    } else if (((Double)i[37]).doubleValue() < 1.5) {
    p = WekaStringREPTree.N47d9a273393(i);
    } else if (true) {
    p = WekaStringREPTree.N1b11171f396(i);
    } 
    return p;
  }
  static double N47d9a273393(Object []i) {
    double p = Double.NaN;
    /* digits */
    if (i[32] == null) {
      p = 0.7517899761336515;
    } else if (((Double)i[32]).doubleValue() < 0.45) {
    p = WekaStringREPTree.N4b8ee4de394(i);
    } else if (true) {
    p = WekaStringREPTree.N27f981c6395(i);
    } 
    return p;
  }
  static double N4b8ee4de394(Object []i) {
    double p = Double.NaN;
    /* maxLenKnownWord */
    if (i[47] == null) {
      p = 0.7918593894542091;
    } else if (((Double)i[47]).doubleValue() < 2.5) {
      p = 0.8943298969072165;
    } else if (true) {
      p = 0.7344877344877345;
    } 
    return p;
  }
  static double N27f981c6395(Object []i) {
    double p = Double.NaN;
    /* maxRepChars */
    if (i[35] == null) {
      p = 0.5056818181818182;
    } else if (((Double)i[35]).doubleValue() < 1.5) {
      p = 0.6923076923076923;
    } else if (true) {
      p = 0.45255474452554745;
    } 
    return p;
  }
  static double N1b11171f396(Object []i) {
    double p = Double.NaN;
    /* digits */
    if (i[32] == null) {
      p = 0.5230326295585412;
    } else if (((Double)i[32]).doubleValue() < 0.18333333333333335) {
    p = WekaStringREPTree.N1151e434397(i);
    } else if (true) {
      p = 0.4146341463414634;
    } 
    return p;
  }
  static double N1151e434397(Object []i) {
    double p = Double.NaN;
    /* classpath */
    if (i[11] == null) {
      p = 0.6365422396856582;
    } else if (((Double)i[11]).doubleValue() < 0.5) {
      p = 0.6604938271604939;
    } else if (true) {
      p = 0.13043478260869565;
    } 
    return p;
  }
  static double N2dc54ad4398(Object []i) {
    double p = Double.NaN;
    /* date */
    if (i[17] == null) {
      p = 0.06363636363636363;
    } else if (((Double)i[17]).doubleValue() < 0.5) {
      p = 1.0;
    } else if (true) {
      p = 0.05504587155963303;
    } 
    return p;
  }
  static double N4659191b399(Object []i) {
    double p = Double.NaN;
    /* simpleSplitWordLen */
    if (i[36] == null) {
      p = 0.3304215723509305;
    } else if (((Double)i[36]).doubleValue() < 2.5) {
    p = WekaStringREPTree.N55634720400(i);
    } else if (true) {
    p = WekaStringREPTree.N4c1909a3402(i);
    } 
    return p;
  }
  static double N55634720400(Object []i) {
    double p = Double.NaN;
    /* regex */
    if (i[3] == null) {
      p = 0.8095238095238095;
    } else if (((Double)i[3]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N4b0d79fc401(i);
    } else if (true) {
      p = 0.14285714285714285;
    } 
    return p;
  }
  static double N4b0d79fc401(Object []i) {
    double p = Double.NaN;
    /* maxRepChars */
    if (i[35] == null) {
      p = 0.8428571428571429;
    } else if (((Double)i[35]).doubleValue() < 1.5) {
      p = 0.9636363636363636;
    } else if (true) {
      p = 0.7647058823529411;
    } 
    return p;
  }
  static double N4c1909a3402(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.3020917135961384;
    } else if (((Double)i[37]).doubleValue() < 2.5) {
    p = WekaStringREPTree.N428640fa403(i);
    } else if (true) {
    p = WekaStringREPTree.N29215f06406(i);
    } 
    return p;
  }
  static double N428640fa403(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.27448453608247425;
    } else if (((Double)i[37]).doubleValue() < 1.5) {
    p = WekaStringREPTree.Nd9345cd404(i);
    } else if (true) {
    p = WekaStringREPTree.N2d710f1a405(i);
    } 
    return p;
  }
  static double Nd9345cd404(Object []i) {
    double p = Double.NaN;
    /* equals */
    if (i[38] == null) {
      p = 0.4059196617336152;
    } else if (((Double)i[38]).doubleValue() < 0.5) {
      p = 0.32512953367875647;
    } else if (true) {
      p = 0.764367816091954;
    } 
    return p;
  }
  static double N2d710f1a405(Object []i) {
    double p = Double.NaN;
    /* pluses */
    if (i[41] == null) {
      p = 0.18451519536903038;
    } else if (((Double)i[41]).doubleValue() < 0.5) {
      p = 0.17702999268471104;
    } else if (true) {
      p = 0.8666666666666667;
    } 
    return p;
  }
  static double N29215f06406(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.7088607594936709;
    } else if (((Double)i[31]).doubleValue() < 0.30000000000000004) {
      p = 0.0;
    } else if (true) {
      p = 0.7417218543046358;
    } 
    return p;
  }
  static double N59505b48407(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.6787096774193548;
    } else if (((Double)i[51]).doubleValue() < 0.8019607843137255) {
    p = WekaStringREPTree.N4efac082408(i);
    } else if (true) {
    p = WekaStringREPTree.N52b1beb6418(i);
    } 
    return p;
  }
  static double N4efac082408(Object []i) {
    double p = Double.NaN;
    /* regex */
    if (i[3] == null) {
      p = 0.7523642732049037;
    } else if (((Double)i[3]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N6bd61f98409(i);
    } else if (true) {
    p = WekaStringREPTree.N72e5a8e415(i);
    } 
    return p;
  }
  static double N6bd61f98409(Object []i) {
    double p = Double.NaN;
    /* minLenKnownWord */
    if (i[46] == null) {
      p = 0.7991527055651839;
    } else if (((Double)i[46]).doubleValue() < 2.5) {
    p = WekaStringREPTree.N48aca48b410(i);
    } else if (true) {
    p = WekaStringREPTree.N506ae4d4413(i);
    } 
    return p;
  }
  static double N48aca48b410(Object []i) {
    double p = Double.NaN;
    /* commands */
    if (i[5] == null) {
      p = 0.8307388730541548;
    } else if (((Double)i[5]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N13fd2ccd411(i);
    } else if (true) {
    p = WekaStringREPTree.Nb9b00e0412(i);
    } 
    return p;
  }
  static double N13fd2ccd411(Object []i) {
    double p = Double.NaN;
    /* nonVocals */
    if (i[34] == null) {
      p = 0.8440995206573841;
    } else if (((Double)i[34]).doubleValue() < 0.788888888888889) {
      p = 0.7984986171473726;
    } else if (true) {
      p = 0.9064864864864864;
    } 
    return p;
  }
  static double Nb9b00e0412(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.5055555555555555;
    } else if (((Double)i[37]).doubleValue() < 1.5) {
      p = 0.0684931506849315;
    } else if (true) {
      p = 0.8037383177570093;
    } 
    return p;
  }
  static double N506ae4d4413(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.5712025316455697;
    } else if (((Double)i[37]).doubleValue() < 2.5) {
    p = WekaStringREPTree.N7d4f9aae414(i);
    } else if (true) {
      p = 0.8648648648648649;
    } 
    return p;
  }
  static double N7d4f9aae414(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.532258064516129;
    } else if (((Double)i[37]).doubleValue() < 1.5) {
      p = 0.660958904109589;
    } else if (true) {
      p = 0.39097744360902253;
    } 
    return p;
  }
  static double N72e5a8e415(Object []i) {
    double p = Double.NaN;
    /* maxLenKnownWord */
    if (i[47] == null) {
      p = 0.28239845261121854;
    } else if (((Double)i[47]).doubleValue() < 2.5) {
    p = WekaStringREPTree.N54e1c68b416(i);
    } else if (true) {
      p = 0.5935483870967742;
    } 
    return p;
  }
  static double N54e1c68b416(Object []i) {
    double p = Double.NaN;
    /* minLenKnownWord */
    if (i[46] == null) {
      p = 0.14917127071823205;
    } else if (((Double)i[46]).doubleValue() < 1.5) {
      p = 1.0;
    } else if (true) {
    p = WekaStringREPTree.N53aac487417(i);
    } 
    return p;
  }
  static double N53aac487417(Object []i) {
    double p = Double.NaN;
    /* pluses */
    if (i[41] == null) {
      p = 0.1174785100286533;
    } else if (((Double)i[41]).doubleValue() < 0.5) {
      p = 0.1023391812865497;
    } else if (true) {
      p = 0.8571428571428571;
    } 
    return p;
  }
  static double N52b1beb6418(Object []i) {
    double p = Double.NaN;
    /* strLen */
    if (i[28] == null) {
      p = 0.4725490196078431;
    } else if (((Double)i[28]).doubleValue() < 4.5) {
    p = WekaStringREPTree.N273e7444419(i);
    } else if (true) {
      p = 0.04067796610169491;
    } 
    return p;
  }
  static double N273e7444419(Object []i) {
    double p = Double.NaN;
    /* maxLenKnownWord */
    if (i[47] == null) {
      p = 0.6482758620689655;
    } else if (((Double)i[47]).doubleValue() < 2.5) {
    p = WekaStringREPTree.N7db12bb6420(i);
    } else if (true) {
    p = WekaStringREPTree.N73e9cf30423(i);
    } 
    return p;
  }
  static double N7db12bb6420(Object []i) {
    double p = Double.NaN;
    /* maxRepChars */
    if (i[35] == null) {
      p = 0.7172284644194756;
    } else if (((Double)i[35]).doubleValue() < 1.5) {
    p = WekaStringREPTree.N783a467b421(i);
    } else if (true) {
    p = WekaStringREPTree.N272113c4422(i);
    } 
    return p;
  }
  static double N783a467b421(Object []i) {
    double p = Double.NaN;
    /* knownWordsCount */
    if (i[44] == null) {
      p = 0.8201058201058201;
    } else if (((Double)i[44]).doubleValue() < 1.5) {
      p = 0.44;
    } else if (true) {
      p = 0.9141914191419142;
    } 
    return p;
  }
  static double N272113c4422(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.6608695652173913;
    } else if (((Double)i[51]).doubleValue() < 0.8366666666666667) {
      p = 0.7356076759061834;
    } else if (true) {
      p = 0.502262443438914;
    } 
    return p;
  }
  static double N73e9cf30423(Object []i) {
    double p = Double.NaN;
    /* regex */
    if (i[3] == null) {
      p = 0.45549738219895286;
    } else if (((Double)i[3]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N771a660424(i);
    } else if (true) {
      p = 0.10526315789473684;
    } 
    return p;
  }
  static double N771a660424(Object []i) {
    double p = Double.NaN;
    /* vocals */
    if (i[33] == null) {
      p = 0.4941860465116279;
    } else if (((Double)i[33]).doubleValue() < 0.125) {
      p = 0.6047619047619047;
    } else if (true) {
      p = 0.3208955223880597;
    } 
    return p;
  }
  static double N2d52216b425(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.11612903225806452;
    } else if (((Double)i[31]).doubleValue() < 0.3666666666666667) {
      p = 0.03231017770597738;
    } else if (true) {
    p = WekaStringREPTree.N242b836426(i);
    } 
    return p;
  }
  static double N242b836426(Object []i) {
    double p = Double.NaN;
    /* dashes */
    if (i[39] == null) {
      p = 0.44871794871794873;
    } else if (((Double)i[39]).doubleValue() < 1.5) {
      p = 0.5245901639344263;
    } else if (true) {
      p = 0.17647058823529413;
    } 
    return p;
  }
  static double N3f6f6701427(Object []i) {
    double p = Double.NaN;
    /* maxLenKnownWord */
    if (i[47] == null) {
      p = 0.8303117187363416;
    } else if (((Double)i[47]).doubleValue() < 2.5) {
    p = WekaStringREPTree.N3527942a428(i);
    } else if (true) {
    p = WekaStringREPTree.N750e2b97492(i);
    } 
    return p;
  }
  static double N3527942a428(Object []i) {
    double p = Double.NaN;
    /* digits */
    if (i[32] == null) {
      p = 0.8676181571867427;
    } else if (((Double)i[32]).doubleValue() < 0.41666666666666663) {
    p = WekaStringREPTree.N942a29c429(i);
    } else if (true) {
    p = WekaStringREPTree.N6574a52c473(i);
    } 
    return p;
  }
  static double N942a29c429(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.8902767920511001;
    } else if (((Double)i[43]).doubleValue() < 0.875) {
    p = WekaStringREPTree.N1ed6388a430(i);
    } else if (true) {
    p = WekaStringREPTree.N537f60bf454(i);
    } 
    return p;
  }
  static double N1ed6388a430(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.9602251229663261;
    } else if (((Double)i[43]).doubleValue() < 0.29166666666666663) {
    p = WekaStringREPTree.N5a45133e431(i);
    } else if (true) {
    p = WekaStringREPTree.N51c668e3445(i);
    } 
    return p;
  }
  static double N5a45133e431(Object []i) {
    double p = Double.NaN;
    /* regex */
    if (i[3] == null) {
      p = 0.8890451633067666;
    } else if (((Double)i[3]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N534a5a98432(i);
    } else if (true) {
    p = WekaStringREPTree.N4d5650ae442(i);
    } 
    return p;
  }
  static double N534a5a98432(Object []i) {
    double p = Double.NaN;
    /* dashes */
    if (i[39] == null) {
      p = 0.901756216310207;
    } else if (((Double)i[39]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N4f80542f433(i);
    } else if (true) {
    p = WekaStringREPTree.N130c12b7436(i);
    } 
    return p;
  }
  static double N4f80542f433(Object []i) {
    double p = Double.NaN;
    /* equals */
    if (i[38] == null) {
      p = 0.9075430245331381;
    } else if (((Double)i[38]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N60bd273d434(i);
    } else if (true) {
      p = 0.8266129032258065;
    } 
    return p;
  }
  static double N60bd273d434(Object []i) {
    double p = Double.NaN;
    /* xml */
    if (i[0] == null) {
      p = 0.9113924050632911;
    } else if (((Double)i[0]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N121314f7435(i);
    } else if (true) {
      p = 0.47368421052631576;
    } 
    return p;
  }
  static double N121314f7435(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.9129932627526468;
    } else if (((Double)i[51]).doubleValue() < 0.8366666666666667) {
      p = 0.9444444444444444;
    } else if (true) {
      p = 0.9049116864263247;
    } 
    return p;
  }
  static double N130c12b7436(Object []i) {
    double p = Double.NaN;
    /* pluses */
    if (i[41] == null) {
      p = 0.7923875432525952;
    } else if (((Double)i[41]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N5e600dd5437(i);
    } else if (true) {
    p = WekaStringREPTree.N2e3967ea440(i);
    } 
    return p;
  }
  static double N5e600dd5437(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.8035714285714286;
    } else if (((Double)i[37]).doubleValue() < 2.5) {
    p = WekaStringREPTree.N576d5deb438(i);
    } else if (true) {
    p = WekaStringREPTree.N5d534f5d439(i);
    } 
    return p;
  }
  static double N576d5deb438(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.7783018867924528;
    } else if (((Double)i[37]).doubleValue() < 1.5) {
      p = 0.8631578947368421;
    } else if (true) {
      p = 0.7094017094017094;
    } 
    return p;
  }
  static double N5d534f5d439(Object []i) {
    double p = Double.NaN;
    /* date */
    if (i[17] == null) {
      p = 0.8823529411764706;
    } else if (((Double)i[17]).doubleValue() < 0.5) {
      p = 1.0;
    } else if (true) {
      p = 0.873015873015873;
    } 
    return p;
  }
  static double N2e3967ea440(Object []i) {
    double p = Double.NaN;
    /* slashes */
    if (i[40] == null) {
      p = 0.4444444444444444;
    } else if (((Double)i[40]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N70e9c95d441(i);
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N70e9c95d441(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.5714285714285714;
    } else if (((Double)i[37]).doubleValue() < 1.5) {
      p = 1.0;
    } else if (true) {
      p = 0.25;
    } 
    return p;
  }
  static double N4d5650ae442(Object []i) {
    double p = Double.NaN;
    /* strLen */
    if (i[28] == null) {
      p = 0.7762345679012346;
    } else if (((Double)i[28]).doubleValue() < 3.5) {
    p = WekaStringREPTree.Na38c7fe443(i);
    } else if (true) {
      p = 0.2926829268292683;
    } 
    return p;
  }
  static double Na38c7fe443(Object []i) {
    double p = Double.NaN;
    /* classpath */
    if (i[11] == null) {
      p = 0.8462897526501767;
    } else if (((Double)i[11]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N6fdbe764444(i);
    } else if (true) {
      p = 0.4;
    } 
    return p;
  }
  static double N6fdbe764444(Object []i) {
    double p = Double.NaN;
    /* date */
    if (i[17] == null) {
      p = 0.8626373626373627;
    } else if (((Double)i[17]).doubleValue() < 0.5) {
      p = 0.6666666666666666;
    } else if (true) {
      p = 0.8764705882352941;
    } 
    return p;
  }
  static double N51c668e3445(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.9911156324177688;
    } else if (((Double)i[37]).doubleValue() < 0.5) {
      p = 0.3023255813953488;
    } else if (true) {
    p = WekaStringREPTree.N2e6a8155446(i);
    } 
    return p;
  }
  static double N2e6a8155446(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.9931301863692015;
    } else if (((Double)i[37]).doubleValue() < 3.5) {
    p = WekaStringREPTree.N6221a451447(i);
    } else if (true) {
    p = WekaStringREPTree.N5824a83d453(i);
    } 
    return p;
  }
  static double N6221a451447(Object []i) {
    double p = Double.NaN;
    /* vocals */
    if (i[33] == null) {
      p = 0.993534776099088;
    } else if (((Double)i[33]).doubleValue() < 0.125) {
    p = WekaStringREPTree.N52719fb6448(i);
    } else if (true) {
    p = WekaStringREPTree.N4a883b15450(i);
    } 
    return p;
  }
  static double N52719fb6448(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.9962821907870875;
    } else if (((Double)i[37]).doubleValue() < 2.5) {
      p = 0.9982833600366217;
    } else if (true) {
    p = WekaStringREPTree.N3012646b449(i);
    } 
    return p;
  }
  static double N3012646b449(Object []i) {
    double p = Double.NaN;
    /* strLen */
    if (i[28] == null) {
      p = 0.988646288209607;
    } else if (((Double)i[28]).doubleValue() < 3.5) {
      p = 0.9845788849347569;
    } else if (true) {
      p = 1.0;
    } 
    return p;
  }
  static double N4a883b15450(Object []i) {
    double p = Double.NaN;
    /* simpleSplitWordLen */
    if (i[36] == null) {
      p = 0.9852700490998363;
    } else if (((Double)i[36]).doubleValue() < 2.5) {
    p = WekaStringREPTree.N25641d39451(i);
    } else if (true) {
    p = WekaStringREPTree.N7b36aa0c452(i);
    } 
    return p;
  }
  static double N25641d39451(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.9445544554455445;
    } else if (((Double)i[37]).doubleValue() < 1.5) {
      p = 1.0;
    } else if (true) {
      p = 0.8852459016393442;
    } 
    return p;
  }
  static double N7b36aa0c452(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.9917747548244227;
    } else if (((Double)i[51]).doubleValue() < 0.8366666666666667) {
      p = 0.9993150684931507;
    } else if (true) {
      p = 0.9853027630805409;
    } 
    return p;
  }
  static double N5824a83d453(Object []i) {
    double p = Double.NaN;
    /* date */
    if (i[17] == null) {
      p = 0.25;
    } else if (((Double)i[17]).doubleValue() < 0.5) {
      p = 1.0;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N537f60bf454(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.8377764367612084;
    } else if (((Double)i[37]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N5677323c455(i);
    } else if (true) {
    p = WekaStringREPTree.N18df8434456(i);
    } 
    return p;
  }
  static double N5677323c455(Object []i) {
    double p = Double.NaN;
    /* digits */
    if (i[32] == null) {
      p = 0.03125;
    } else if (((Double)i[32]).doubleValue() < 0.125) {
      p = 0.0189873417721519;
    } else if (true) {
      p = 1.0;
    } 
    return p;
  }
  static double N18df8434456(Object []i) {
    double p = Double.NaN;
    /* simpleSplitWordLen */
    if (i[36] == null) {
      p = 0.8423833493984506;
    } else if (((Double)i[36]).doubleValue() < 2.5) {
    p = WekaStringREPTree.N65c7a252457(i);
    } else if (true) {
    p = WekaStringREPTree.N4b45a2f5464(i);
    } 
    return p;
  }
  static double N65c7a252457(Object []i) {
    double p = Double.NaN;
    /* regex */
    if (i[3] == null) {
      p = 0.7195498275549101;
    } else if (((Double)i[3]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N4d154ccd458(i);
    } else if (true) {
      p = 0.313953488372093;
    } 
    return p;
  }
  static double N4d154ccd458(Object []i) {
    double p = Double.NaN;
    /* country */
    if (i[14] == null) {
      p = 0.7394781946295944;
    } else if (((Double)i[14]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N229c6181459(i);
    } else if (true) {
    p = WekaStringREPTree.N791f145a462(i);
    } 
    return p;
  }
  static double N229c6181459(Object []i) {
    double p = Double.NaN;
    /* nonVocals */
    if (i[34] == null) {
      p = 0.7463837994214079;
    } else if (((Double)i[34]).doubleValue() < 0.7083333333333333) {
    p = WekaStringREPTree.N4686afc2460(i);
    } else if (true) {
    p = WekaStringREPTree.N1e0b4072461(i);
    } 
    return p;
  }
  static double N4686afc2460(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.7549135220125787;
    } else if (((Double)i[37]).doubleValue() < 1.5) {
      p = 0.7153103448275862;
    } else if (true) {
      p = 0.8530416951469583;
    } 
    return p;
  }
  static double N1e0b4072461(Object []i) {
    double p = Double.NaN;
    /* date */
    if (i[17] == null) {
      p = 0.29896907216494845;
    } else if (((Double)i[17]).doubleValue() < 0.5) {
      p = 1.0;
    } else if (true) {
      p = 0.04225352112676056;
    } 
    return p;
  }
  static double N791f145a462(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.19696969696969696;
    } else if (((Double)i[37]).doubleValue() < 1.5) {
      p = 0.11764705882352941;
    } else if (true) {
    p = WekaStringREPTree.N38cee291463(i);
    } 
    return p;
  }
  static double N38cee291463(Object []i) {
    double p = Double.NaN;
    /* vocals */
    if (i[33] == null) {
      p = 0.28125;
    } else if (((Double)i[33]).doubleValue() < 0.16666666666666666) {
      p = 0.2222222222222222;
    } else if (true) {
      p = 0.35714285714285715;
    } 
    return p;
  }
  static double N4b45a2f5464(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.8724557817082926;
    } else if (((Double)i[37]).doubleValue() < 3.5) {
    p = WekaStringREPTree.Nf09733f465(i);
    } else if (true) {
    p = WekaStringREPTree.N1ffaf86472(i);
    } 
    return p;
  }
  static double Nf09733f465(Object []i) {
    double p = Double.NaN;
    /* equals */
    if (i[38] == null) {
      p = 0.8743429844097995;
    } else if (((Double)i[38]).doubleValue() < 0.5) {
    p = WekaStringREPTree.Ne350b40466(i);
    } else if (true) {
    p = WekaStringREPTree.N6340e5f0469(i);
    } 
    return p;
  }
  static double Ne350b40466(Object []i) {
    double p = Double.NaN;
    /* xml */
    if (i[0] == null) {
      p = 0.881366980165751;
    } else if (((Double)i[0]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N41a0aa7d467(i);
    } else if (true) {
    p = WekaStringREPTree.N2794eab6468(i);
    } 
    return p;
  }
  static double N41a0aa7d467(Object []i) {
    double p = Double.NaN;
    /* country */
    if (i[14] == null) {
      p = 0.8866805805900768;
    } else if (((Double)i[14]).doubleValue() < 0.5) {
      p = 0.8886559626471009;
    } else if (true) {
      p = 0.44086021505376344;
    } 
    return p;
  }
  static double N2794eab6468(Object []i) {
    double p = Double.NaN;
    /* slashes */
    if (i[40] == null) {
      p = 0.5984848484848485;
    } else if (((Double)i[40]).doubleValue() < 0.5) {
      p = 0.06557377049180328;
    } else if (true) {
      p = 0.6955223880597015;
    } 
    return p;
  }
  static double N6340e5f0469(Object []i) {
    double p = Double.NaN;
    /* minLenKnownWord */
    if (i[46] == null) {
      p = 0.7191358024691358;
    } else if (((Double)i[46]).doubleValue() < 1.5) {
    p = WekaStringREPTree.N45099dd3470(i);
    } else if (true) {
    p = WekaStringREPTree.N13e344d471(i);
    } 
    return p;
  }
  static double N45099dd3470(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.803347280334728;
    } else if (((Double)i[31]).doubleValue() < 0.5833333333333333) {
      p = 0.9719101123595506;
    } else if (true) {
      p = 0.7476808905380334;
    } 
    return p;
  }
  static double N13e344d471(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.4823529411764706;
    } else if (((Double)i[37]).doubleValue() < 1.5) {
      p = 0.8;
    } else if (true) {
      p = 0.3736842105263158;
    } 
    return p;
  }
  static double N1ffaf86472(Object []i) {
    double p = Double.NaN;
    /* knownWordsCount */
    if (i[44] == null) {
      p = 0.057692307692307696;
    } else if (((Double)i[44]).doubleValue() < 1.5) {
      p = 1.0;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N6574a52c473(Object []i) {
    double p = Double.NaN;
    /* datatype */
    if (i[18] == null) {
      p = 0.5064641241111829;
    } else if (((Double)i[18]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N6c1a5b54474(i);
    } else if (true) {
    p = WekaStringREPTree.N5ab956d7490(i);
    } 
    return p;
  }
  static double N6c1a5b54474(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.6245915032679739;
    } else if (((Double)i[43]).doubleValue() < 0.8333333333333333) {
      p = 0.9932432432432432;
    } else if (true) {
    p = WekaStringREPTree.N1c7696c6475(i);
    } 
    return p;
  }
  static double N1c7696c6475(Object []i) {
    double p = Double.NaN;
    /* date */
    if (i[17] == null) {
      p = 0.6008695652173913;
    } else if (((Double)i[17]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N60099951476(i);
    } else if (true) {
    p = WekaStringREPTree.N55a147cc482(i);
    } 
    return p;
  }
  static double N60099951476(Object []i) {
    double p = Double.NaN;
    /* nonVocals */
    if (i[34] == null) {
      p = 0.7151515151515152;
    } else if (((Double)i[34]).doubleValue() < 0.41666666666666663) {
    p = WekaStringREPTree.N20140db9477(i);
    } else if (true) {
    p = WekaStringREPTree.N1a942c18481(i);
    } 
    return p;
  }
  static double N20140db9477(Object []i) {
    double p = Double.NaN;
    /* vocals */
    if (i[33] == null) {
      p = 0.7742448330683624;
    } else if (((Double)i[33]).doubleValue() < 0.29166666666666663) {
    p = WekaStringREPTree.N1e6a3214478(i);
    } else if (true) {
    p = WekaStringREPTree.N1a6d8329480(i);
    } 
    return p;
  }
  static double N1e6a3214478(Object []i) {
    double p = Double.NaN;
    /* crypto */
    if (i[19] == null) {
      p = 0.8048289738430584;
    } else if (((Double)i[19]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N368247b9479(i);
    } else if (true) {
      p = 0.25;
    } 
    return p;
  }
  static double N368247b9479(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.8093306288032455;
    } else if (((Double)i[31]).doubleValue() < 0.8333333333333333) {
      p = 0.8045738045738046;
    } else if (true) {
      p = 1.0;
    } 
    return p;
  }
  static double N1a6d8329480(Object []i) {
    double p = Double.NaN;
    /* strLen */
    if (i[28] == null) {
      p = 0.6590909090909091;
    } else if (((Double)i[28]).doubleValue() < 3.5) {
      p = 0.5882352941176471;
    } else if (true) {
      p = 0.9;
    } 
    return p;
  }
  static double N1a942c18481(Object []i) {
    double p = Double.NaN;
    /* brand */
    if (i[20] == null) {
      p = 0.6121883656509696;
    } else if (((Double)i[20]).doubleValue() < 0.5) {
      p = 0.6155988857938719;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N55a147cc482(Object []i) {
    double p = Double.NaN;
    /* nonVocals */
    if (i[34] == null) {
      p = 0.5145038167938931;
    } else if (((Double)i[34]).doubleValue() < 0.29166666666666663) {
    p = WekaStringREPTree.N71ba6d4e483(i);
    } else if (true) {
    p = WekaStringREPTree.N4145bad8487(i);
    } 
    return p;
  }
  static double N71ba6d4e483(Object []i) {
    double p = Double.NaN;
    /* classpath */
    if (i[11] == null) {
      p = 0.6125166444740346;
    } else if (((Double)i[11]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N738dc9b484(i);
    } else if (true) {
      p = 0.20689655172413793;
    } 
    return p;
  }
  static double N738dc9b484(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.628808864265928;
    } else if (((Double)i[37]).doubleValue() < 1.5) {
    p = WekaStringREPTree.N3c77d488485(i);
    } else if (true) {
    p = WekaStringREPTree.N63376bed486(i);
    } 
    return p;
  }
  static double N3c77d488485(Object []i) {
    double p = Double.NaN;
    /* pluses */
    if (i[41] == null) {
      p = 0.5273775216138329;
    } else if (((Double)i[41]).doubleValue() < 0.5) {
      p = 0.559375;
    } else if (true) {
      p = 0.14814814814814814;
    } 
    return p;
  }
  static double N63376bed486(Object []i) {
    double p = Double.NaN;
    /* slashes */
    if (i[40] == null) {
      p = 0.7226666666666667;
    } else if (((Double)i[40]).doubleValue() < 0.5) {
      p = 0.7436619718309859;
    } else if (true) {
      p = 0.35;
    } 
    return p;
  }
  static double N4145bad8487(Object []i) {
    double p = Double.NaN;
    /* knownWordsCount */
    if (i[44] == null) {
      p = 0.3828264758497317;
    } else if (((Double)i[44]).doubleValue() < 3.5) {
    p = WekaStringREPTree.Nd86a6f488(i);
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double Nd86a6f488(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.4115384615384615;
    } else if (((Double)i[51]).doubleValue() < 0.8397435897435898) {
      p = 0.627906976744186;
    } else if (true) {
    p = WekaStringREPTree.N2892d68489(i);
    } 
    return p;
  }
  static double N2892d68489(Object []i) {
    double p = Double.NaN;
    /* strLen */
    if (i[28] == null) {
      p = 0.3920335429769392;
    } else if (((Double)i[28]).doubleValue() < 3.5) {
      p = 0.4298850574712644;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N5ab956d7490(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.058823529411764705;
    } else if (((Double)i[31]).doubleValue() < 0.8333333333333333) {
    p = WekaStringREPTree.N3646a422491(i);
    } else if (true) {
      p = 0.04709576138147567;
    } 
    return p;
  }
  static double N3646a422491(Object []i) {
    double p = Double.NaN;
    /* date */
    if (i[17] == null) {
      p = 0.8888888888888888;
    } else if (((Double)i[17]).doubleValue() < 0.5) {
      p = 1.0;
    } else if (true) {
      p = 0.75;
    } 
    return p;
  }
  static double N750e2b97492(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.4221294363256785;
    } else if (((Double)i[51]).doubleValue() < 0.8366666666666667) {
    p = WekaStringREPTree.N3e27aa33493(i);
    } else if (true) {
      p = 0.034482758620689655;
    } 
    return p;
  }
  static double N3e27aa33493(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.4471111111111111;
    } else if (((Double)i[43]).doubleValue() < 0.875) {
      p = 0.9895470383275261;
    } else if (true) {
    p = WekaStringREPTree.N2e385cce494(i);
    } 
    return p;
  }
  static double N2e385cce494(Object []i) {
    double p = Double.NaN;
    /* vocals */
    if (i[33] == null) {
      p = 0.4101590315689532;
    } else if (((Double)i[33]).doubleValue() < 0.125) {
    p = WekaStringREPTree.N2ddc9a9f495(i);
    } else if (true) {
    p = WekaStringREPTree.N740cae06500(i);
    } 
    return p;
  }
  static double N2ddc9a9f495(Object []i) {
    double p = Double.NaN;
    /* regex */
    if (i[3] == null) {
      p = 0.6050156739811913;
    } else if (((Double)i[3]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N298a5e20496(i);
    } else if (true) {
      p = 0.10273972602739725;
    } 
    return p;
  }
  static double N298a5e20496(Object []i) {
    double p = Double.NaN;
    /* slashes */
    if (i[40] == null) {
      p = 0.6699115044247788;
    } else if (((Double)i[40]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N2a7f1f10497(i);
    } else if (true) {
      p = 0.21951219512195122;
    } 
    return p;
  }
  static double N2a7f1f10497(Object []i) {
    double p = Double.NaN;
    /* commands */
    if (i[5] == null) {
      p = 0.6868686868686869;
    } else if (((Double)i[5]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N46cdf8bd498(i);
    } else if (true) {
      p = 0.08;
    } 
    return p;
  }
  static double N46cdf8bd498(Object []i) {
    double p = Double.NaN;
    /* dashes */
    if (i[39] == null) {
      p = 0.7011278195488722;
    } else if (((Double)i[39]).doubleValue() < 0.5) {
    p = WekaStringREPTree.Nf0c8a99499(i);
    } else if (true) {
      p = 0.3225806451612903;
    } 
    return p;
  }
  static double Nf0c8a99499(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.712487899322362;
    } else if (((Double)i[37]).doubleValue() < 1.5) {
      p = 0.6729986431478969;
    } else if (true) {
      p = 0.8108108108108109;
    } 
    return p;
  }
  static double N740cae06500(Object []i) {
    double p = Double.NaN;
    /* regex */
    if (i[3] == null) {
      p = 0.3255022131426626;
    } else if (((Double)i[3]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N26d9b808501(i);
    } else if (true) {
      p = 0.09268292682926829;
    } 
    return p;
  }
  static double N26d9b808501(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.34297218155197656;
    } else if (((Double)i[37]).doubleValue() < 1.5) {
    p = WekaStringREPTree.Nf78a47e502(i);
    } else if (true) {
    p = WekaStringREPTree.N11392934509(i);
    } 
    return p;
  }
  static double Nf78a47e502(Object []i) {
    double p = Double.NaN;
    /* digits */
    if (i[32] == null) {
      p = 0.2850658193372674;
    } else if (((Double)i[32]).doubleValue() < 0.125) {
    p = WekaStringREPTree.N644baf4a503(i);
    } else if (true) {
    p = WekaStringREPTree.N54c5a2ff506(i);
    } 
    return p;
  }
  static double N644baf4a503(Object []i) {
    double p = Double.NaN;
    /* equals */
    if (i[38] == null) {
      p = 0.2509578544061303;
    } else if (((Double)i[38]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N7526515b504(i);
    } else if (true) {
    p = WekaStringREPTree.N1ed4ae0f505(i);
    } 
    return p;
  }
  static double N7526515b504(Object []i) {
    double p = Double.NaN;
    /* commands */
    if (i[5] == null) {
      p = 0.2623394185260311;
    } else if (((Double)i[5]).doubleValue() < 0.5) {
      p = 0.2778977681785457;
    } else if (true) {
      p = 0.022222222222222223;
    } 
    return p;
  }
  static double N1ed4ae0f505(Object []i) {
    double p = Double.NaN;
    /* vocals */
    if (i[33] == null) {
      p = 0.05747126436781609;
    } else if (((Double)i[33]).doubleValue() < 0.375) {
      p = 0.04054054054054054;
    } else if (true) {
      p = 0.15384615384615385;
    } 
    return p;
  }
  static double N54c5a2ff506(Object []i) {
    double p = Double.NaN;
    /* vocals */
    if (i[33] == null) {
      p = 0.36891679748822603;
    } else if (((Double)i[33]).doubleValue() < 0.375) {
    p = WekaStringREPTree.N6d4d66d2507(i);
    } else if (true) {
    p = WekaStringREPTree.N2a265ea9508(i);
    } 
    return p;
  }
  static double N6d4d66d2507(Object []i) {
    double p = Double.NaN;
    /* crypto */
    if (i[19] == null) {
      p = 0.3180147058823529;
    } else if (((Double)i[19]).doubleValue() < 0.5) {
      p = 0.3320388349514563;
    } else if (true) {
      p = 0.06896551724137931;
    } 
    return p;
  }
  static double N2a265ea9508(Object []i) {
    double p = Double.NaN;
    /* brand */
    if (i[20] == null) {
      p = 0.6666666666666666;
    } else if (((Double)i[20]).doubleValue() < 0.5) {
      p = 0.7380952380952381;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N11392934509(Object []i) {
    double p = Double.NaN;
    /* xml */
    if (i[0] == null) {
      p = 0.5841209829867675;
    } else if (((Double)i[0]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N6892b3b6510(i);
    } else if (true) {
    p = WekaStringREPTree.N76a4ebf2512(i);
    } 
    return p;
  }
  static double N6892b3b6510(Object []i) {
    double p = Double.NaN;
    /* commands */
    if (i[5] == null) {
      p = 0.6338912133891214;
    } else if (((Double)i[5]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N6e6f2380511(i);
    } else if (true) {
      p = 0.05263157894736842;
    } 
    return p;
  }
  static double N6e6f2380511(Object []i) {
    double p = Double.NaN;
    /* specialChars */
    if (i[21] == null) {
      p = 0.6579520697167756;
    } else if (((Double)i[21]).doubleValue() < 0.5) {
      p = 0.6696230598669624;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N76a4ebf2512(Object []i) {
    double p = Double.NaN;
    /* commands */
    if (i[5] == null) {
      p = 0.11764705882352941;
    } else if (((Double)i[5]).doubleValue() < 0.5) {
      p = 0.13636363636363635;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N2e8c1c9b513(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.2812401138880101;
    } else if (((Double)i[43]).doubleValue() < 0.5833333333333333) {
    p = WekaStringREPTree.N53fe15ff514(i);
    } else if (true) {
    p = WekaStringREPTree.N33065d67569(i);
    } 
    return p;
  }
  static double N53fe15ff514(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.47349125775521717;
    } else if (((Double)i[37]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N449a4f23515(i);
    } else if (true) {
    p = WekaStringREPTree.N75d3a5e0552(i);
    } 
    return p;
  }
  static double N449a4f23515(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.37412858249419056;
    } else if (((Double)i[51]).doubleValue() < 0.9183333333333333) {
    p = WekaStringREPTree.N1530c739516(i);
    } else if (true) {
    p = WekaStringREPTree.N3b0fe47a546(i);
    } 
    return p;
  }
  static double N1530c739516(Object []i) {
    double p = Double.NaN;
    /* stackHeuristic */
    if (i[48] == null) {
      p = 0.4149816176470588;
    } else if (((Double)i[48]).doubleValue() < -0.1073078062302856) {
    p = WekaStringREPTree.N5b1669c0517(i);
    } else if (true) {
    p = WekaStringREPTree.N173ed316529(i);
    } 
    return p;
  }
  static double N5b1669c0517(Object []i) {
    double p = Double.NaN;
    /* digits */
    if (i[32] == null) {
      p = 0.12138728323699421;
    } else if (((Double)i[32]).doubleValue() < 0.125) {
    p = WekaStringREPTree.N78e4deb0518(i);
    } else if (true) {
      p = 1.0;
    } 
    return p;
  }
  static double N78e4deb0518(Object []i) {
    double p = Double.NaN;
    /* chiSquare2eqDist */
    if (i[49] == null) {
      p = 0.1111111111111111;
    } else if (((Double)i[49]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N6e9175d8519(i);
    } else if (true) {
    p = WekaStringREPTree.N2cf3d63b526(i);
    } 
    return p;
  }
  static double N6e9175d8519(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.07641196013289037;
    } else if (((Double)i[31]).doubleValue() < 0.375) {
    p = WekaStringREPTree.N7d0b7e3c520(i);
    } else if (true) {
    p = WekaStringREPTree.N2eae8e6e523(i);
    } 
    return p;
  }
  static double N7d0b7e3c520(Object []i) {
    double p = Double.NaN;
    /* maxRepChars */
    if (i[35] == null) {
      p = 0.05472636815920398;
    } else if (((Double)i[35]).doubleValue() < 1.5) {
    p = WekaStringREPTree.N15bb5034521(i);
    } else if (true) {
      p = 0.5;
    } 
    return p;
  }
  static double N15bb5034521(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.05025125628140704;
    } else if (((Double)i[43]).doubleValue() < 0.29166666666666663) {
      p = 0.07017543859649122;
    } else if (true) {
    p = WekaStringREPTree.N4b741d6d522(i);
    } 
    return p;
  }
  static double N4b741d6d522(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.023529411764705882;
    } else if (((Double)i[51]).doubleValue() < 0.8748778103616813) {
      p = 0.0;
    } else if (true) {
      p = 0.029411764705882353;
    } 
    return p;
  }
  static double N2eae8e6e523(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.12;
    } else if (((Double)i[43]).doubleValue() < 0.125) {
    p = WekaStringREPTree.N8f2ef19524(i);
    } else if (true) {
      p = 0.06521739130434782;
    } 
    return p;
  }
  static double N8f2ef19524(Object []i) {
    double p = Double.NaN;
    /* strLen */
    if (i[28] == null) {
      p = 0.16666666666666666;
    } else if (((Double)i[28]).doubleValue() < 3.5) {
    p = WekaStringREPTree.N470734c3525(i);
    } else if (true) {
      p = 0.5;
    } 
    return p;
  }
  static double N470734c3525(Object []i) {
    double p = Double.NaN;
    /* strLen */
    if (i[28] == null) {
      p = 0.07142857142857142;
    } else if (((Double)i[28]).doubleValue() < 2.5) {
      p = 0.05263157894736842;
    } else if (true) {
      p = 0.25;
    } 
    return p;
  }
  static double N2cf3d63b526(Object []i) {
    double p = Double.NaN;
    /* maxRepChars */
    if (i[35] == null) {
      p = 0.36585365853658536;
    } else if (((Double)i[35]).doubleValue() < 1.5) {
    p = WekaStringREPTree.N7674f035527(i);
    } else if (true) {
      p = 0.625;
    } 
    return p;
  }
  static double N7674f035527(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.2;
    } else if (((Double)i[51]).doubleValue() < 0.8844444444444444) {
    p = WekaStringREPTree.N69e153c5528(i);
    } else if (true) {
      p = 0.125;
    } 
    return p;
  }
  static double N69e153c5528(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.23529411764705882;
    } else if (((Double)i[51]).doubleValue() < 0.8775) {
      p = 0.0;
    } else if (true) {
      p = 0.3076923076923077;
    } 
    return p;
  }
  static double N173ed316529(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.4704918032786885;
    } else if (((Double)i[51]).doubleValue() < 0.8775) {
    p = WekaStringREPTree.N25ce9dc4530(i);
    } else if (true) {
    p = WekaStringREPTree.N17f62e33532(i);
    } 
    return p;
  }
  static double N25ce9dc4530(Object []i) {
    double p = Double.NaN;
    /* regex */
    if (i[3] == null) {
      p = 0.8289473684210527;
    } else if (((Double)i[3]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N74ea2410531(i);
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N74ea2410531(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.8513513513513513;
    } else if (((Double)i[31]).doubleValue() < 0.8333333333333333) {
      p = 1.0;
    } else if (true) {
      p = 0.7608695652173914;
    } 
    return p;
  }
  static double N17f62e33532(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.4549600912200684;
    } else if (((Double)i[31]).doubleValue() < 0.41666666666666663) {
    p = WekaStringREPTree.N76b1e9b8533(i);
    } else if (true) {
    p = WekaStringREPTree.N5d0bf09b537(i);
    } 
    return p;
  }
  static double N76b1e9b8533(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.19117647058823528;
    } else if (((Double)i[51]).doubleValue() < 0.8867521367521367) {
      p = 0.6956521739130435;
    } else if (true) {
    p = WekaStringREPTree.N27406a17534(i);
    } 
    return p;
  }
  static double N27406a17534(Object []i) {
    double p = Double.NaN;
    /* digits */
    if (i[32] == null) {
      p = 0.08849557522123894;
    } else if (((Double)i[32]).doubleValue() < 0.16666666666666666) {
    p = WekaStringREPTree.N2af004b535(i);
    } else if (true) {
      p = 1.0;
    } 
    return p;
  }
  static double N2af004b535(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.046296296296296294;
    } else if (((Double)i[43]).doubleValue() < 0.16666666666666666) {
    p = WekaStringREPTree.N248e319b536(i);
    } else if (true) {
      p = 0.02564102564102564;
    } 
    return p;
  }
  static double N248e319b536(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.1;
    } else if (((Double)i[51]).doubleValue() < 0.8982758620689655) {
      p = 0.0;
    } else if (true) {
      p = 0.17647058823529413;
    } 
    return p;
  }
  static double N5d0bf09b537(Object []i) {
    double p = Double.NaN;
    /* equals */
    if (i[38] == null) {
      p = 0.47713226205191595;
    } else if (((Double)i[38]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N793f29ff538(i);
    } else if (true) {
    p = WekaStringREPTree.N117159c0543(i);
    } 
    return p;
  }
  static double N793f29ff538(Object []i) {
    double p = Double.NaN;
    /* date */
    if (i[17] == null) {
      p = 0.4861913937058446;
    } else if (((Double)i[17]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N3e8c3cb539(i);
    } else if (true) {
    p = WekaStringREPTree.N563f38c4540(i);
    } 
    return p;
  }
  static double N3e8c3cb539(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.125;
    } else if (((Double)i[51]).doubleValue() < 0.9110671936758894) {
      p = 0.08;
    } else if (true) {
      p = 0.5;
    } 
    return p;
  }
  static double N563f38c4540(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.4996668887408394;
    } else if (((Double)i[31]).doubleValue() < 0.5833333333333333) {
    p = WekaStringREPTree.N543295b0541(i);
    } else if (true) {
    p = WekaStringREPTree.N54422e18542(i);
    } 
    return p;
  }
  static double N543295b0541(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.600896860986547;
    } else if (((Double)i[51]).doubleValue() < 0.9148550724637681) {
      p = 0.9387755102040817;
    } else if (true) {
      p = 0.5057471264367817;
    } 
    return p;
  }
  static double N54422e18542(Object []i) {
    double p = Double.NaN;
    /* slashes */
    if (i[40] == null) {
      p = 0.48200312989045385;
    } else if (((Double)i[40]).doubleValue() < 0.5) {
      p = 0.49385749385749383;
    } else if (true) {
      p = 0.22807017543859648;
    } 
    return p;
  }
  static double N117159c0543(Object []i) {
    double p = Double.NaN;
    /* strLen */
    if (i[28] == null) {
      p = 0.2459016393442623;
    } else if (((Double)i[28]).doubleValue() < 2.5) {
    p = WekaStringREPTree.N3e27ba32544(i);
    } else if (true) {
      p = 0.3333333333333333;
    } 
    return p;
  }
  static double N3e27ba32544(Object []i) {
    double p = Double.NaN;
    /* regex */
    if (i[3] == null) {
      p = 0.2413793103448276;
    } else if (((Double)i[3]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N7ef82753545(i);
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N7ef82753545(Object []i) {
    double p = Double.NaN;
    /* date */
    if (i[17] == null) {
      p = 0.25;
    } else if (((Double)i[17]).doubleValue() < 0.5) {
      p = 0.0;
    } else if (true) {
      p = 0.25925925925925924;
    } 
    return p;
  }
  static double N3b0fe47a546(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.15517241379310345;
    } else if (((Double)i[43]).doubleValue() < 0.25) {
    p = WekaStringREPTree.N202b0582547(i);
    } else if (true) {
    p = WekaStringREPTree.N58cbafc2550(i);
    } 
    return p;
  }
  static double N202b0582547(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.11447811447811448;
    } else if (((Double)i[31]).doubleValue() < 0.75) {
      p = 0.5;
    } else if (true) {
    p = WekaStringREPTree.N235ecd9f548(i);
    } 
    return p;
  }
  static double N235ecd9f548(Object []i) {
    double p = Double.NaN;
    /* setDist */
    if (i[29] == null) {
      p = 0.10652920962199312;
    } else if (((Double)i[29]).doubleValue() < 0.75) {
      p = 0.15714285714285714;
    } else if (true) {
    p = WekaStringREPTree.N1ca3b418549(i);
    } 
    return p;
  }
  static double N1ca3b418549(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.09049773755656108;
    } else if (((Double)i[51]).doubleValue() < 0.9534632034632035) {
      p = 0.015384615384615385;
    } else if (true) {
      p = 0.12179487179487179;
    } 
    return p;
  }
  static double N58cbafc2550(Object []i) {
    double p = Double.NaN;
    /* digits */
    if (i[32] == null) {
      p = 0.26605504587155965;
    } else if (((Double)i[32]).doubleValue() < 0.25) {
    p = WekaStringREPTree.N2034b64c551(i);
    } else if (true) {
      p = 1.0;
    } 
    return p;
  }
  static double N2034b64c551(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.24528301886792453;
    } else if (((Double)i[51]).doubleValue() < 0.9215384615384616) {
      p = 0.09523809523809523;
    } else if (true) {
      p = 0.2823529411764706;
    } 
    return p;
  }
  static double N75d3a5e0552(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.7396265560165975;
    } else if (((Double)i[51]).doubleValue() < 0.9110671936758894) {
    p = WekaStringREPTree.N74d1dc36553(i);
    } else if (true) {
    p = WekaStringREPTree.N53fb3dab567(i);
    } 
    return p;
  }
  static double N74d1dc36553(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.8187660668380463;
    } else if (((Double)i[43]).doubleValue() < 0.29166666666666663) {
    p = WekaStringREPTree.N7161d8d1554(i);
    } else if (true) {
    p = WekaStringREPTree.N19e4653c558(i);
    } 
    return p;
  }
  static double N7161d8d1554(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.27184466019417475;
    } else if (((Double)i[37]).doubleValue() < 2.5) {
    p = WekaStringREPTree.N74e28667555(i);
    } else if (true) {
      p = 1.0;
    } 
    return p;
  }
  static double N74e28667555(Object []i) {
    double p = Double.NaN;
    /* date */
    if (i[17] == null) {
      p = 0.23469387755102042;
    } else if (((Double)i[17]).doubleValue() < 0.5) {
      p = 0.6;
    } else if (true) {
    p = WekaStringREPTree.N1cf6d1be556(i);
    } 
    return p;
  }
  static double N1cf6d1be556(Object []i) {
    double p = Double.NaN;
    /* dashes */
    if (i[39] == null) {
      p = 0.21505376344086022;
    } else if (((Double)i[39]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N663c9e7a557(i);
    } else if (true) {
      p = 0.14814814814814814;
    } 
    return p;
  }
  static double N663c9e7a557(Object []i) {
    double p = Double.NaN;
    /* stackHeuristic */
    if (i[48] == null) {
      p = 0.3076923076923077;
    } else if (((Double)i[48]).doubleValue() < -0.1073078062302856) {
      p = 0.0;
    } else if (true) {
      p = 0.3333333333333333;
    } 
    return p;
  }
  static double N19e4653c558(Object []i) {
    double p = Double.NaN;
    /* strLen */
    if (i[28] == null) {
      p = 0.9022222222222223;
    } else if (((Double)i[28]).doubleValue() < 2.5) {
    p = WekaStringREPTree.N795509d9559(i);
    } else if (true) {
    p = WekaStringREPTree.N4be29ed9564(i);
    } 
    return p;
  }
  static double N795509d9559(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.9422718808193669;
    } else if (((Double)i[37]).doubleValue() < 1.5) {
    p = WekaStringREPTree.N53045c6c560(i);
    } else if (true) {
    p = WekaStringREPTree.N5149d738561(i);
    } 
    return p;
  }
  static double N53045c6c560(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.9916317991631799;
    } else if (((Double)i[31]).doubleValue() < 0.75) {
      p = 1.0;
    } else if (true) {
      p = 0.9473684210526315;
    } 
    return p;
  }
  static double N5149d738561(Object []i) {
    double p = Double.NaN;
    /* nonVocals */
    if (i[34] == null) {
      p = 0.9026845637583892;
    } else if (((Double)i[34]).doubleValue() < 0.25) {
      p = 0.8490566037735849;
    } else if (true) {
    p = WekaStringREPTree.N6bbe85a8562(i);
    } 
    return p;
  }
  static double N6bbe85a8562(Object []i) {
    double p = Double.NaN;
    /* commands */
    if (i[5] == null) {
      p = 0.9322916666666666;
    } else if (((Double)i[5]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N3a7442c7563(i);
    } else if (true) {
      p = 1.0;
    } 
    return p;
  }
  static double N3a7442c7563(Object []i) {
    double p = Double.NaN;
    /* date */
    if (i[17] == null) {
      p = 0.9289617486338798;
    } else if (((Double)i[17]).doubleValue() < 0.5) {
      p = 0.9404761904761905;
    } else if (true) {
      p = 0.9191919191919192;
    } 
    return p;
  }
  static double N4be29ed9564(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.7463768115942029;
    } else if (((Double)i[51]).doubleValue() < 0.8775) {
      p = 0.8421052631578947;
    } else if (true) {
    p = WekaStringREPTree.N548d708a565(i);
    } 
    return p;
  }
  static double N548d708a565(Object []i) {
    double p = Double.NaN;
    /* date */
    if (i[17] == null) {
      p = 0.5348837209302325;
    } else if (((Double)i[17]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N4b013c76566(i);
    } else if (true) {
      p = 0.6;
    } 
    return p;
  }
  static double N4b013c76566(Object []i) {
    double p = Double.NaN;
    /* commands */
    if (i[5] == null) {
      p = 0.38461538461538464;
    } else if (((Double)i[5]).doubleValue() < 0.5) {
      p = 0.2;
    } else if (true) {
      p = 1.0;
    } 
    return p;
  }
  static double N53fb3dab567(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.40860215053763443;
    } else if (((Double)i[37]).doubleValue() < 1.5) {
    p = WekaStringREPTree.Ncb0755b568(i);
    } else if (true) {
      p = 0.6229508196721312;
    } 
    return p;
  }
  static double Ncb0755b568(Object []i) {
    double p = Double.NaN;
    /* digits */
    if (i[32] == null) {
      p = 0.304;
    } else if (((Double)i[32]).doubleValue() < 0.25) {
      p = 0.25;
    } else if (true) {
      p = 0.52;
    } 
    return p;
  }
  static double N33065d67569(Object []i) {
    double p = Double.NaN;
    /* maxLenKnownWord */
    if (i[47] == null) {
      p = 0.1664140138116894;
    } else if (((Double)i[47]).doubleValue() < 1.5) {
    p = WekaStringREPTree.N712625fd570(i);
    } else if (true) {
    p = WekaStringREPTree.N2cb4893b604(i);
    } 
    return p;
  }
  static double N712625fd570(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.20030218001295058;
    } else if (((Double)i[43]).doubleValue() < 0.7083333333333333) {
    p = WekaStringREPTree.N7bba5817571(i);
    } else if (true) {
    p = WekaStringREPTree.N4c60d6e9579(i);
    } 
    return p;
  }
  static double N7bba5817571(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.4377224199288256;
    } else if (((Double)i[51]).doubleValue() < 0.8947044334975369) {
    p = WekaStringREPTree.N742ff096572(i);
    } else if (true) {
      p = 0.12195121951219512;
    } 
    return p;
  }
  static double N742ff096572(Object []i) {
    double p = Double.NaN;
    /* nonVocals */
    if (i[34] == null) {
      p = 0.5678391959798995;
    } else if (((Double)i[34]).doubleValue() < 0.16666666666666666) {
      p = 0.2765957446808511;
    } else if (true) {
    p = WekaStringREPTree.N75437611573(i);
    } 
    return p;
  }
  static double N75437611573(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.6578947368421053;
    } else if (((Double)i[37]).doubleValue() < 1.5) {
    p = WekaStringREPTree.N350aac89574(i);
    } else if (true) {
    p = WekaStringREPTree.N196a42c3578(i);
    } 
    return p;
  }
  static double N350aac89574(Object []i) {
    double p = Double.NaN;
    /* strLen */
    if (i[28] == null) {
      p = 0.7247706422018348;
    } else if (((Double)i[28]).doubleValue() < 3.5) {
    p = WekaStringREPTree.N1c5920df575(i);
    } else if (true) {
      p = 0.09090909090909091;
    } 
    return p;
  }
  static double N1c5920df575(Object []i) {
    double p = Double.NaN;
    /* digits */
    if (i[32] == null) {
      p = 0.7959183673469388;
    } else if (((Double)i[32]).doubleValue() < 0.16666666666666666) {
    p = WekaStringREPTree.N17f9d882576(i);
    } else if (true) {
      p = 1.0;
    } 
    return p;
  }
  static double N17f9d882576(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.6825396825396826;
    } else if (((Double)i[31]).doubleValue() < 0.5) {
      p = 0.8518518518518519;
    } else if (true) {
    p = WekaStringREPTree.N79e4c792577(i);
    } 
    return p;
  }
  static double N79e4c792577(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.5555555555555556;
    } else if (((Double)i[37]).doubleValue() < 0.5) {
      p = 0.48148148148148145;
    } else if (true) {
      p = 0.7777777777777778;
    } 
    return p;
  }
  static double N196a42c3578(Object []i) {
    double p = Double.NaN;
    /* simpleSplitWordLen */
    if (i[36] == null) {
      p = 0.4883720930232558;
    } else if (((Double)i[36]).doubleValue() < 2.5) {
      p = 1.0;
    } else if (true) {
      p = 0.37142857142857144;
    } 
    return p;
  }
  static double N4c60d6e9579(Object []i) {
    double p = Double.NaN;
    /* knownWordsCount */
    if (i[44] == null) {
      p = 0.18497242647058823;
    } else if (((Double)i[44]).doubleValue() < 1.5) {
    p = WekaStringREPTree.N15043a2f580(i);
    } else if (true) {
    p = WekaStringREPTree.N5f049ea1592(i);
    } 
    return p;
  }
  static double N15043a2f580(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.2582137899120777;
    } else if (((Double)i[51]).doubleValue() < 0.8775) {
      p = 0.8205128205128205;
    } else if (true) {
    p = WekaStringREPTree.N4a83a74a581(i);
    } 
    return p;
  }
  static double N4a83a74a581(Object []i) {
    double p = Double.NaN;
    /* nonVocals */
    if (i[34] == null) {
      p = 0.2478793590951932;
    } else if (((Double)i[34]).doubleValue() < 0.41666666666666663) {
    p = WekaStringREPTree.N1349883582(i);
    } else if (true) {
    p = WekaStringREPTree.N35dab4eb588(i);
    } 
    return p;
  }
  static double N1349883582(Object []i) {
    double p = Double.NaN;
    /* setDist */
    if (i[29] == null) {
      p = 0.20293724966622162;
    } else if (((Double)i[29]).doubleValue() < 0.75) {
    p = WekaStringREPTree.N4b29d1d2583(i);
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N4b29d1d2583(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.21745350500715308;
    } else if (((Double)i[31]).doubleValue() < 0.8333333333333333) {
    p = WekaStringREPTree.N7f485fda584(i);
    } else if (true) {
    p = WekaStringREPTree.Nd737b89586(i);
    } 
    return p;
  }
  static double N7f485fda584(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.15844155844155844;
    } else if (((Double)i[37]).doubleValue() < 1.5) {
    p = WekaStringREPTree.N28261e8e585(i);
    } else if (true) {
      p = 0.12435233160621761;
    } 
    return p;
  }
  static double N28261e8e585(Object []i) {
    double p = Double.NaN;
    /* strLen */
    if (i[28] == null) {
      p = 0.19270833333333334;
    } else if (((Double)i[28]).doubleValue() < 2.5) {
      p = 0.2595419847328244;
    } else if (true) {
      p = 0.04918032786885246;
    } 
    return p;
  }
  static double Nd737b89586(Object []i) {
    double p = Double.NaN;
    /* datatype */
    if (i[18] == null) {
      p = 0.2898089171974522;
    } else if (((Double)i[18]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N8519cb4587(i);
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N8519cb4587(Object []i) {
    double p = Double.NaN;
    /* regex */
    if (i[3] == null) {
      p = 0.3204225352112676;
    } else if (((Double)i[3]).doubleValue() < 0.5) {
      p = 0.30824372759856633;
    } else if (true) {
      p = 1.0;
    } 
    return p;
  }
  static double N35dab4eb588(Object []i) {
    double p = Double.NaN;
    /* xml */
    if (i[0] == null) {
      p = 0.27239621267297887;
    } else if (((Double)i[0]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N2d901eb0589(i);
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N2d901eb0589(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.27827380952380953;
    } else if (((Double)i[37]).doubleValue() < 1.5) {
    p = WekaStringREPTree.N3ba987b8590(i);
    } else if (true) {
      p = 0.23629489603024575;
    } 
    return p;
  }
  static double N3ba987b8590(Object []i) {
    double p = Double.NaN;
    /* dashes */
    if (i[39] == null) {
      p = 0.30552147239263805;
    } else if (((Double)i[39]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N3f191845591(i);
    } else if (true) {
      p = 0.13793103448275862;
    } 
    return p;
  }
  static double N3f191845591(Object []i) {
    double p = Double.NaN;
    /* equals */
    if (i[38] == null) {
      p = 0.31836195508586523;
    } else if (((Double)i[38]).doubleValue() < 0.5) {
      p = 0.3278463648834019;
    } else if (true) {
      p = 0.07142857142857142;
    } 
    return p;
  }
  static double N5f049ea1592(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.11273391145595618;
    } else if (((Double)i[51]).doubleValue() < 0.8768939393939394) {
      p = 0.2642857142857143;
    } else if (true) {
    p = WekaStringREPTree.N72cc7e6f593(i);
    } 
    return p;
  }
  static double N72cc7e6f593(Object []i) {
    double p = Double.NaN;
    /* digits */
    if (i[32] == null) {
      p = 0.10238907849829351;
    } else if (((Double)i[32]).doubleValue() < 0.5833333333333333) {
    p = WekaStringREPTree.N5afa3c9594(i);
    } else if (true) {
      p = 0.007874015748031496;
    } 
    return p;
  }
  static double N5afa3c9594(Object []i) {
    double p = Double.NaN;
    /* digits */
    if (i[32] == null) {
      p = 0.11574846967167501;
    } else if (((Double)i[32]).doubleValue() < 0.41666666666666663) {
    p = WekaStringREPTree.N72035809595(i);
    } else if (true) {
    p = WekaStringREPTree.N68c9133c601(i);
    } 
    return p;
  }
  static double N72035809595(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.07664233576642336;
    } else if (((Double)i[51]).doubleValue() < 0.8867521367521367) {
    p = WekaStringREPTree.N909217e596(i);
    } else if (true) {
    p = WekaStringREPTree.N8458f04599(i);
    } 
    return p;
  }
  static double N909217e596(Object []i) {
    double p = Double.NaN;
    /* date */
    if (i[17] == null) {
      p = 0.14184397163120568;
    } else if (((Double)i[17]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N18271936597(i);
    } else if (true) {
    p = WekaStringREPTree.N606e4010598(i);
    } 
    return p;
  }
  static double N18271936597(Object []i) {
    double p = Double.NaN;
    /* knownWordsCount */
    if (i[44] == null) {
      p = 0.39285714285714285;
    } else if (((Double)i[44]).doubleValue() < 2.5) {
      p = 0.9;
    } else if (true) {
      p = 0.1111111111111111;
    } 
    return p;
  }
  static double N606e4010598(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.1141732283464567;
    } else if (((Double)i[51]).doubleValue() < 0.8823076923076922) {
      p = 0.06829268292682927;
    } else if (true) {
      p = 0.30612244897959184;
    } 
    return p;
  }
  static double N8458f04599(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.05405405405405406;
    } else if (((Double)i[51]).doubleValue() < 0.9198717948717949) {
    p = WekaStringREPTree.N48075da3600(i);
    } else if (true) {
      p = 0.006734006734006734;
    } 
    return p;
  }
  static double N48075da3600(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.08123791102514506;
    } else if (((Double)i[51]).doubleValue() < 0.9148550724637681) {
      p = 0.05221932114882506;
    } else if (true) {
      p = 0.16417910447761194;
    } 
    return p;
  }
  static double N68c9133c601(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.1768901569186876;
    } else if (((Double)i[37]).doubleValue() < 0.5) {
      p = 0.8095238095238095;
    } else if (true) {
    p = WekaStringREPTree.N7a35b0f5602(i);
    } 
    return p;
  }
  static double N7a35b0f5602(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.15735294117647058;
    } else if (((Double)i[37]).doubleValue() < 1.5) {
    p = WekaStringREPTree.N5e2c3d18603(i);
    } else if (true) {
      p = 0.375;
    } 
    return p;
  }
  static double N5e2c3d18603(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.15210843373493976;
    } else if (((Double)i[51]).doubleValue() < 0.9148550724637681) {
      p = 0.17102966841186737;
    } else if (true) {
      p = 0.03296703296703297;
    } 
    return p;
  }
  static double N2cb4893b604(Object []i) {
    double p = Double.NaN;
    /* date */
    if (i[17] == null) {
      p = 0.046012269938650305;
    } else if (((Double)i[17]).doubleValue() < 0.5) {
    p = WekaStringREPTree.Ncc43f62605(i);
    } else if (true) {
    p = WekaStringREPTree.N413d1baf609(i);
    } 
    return p;
  }
  static double Ncc43f62605(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.46835443037974683;
    } else if (((Double)i[43]).doubleValue() < 0.8333333333333333) {
      p = 0.20689655172413793;
    } else if (true) {
    p = WekaStringREPTree.N5b218417606(i);
    } 
    return p;
  }
  static double N5b218417606(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.62;
    } else if (((Double)i[51]).doubleValue() < 0.8775) {
    p = WekaStringREPTree.N645aa696607(i);
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N645aa696607(Object []i) {
    double p = Double.NaN;
    /* vocals */
    if (i[33] == null) {
      p = 0.6888888888888889;
    } else if (((Double)i[33]).doubleValue() < 0.16666666666666666) {
      p = 0.4782608695652174;
    } else if (true) {
    p = WekaStringREPTree.N6caf0677608(i);
    } 
    return p;
  }
  static double N6caf0677608(Object []i) {
    double p = Double.NaN;
    /* digits */
    if (i[32] == null) {
      p = 0.9090909090909091;
    } else if (((Double)i[32]).doubleValue() < 0.16666666666666666) {
      p = 0.8666666666666667;
    } else if (true) {
      p = 1.0;
    } 
    return p;
  }
  static double N413d1baf609(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.018775510204081632;
    } else if (((Double)i[43]).doubleValue() < 0.7083333333333333) {
    p = WekaStringREPTree.N16eb3ea3610(i);
    } else if (true) {
    p = WekaStringREPTree.N273444fe611(i);
    } 
    return p;
  }
  static double N16eb3ea3610(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.04430379746835443;
    } else if (((Double)i[51]).doubleValue() < 0.8905835543766578) {
      p = 0.27450980392156865;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N273444fe611(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.009900990099009901;
    } else if (((Double)i[37]).doubleValue() < 1.5) {
      p = 0.004519774011299435;
    } else if (true) {
    p = WekaStringREPTree.N33bc72d1612(i);
    } 
    return p;
  }
  static double N33bc72d1612(Object []i) {
    double p = Double.NaN;
    /* knownWordsCount */
    if (i[44] == null) {
      p = 0.20833333333333334;
    } else if (((Double)i[44]).doubleValue() < 1.5) {
    p = WekaStringREPTree.N1a75e76a613(i);
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N1a75e76a613(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.5555555555555556;
    } else if (((Double)i[37]).doubleValue() < 2.5) {
      p = 0.7142857142857143;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N5524cca1614(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.9220704696565452;
    } else if (((Double)i[37]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N5032714f615(i);
    } else if (true) {
    p = WekaStringREPTree.N5f8e8a9d735(i);
    } 
    return p;
  }
  static double N5032714f615(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.2537342493950099;
    } else if (((Double)i[31]).doubleValue() < 0.7486842105263158) {
    p = WekaStringREPTree.N48bb62616(i);
    } else if (true) {
    p = WekaStringREPTree.N1033576a658(i);
    } 
    return p;
  }
  static double N48bb62616(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.011683164207599244;
    } else if (((Double)i[31]).doubleValue() < 0.02582908163265306) {
    p = WekaStringREPTree.N353352b6617(i);
    } else if (true) {
    p = WekaStringREPTree.N4681c175618(i);
    } 
    return p;
  }
  static double N353352b6617(Object []i) {
    double p = Double.NaN;
    /* maxRepChars */
    if (i[35] == null) {
      p = 0.8804347826086957;
    } else if (((Double)i[35]).doubleValue() < 1.5) {
      p = 1.0;
    } else if (true) {
      p = 0.45;
    } 
    return p;
  }
  static double N4681c175618(Object []i) {
    double p = Double.NaN;
    /* digits */
    if (i[32] == null) {
      p = 0.010021415057072167;
    } else if (((Double)i[32]).doubleValue() < 0.044466403162055336) {
    p = WekaStringREPTree.N57a78e3619(i);
    } else if (true) {
    p = WekaStringREPTree.N24569dba649(i);
    } 
    return p;
  }
  static double N57a78e3619(Object []i) {
    double p = Double.NaN;
    /* strLen */
    if (i[28] == null) {
      p = 0.009117272746239385;
    } else if (((Double)i[28]).doubleValue() < 6.5) {
    p = WekaStringREPTree.N402c4085620(i);
    } else if (true) {
    p = WekaStringREPTree.N1750fbeb630(i);
    } 
    return p;
  }
  static double N402c4085620(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.06021425932766901;
    } else if (((Double)i[31]).doubleValue() < 0.29166666666666663) {
      p = 1.0;
    } else if (true) {
    p = WekaStringREPTree.N6fa51cd4621(i);
    } 
    return p;
  }
  static double N6fa51cd4621(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.05286671630677588;
    } else if (((Double)i[43]).doubleValue() < 0.55) {
    p = WekaStringREPTree.N2767e23c622(i);
    } else if (true) {
      p = 0.02187182095625636;
    } 
    return p;
  }
  static double N2767e23c622(Object []i) {
    double p = Double.NaN;
    /* stackHeuristic */
    if (i[48] == null) {
      p = 0.1375;
    } else if (((Double)i[48]).doubleValue() < -0.12016178896229138) {
      p = 0.09269162210338681;
    } else if (true) {
    p = WekaStringREPTree.N710c2b53623(i);
    } 
    return p;
  }
  static double N710c2b53623(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.29559748427672955;
    } else if (((Double)i[51]).doubleValue() < 0.8412298387096775) {
    p = WekaStringREPTree.N5386659f624(i);
    } else if (true) {
    p = WekaStringREPTree.N1caa0244627(i);
    } 
    return p;
  }
  static double N5386659f624(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.8928571428571429;
    } else if (((Double)i[51]).doubleValue() < 0.8360215053763441) {
    p = WekaStringREPTree.N14028087625(i);
    } else if (true) {
      p = 1.0;
    } 
    return p;
  }
  static double N14028087625(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.7857142857142857;
    } else if (((Double)i[31]).doubleValue() < 0.5) {
      p = 0.0;
    } else if (true) {
    p = WekaStringREPTree.Ncecf639626(i);
    } 
    return p;
  }
  static double Ncecf639626(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.9166666666666666;
    } else if (((Double)i[43]).doubleValue() < 0.2) {
      p = 0.6666666666666666;
    } else if (true) {
      p = 1.0;
    } 
    return p;
  }
  static double N1caa0244627(Object []i) {
    double p = Double.NaN;
    /* strLen */
    if (i[28] == null) {
      p = 0.16793893129770993;
    } else if (((Double)i[28]).doubleValue() < 4.5) {
    p = WekaStringREPTree.N7ce026d3628(i);
    } else if (true) {
      p = 0.075;
    } 
    return p;
  }
  static double N7ce026d3628(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.3137254901960784;
    } else if (((Double)i[51]).doubleValue() < 0.87042842215256) {
      p = 1.0;
    } else if (true) {
    p = WekaStringREPTree.N7ce69770629(i);
    } 
    return p;
  }
  static double N7ce69770629(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.10256410256410256;
    } else if (((Double)i[43]).doubleValue() < 0.375) {
      p = 0.0;
    } else if (true) {
      p = 0.12121212121212122;
    } 
    return p;
  }
  static double N1750fbeb630(Object []i) {
    double p = Double.NaN;
    /* maxSingleChar */
    if (i[30] == null) {
      p = 0.006058729877940917;
    } else if (((Double)i[30]).doubleValue() < 0.03361581920903955) {
    p = WekaStringREPTree.N5b247367631(i);
    } else if (true) {
    p = WekaStringREPTree.N268f106e632(i);
    } 
    return p;
  }
  static double N5b247367631(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.2692307692307692;
    } else if (((Double)i[43]).doubleValue() < 0.546875) {
      p = 0.7;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N268f106e632(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.005907341032789061;
    } else if (((Double)i[31]).doubleValue() < 0.06316489361702127) {
    p = WekaStringREPTree.N6e9a5ed8633(i);
    } else if (true) {
    p = WekaStringREPTree.N6c284af635(i);
    } 
    return p;
  }
  static double N6e9a5ed8633(Object []i) {
    double p = Double.NaN;
    /* strLen */
    if (i[28] == null) {
      p = 0.10424710424710425;
    } else if (((Double)i[28]).doubleValue() < 22.5) {
      p = 0.7666666666666667;
    } else if (true) {
    p = WekaStringREPTree.N7e057f43634(i);
    } 
    return p;
  }
  static double N7e057f43634(Object []i) {
    double p = Double.NaN;
    /* strLen */
    if (i[28] == null) {
      p = 0.017467248908296942;
    } else if (((Double)i[28]).doubleValue() < 28.5) {
      p = 0.5;
    } else if (true) {
      p = 0.008888888888888889;
    } 
    return p;
  }
  static double N6c284af635(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.0053405727764302725;
    } else if (((Double)i[31]).doubleValue() < 0.6626016260162602) {
    p = WekaStringREPTree.N5890e879636(i);
    } else if (true) {
    p = WekaStringREPTree.N2b40ff9c645(i);
    } 
    return p;
  }
  static double N5890e879636(Object []i) {
    double p = Double.NaN;
    /* setDist */
    if (i[29] == null) {
      p = 0.004892542781823868;
    } else if (((Double)i[29]).doubleValue() < 0.1371473354231975) {
    p = WekaStringREPTree.N6440112d637(i);
    } else if (true) {
    p = WekaStringREPTree.N183ec003641(i);
    } 
    return p;
  }
  static double N6440112d637(Object []i) {
    double p = Double.NaN;
    /* simpleSplitWordLen */
    if (i[36] == null) {
      p = 0.023166023166023165;
    } else if (((Double)i[36]).doubleValue() < 20.0) {
    p = WekaStringREPTree.N31ea9581638(i);
    } else if (true) {
    p = WekaStringREPTree.N7c137fd5640(i);
    } 
    return p;
  }
  static double N31ea9581638(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.02166623678101625;
    } else if (((Double)i[43]).doubleValue() < 0.7041245791245792) {
    p = WekaStringREPTree.N231f98ef639(i);
    } else if (true) {
      p = 0.005270555165144062;
    } 
    return p;
  }
  static double N231f98ef639(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.06692531522793405;
    } else if (((Double)i[51]).doubleValue() < 0.7754310344827586) {
      p = 0.2245762711864407;
    } else if (true) {
      p = 0.02012578616352201;
    } 
    return p;
  }
  static double N7c137fd5640(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.75;
    } else if (((Double)i[43]).doubleValue() < 0.7191659272404614) {
      p = 1.0;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N183ec003641(Object []i) {
    double p = Double.NaN;
    /* maxSingleChar */
    if (i[30] == null) {
      p = 0.003155808890084889;
    } else if (((Double)i[30]).doubleValue() < 0.4365079365079365) {
    p = WekaStringREPTree.N7d9d0818642(i);
    } else if (true) {
    p = WekaStringREPTree.N451001e5644(i);
    } 
    return p;
  }
  static double N7d9d0818642(Object []i) {
    double p = Double.NaN;
    /* date */
    if (i[17] == null) {
      p = 0.002822847885318736;
    } else if (((Double)i[17]).doubleValue() < 0.5) {
      p = 0.054878048780487805;
    } else if (true) {
    p = WekaStringREPTree.N221a3fa4643(i);
    } 
    return p;
  }
  static double N221a3fa4643(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.002612446087492298;
    } else if (((Double)i[31]).doubleValue() < 0.16035714285714286) {
      p = 0.008126269729645258;
    } else if (true) {
      p = 0.0015800561797752809;
    } 
    return p;
  }
  static double N451001e5644(Object []i) {
    double p = Double.NaN;
    /* normEntropy */
    if (i[50] == null) {
      p = 0.10144927536231885;
    } else if (((Double)i[50]).doubleValue() < 2.596791631981637) {
      p = 0.050505050505050504;
    } else if (true) {
      p = 0.23076923076923078;
    } 
    return p;
  }
  static double N2b40ff9c645(Object []i) {
    double p = Double.NaN;
    /* maxSingleChar */
    if (i[30] == null) {
      p = 0.11864406779661017;
    } else if (((Double)i[30]).doubleValue() < 0.08928571428571427) {
      p = 0.625;
    } else if (true) {
    p = WekaStringREPTree.N3e08ff24646(i);
    } 
    return p;
  }
  static double N3e08ff24646(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.09467455621301775;
    } else if (((Double)i[43]).doubleValue() < 0.5857142857142856) {
    p = WekaStringREPTree.N4d1c005e647(i);
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N4d1c005e647(Object []i) {
    double p = Double.NaN;
    /* setDist */
    if (i[29] == null) {
      p = 0.24242424242424243;
    } else if (((Double)i[29]).doubleValue() < 0.875) {
    p = WekaStringREPTree.N8462f31648(i);
    } else if (true) {
      p = 0.1276595744680851;
    } 
    return p;
  }
  static double N8462f31648(Object []i) {
    double p = Double.NaN;
    /* stackHeuristic */
    if (i[48] == null) {
      p = 0.5263157894736842;
    } else if (((Double)i[48]).doubleValue() < -0.1333084337672965) {
      p = 0.35714285714285715;
    } else if (true) {
      p = 1.0;
    } 
    return p;
  }
  static double N24569dba649(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.2710843373493976;
    } else if (((Double)i[43]).doubleValue() < 0.5798319327731092) {
    p = WekaStringREPTree.N5ddeb7cb650(i);
    } else if (true) {
    p = WekaStringREPTree.N59402b8f653(i);
    } 
    return p;
  }
  static double N5ddeb7cb650(Object []i) {
    double p = Double.NaN;
    /* sumRepChar */
    if (i[42] == null) {
      p = 0.7560975609756098;
    } else if (((Double)i[42]).doubleValue() < 2.5) {
    p = WekaStringREPTree.N70ed52de651(i);
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N70ed52de651(Object []i) {
    double p = Double.NaN;
    /* setDist */
    if (i[29] == null) {
      p = 0.8157894736842105;
    } else if (((Double)i[29]).doubleValue() < 0.31666666666666665) {
      p = 0.90625;
    } else if (true) {
    p = WekaStringREPTree.N496bc455652(i);
    } 
    return p;
  }
  static double N496bc455652(Object []i) {
    double p = Double.NaN;
    /* digits */
    if (i[32] == null) {
      p = 0.3333333333333333;
    } else if (((Double)i[32]).doubleValue() < 0.13392857142857142) {
      p = 0.0;
    } else if (true) {
      p = 1.0;
    } 
    return p;
  }
  static double N59402b8f653(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.112;
    } else if (((Double)i[31]).doubleValue() < 0.18333333333333335) {
      p = 1.0;
    } else if (true) {
    p = WekaStringREPTree.N7188af83654(i);
    } 
    return p;
  }
  static double N7188af83654(Object []i) {
    double p = Double.NaN;
    /* normEntropy */
    if (i[50] == null) {
      p = 0.0975609756097561;
    } else if (((Double)i[50]).doubleValue() < 2.453445297804259) {
    p = WekaStringREPTree.N6be968ce655(i);
    } else if (true) {
    p = WekaStringREPTree.N247310d0657(i);
    } 
    return p;
  }
  static double N6be968ce655(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.3333333333333333;
    } else if (((Double)i[51]).doubleValue() < 0.8435972629521017) {
    p = WekaStringREPTree.N7c37508a656(i);
    } else if (true) {
      p = 0.2;
    } 
    return p;
  }
  static double N7c37508a656(Object []i) {
    double p = Double.NaN;
    /* setDist */
    if (i[29] == null) {
      p = 0.6666666666666666;
    } else if (((Double)i[29]).doubleValue() < 0.7) {
      p = 1.0;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N247310d0657(Object []i) {
    double p = Double.NaN;
    /* knownWordsCount */
    if (i[44] == null) {
      p = 0.049019607843137254;
    } else if (((Double)i[44]).doubleValue() < 4.5) {
      p = 0.3333333333333333;
    } else if (true) {
      p = 0.03125;
    } 
    return p;
  }
  static double N1033576a658(Object []i) {
    double p = Double.NaN;
    /* setDist */
    if (i[29] == null) {
      p = 0.745624762788344;
    } else if (((Double)i[29]).doubleValue() < 1.0416666666666665) {
    p = WekaStringREPTree.N303cf2ba659(i);
    } else if (true) {
    p = WekaStringREPTree.N740fb309728(i);
    } 
    return p;
  }
  static double N303cf2ba659(Object []i) {
    double p = Double.NaN;
    /* setDist */
    if (i[29] == null) {
      p = 0.9094498552250593;
    } else if (((Double)i[29]).doubleValue() < 0.6125) {
    p = WekaStringREPTree.N76494737660(i);
    } else if (true) {
    p = WekaStringREPTree.N4c163e3694(i);
    } 
    return p;
  }
  static double N76494737660(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.9432790837854129;
    } else if (((Double)i[51]).doubleValue() < 0.8423295454545454) {
    p = WekaStringREPTree.N4a003cbe661(i);
    } else if (true) {
    p = WekaStringREPTree.N6f10d5b6680(i);
    } 
    return p;
  }
  static double N4a003cbe661(Object []i) {
    double p = Double.NaN;
    /* regex */
    if (i[3] == null) {
      p = 0.9494512195121951;
    } else if (((Double)i[3]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N4082ba93662(i);
    } else if (true) {
    p = WekaStringREPTree.N6d60fe40668(i);
    } 
    return p;
  }
  static double N4082ba93662(Object []i) {
    double p = Double.NaN;
    /* setDist */
    if (i[29] == null) {
      p = 0.9679275133036099;
    } else if (((Double)i[29]).doubleValue() < 0.06066176470588235) {
      p = 0.16;
    } else if (true) {
    p = WekaStringREPTree.N17fc391b663(i);
    } 
    return p;
  }
  static double N17fc391b663(Object []i) {
    double p = Double.NaN;
    /* knownWordsCount */
    if (i[44] == null) {
      p = 0.969382609322095;
    } else if (((Double)i[44]).doubleValue() < 5.5) {
    p = WekaStringREPTree.N2b30a42c664(i);
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N2b30a42c664(Object []i) {
    double p = Double.NaN;
    /* setDist */
    if (i[29] == null) {
      p = 0.9700115340253749;
    } else if (((Double)i[29]).doubleValue() < 0.08712121212121213) {
      p = 0.8378378378378378;
    } else if (true) {
    p = WekaStringREPTree.N609e8838665(i);
    } 
    return p;
  }
  static double N609e8838665(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.9714368988633052;
    } else if (((Double)i[51]).doubleValue() < 0.7700320512820513) {
      p = 0.9844194553583525;
    } else if (true) {
    p = WekaStringREPTree.N359df09a666(i);
    } 
    return p;
  }
  static double N359df09a666(Object []i) {
    double p = Double.NaN;
    /* strLen */
    if (i[28] == null) {
      p = 0.9563298123916129;
    } else if (((Double)i[28]).doubleValue() < 5.5) {
      p = 0.9678611602121163;
    } else if (true) {
    p = WekaStringREPTree.N43df23d3667(i);
    } 
    return p;
  }
  static double N43df23d3667(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.35833333333333334;
    } else if (((Double)i[31]).doubleValue() < 0.8819444444444444) {
      p = 0.7407407407407407;
    } else if (true) {
      p = 0.24731182795698925;
    } 
    return p;
  }
  static double N6d60fe40668(Object []i) {
    double p = Double.NaN;
    /* sumRepChar */
    if (i[42] == null) {
      p = 0.8464314354450682;
    } else if (((Double)i[42]).doubleValue() < 2.5) {
    p = WekaStringREPTree.N792b749c669(i);
    } else if (true) {
    p = WekaStringREPTree.N1972e513676(i);
    } 
    return p;
  }
  static double N792b749c669(Object []i) {
    double p = Double.NaN;
    /* setDist */
    if (i[29] == null) {
      p = 0.8663811563169165;
    } else if (((Double)i[29]).doubleValue() < 0.3693181818181818) {
      p = 0.886722866174921;
    } else if (true) {
    p = WekaStringREPTree.N23e84203670(i);
    } 
    return p;
  }
  static double N23e84203670(Object []i) {
    double p = Double.NaN;
    /* normEntropy */
    if (i[50] == null) {
      p = 0.7780320366132724;
    } else if (((Double)i[50]).doubleValue() < 2.2437777590084274) {
      p = 0.5;
    } else if (true) {
    p = WekaStringREPTree.N19932c16671(i);
    } 
    return p;
  }
  static double N19932c16671(Object []i) {
    double p = Double.NaN;
    /* stackHeuristic */
    if (i[48] == null) {
      p = 0.7899761336515513;
    } else if (((Double)i[48]).doubleValue() < -0.2810337660332421) {
    p = WekaStringREPTree.N73eb439a672(i);
    } else if (true) {
    p = WekaStringREPTree.N305ffe9e674(i);
    } 
    return p;
  }
  static double N73eb439a672(Object []i) {
    double p = Double.NaN;
    /* maxSingleChar */
    if (i[30] == null) {
      p = 0.6949152542372882;
    } else if (((Double)i[30]).doubleValue() < 0.2863636363636364) {
      p = 0.7916666666666666;
    } else if (true) {
    p = WekaStringREPTree.N514646ef673(i);
    } 
    return p;
  }
  static double N514646ef673(Object []i) {
    double p = Double.NaN;
    /* pluses */
    if (i[41] == null) {
      p = 0.2727272727272727;
    } else if (((Double)i[41]).doubleValue() < 0.5) {
      p = 0.375;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N305ffe9e674(Object []i) {
    double p = Double.NaN;
    /* maxRepChars */
    if (i[35] == null) {
      p = 0.8055555555555556;
    } else if (((Double)i[35]).doubleValue() < 1.5) {
    p = WekaStringREPTree.N302c971f675(i);
    } else if (true) {
      p = 0.6779661016949152;
    } 
    return p;
  }
  static double N302c971f675(Object []i) {
    double p = Double.NaN;
    /* slashes */
    if (i[40] == null) {
      p = 0.8305647840531561;
    } else if (((Double)i[40]).doubleValue() < 0.5) {
      p = 0.7925311203319502;
    } else if (true) {
      p = 0.9833333333333333;
    } 
    return p;
  }
  static double N1972e513676(Object []i) {
    double p = Double.NaN;
    /* normEntropy */
    if (i[50] == null) {
      p = 0.5534591194968553;
    } else if (((Double)i[50]).doubleValue() < 3.2374138036158318) {
    p = WekaStringREPTree.N7ae0a9ec677(i);
    } else if (true) {
    p = WekaStringREPTree.N61c4eee0679(i);
    } 
    return p;
  }
  static double N7ae0a9ec677(Object []i) {
    double p = Double.NaN;
    /* sumRepChar */
    if (i[42] == null) {
      p = 0.2631578947368421;
    } else if (((Double)i[42]).doubleValue() < 3.5) {
      p = 0.4666666666666667;
    } else if (true) {
    p = WekaStringREPTree.N35841320678(i);
    } 
    return p;
  }
  static double N35841320678(Object []i) {
    double p = Double.NaN;
    /* setDist */
    if (i[29] == null) {
      p = 0.13043478260869565;
    } else if (((Double)i[29]).doubleValue() < 0.4017857142857143) {
      p = 0.23529411764705882;
    } else if (true) {
      p = 0.06896551724137931;
    } 
    return p;
  }
  static double N61c4eee0679(Object []i) {
    double p = Double.NaN;
    /* sumRepChar */
    if (i[42] == null) {
      p = 0.8192771084337349;
    } else if (((Double)i[42]).doubleValue() < 7.5) {
      p = 0.8607594936708861;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N6f10d5b6680(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.4105263157894737;
    } else if (((Double)i[51]).doubleValue() < 0.8527551942186089) {
    p = WekaStringREPTree.N1040be71681(i);
    } else if (true) {
    p = WekaStringREPTree.N2a693f59684(i);
    } 
    return p;
  }
  static double N1040be71681(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.1694915254237288;
    } else if (((Double)i[51]).doubleValue() < 0.8473193473193473) {
    p = WekaStringREPTree.N548a24a682(i);
    } else if (true) {
      p = 0.08;
    } 
    return p;
  }
  static double N548a24a682(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.23529411764705882;
    } else if (((Double)i[31]).doubleValue() < 0.775) {
      p = 0.5;
    } else if (true) {
    p = WekaStringREPTree.N433defed683(i);
    } 
    return p;
  }
  static double N433defed683(Object []i) {
    double p = Double.NaN;
    /* regex */
    if (i[3] == null) {
      p = 0.2;
    } else if (((Double)i[3]).doubleValue() < 0.5) {
      p = 0.2608695652173913;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N2a693f59684(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.5190839694656488;
    } else if (((Double)i[31]).doubleValue() < 0.9166666666666667) {
    p = WekaStringREPTree.N3f4faf53685(i);
    } else if (true) {
    p = WekaStringREPTree.N25be7b63690(i);
    } 
    return p;
  }
  static double N3f4faf53685(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.6385542168674698;
    } else if (((Double)i[43]).doubleValue() < 0.7083333333333333) {
    p = WekaStringREPTree.N7fd50002686(i);
    } else if (true) {
      p = 0.3333333333333333;
    } 
    return p;
  }
  static double N7fd50002686(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.7857142857142857;
    } else if (((Double)i[43]).doubleValue() < 0.45) {
      p = 0.9411764705882353;
    } else if (true) {
    p = WekaStringREPTree.N533bda92687(i);
    } 
    return p;
  }
  static double N533bda92687(Object []i) {
    double p = Double.NaN;
    /* digits */
    if (i[32] == null) {
      p = 0.5454545454545454;
    } else if (((Double)i[32]).doubleValue() < 0.1) {
    p = WekaStringREPTree.N304bb45b688(i);
    } else if (true) {
      p = 1.0;
    } 
    return p;
  }
  static double N304bb45b688(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.23076923076923078;
    } else if (((Double)i[51]).doubleValue() < 0.8596059113300493) {
      p = 0.0;
    } else if (true) {
    p = WekaStringREPTree.N723ca036689(i);
    } 
    return p;
  }
  static double N723ca036689(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.42857142857142855;
    } else if (((Double)i[51]).doubleValue() < 0.8665183537263625) {
      p = 1.0;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N25be7b63690(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.3125;
    } else if (((Double)i[51]).doubleValue() < 0.8615900383141762) {
    p = WekaStringREPTree.N28dcca0c691(i);
    } else if (true) {
    p = WekaStringREPTree.N45d84a20692(i);
    } 
    return p;
  }
  static double N28dcca0c691(Object []i) {
    double p = Double.NaN;
    /* date */
    if (i[17] == null) {
      p = 0.15384615384615385;
    } else if (((Double)i[17]).doubleValue() < 0.5) {
      p = 0.0;
    } else if (true) {
      p = 0.2222222222222222;
    } 
    return p;
  }
  static double N45d84a20692(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.37142857142857144;
    } else if (((Double)i[43]).doubleValue() < 0.625) {
    p = WekaStringREPTree.N52f27fbd693(i);
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N52f27fbd693(Object []i) {
    double p = Double.NaN;
    /* digits */
    if (i[32] == null) {
      p = 0.41935483870967744;
    } else if (((Double)i[32]).doubleValue() < 0.125) {
      p = 0.3333333333333333;
    } else if (true) {
      p = 1.0;
    } 
    return p;
  }
  static double N4c163e3694(Object []i) {
    double p = Double.NaN;
    /* sumRepChar */
    if (i[42] == null) {
      p = 0.6760914760914761;
    } else if (((Double)i[42]).doubleValue() < 1.5) {
    p = WekaStringREPTree.N4a8355dd695(i);
    } else if (true) {
    p = WekaStringREPTree.N5c80cf32712(i);
    } 
    return p;
  }
  static double N4a8355dd695(Object []i) {
    double p = Double.NaN;
    /* equals */
    if (i[38] == null) {
      p = 0.7536475869809203;
    } else if (((Double)i[38]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N4d0d9fe7696(i);
    } else if (true) {
    p = WekaStringREPTree.N6b695b06709(i);
    } 
    return p;
  }
  static double N4d0d9fe7696(Object []i) {
    double p = Double.NaN;
    /* regex */
    if (i[3] == null) {
      p = 0.7880671224362958;
    } else if (((Double)i[3]).doubleValue() < 0.5) {
    p = WekaStringREPTree.Nc430e6c697(i);
    } else if (true) {
    p = WekaStringREPTree.N70cf32e3702(i);
    } 
    return p;
  }
  static double Nc430e6c697(Object []i) {
    double p = Double.NaN;
    /* setDist */
    if (i[29] == null) {
      p = 0.8140885984023238;
    } else if (((Double)i[29]).doubleValue() < 0.775) {
    p = WekaStringREPTree.N312aa7c698(i);
    } else if (true) {
    p = WekaStringREPTree.N536f2a7e699(i);
    } 
    return p;
  }
  static double N312aa7c698(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.8977272727272727;
    } else if (((Double)i[51]).doubleValue() < 0.8212005108556832) {
      p = 0.9181969949916527;
    } else if (true) {
      p = 0.17647058823529413;
    } 
    return p;
  }
  static double N536f2a7e699(Object []i) {
    double p = Double.NaN;
    /* strLen */
    if (i[28] == null) {
      p = 0.7463863337713534;
    } else if (((Double)i[28]).doubleValue() < 7.5) {
      p = 0.7590847913862718;
    } else if (true) {
    p = WekaStringREPTree.N72bc6553700(i);
    } 
    return p;
  }
  static double N72bc6553700(Object []i) {
    double p = Double.NaN;
    /* slashes */
    if (i[40] == null) {
      p = 0.2222222222222222;
    } else if (((Double)i[40]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N66982506701(i);
    } else if (true) {
      p = 1.0;
    } 
    return p;
  }
  static double N66982506701(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.125;
    } else if (((Double)i[51]).doubleValue() < 0.7000907441016334) {
      p = 0.5;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N70cf32e3702(Object []i) {
    double p = Double.NaN;
    /* strLen */
    if (i[28] == null) {
      p = 0.6336206896551724;
    } else if (((Double)i[28]).doubleValue() < 5.5) {
    p = WekaStringREPTree.N5a59ca5e703(i);
    } else if (true) {
    p = WekaStringREPTree.N71075444707(i);
    } 
    return p;
  }
  static double N5a59ca5e703(Object []i) {
    double p = Double.NaN;
    /* pluses */
    if (i[41] == null) {
      p = 0.6945812807881774;
    } else if (((Double)i[41]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N4bdeaabb704(i);
    } else if (true) {
    p = WekaStringREPTree.N65987993706(i);
    } 
    return p;
  }
  static double N4bdeaabb704(Object []i) {
    double p = Double.NaN;
    /* strLen */
    if (i[28] == null) {
      p = 0.6666666666666666;
    } else if (((Double)i[28]).doubleValue() < 4.5) {
      p = 0.6371681415929203;
    } else if (true) {
    p = WekaStringREPTree.N6c4906d3705(i);
    } 
    return p;
  }
  static double N6c4906d3705(Object []i) {
    double p = Double.NaN;
    /* slashes */
    if (i[40] == null) {
      p = 0.7213114754098361;
    } else if (((Double)i[40]).doubleValue() < 0.5) {
      p = 0.7884615384615384;
    } else if (true) {
      p = 0.3333333333333333;
    } 
    return p;
  }
  static double N65987993706(Object []i) {
    double p = Double.NaN;
    /* slashes */
    if (i[40] == null) {
      p = 0.8620689655172413;
    } else if (((Double)i[40]).doubleValue() < 0.5) {
      p = 0.92;
    } else if (true) {
      p = 0.5;
    } 
    return p;
  }
  static double N71075444707(Object []i) {
    double p = Double.NaN;
    /* setDist */
    if (i[29] == null) {
      p = 0.20689655172413793;
    } else if (((Double)i[29]).doubleValue() < 0.7333333333333334) {
      p = 0.625;
    } else if (true) {
    p = WekaStringREPTree.N4f32a3ad708(i);
    } 
    return p;
  }
  static double N4f32a3ad708(Object []i) {
    double p = Double.NaN;
    /* pluses */
    if (i[41] == null) {
      p = 0.047619047619047616;
    } else if (((Double)i[41]).doubleValue() < 0.5) {
      p = 0.0;
    } else if (true) {
      p = 0.25;
    } 
    return p;
  }
  static double N6b695b06709(Object []i) {
    double p = Double.NaN;
    /* setDist */
    if (i[29] == null) {
      p = 0.43352601156069365;
    } else if (((Double)i[29]).doubleValue() < 0.7916666666666667) {
      p = 0.6086956521739131;
    } else if (true) {
    p = WekaStringREPTree.N4d1bf319710(i);
    } 
    return p;
  }
  static double N4d1bf319710(Object []i) {
    double p = Double.NaN;
    /* maxRepChars */
    if (i[35] == null) {
      p = 0.3173076923076923;
    } else if (((Double)i[35]).doubleValue() < 1.5) {
    p = WekaStringREPTree.N6f53b8a711(i);
    } else if (true) {
      p = 0.6521739130434783;
    } 
    return p;
  }
  static double N6f53b8a711(Object []i) {
    double p = Double.NaN;
    /* equals */
    if (i[38] == null) {
      p = 0.2222222222222222;
    } else if (((Double)i[38]).doubleValue() < 1.5) {
      p = 0.17105263157894737;
    } else if (true) {
      p = 1.0;
    } 
    return p;
  }
  static double N5c80cf32712(Object []i) {
    double p = Double.NaN;
    /* normEntropy */
    if (i[50] == null) {
      p = 0.45425361155698235;
    } else if (((Double)i[50]).doubleValue() < 2.3709505944546687) {
    p = WekaStringREPTree.N7d900ecf713(i);
    } else if (true) {
    p = WekaStringREPTree.N6cb107fd722(i);
    } 
    return p;
  }
  static double N7d900ecf713(Object []i) {
    double p = Double.NaN;
    /* sumRepChar */
    if (i[42] == null) {
      p = 0.3450134770889488;
    } else if (((Double)i[42]).doubleValue() < 2.5) {
    p = WekaStringREPTree.N6f01b95f714(i);
    } else if (true) {
    p = WekaStringREPTree.N7a5ceedd719(i);
    } 
    return p;
  }
  static double N6f01b95f714(Object []i) {
    double p = Double.NaN;
    /* equals */
    if (i[38] == null) {
      p = 0.382262996941896;
    } else if (((Double)i[38]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N4007f65e715(i);
    } else if (true) {
    p = WekaStringREPTree.N5965d37718(i);
    } 
    return p;
  }
  static double N4007f65e715(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.4206896551724138;
    } else if (((Double)i[51]).doubleValue() < 0.8032258064516129) {
    p = WekaStringREPTree.N1a245833716(i);
    } else if (true) {
      p = 0.28703703703703703;
    } 
    return p;
  }
  static double N1a245833716(Object []i) {
    double p = Double.NaN;
    /* regex */
    if (i[3] == null) {
      p = 0.5;
    } else if (((Double)i[3]).doubleValue() < 0.5) {
      p = 0.60431654676259;
    } else if (true) {
    p = WekaStringREPTree.N673fdbce717(i);
    } 
    return p;
  }
  static double N673fdbce717(Object []i) {
    double p = Double.NaN;
    /* strLen */
    if (i[28] == null) {
      p = 0.16279069767441862;
    } else if (((Double)i[28]).doubleValue() < 7.0) {
      p = 0.23333333333333334;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N5965d37718(Object []i) {
    double p = Double.NaN;
    /* maxRepChars */
    if (i[35] == null) {
      p = 0.08108108108108109;
    } else if (((Double)i[35]).doubleValue() < 1.5) {
      p = 0.2727272727272727;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N7a5ceedd719(Object []i) {
    double p = Double.NaN;
    /* maxRepChars */
    if (i[35] == null) {
      p = 0.06818181818181818;
    } else if (((Double)i[35]).doubleValue() < 2.5) {
    p = WekaStringREPTree.N4201c465720(i);
    } else if (true) {
      p = 0.4;
    } 
    return p;
  }
  static double N4201c465720(Object []i) {
    double p = Double.NaN;
    /* equals */
    if (i[38] == null) {
      p = 0.02564102564102564;
    } else if (((Double)i[38]).doubleValue() < 1.5) {
      p = 0.0;
    } else if (true) {
    p = WekaStringREPTree.N5b799640721(i);
    } 
    return p;
  }
  static double N5b799640721(Object []i) {
    double p = Double.NaN;
    /* regex */
    if (i[3] == null) {
      p = 0.2;
    } else if (((Double)i[3]).doubleValue() < 0.5) {
      p = 0.0;
    } else if (true) {
      p = 0.5;
    } 
    return p;
  }
  static double N6cb107fd722(Object []i) {
    double p = Double.NaN;
    /* regex */
    if (i[3] == null) {
      p = 0.6150793650793651;
    } else if (((Double)i[3]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N710636b0723(i);
    } else if (true) {
      p = 0.23404255319148937;
    } 
    return p;
  }
  static double N710636b0723(Object []i) {
    double p = Double.NaN;
    /* setDist */
    if (i[29] == null) {
      p = 0.8417721518987342;
    } else if (((Double)i[29]).doubleValue() < 0.8452380952380952) {
    p = WekaStringREPTree.N3de8f619724(i);
    } else if (true) {
    p = WekaStringREPTree.Neadd4fb727(i);
    } 
    return p;
  }
  static double N3de8f619724(Object []i) {
    double p = Double.NaN;
    /* normEntropy */
    if (i[50] == null) {
      p = 0.9468085106382979;
    } else if (((Double)i[50]).doubleValue() < 2.8438609648997724) {
      p = 0.3333333333333333;
    } else if (true) {
    p = WekaStringREPTree.N2ab4bc72725(i);
    } 
    return p;
  }
  static double N2ab4bc72725(Object []i) {
    double p = Double.NaN;
    /* equals */
    if (i[38] == null) {
      p = 0.967032967032967;
    } else if (((Double)i[38]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N4e5ed836726(i);
    } else if (true) {
      p = 0.8;
    } 
    return p;
  }
  static double N4e5ed836726(Object []i) {
    double p = Double.NaN;
    /* maxSingleChar */
    if (i[30] == null) {
      p = 0.9767441860465116;
    } else if (((Double)i[30]).doubleValue() < 0.21825396825396826) {
      p = 0.8947368421052632;
    } else if (true) {
      p = 1.0;
    } 
    return p;
  }
  static double Neadd4fb727(Object []i) {
    double p = Double.NaN;
    /* strLen */
    if (i[28] == null) {
      p = 0.6875;
    } else if (((Double)i[28]).doubleValue() < 13.5) {
      p = 0.803921568627451;
    } else if (true) {
      p = 0.23076923076923078;
    } 
    return p;
  }
  static double N740fb309728(Object []i) {
    double p = Double.NaN;
    /* regex */
    if (i[3] == null) {
      p = 0.08605341246290801;
    } else if (((Double)i[3]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N7bd7d6d6729(i);
    } else if (true) {
      p = 0.002599090318388564;
    } 
    return p;
  }
  static double N7bd7d6d6729(Object []i) {
    double p = Double.NaN;
    /* date */
    if (i[17] == null) {
      p = 0.12645486001887385;
    } else if (((Double)i[17]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N43f02ef2730(i);
    } else if (true) {
    p = WekaStringREPTree.N239a307b731(i);
    } 
    return p;
  }
  static double N43f02ef2730(Object []i) {
    double p = Double.NaN;
    /* strLen */
    if (i[28] == null) {
      p = 0.05568720379146919;
    } else if (((Double)i[28]).doubleValue() < 5.5) {
      p = 0.5909090909090909;
    } else if (true) {
      p = 0.0413625304136253;
    } 
    return p;
  }
  static double N239a307b731(Object []i) {
    double p = Double.NaN;
    /* setDist */
    if (i[29] == null) {
      p = 0.15203426124197003;
    } else if (((Double)i[29]).doubleValue() < 1.5192307692307692) {
    p = WekaStringREPTree.N2a8448fa732(i);
    } else if (true) {
      p = 0.14285714285714285;
    } 
    return p;
  }
  static double N2a8448fa732(Object []i) {
    double p = Double.NaN;
    /* sumRepChar */
    if (i[42] == null) {
      p = 0.27848101265822783;
    } else if (((Double)i[42]).doubleValue() < 2.5) {
    p = WekaStringREPTree.N6f204a1a733(i);
    } else if (true) {
      p = 0.08695652173913043;
    } 
    return p;
  }
  static double N6f204a1a733(Object []i) {
    double p = Double.NaN;
    /* maxRepChars */
    if (i[35] == null) {
      p = 0.35714285714285715;
    } else if (((Double)i[35]).doubleValue() < 2.5) {
    p = WekaStringREPTree.N2de56eb2734(i);
    } else if (true) {
      p = 0.16326530612244897;
    } 
    return p;
  }
  static double N2de56eb2734(Object []i) {
    double p = Double.NaN;
    /* normEntropy */
    if (i[50] == null) {
      p = 0.5079365079365079;
    } else if (((Double)i[50]).doubleValue() < 1.7821495440322355) {
      p = 0.38461538461538464;
    } else if (true) {
      p = 0.7083333333333334;
    } 
    return p;
  }
  static double N5f8e8a9d735(Object []i) {
    double p = Double.NaN;
    /* minLenKnownWord */
    if (i[46] == null) {
      p = 0.948515742887992;
    } else if (((Double)i[46]).doubleValue() < 1.5) {
    p = WekaStringREPTree.N5745ca0e736(i);
    } else if (true) {
    p = WekaStringREPTree.N456d6c1e1044(i);
    } 
    return p;
  }
  static double N5745ca0e736(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.9577393393639135;
    } else if (((Double)i[43]).doubleValue() < 0.09023066485753053) {
    p = WekaStringREPTree.N3ad83a66737(i);
    } else if (true) {
    p = WekaStringREPTree.N5340477f816(i);
    } 
    return p;
  }
  static double N3ad83a66737(Object []i) {
    double p = Double.NaN;
    /* vocals */
    if (i[33] == null) {
      p = 0.5366038553173056;
    } else if (((Double)i[33]).doubleValue() < 0.2231800766283525) {
    p = WekaStringREPTree.N3cce5371738(i);
    } else if (true) {
    p = WekaStringREPTree.N79207381787(i);
    } 
    return p;
  }
  static double N3cce5371738(Object []i) {
    double p = Double.NaN;
    /* setDist */
    if (i[29] == null) {
      p = 0.7684968195513894;
    } else if (((Double)i[29]).doubleValue() < 0.525062656641604) {
    p = WekaStringREPTree.N17bffc17739(i);
    } else if (true) {
    p = WekaStringREPTree.N15888343766(i);
    } 
    return p;
  }
  static double N17bffc17739(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.8375243764754182;
    } else if (((Double)i[31]).doubleValue() < 0.3288288288288288) {
    p = WekaStringREPTree.N6e535154740(i);
    } else if (true) {
    p = WekaStringREPTree.N790da477757(i);
    } 
    return p;
  }
  static double N6e535154740(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.5992673992673992;
    } else if (((Double)i[37]).doubleValue() < 5.5) {
    p = WekaStringREPTree.N15a34df2741(i);
    } else if (true) {
    p = WekaStringREPTree.N72c8e7b752(i);
    } 
    return p;
  }
  static double N15a34df2741(Object []i) {
    double p = Double.NaN;
    /* date */
    if (i[17] == null) {
      p = 0.7335243553008596;
    } else if (((Double)i[17]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N5b38c1ec742(i);
    } else if (true) {
      p = 0.009009009009009009;
    } 
    return p;
  }
  static double N5b38c1ec742(Object []i) {
    double p = Double.NaN;
    /* vocals */
    if (i[33] == null) {
      p = 0.7740796772566818;
    } else if (((Double)i[33]).doubleValue() < 0.17028985507246375) {
    p = WekaStringREPTree.N338fc1d8743(i);
    } else if (true) {
    p = WekaStringREPTree.N1807e3f6747(i);
    } 
    return p;
  }
  static double N338fc1d8743(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.8508710801393728;
    } else if (((Double)i[51]).doubleValue() < 0.6916017797552837) {
    p = WekaStringREPTree.N4722ef0c744(i);
    } else if (true) {
    p = WekaStringREPTree.N55cb6996746(i);
    } 
    return p;
  }
  static double N4722ef0c744(Object []i) {
    double p = Double.NaN;
    /* maxRepChars */
    if (i[35] == null) {
      p = 0.8649819494584837;
    } else if (((Double)i[35]).doubleValue() < 2.5) {
    p = WekaStringREPTree.N48e1f6c7745(i);
    } else if (true) {
      p = 0.3076923076923077;
    } 
    return p;
  }
  static double N48e1f6c7745(Object []i) {
    double p = Double.NaN;
    /* sumRepChar */
    if (i[42] == null) {
      p = 0.8702623906705539;
    } else if (((Double)i[42]).doubleValue() < 2.5) {
      p = 0.9322459222082811;
    } else if (true) {
      p = 0.7843478260869565;
    } 
    return p;
  }
  static double N55cb6996746(Object []i) {
    double p = Double.NaN;
    /* strLen */
    if (i[28] == null) {
      p = 0.46;
    } else if (((Double)i[28]).doubleValue() < 8.5) {
      p = 1.0;
    } else if (true) {
      p = 0.03571428571428571;
    } 
    return p;
  }
  static double N1807e3f6747(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.572992700729927;
    } else if (((Double)i[37]).doubleValue() < 3.5) {
    p = WekaStringREPTree.N480d3575748(i);
    } else if (true) {
    p = WekaStringREPTree.N194fad1750(i);
    } 
    return p;
  }
  static double N480d3575748(Object []i) {
    double p = Double.NaN;
    /* maxRepChars */
    if (i[35] == null) {
      p = 0.7068965517241379;
    } else if (((Double)i[35]).doubleValue() < 2.5) {
    p = WekaStringREPTree.Nf1da57d749(i);
    } else if (true) {
      p = 0.05;
    } 
    return p;
  }
  static double Nf1da57d749(Object []i) {
    double p = Double.NaN;
    /* slashes */
    if (i[40] == null) {
      p = 0.7469512195121951;
    } else if (((Double)i[40]).doubleValue() < 1.5) {
      p = 0.768025078369906;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N194fad1750(Object []i) {
    double p = Double.NaN;
    /* simpleSplitWordLen */
    if (i[36] == null) {
      p = 0.34;
    } else if (((Double)i[36]).doubleValue() < 6.5) {
    p = WekaStringREPTree.N26abb146751(i);
    } else if (true) {
      p = 0.7692307692307693;
    } 
    return p;
  }
  static double N26abb146751(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.1891891891891892;
    } else if (((Double)i[31]).doubleValue() < 0.17914438502673796) {
      p = 0.038461538461538464;
    } else if (true) {
      p = 0.5454545454545454;
    } 
    return p;
  }
  static double N72c8e7b752(Object []i) {
    double p = Double.NaN;
    /* simpleSplitWordLen */
    if (i[36] == null) {
      p = 0.15723270440251572;
    } else if (((Double)i[36]).doubleValue() < 7.5) {
      p = 0.015113350125944584;
    } else if (true) {
    p = WekaStringREPTree.N65f8f5ae753(i);
    } 
    return p;
  }
  static double N65f8f5ae753(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.39330543933054396;
    } else if (((Double)i[37]).doubleValue() < 7.5) {
      p = 0.7419354838709677;
    } else if (true) {
    p = WekaStringREPTree.N431cd9b2754(i);
    } 
    return p;
  }
  static double N431cd9b2754(Object []i) {
    double p = Double.NaN;
    /* maxSingleChar */
    if (i[30] == null) {
      p = 0.17123287671232876;
    } else if (((Double)i[30]).doubleValue() < 0.08697478991596638) {
      p = 0.8235294117647058;
    } else if (true) {
    p = WekaStringREPTree.N38467116755(i);
    } 
    return p;
  }
  static double N38467116755(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.08527131782945736;
    } else if (((Double)i[51]).doubleValue() < 0.40862708719851576) {
    p = WekaStringREPTree.N5b7a7f33756(i);
    } else if (true) {
      p = 0.02564102564102564;
    } 
    return p;
  }
  static double N5b7a7f33756(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.6666666666666666;
    } else if (((Double)i[31]).doubleValue() < 0.17256097560975608) {
      p = 0.0;
    } else if (true) {
      p = 1.0;
    } 
    return p;
  }
  static double N790da477757(Object []i) {
    double p = Double.NaN;
    /* setDist */
    if (i[29] == null) {
      p = 0.9302723513474975;
    } else if (((Double)i[29]).doubleValue() < 0.0531015037593985) {
      p = 0.2972972972972973;
    } else if (true) {
    p = WekaStringREPTree.N5c7933ad758(i);
    } 
    return p;
  }
  static double N5c7933ad758(Object []i) {
    double p = Double.NaN;
    /* xml */
    if (i[0] == null) {
      p = 0.9336295871559633;
    } else if (((Double)i[0]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N57bc27f5759(i);
    } else if (true) {
      p = 0.20689655172413793;
    } 
    return p;
  }
  static double N57bc27f5759(Object []i) {
    double p = Double.NaN;
    /* vocals */
    if (i[33] == null) {
      p = 0.9366633079026918;
    } else if (((Double)i[33]).doubleValue() < 0.15301003344481606) {
    p = WekaStringREPTree.N5fb759d6760(i);
    } else if (true) {
    p = WekaStringREPTree.N68c9d179763(i);
    } 
    return p;
  }
  static double N5fb759d6760(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.9485201511335013;
    } else if (((Double)i[51]).doubleValue() < 0.6256868131868132) {
      p = 0.9803120356612184;
    } else if (true) {
    p = WekaStringREPTree.N4b8d604b761(i);
    } 
    return p;
  }
  static double N4b8d604b761(Object []i) {
    double p = Double.NaN;
    /* strLen */
    if (i[28] == null) {
      p = 0.9251366120218579;
    } else if (((Double)i[28]).doubleValue() < 11.5) {
    p = WekaStringREPTree.N5e7cd6cc762(i);
    } else if (true) {
      p = 0.08;
    } 
    return p;
  }
  static double N5e7cd6cc762(Object []i) {
    double p = Double.NaN;
    /* slashes */
    if (i[40] == null) {
      p = 0.930949105914718;
    } else if (((Double)i[40]).doubleValue() < 1.5) {
      p = 0.9348850096979773;
    } else if (true) {
      p = 0.38461538461538464;
    } 
    return p;
  }
  static double N68c9d179763(Object []i) {
    double p = Double.NaN;
    /* equals */
    if (i[38] == null) {
      p = 0.8100840336134454;
    } else if (((Double)i[38]).doubleValue() < 1.5) {
    p = WekaStringREPTree.Nd554c5f764(i);
    } else if (true) {
      p = 1.0;
    } 
    return p;
  }
  static double Nd554c5f764(Object []i) {
    double p = Double.NaN;
    /* setDist */
    if (i[29] == null) {
      p = 0.744343891402715;
    } else if (((Double)i[29]).doubleValue() < 0.2863636363636364) {
      p = 0.9110320284697508;
    } else if (true) {
    p = WekaStringREPTree.N2dfaea86765(i);
    } 
    return p;
  }
  static double N2dfaea86765(Object []i) {
    double p = Double.NaN;
    /* equals */
    if (i[38] == null) {
      p = 0.453416149068323;
    } else if (((Double)i[38]).doubleValue() < 0.5) {
      p = 0.5811965811965812;
    } else if (true) {
      p = 0.11363636363636363;
    } 
    return p;
  }
  static double N15888343766(Object []i) {
    double p = Double.NaN;
    /* normEntropy */
    if (i[50] == null) {
      p = 0.4634920634920635;
    } else if (((Double)i[50]).doubleValue() < 1.0968753530849664) {
      p = 0.02;
    } else if (true) {
    p = WekaStringREPTree.N33ecda92767(i);
    } 
    return p;
  }
  static double N33ecda92767(Object []i) {
    double p = Double.NaN;
    /* vocals */
    if (i[33] == null) {
      p = 0.5202046035805626;
    } else if (((Double)i[33]).doubleValue() < 0.1206060606060606) {
    p = WekaStringREPTree.N14fc5f04768(i);
    } else if (true) {
    p = WekaStringREPTree.N7b4c50bc783(i);
    } 
    return p;
  }
  static double N14fc5f04768(Object []i) {
    double p = Double.NaN;
    /* strLen */
    if (i[28] == null) {
      p = 0.5901749663526245;
    } else if (((Double)i[28]).doubleValue() < 32.5) {
    p = WekaStringREPTree.N6e2829c7769(i);
    } else if (true) {
    p = WekaStringREPTree.N4d14b6c2778(i);
    } 
    return p;
  }
  static double N6e2829c7769(Object []i) {
    double p = Double.NaN;
    /* date */
    if (i[17] == null) {
      p = 0.6537242472266244;
    } else if (((Double)i[17]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N3feb2dda770(i);
    } else if (true) {
    p = WekaStringREPTree.N55de24cc774(i);
    } 
    return p;
  }
  static double N3feb2dda770(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.7559429477020603;
    } else if (((Double)i[43]).doubleValue() < 0.04257246376811594) {
    p = WekaStringREPTree.N6a8658ff771(i);
    } else if (true) {
      p = 0.9555555555555556;
    } 
    return p;
  }
  static double N6a8658ff771(Object []i) {
    double p = Double.NaN;
    /* vocals */
    if (i[33] == null) {
      p = 0.7016129032258065;
    } else if (((Double)i[33]).doubleValue() < 0.04257246376811594) {
    p = WekaStringREPTree.N1c742ed4772(i);
    } else if (true) {
    p = WekaStringREPTree.N333d4a8c773(i);
    } 
    return p;
  }
  static double N1c742ed4772(Object []i) {
    double p = Double.NaN;
    /* slashes */
    if (i[40] == null) {
      p = 0.8194444444444444;
    } else if (((Double)i[40]).doubleValue() < 0.5) {
      p = 0.8436363636363636;
    } else if (true) {
      p = 0.3076923076923077;
    } 
    return p;
  }
  static double N333d4a8c773(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.5384615384615384;
    } else if (((Double)i[51]).doubleValue() < 0.5244047619047619) {
      p = 0.25862068965517243;
    } else if (true) {
      p = 0.6466666666666666;
    } 
    return p;
  }
  static double N55de24cc774(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.5515055467511886;
    } else if (((Double)i[31]).doubleValue() < 0.36141304347826086) {
      p = 0.0;
    } else if (true) {
    p = WekaStringREPTree.Ndc7df28775(i);
    } 
    return p;
  }
  static double Ndc7df28775(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.6373626373626373;
    } else if (((Double)i[51]).doubleValue() < 0.6350806451612903) {
    p = WekaStringREPTree.N30f842ca776(i);
    } else if (true) {
    p = WekaStringREPTree.N69c81773777(i);
    } 
    return p;
  }
  static double N30f842ca776(Object []i) {
    double p = Double.NaN;
    /* regex */
    if (i[3] == null) {
      p = 0.8461538461538461;
    } else if (((Double)i[3]).doubleValue() < 0.5) {
      p = 0.9186046511627907;
    } else if (true) {
      p = 0.30434782608695654;
    } 
    return p;
  }
  static double N69c81773777(Object []i) {
    double p = Double.NaN;
    /* setDist */
    if (i[29] == null) {
      p = 0.5213675213675214;
    } else if (((Double)i[29]).doubleValue() < 0.6125) {
      p = 0.8095238095238095;
    } else if (true) {
      p = 0.4307116104868914;
    } 
    return p;
  }
  static double N4d14b6c2778(Object []i) {
    double p = Double.NaN;
    /* date */
    if (i[17] == null) {
      p = 0.23214285714285715;
    } else if (((Double)i[17]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N7e990ed7779(i);
    } else if (true) {
    p = WekaStringREPTree.N4d15107f782(i);
    } 
    return p;
  }
  static double N7e990ed7779(Object []i) {
    double p = Double.NaN;
    /* setDist */
    if (i[29] == null) {
      p = 0.3728813559322034;
    } else if (((Double)i[29]).doubleValue() < 2.1882352941176473) {
    p = WekaStringREPTree.Nc05fddc780(i);
    } else if (true) {
      p = 0.25;
    } 
    return p;
  }
  static double Nc05fddc780(Object []i) {
    double p = Double.NaN;
    /* sumRepChar */
    if (i[42] == null) {
      p = 0.631578947368421;
    } else if (((Double)i[42]).doubleValue() < 18.5) {
    p = WekaStringREPTree.N25df00a0781(i);
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N25df00a0781(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.7272727272727273;
    } else if (((Double)i[43]).doubleValue() < 0.01980974796508777) {
      p = 0.2222222222222222;
    } else if (true) {
      p = 0.9166666666666666;
    } 
    return p;
  }
  static double N4d15107f782(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.07547169811320754;
    } else if (((Double)i[37]).doubleValue() < 75.5) {
      p = 0.03296703296703297;
    } else if (true) {
      p = 0.3333333333333333;
    } 
    return p;
  }
  static double N7b4c50bc783(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.29850746268656714;
    } else if (((Double)i[37]).doubleValue() < 2.5) {
    p = WekaStringREPTree.N5884a914784(i);
    } else if (true) {
    p = WekaStringREPTree.N60f00693786(i);
    } 
    return p;
  }
  static double N5884a914784(Object []i) {
    double p = Double.NaN;
    /* nonVocals */
    if (i[34] == null) {
      p = 0.5838926174496645;
    } else if (((Double)i[34]).doubleValue() < 0.5857843137254902) {
    p = WekaStringREPTree.N50378a4785(i);
    } else if (true) {
      p = 0.9253731343283582;
    } 
    return p;
  }
  static double N50378a4785(Object []i) {
    double p = Double.NaN;
    /* stackHeuristic */
    if (i[48] == null) {
      p = 0.3048780487804878;
    } else if (((Double)i[48]).doubleValue() < -0.42155064904986317) {
      p = 0.06382978723404255;
    } else if (true) {
      p = 0.6285714285714286;
    } 
    return p;
  }
  static double N60f00693786(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.165625;
    } else if (((Double)i[51]).doubleValue() < 0.5543735224586288) {
      p = 0.07547169811320754;
    } else if (true) {
      p = 0.3425925925925926;
    } 
    return p;
  }
  static double N79207381787(Object []i) {
    double p = Double.NaN;
    /* stackHeuristic */
    if (i[48] == null) {
      p = 0.1116564417177914;
    } else if (((Double)i[48]).doubleValue() < -0.315596028282386) {
    p = WekaStringREPTree.N491b9b8788(i);
    } else if (true) {
    p = WekaStringREPTree.N782859e799(i);
    } 
    return p;
  }
  static double N491b9b8788(Object []i) {
    double p = Double.NaN;
    /* equals */
    if (i[38] == null) {
      p = 0.04893435635123615;
    } else if (((Double)i[38]).doubleValue() < 1.5) {
    p = WekaStringREPTree.N1a4927d6789(i);
    } else if (true) {
      p = 0.9795918367346939;
    } 
    return p;
  }
  static double N1a4927d6789(Object []i) {
    double p = Double.NaN;
    /* stackHeuristic */
    if (i[48] == null) {
      p = 0.04109353507565337;
    } else if (((Double)i[48]).doubleValue() < -0.5210300470577258) {
    p = WekaStringREPTree.N7a6d7e92790(i);
    } else if (true) {
    p = WekaStringREPTree.N5a5a729f793(i);
    } 
    return p;
  }
  static double N7a6d7e92790(Object []i) {
    double p = Double.NaN;
    /* normEntropy */
    if (i[50] == null) {
      p = 0.015445719329214475;
    } else if (((Double)i[50]).doubleValue() < 2.9421119830614693) {
    p = WekaStringREPTree.Naba625791(i);
    } else if (true) {
    p = WekaStringREPTree.N97e93f1792(i);
    } 
    return p;
  }
  static double Naba625791(Object []i) {
    double p = Double.NaN;
    /* maxSingleChar */
    if (i[30] == null) {
      p = 0.391304347826087;
    } else if (((Double)i[30]).doubleValue() < 0.25380116959064325) {
      p = 0.9090909090909091;
    } else if (true) {
      p = 0.22857142857142856;
    } 
    return p;
  }
  static double N97e93f1792(Object []i) {
    double p = Double.NaN;
    /* setDist */
    if (i[29] == null) {
      p = 0.0115916183682568;
    } else if (((Double)i[29]).doubleValue() < 0.2554347826086957) {
      p = 0.75;
    } else if (true) {
      p = 0.01027244305493524;
    } 
    return p;
  }
  static double N5a5a729f793(Object []i) {
    double p = Double.NaN;
    /* simpleSplitWordLen */
    if (i[36] == null) {
      p = 0.13161993769470404;
    } else if (((Double)i[36]).doubleValue() < 7.5) {
    p = WekaStringREPTree.N4b520ea8794(i);
    } else if (true) {
    p = WekaStringREPTree.N3932c79a798(i);
    } 
    return p;
  }
  static double N4b520ea8794(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.1085899513776337;
    } else if (((Double)i[31]).doubleValue() < 0.067816091954023) {
      p = 0.9333333333333333;
    } else if (true) {
    p = WekaStringREPTree.N16150369795(i);
    } 
    return p;
  }
  static double N16150369795(Object []i) {
    double p = Double.NaN;
    /* digits */
    if (i[32] == null) {
      p = 0.09844134536505332;
    } else if (((Double)i[32]).doubleValue() < 0.02) {
      p = 0.08598452278589853;
    } else if (true) {
    p = WekaStringREPTree.N6b09fb41796(i);
    } 
    return p;
  }
  static double N6b09fb41796(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.35714285714285715;
    } else if (((Double)i[37]).doubleValue() < 1.5) {
      p = 0.8181818181818182;
    } else if (true) {
    p = WekaStringREPTree.N624ea235797(i);
    } 
    return p;
  }
  static double N624ea235797(Object []i) {
    double p = Double.NaN;
    /* sumRepChar */
    if (i[42] == null) {
      p = 0.24444444444444444;
    } else if (((Double)i[42]).doubleValue() < 2.5) {
      p = 0.5625;
    } else if (true) {
      p = 0.06896551724137931;
    } 
    return p;
  }
  static double N3932c79a798(Object []i) {
    double p = Double.NaN;
    /* sumRepChar */
    if (i[42] == null) {
      p = 0.7;
    } else if (((Double)i[42]).doubleValue() < 6.5) {
      p = 0.813953488372093;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N782859e799(Object []i) {
    double p = Double.NaN;
    /* strLen */
    if (i[28] == null) {
      p = 0.6732824427480916;
    } else if (((Double)i[28]).doubleValue() < 9.5) {
    p = WekaStringREPTree.N23f5b5dc800(i);
    } else if (true) {
    p = WekaStringREPTree.N210ab13f806(i);
    } 
    return p;
  }
  static double N23f5b5dc800(Object []i) {
    double p = Double.NaN;
    /* nonVocals */
    if (i[34] == null) {
      p = 0.8520900321543409;
    } else if (((Double)i[34]).doubleValue() < 0.35416666666666663) {
    p = WekaStringREPTree.N34bde49d801(i);
    } else if (true) {
    p = WekaStringREPTree.N821330f803(i);
    } 
    return p;
  }
  static double N34bde49d801(Object []i) {
    double p = Double.NaN;
    /* nonVocals */
    if (i[34] == null) {
      p = 0.908675799086758;
    } else if (((Double)i[34]).doubleValue() < 0.05555555555555555) {
    p = WekaStringREPTree.N1b1cfb87802(i);
    } else if (true) {
      p = 0.9420289855072463;
    } 
    return p;
  }
  static double N1b1cfb87802(Object []i) {
    double p = Double.NaN;
    /* regex */
    if (i[3] == null) {
      p = 0.3333333333333333;
    } else if (((Double)i[3]).doubleValue() < 0.5) {
      p = 1.0;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N821330f803(Object []i) {
    double p = Double.NaN;
    /* equals */
    if (i[38] == null) {
      p = 0.717391304347826;
    } else if (((Double)i[38]).doubleValue() < 0.5) {
      p = 0.7916666666666666;
    } else if (true) {
    p = WekaStringREPTree.N6f43c82804(i);
    } 
    return p;
  }
  static double N6f43c82804(Object []i) {
    double p = Double.NaN;
    /* setDist */
    if (i[29] == null) {
      p = 0.45;
    } else if (((Double)i[29]).doubleValue() < 0.4017857142857143) {
    p = WekaStringREPTree.N5db6b9cd805(i);
    } else if (true) {
      p = 0.125;
    } 
    return p;
  }
  static double N5db6b9cd805(Object []i) {
    double p = Double.NaN;
    /* strLen */
    if (i[28] == null) {
      p = 0.6666666666666666;
    } else if (((Double)i[28]).doubleValue() < 8.5) {
      p = 0.42857142857142855;
    } else if (true) {
      p = 1.0;
    } 
    return p;
  }
  static double N210ab13f806(Object []i) {
    double p = Double.NaN;
    /* normEntropy */
    if (i[50] == null) {
      p = 0.5116279069767442;
    } else if (((Double)i[50]).doubleValue() < 3.108861674944148) {
    p = WekaStringREPTree.N20b2475a807(i);
    } else if (true) {
    p = WekaStringREPTree.N1be2019a810(i);
    } 
    return p;
  }
  static double N20b2475a807(Object []i) {
    double p = Double.NaN;
    /* vocals */
    if (i[33] == null) {
      p = 0.2676056338028169;
    } else if (((Double)i[33]).doubleValue() < 0.23940036341611146) {
      p = 1.0;
    } else if (true) {
    p = WekaStringREPTree.N7857fe2808(i);
    } 
    return p;
  }
  static double N7857fe2808(Object []i) {
    double p = Double.NaN;
    /* nonVocals */
    if (i[34] == null) {
      p = 0.21212121212121213;
    } else if (((Double)i[34]).doubleValue() < 0.23636363636363636) {
      p = 0.8;
    } else if (true) {
    p = WekaStringREPTree.N6f15d60e809(i);
    } 
    return p;
  }
  static double N6f15d60e809(Object []i) {
    double p = Double.NaN;
    /* normEntropy */
    if (i[50] == null) {
      p = 0.16393442622950818;
    } else if (((Double)i[50]).doubleValue() < 3.084962500721156) {
      p = 0.030303030303030304;
    } else if (true) {
      p = 0.32142857142857145;
    } 
    return p;
  }
  static double N1be2019a810(Object []i) {
    double p = Double.NaN;
    /* equals */
    if (i[38] == null) {
      p = 0.575091575091575;
    } else if (((Double)i[38]).doubleValue() < 1.5) {
    p = WekaStringREPTree.N29d80d2b811(i);
    } else if (true) {
      p = 1.0;
    } 
    return p;
  }
  static double N29d80d2b811(Object []i) {
    double p = Double.NaN;
    /* simpleSplitWordLen */
    if (i[36] == null) {
      p = 0.5486381322957199;
    } else if (((Double)i[36]).doubleValue() < 5.5) {
    p = WekaStringREPTree.N58e1d9d812(i);
    } else if (true) {
    p = WekaStringREPTree.N2657d4dd815(i);
    } 
    return p;
  }
  static double N58e1d9d812(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.49765258215962443;
    } else if (((Double)i[31]).doubleValue() < 0.2153846153846154) {
    p = WekaStringREPTree.N446a1e84813(i);
    } else if (true) {
      p = 0.36585365853658536;
    } 
    return p;
  }
  static double N446a1e84813(Object []i) {
    double p = Double.NaN;
    /* strLen */
    if (i[28] == null) {
      p = 0.6777777777777778;
    } else if (((Double)i[28]).doubleValue() < 13.5) {
    p = WekaStringREPTree.N4f0f2942814(i);
    } else if (true) {
      p = 0.25;
    } 
    return p;
  }
  static double N4f0f2942814(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.6976744186046512;
    } else if (((Double)i[51]).doubleValue() < 0.6118538324420677) {
      p = 0.9411764705882353;
    } else if (true) {
      p = 0.5384615384615384;
    } 
    return p;
  }
  static double N2657d4dd815(Object []i) {
    double p = Double.NaN;
    /* regex */
    if (i[3] == null) {
      p = 0.7954545454545454;
    } else if (((Double)i[3]).doubleValue() < 0.5) {
      p = 0.8857142857142857;
    } else if (true) {
      p = 0.4444444444444444;
    } 
    return p;
  }
  static double N5340477f816(Object []i) {
    double p = Double.NaN;
    /* date */
    if (i[17] == null) {
      p = 0.9622060267741769;
    } else if (((Double)i[17]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N47caedad817(i);
    } else if (true) {
    p = WekaStringREPTree.N730d2164922(i);
    } 
    return p;
  }
  static double N47caedad817(Object []i) {
    double p = Double.NaN;
    /* dashes */
    if (i[39] == null) {
      p = 0.9759247997122542;
    } else if (((Double)i[39]).doubleValue() < 1.5) {
    p = WekaStringREPTree.N7139992f818(i);
    } else if (true) {
    p = WekaStringREPTree.N1f9f6368878(i);
    } 
    return p;
  }
  static double N7139992f818(Object []i) {
    double p = Double.NaN;
    /* country */
    if (i[14] == null) {
      p = 0.9793330492291777;
    } else if (((Double)i[14]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N69504ae9819(i);
    } else if (true) {
    p = WekaStringREPTree.N12591ac8859(i);
    } 
    return p;
  }
  static double N69504ae9819(Object []i) {
    double p = Double.NaN;
    /* knownUniqueWords */
    if (i[45] == null) {
      p = 0.9800278357236409;
    } else if (((Double)i[45]).doubleValue() < 4.5) {
    p = WekaStringREPTree.N387a8303820(i);
    } else if (true) {
    p = WekaStringREPTree.N3aa078fd845(i);
    } 
    return p;
  }
  static double N387a8303820(Object []i) {
    double p = Double.NaN;
    /* setDist */
    if (i[29] == null) {
      p = 0.9447672818921209;
    } else if (((Double)i[29]).doubleValue() < 0.5186206896551724) {
    p = WekaStringREPTree.N28cda624821(i);
    } else if (true) {
    p = WekaStringREPTree.N4dc27487834(i);
    } 
    return p;
  }
  static double N28cda624821(Object []i) {
    double p = Double.NaN;
    /* maxLenKnownWord */
    if (i[47] == null) {
      p = 0.9588311264040742;
    } else if (((Double)i[47]).doubleValue() < 2.5) {
    p = WekaStringREPTree.N1500b2f3822(i);
    } else if (true) {
    p = WekaStringREPTree.N5c7bfdc1828(i);
    } 
    return p;
  }
  static double N1500b2f3822(Object []i) {
    double p = Double.NaN;
    /* digits */
    if (i[32] == null) {
      p = 0.9715570741231434;
    } else if (((Double)i[32]).doubleValue() < 0.4365079365079365) {
    p = WekaStringREPTree.N7eecb5b8823(i);
    } else if (true) {
    p = WekaStringREPTree.N475c9c31826(i);
    } 
    return p;
  }
  static double N7eecb5b8823(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.9745726178613578;
    } else if (((Double)i[43]).doubleValue() < 0.23205128205128206) {
    p = WekaStringREPTree.N126253fd824(i);
    } else if (true) {
    p = WekaStringREPTree.N57db2b13825(i);
    } 
    return p;
  }
  static double N126253fd824(Object []i) {
    double p = Double.NaN;
    /* vocals */
    if (i[33] == null) {
      p = 0.8929664873810509;
    } else if (((Double)i[33]).doubleValue() < 0.1975609756097561) {
      p = 0.9584178498985801;
    } else if (true) {
      p = 0.6029213483146068;
    } 
    return p;
  }
  static double N57db2b13825(Object []i) {
    double p = Double.NaN;
    /* color */
    if (i[10] == null) {
      p = 0.9821930827718366;
    } else if (((Double)i[10]).doubleValue() < 0.5) {
      p = 0.9825633532785998;
    } else if (true) {
      p = 0.20967741935483872;
    } 
    return p;
  }
  static double N475c9c31826(Object []i) {
    double p = Double.NaN;
    /* maxRepChars */
    if (i[35] == null) {
      p = 0.748035620743845;
    } else if (((Double)i[35]).doubleValue() < 2.5) {
    p = WekaStringREPTree.N5c86a017827(i);
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N5c86a017827(Object []i) {
    double p = Double.NaN;
    /* maxLenKnownWord */
    if (i[47] == null) {
      p = 0.7712665406427222;
    } else if (((Double)i[47]).doubleValue() < 1.5) {
      p = 0.8263414634146341;
    } else if (true) {
      p = 0.5015923566878981;
    } 
    return p;
  }
  static double N5c7bfdc1828(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.8691689798324694;
    } else if (((Double)i[51]).doubleValue() < 0.6900656814449918) {
    p = WekaStringREPTree.N5276d6ee829(i);
    } else if (true) {
    p = WekaStringREPTree.N1b919693832(i);
    } 
    return p;
  }
  static double N5276d6ee829(Object []i) {
    double p = Double.NaN;
    /* xml */
    if (i[0] == null) {
      p = 0.9126294378698225;
    } else if (((Double)i[0]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N71687585830(i);
    } else if (true) {
    p = WekaStringREPTree.N1807f5a7831(i);
    } 
    return p;
  }
  static double N71687585830(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.9238837748137015;
    } else if (((Double)i[43]).doubleValue() < 0.3114224137931034) {
      p = 0.7365213314580403;
    } else if (true) {
      p = 0.9372924006039255;
    } 
    return p;
  }
  static double N1807f5a7831(Object []i) {
    double p = Double.NaN;
    /* sumRepChar */
    if (i[42] == null) {
      p = 0.20784313725490197;
    } else if (((Double)i[42]).doubleValue() < 2.5) {
      p = 0.5238095238095238;
    } else if (true) {
      p = 0.05263157894736842;
    } 
    return p;
  }
  static double N1b919693832(Object []i) {
    double p = Double.NaN;
    /* strLen */
    if (i[28] == null) {
      p = 0.6984626558528023;
    } else if (((Double)i[28]).doubleValue() < 8.5) {
    p = WekaStringREPTree.N7fb4f2a9833(i);
    } else if (true) {
      p = 0.03917050691244239;
    } 
    return p;
  }
  static double N7fb4f2a9833(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.7350198032451769;
    } else if (((Double)i[43]).doubleValue() < 0.9375) {
      p = 0.9496402877697842;
    } else if (true) {
      p = 0.6886748485319248;
    } 
    return p;
  }
  static double N4dc27487834(Object []i) {
    double p = Double.NaN;
    /* maxRepChars */
    if (i[35] == null) {
      p = 0.8165112070165669;
    } else if (((Double)i[35]).doubleValue() < 2.5) {
    p = WekaStringREPTree.N6a4f1a55835(i);
    } else if (true) {
    p = WekaStringREPTree.N6933b6c6839(i);
    } 
    return p;
  }
  static double N6a4f1a55835(Object []i) {
    double p = Double.NaN;
    /* color */
    if (i[10] == null) {
      p = 0.8429414570168118;
    } else if (((Double)i[10]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N7dfd3c81836(i);
    } else if (true) {
      p = 0.008595988538681949;
    } 
    return p;
  }
  static double N7dfd3c81836(Object []i) {
    double p = Double.NaN;
    /* vocals */
    if (i[33] == null) {
      p = 0.851712400975933;
    } else if (((Double)i[33]).doubleValue() < 0.20204081632653062) {
    p = WekaStringREPTree.N2584b82d837(i);
    } else if (true) {
    p = WekaStringREPTree.N7bbc8656838(i);
    } 
    return p;
  }
  static double N2584b82d837(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.884880276915391;
    } else if (((Double)i[43]).doubleValue() < 0.9925742574257426) {
      p = 0.9555588807421816;
    } else if (true) {
      p = 0.8204270996793341;
    } 
    return p;
  }
  static double N7bbc8656838(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.6721406491499228;
    } else if (((Double)i[37]).doubleValue() < 3.5) {
      p = 0.8587055606198724;
    } else if (true) {
      p = 0.34641909814323607;
    } 
    return p;
  }
  static double N6933b6c6839(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.4419095901985636;
    } else if (((Double)i[31]).doubleValue() < 0.31009615384615385) {
    p = WekaStringREPTree.N7d3e8655840(i);
    } else if (true) {
    p = WekaStringREPTree.N626abbd0842(i);
    } 
    return p;
  }
  static double N7d3e8655840(Object []i) {
    double p = Double.NaN;
    /* normEntropy */
    if (i[50] == null) {
      p = 0.889487870619946;
    } else if (((Double)i[50]).doubleValue() < 2.1788274701823465) {
      p = 0.35135135135135137;
    } else if (true) {
    p = WekaStringREPTree.N7dfb0c0f841(i);
    } 
    return p;
  }
  static double N7dfb0c0f841(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.9491017964071856;
    } else if (((Double)i[37]).doubleValue() < 3.5) {
      p = 0.9805194805194806;
    } else if (true) {
      p = 0.5769230769230769;
    } 
    return p;
  }
  static double N626abbd0842(Object []i) {
    double p = Double.NaN;
    /* setDist */
    if (i[29] == null) {
      p = 0.3587174348697395;
    } else if (((Double)i[29]).doubleValue() < 2.4365079365079367) {
    p = WekaStringREPTree.N169bb4dd843(i);
    } else if (true) {
    p = WekaStringREPTree.N1f9e9475844(i);
    } 
    return p;
  }
  static double N169bb4dd843(Object []i) {
    double p = Double.NaN;
    /* knownUniqueWords */
    if (i[45] == null) {
      p = 0.4780262143407864;
    } else if (((Double)i[45]).doubleValue() < 3.5) {
      p = 0.3985872855701312;
    } else if (true) {
      p = 0.7352941176470589;
    } 
    return p;
  }
  static double N1f9e9475844(Object []i) {
    double p = Double.NaN;
    /* nonVocals */
    if (i[34] == null) {
      p = 0.13733905579399142;
    } else if (((Double)i[34]).doubleValue() < 0.009723402246766733) {
      p = 0.5797101449275363;
    } else if (true) {
      p = 0.08888888888888889;
    } 
    return p;
  }
  static double N3aa078fd845(Object []i) {
    double p = Double.NaN;
    /* strLen */
    if (i[28] == null) {
      p = 0.9909624033590644;
    } else if (((Double)i[28]).doubleValue() < 5.5) {
    p = WekaStringREPTree.Nd23e042846(i);
    } else if (true) {
    p = WekaStringREPTree.N14dd7b39849(i);
    } 
    return p;
  }
  static double Nd23e042846(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.4448669201520912;
    } else if (((Double)i[31]).doubleValue() < 0.5) {
      p = 0.9904761904761905;
    } else if (true) {
    p = WekaStringREPTree.N46d59067847(i);
    } 
    return p;
  }
  static double N46d59067847(Object []i) {
    double p = Double.NaN;
    /* nonVocals */
    if (i[34] == null) {
      p = 0.3611111111111111;
    } else if (((Double)i[34]).doubleValue() < 0.1) {
      p = 0.875;
    } else if (true) {
    p = WekaStringREPTree.N2d0399f4848(i);
    } 
    return p;
  }
  static double N2d0399f4848(Object []i) {
    double p = Double.NaN;
    /* digits */
    if (i[32] == null) {
      p = 0.3424242424242424;
    } else if (((Double)i[32]).doubleValue() < 0.7) {
      p = 0.4138755980861244;
    } else if (true) {
      p = 0.2190082644628099;
    } 
    return p;
  }
  static double N14dd7b39849(Object []i) {
    double p = Double.NaN;
    /* color */
    if (i[10] == null) {
      p = 0.9913302891725096;
    } else if (((Double)i[10]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N66ea810850(i);
    } else if (true) {
    p = WekaStringREPTree.Nf68f0dc856(i);
    } 
    return p;
  }
  static double N66ea810850(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.9917140036159873;
    } else if (((Double)i[43]).doubleValue() < 1.1180555555555556) {
    p = WekaStringREPTree.N6cd24612851(i);
    } else if (true) {
    p = WekaStringREPTree.N51891008854(i);
    } 
    return p;
  }
  static double N6cd24612851(Object []i) {
    double p = Double.NaN;
    /* maxRepChars */
    if (i[35] == null) {
      p = 0.9919002859527426;
    } else if (((Double)i[35]).doubleValue() < 5.5) {
    p = WekaStringREPTree.N5dafbe45852(i);
    } else if (true) {
    p = WekaStringREPTree.N2254127a853(i);
    } 
    return p;
  }
  static double N5dafbe45852(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.992050552090141;
    } else if (((Double)i[51]).doubleValue() < 0.625307881773399) {
      p = 0.9950643172661521;
    } else if (true) {
      p = 0.9697111440537701;
    } 
    return p;
  }
  static double N2254127a853(Object []i) {
    double p = Double.NaN;
    /* normEntropy */
    if (i[50] == null) {
      p = 0.5655339805825242;
    } else if (((Double)i[50]).doubleValue() < 2.825898460065524) {
      p = 0.2463768115942029;
    } else if (true) {
      p = 0.7262773722627737;
    } 
    return p;
  }
  static double N51891008854(Object []i) {
    double p = Double.NaN;
    /* setDist */
    if (i[29] == null) {
      p = 0.4199475065616798;
    } else if (((Double)i[29]).doubleValue() < 0.31666666666666665) {
    p = WekaStringREPTree.N2f953efd855(i);
    } else if (true) {
      p = 0.10407239819004525;
    } 
    return p;
  }
  static double N2f953efd855(Object []i) {
    double p = Double.NaN;
    /* digits */
    if (i[32] == null) {
      p = 0.85625;
    } else if (((Double)i[32]).doubleValue() < 0.458041958041958) {
      p = 0.9178082191780822;
    } else if (true) {
      p = 0.21428571428571427;
    } 
    return p;
  }
  static double Nf68f0dc856(Object []i) {
    double p = Double.NaN;
    /* normEntropy */
    if (i[50] == null) {
      p = 0.6704789135096497;
    } else if (((Double)i[50]).doubleValue() < 3.1424470127319504) {
      p = 0.0025575447570332483;
    } else if (true) {
    p = WekaStringREPTree.Nd2de489857(i);
    } 
    return p;
  }
  static double Nd2de489857(Object []i) {
    double p = Double.NaN;
    /* knownUniqueWords */
    if (i[45] == null) {
      p = 0.9295634920634921;
    } else if (((Double)i[45]).doubleValue() < 6.5) {
    p = WekaStringREPTree.N14bdbc74858(i);
    } else if (true) {
      p = 0.9800443458980045;
    } 
    return p;
  }
  static double N14bdbc74858(Object []i) {
    double p = Double.NaN;
    /* slashes */
    if (i[40] == null) {
      p = 0.5;
    } else if (((Double)i[40]).doubleValue() < 0.5) {
      p = 0.7761194029850746;
    } else if (true) {
      p = 0.02564102564102564;
    } 
    return p;
  }
  static double N12591ac8859(Object []i) {
    double p = Double.NaN;
    /* setDist */
    if (i[29] == null) {
      p = 0.29460847240051347;
    } else if (((Double)i[29]).doubleValue() < 0.3726851851851852) {
    p = WekaStringREPTree.N5a7fe64f860(i);
    } else if (true) {
    p = WekaStringREPTree.N37313c65869(i);
    } 
    return p;
  }
  static double N5a7fe64f860(Object []i) {
    double p = Double.NaN;
    /* simpleSplitWordLen */
    if (i[36] == null) {
      p = 0.6355555555555555;
    } else if (((Double)i[36]).doubleValue() < 10.5) {
    p = WekaStringREPTree.N38145825861(i);
    } else if (true) {
    p = WekaStringREPTree.N7dc19a70866(i);
    } 
    return p;
  }
  static double N38145825861(Object []i) {
    double p = Double.NaN;
    /* setDist */
    if (i[29] == null) {
      p = 0.3434650455927052;
    } else if (((Double)i[29]).doubleValue() < 0.1715686274509804) {
    p = WekaStringREPTree.N41330d4f862(i);
    } else if (true) {
    p = WekaStringREPTree.N1b66c0fb863(i);
    } 
    return p;
  }
  static double N41330d4f862(Object []i) {
    double p = Double.NaN;
    /* setDist */
    if (i[29] == null) {
      p = 0.7087378640776699;
    } else if (((Double)i[29]).doubleValue() < 0.13392857142857142) {
      p = 0.8867924528301887;
    } else if (true) {
      p = 0.52;
    } 
    return p;
  }
  static double N1b66c0fb863(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.17699115044247787;
    } else if (((Double)i[31]).doubleValue() < 0.3708791208791209) {
      p = 0.0;
    } else if (true) {
    p = WekaStringREPTree.N3e0e1046864(i);
    } 
    return p;
  }
  static double N3e0e1046864(Object []i) {
    double p = Double.NaN;
    /* nonVocals */
    if (i[34] == null) {
      p = 0.291970802919708;
    } else if (((Double)i[34]).doubleValue() < 0.4083333333333333) {
    p = WekaStringREPTree.N24c1b2d2865(i);
    } else if (true) {
      p = 0.75;
    } 
    return p;
  }
  static double N24c1b2d2865(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.1743119266055046;
    } else if (((Double)i[43]).doubleValue() < 0.9375) {
      p = 0.8571428571428571;
    } else if (true) {
      p = 0.12745098039215685;
    } 
    return p;
  }
  static double N7dc19a70866(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.9132947976878613;
    } else if (((Double)i[43]).doubleValue() < 0.3980263157894737) {
    p = WekaStringREPTree.N508dec2b867(i);
    } else if (true) {
    p = WekaStringREPTree.N1e4f4a5c868(i);
    } 
    return p;
  }
  static double N508dec2b867(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.10526315789473684;
    } else if (((Double)i[31]).doubleValue() < 0.4507692307692308) {
      p = 0.0;
    } else if (true) {
      p = 1.0;
    } 
    return p;
  }
  static double N1e4f4a5c868(Object []i) {
    double p = Double.NaN;
    /* normEntropy */
    if (i[50] == null) {
      p = 0.9602446483180428;
    } else if (((Double)i[50]).doubleValue() < 3.37617037788068) {
      p = 0.2222222222222222;
    } else if (true) {
      p = 0.9811320754716981;
    } 
    return p;
  }
  static double N37313c65869(Object []i) {
    double p = Double.NaN;
    /* vocals */
    if (i[33] == null) {
      p = 0.03397508493771234;
    } else if (((Double)i[33]).doubleValue() < 0.03464755077658303) {
    p = WekaStringREPTree.N465232e9870(i);
    } else if (true) {
    p = WekaStringREPTree.N7486b455874(i);
    } 
    return p;
  }
  static double N465232e9870(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.36363636363636365;
    } else if (((Double)i[43]).doubleValue() < 0.9444444444444444) {
      p = 1.0;
    } else if (true) {
    p = WekaStringREPTree.N798162bc871(i);
    } 
    return p;
  }
  static double N798162bc871(Object []i) {
    double p = Double.NaN;
    /* normEntropy */
    if (i[50] == null) {
      p = 0.2222222222222222;
    } else if (((Double)i[50]).doubleValue() < 2.9329993066372895) {
    p = WekaStringREPTree.N1df8da7a872(i);
    } else if (true) {
      p = 0.6;
    } 
    return p;
  }
  static double N1df8da7a872(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.11428571428571428;
    } else if (((Double)i[31]).doubleValue() < 0.5357142857142857) {
    p = WekaStringREPTree.N23941fb4873(i);
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N23941fb4873(Object []i) {
    double p = Double.NaN;
    /* commands */
    if (i[5] == null) {
      p = 0.4;
    } else if (((Double)i[5]).doubleValue() < 0.5) {
      p = 0.6666666666666666;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N7486b455874(Object []i) {
    double p = Double.NaN;
    /* normEntropy */
    if (i[50] == null) {
      p = 0.012077294685990338;
    } else if (((Double)i[50]).doubleValue() < 2.2663326399706225) {
      p = 0.08571428571428572;
    } else if (true) {
    p = WekaStringREPTree.N660acfb875(i);
    } 
    return p;
  }
  static double N660acfb875(Object []i) {
    double p = Double.NaN;
    /* vocals */
    if (i[33] == null) {
      p = 0.008827238335435058;
    } else if (((Double)i[33]).doubleValue() < 0.06186224489795918) {
    p = WekaStringREPTree.N5d908d47876(i);
    } else if (true) {
    p = WekaStringREPTree.N5efa40fe877(i);
    } 
    return p;
  }
  static double N5d908d47876(Object []i) {
    double p = Double.NaN;
    /* normEntropy */
    if (i[50] == null) {
      p = 0.06666666666666667;
    } else if (((Double)i[50]).doubleValue() < 3.683561466157239) {
      p = 0.0;
    } else if (true) {
      p = 0.6666666666666666;
    } 
    return p;
  }
  static double N5efa40fe877(Object []i) {
    double p = Double.NaN;
    /* vocals */
    if (i[33] == null) {
      p = 0.00655307994757536;
    } else if (((Double)i[33]).doubleValue() < 0.1213235294117647) {
      p = 0.047619047619047616;
    } else if (true) {
      p = 0.0014727540500736377;
    } 
    return p;
  }
  static double N1f9f6368878(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.832859951933581;
    } else if (((Double)i[37]).doubleValue() < 5.5) {
    p = WekaStringREPTree.N1c9b0314879(i);
    } else if (true) {
    p = WekaStringREPTree.N21be3395906(i);
    } 
    return p;
  }
  static double N1c9b0314879(Object []i) {
    double p = Double.NaN;
    /* digits */
    if (i[32] == null) {
      p = 0.21967165480168532;
    } else if (((Double)i[32]).doubleValue() < 0.29520697167755994) {
    p = WekaStringREPTree.N45385f75880(i);
    } else if (true) {
    p = WekaStringREPTree.N2f67a4d3896(i);
    } 
    return p;
  }
  static double N45385f75880(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.6661904761904762;
    } else if (((Double)i[31]).doubleValue() < 0.458041958041958) {
    p = WekaStringREPTree.N49c90a9c881(i);
    } else if (true) {
    p = WekaStringREPTree.N1224144a887(i);
    } 
    return p;
  }
  static double N49c90a9c881(Object []i) {
    double p = Double.NaN;
    /* equals */
    if (i[38] == null) {
      p = 0.42463958060288337;
    } else if (((Double)i[38]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N2d29b4ee882(i);
    } else if (true) {
      p = 0.9735099337748344;
    } 
    return p;
  }
  static double N2d29b4ee882(Object []i) {
    double p = Double.NaN;
    /* knownUniqueWords */
    if (i[45] == null) {
      p = 0.28921568627450983;
    } else if (((Double)i[45]).doubleValue() < 9.5) {
    p = WekaStringREPTree.N69ee81fc883(i);
    } else if (true) {
    p = WekaStringREPTree.Nf58853c886(i);
    } 
    return p;
  }
  static double N69ee81fc883(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.21415270018621974;
    } else if (((Double)i[37]).doubleValue() < 2.5) {
    p = WekaStringREPTree.N6e2aa843884(i);
    } else if (true) {
    p = WekaStringREPTree.N6f36c2f0885(i);
    } 
    return p;
  }
  static double N6e2aa843884(Object []i) {
    double p = Double.NaN;
    /* maxLenKnownWord */
    if (i[47] == null) {
      p = 0.0881542699724518;
    } else if (((Double)i[47]).doubleValue() < 1.5) {
      p = 0.45454545454545453;
    } else if (true) {
      p = 0.051515151515151514;
    } 
    return p;
  }
  static double N6f36c2f0885(Object []i) {
    double p = Double.NaN;
    /* sumRepChar */
    if (i[42] == null) {
      p = 0.47701149425287354;
    } else if (((Double)i[42]).doubleValue() < 6.5) {
      p = 0.7477477477477478;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double Nf58853c886(Object []i) {
    double p = Double.NaN;
    /* crypto */
    if (i[19] == null) {
      p = 0.8266666666666667;
    } else if (((Double)i[19]).doubleValue() < 0.5) {
      p = 0.9242424242424242;
    } else if (true) {
      p = 0.1111111111111111;
    } 
    return p;
  }
  static double N1224144a887(Object []i) {
    double p = Double.NaN;
    /* dashes */
    if (i[39] == null) {
      p = 0.8040388930441287;
    } else if (((Double)i[39]).doubleValue() < 2.5) {
    p = WekaStringREPTree.N29f7cefd888(i);
    } else if (true) {
    p = WekaStringREPTree.N13d73f29893(i);
    } 
    return p;
  }
  static double N29f7cefd888(Object []i) {
    double p = Double.NaN;
    /* setDist */
    if (i[29] == null) {
      p = 0.9155313351498637;
    } else if (((Double)i[29]).doubleValue() < 0.6181818181818182) {
    p = WekaStringREPTree.N700fb871889(i);
    } else if (true) {
    p = WekaStringREPTree.N9816741891(i);
    } 
    return p;
  }
  static double N700fb871889(Object []i) {
    double p = Double.NaN;
    /* nonVocals */
    if (i[34] == null) {
      p = 0.935077519379845;
    } else if (((Double)i[34]).doubleValue() < 0.19090909090909092) {
    p = WekaStringREPTree.N3b35a229890(i);
    } else if (true) {
      p = 0.9671532846715328;
    } 
    return p;
  }
  static double N3b35a229890(Object []i) {
    double p = Double.NaN;
    /* regex */
    if (i[3] == null) {
      p = 0.8095238095238095;
    } else if (((Double)i[3]).doubleValue() < 0.5) {
      p = 0.958904109589041;
    } else if (true) {
      p = 0.46875;
    } 
    return p;
  }
  static double N9816741891(Object []i) {
    double p = Double.NaN;
    /* sumRepChar */
    if (i[42] == null) {
      p = 0.6231884057971014;
    } else if (((Double)i[42]).doubleValue() < 1.5) {
    p = WekaStringREPTree.N1e16c0aa892(i);
    } else if (true) {
      p = 0.4444444444444444;
    } 
    return p;
  }
  static double N1e16c0aa892(Object []i) {
    double p = Double.NaN;
    /* maxRepChars */
    if (i[35] == null) {
      p = 0.8181818181818182;
    } else if (((Double)i[35]).doubleValue() < 1.5) {
      p = 0.9166666666666666;
    } else if (true) {
      p = 0.5555555555555556;
    } 
    return p;
  }
  static double N13d73f29893(Object []i) {
    double p = Double.NaN;
    /* nonVocals */
    if (i[34] == null) {
      p = 0.2838983050847458;
    } else if (((Double)i[34]).doubleValue() < 0.23669467787114845) {
    p = WekaStringREPTree.N565f390894(i);
    } else if (true) {
      p = 0.6575342465753424;
    } 
    return p;
  }
  static double N565f390894(Object []i) {
    double p = Double.NaN;
    /* regex */
    if (i[3] == null) {
      p = 0.1165644171779141;
    } else if (((Double)i[3]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N7dc3712895(i);
    } else if (true) {
      p = 0.007874015748031496;
    } 
    return p;
  }
  static double N7dc3712895(Object []i) {
    double p = Double.NaN;
    /* strLen */
    if (i[28] == null) {
      p = 0.5;
    } else if (((Double)i[28]).doubleValue() < 16.0) {
      p = 0.7083333333333334;
    } else if (true) {
      p = 0.08333333333333333;
    } 
    return p;
  }
  static double N2f67a4d3896(Object []i) {
    double p = Double.NaN;
    /* maxLenKnownWord */
    if (i[47] == null) {
      p = 0.02362533974492996;
    } else if (((Double)i[47]).doubleValue() < 1.5) {
    p = WekaStringREPTree.N5e3f861897(i);
    } else if (true) {
    p = WekaStringREPTree.N6d5620ce902(i);
    } 
    return p;
  }
  static double N5e3f861897(Object []i) {
    double p = Double.NaN;
    /* normEntropy */
    if (i[50] == null) {
      p = 0.5714285714285714;
    } else if (((Double)i[50]).doubleValue() < 2.388832343278267) {
      p = 0.09090909090909091;
    } else if (true) {
    p = WekaStringREPTree.N2fb0623e898(i);
    } 
    return p;
  }
  static double N2fb0623e898(Object []i) {
    double p = Double.NaN;
    /* vocals */
    if (i[33] == null) {
      p = 0.6730769230769231;
    } else if (((Double)i[33]).doubleValue() < 0.093841642228739) {
    p = WekaStringREPTree.N49b2a47d899(i);
    } else if (true) {
    p = WekaStringREPTree.N415b0b49901(i);
    } 
    return p;
  }
  static double N49b2a47d899(Object []i) {
    double p = Double.NaN;
    /* dashes */
    if (i[39] == null) {
      p = 0.7710843373493976;
    } else if (((Double)i[39]).doubleValue() < 3.5) {
    p = WekaStringREPTree.N5be1d0a4900(i);
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N5be1d0a4900(Object []i) {
    double p = Double.NaN;
    /* maxSingleChar */
    if (i[30] == null) {
      p = 0.8311688311688312;
    } else if (((Double)i[30]).doubleValue() < 0.4105263157894737) {
      p = 0.8648648648648649;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N415b0b49901(Object []i) {
    double p = Double.NaN;
    /* vocals */
    if (i[33] == null) {
      p = 0.2857142857142857;
    } else if (((Double)i[33]).doubleValue() < 0.16783216783216784) {
      p = 0.16666666666666666;
    } else if (true) {
      p = 1.0;
    } 
    return p;
  }
  static double N6d5620ce902(Object []i) {
    double p = Double.NaN;
    /* digits */
    if (i[32] == null) {
      p = 0.008803951041442989;
    } else if (((Double)i[32]).doubleValue() < 0.38675213675213677) {
    p = WekaStringREPTree.N311bf055903(i);
    } else if (true) {
    p = WekaStringREPTree.N7d322cad905(i);
    } 
    return p;
  }
  static double N311bf055903(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.21656050955414013;
    } else if (((Double)i[31]).doubleValue() < 0.6491228070175439) {
    p = WekaStringREPTree.N642a7222904(i);
    } else if (true) {
      p = 0.92;
    } 
    return p;
  }
  static double N642a7222904(Object []i) {
    double p = Double.NaN;
    /* equals */
    if (i[38] == null) {
      p = 0.08333333333333333;
    } else if (((Double)i[38]).doubleValue() < 0.5) {
      p = 0.0546875;
    } else if (true) {
      p = 1.0;
    } 
    return p;
  }
  static double N7d322cad905(Object []i) {
    double p = Double.NaN;
    /* strLen */
    if (i[28] == null) {
      p = 0.0015555555555555555;
    } else if (((Double)i[28]).doubleValue() < 57.5) {
      p = 6.672597864768683E-4;
    } else if (true) {
      p = 1.0;
    } 
    return p;
  }
  static double N21be3395906(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.9748091346315542;
    } else if (((Double)i[43]).doubleValue() < 1.0083333333333333) {
    p = WekaStringREPTree.N4f49f6af907(i);
    } else if (true) {
    p = WekaStringREPTree.N20bd8be5921(i);
    } 
    return p;
  }
  static double N4f49f6af907(Object []i) {
    double p = Double.NaN;
    /* regex */
    if (i[3] == null) {
      p = 0.9784201816892371;
    } else if (((Double)i[3]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N78452606908(i);
    } else if (true) {
    p = WekaStringREPTree.N15d49048912(i);
    } 
    return p;
  }
  static double N78452606908(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.9927850496767071;
    } else if (((Double)i[31]).doubleValue() < 0.2901913875598086) {
      p = 0.6216216216216216;
    } else if (true) {
    p = WekaStringREPTree.N147e2ae7909(i);
    } 
    return p;
  }
  static double N147e2ae7909(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.9938710952945828;
    } else if (((Double)i[43]).doubleValue() < 0.21305837139356132) {
    p = WekaStringREPTree.N448c8166910(i);
    } else if (true) {
    p = WekaStringREPTree.N4470fbd6911(i);
    } 
    return p;
  }
  static double N448c8166910(Object []i) {
    double p = Double.NaN;
    /* setDist */
    if (i[29] == null) {
      p = 0.7974683544303798;
    } else if (((Double)i[29]).doubleValue() < 0.48282241014799154) {
      p = 0.967479674796748;
    } else if (true) {
      p = 0.2;
    } 
    return p;
  }
  static double N4470fbd6911(Object []i) {
    double p = Double.NaN;
    /* maxSingleChar */
    if (i[30] == null) {
      p = 0.9951058411586822;
    } else if (((Double)i[30]).doubleValue() < 0.33245614035087717) {
      p = 0.995538737303326;
    } else if (true) {
      p = 0.5925925925925926;
    } 
    return p;
  }
  static double N15d49048912(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.8926300918295267;
    } else if (((Double)i[43]).doubleValue() < 0.9959128065395095) {
    p = WekaStringREPTree.N7098b907913(i);
    } else if (true) {
    p = WekaStringREPTree.N2235eaab916(i);
    } 
    return p;
  }
  static double N7098b907913(Object []i) {
    double p = Double.NaN;
    /* dashes */
    if (i[39] == null) {
      p = 0.9767132401862941;
    } else if (((Double)i[39]).doubleValue() < 4.5) {
      p = 0.9831023994592768;
    } else if (true) {
    p = WekaStringREPTree.N503f91c3914(i);
    } 
    return p;
  }
  static double N503f91c3914(Object []i) {
    double p = Double.NaN;
    /* knownUniqueWords */
    if (i[45] == null) {
      p = 0.574468085106383;
    } else if (((Double)i[45]).doubleValue() < 16.5) {
      p = 0.30434782608695654;
    } else if (true) {
    p = WekaStringREPTree.N13526e59915(i);
    } 
    return p;
  }
  static double N13526e59915(Object []i) {
    double p = Double.NaN;
    /* maxRepChars */
    if (i[35] == null) {
      p = 0.8333333333333334;
    } else if (((Double)i[35]).doubleValue() < 2.5) {
      p = 1.0;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N2235eaab916(Object []i) {
    double p = Double.NaN;
    /* knownUniqueWords */
    if (i[45] == null) {
      p = 0.6889605157131345;
    } else if (((Double)i[45]).doubleValue() < 8.5) {
    p = WekaStringREPTree.N17503f6b917(i);
    } else if (true) {
    p = WekaStringREPTree.N3b6d844d919(i);
    } 
    return p;
  }
  static double N17503f6b917(Object []i) {
    double p = Double.NaN;
    /* stackHeuristic */
    if (i[48] == null) {
      p = 0.3826429980276134;
    } else if (((Double)i[48]).doubleValue() < -0.4733940424235789) {
    p = WekaStringREPTree.N3bcd05cb918(i);
    } else if (true) {
      p = 0.793939393939394;
    } 
    return p;
  }
  static double N3bcd05cb918(Object []i) {
    double p = Double.NaN;
    /* nonVocals */
    if (i[34] == null) {
      p = 0.18421052631578946;
    } else if (((Double)i[34]).doubleValue() < 0.27972709551656916) {
      p = 0.09731543624161074;
    } else if (true) {
      p = 0.7727272727272727;
    } 
    return p;
  }
  static double N3b6d844d919(Object []i) {
    double p = Double.NaN;
    /* normEntropy */
    if (i[50] == null) {
      p = 0.9005449591280654;
    } else if (((Double)i[50]).doubleValue() < 3.713962629659777) {
      p = 0.9855670103092784;
    } else if (true) {
    p = WekaStringREPTree.N36804139920(i);
    } 
    return p;
  }
  static double N36804139920(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.7349397590361446;
    } else if (((Double)i[31]).doubleValue() < 0.7101018675721562) {
      p = 0.9491525423728814;
    } else if (true) {
      p = 0.20833333333333334;
    } 
    return p;
  }
  static double N20bd8be5921(Object []i) {
    double p = Double.NaN;
    /* setDist */
    if (i[29] == null) {
      p = 0.09836065573770492;
    } else if (((Double)i[29]).doubleValue() < 0.23502722323049002) {
      p = 0.8461538461538461;
    } else if (true) {
      p = 0.009174311926605505;
    } 
    return p;
  }
  static double N730d2164922(Object []i) {
    double p = Double.NaN;
    /* nonVocals */
    if (i[34] == null) {
      p = 0.8334138731289412;
    } else if (((Double)i[34]).doubleValue() < 0.40072992700729926) {
    p = WekaStringREPTree.N24959ca4923(i);
    } else if (true) {
    p = WekaStringREPTree.N4ef74c30996(i);
    } 
    return p;
  }
  static double N24959ca4923(Object []i) {
    double p = Double.NaN;
    /* maxSingleChar */
    if (i[30] == null) {
      p = 0.8990039316711963;
    } else if (((Double)i[30]).doubleValue() < 0.35857142857142854) {
    p = WekaStringREPTree.N10289886924(i);
    } else if (true) {
    p = WekaStringREPTree.N68746f22963(i);
    } 
    return p;
  }
  static double N10289886924(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.9254573170731707;
    } else if (((Double)i[43]).doubleValue() < 0.8410526315789473) {
    p = WekaStringREPTree.N5c86dbc5925(i);
    } else if (true) {
    p = WekaStringREPTree.N3e2055d6940(i);
    } 
    return p;
  }
  static double N5c86dbc5925(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.9892704718599178;
    } else if (((Double)i[51]).doubleValue() < 0.8418749999999999) {
    p = WekaStringREPTree.N461ad730926(i);
    } else if (true) {
    p = WekaStringREPTree.N5167f57d937(i);
    } 
    return p;
  }
  static double N461ad730926(Object []i) {
    double p = Double.NaN;
    /* nonVocals */
    if (i[34] == null) {
      p = 0.9900705443897245;
    } else if (((Double)i[34]).doubleValue() < 0.34330357142857143) {
    p = WekaStringREPTree.N4ee203eb927(i);
    } else if (true) {
    p = WekaStringREPTree.N3e78b6a5931(i);
    } 
    return p;
  }
  static double N4ee203eb927(Object []i) {
    double p = Double.NaN;
    /* setDist */
    if (i[29] == null) {
      p = 0.9934352086616871;
    } else if (((Double)i[29]).doubleValue() < 1.45) {
    p = WekaStringREPTree.N1a5a4e19928(i);
    } else if (true) {
    p = WekaStringREPTree.N60db1c0e930(i);
    } 
    return p;
  }
  static double N1a5a4e19928(Object []i) {
    double p = Double.NaN;
    /* color */
    if (i[10] == null) {
      p = 0.9936523169728544;
    } else if (((Double)i[10]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N7068e664929(i);
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N7068e664929(Object []i) {
    double p = Double.NaN;
    /* digits */
    if (i[32] == null) {
      p = 0.9937476862325696;
    } else if (((Double)i[32]).doubleValue() < 0.6515151515151515) {
      p = 0.9939902032079692;
    } else if (true) {
      p = 0.6538461538461539;
    } 
    return p;
  }
  static double N60db1c0e930(Object []i) {
    double p = Double.NaN;
    /* normEntropy */
    if (i[50] == null) {
      p = 0.36;
    } else if (((Double)i[50]).doubleValue() < 2.7687101288213753) {
      p = 0.8181818181818182;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N3e78b6a5931(Object []i) {
    double p = Double.NaN;
    /* stackHeuristic */
    if (i[48] == null) {
      p = 0.8766743648960739;
    } else if (((Double)i[48]).doubleValue() < -0.32372648640778035) {
    p = WekaStringREPTree.N769a1df5932(i);
    } else if (true) {
    p = WekaStringREPTree.N2438dcd935(i);
    } 
    return p;
  }
  static double N769a1df5932(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.5;
    } else if (((Double)i[51]).doubleValue() < 0.577922077922078) {
    p = WekaStringREPTree.N41f69e84933(i);
    } else if (true) {
    p = WekaStringREPTree.N7975d1d8934(i);
    } 
    return p;
  }
  static double N41f69e84933(Object []i) {
    double p = Double.NaN;
    /* stackHeuristic */
    if (i[48] == null) {
      p = 0.8516129032258064;
    } else if (((Double)i[48]).doubleValue() < -1.3886364447910209) {
      p = 0.1111111111111111;
    } else if (true) {
      p = 0.8972602739726028;
    } 
    return p;
  }
  static double N7975d1d8934(Object []i) {
    double p = Double.NaN;
    /* normEntropy */
    if (i[50] == null) {
      p = 0.12413793103448276;
    } else if (((Double)i[50]).doubleValue() < 3.0271691184406184) {
      p = 0.6875;
    } else if (true) {
      p = 0.05426356589147287;
    } 
    return p;
  }
  static double N2438dcd935(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.9372654155495979;
    } else if (((Double)i[51]).doubleValue() < 0.8245073891625616) {
    p = WekaStringREPTree.N24105dc5936(i);
    } else if (true) {
      p = 0.2222222222222222;
    } 
    return p;
  }
  static double N24105dc5936(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.9442338927991337;
    } else if (((Double)i[37]).doubleValue() < 6.5) {
      p = 0.9693693693693693;
    } else if (true) {
      p = 0.7142857142857143;
    } 
    return p;
  }
  static double N5167f57d937(Object []i) {
    double p = Double.NaN;
    /* maxSingleChar */
    if (i[30] == null) {
      p = 0.26506024096385544;
    } else if (((Double)i[30]).doubleValue() < 0.11923076923076924) {
      p = 1.0;
    } else if (true) {
    p = WekaStringREPTree.N64b0598938(i);
    } 
    return p;
  }
  static double N64b0598938(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.22784810126582278;
    } else if (((Double)i[51]).doubleValue() < 0.849002849002849) {
    p = WekaStringREPTree.N18f8cd79939(i);
    } else if (true) {
      p = 0.043478260869565216;
    } 
    return p;
  }
  static double N18f8cd79939(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.30357142857142855;
    } else if (((Double)i[37]).doubleValue() < 1.5) {
      p = 0.13333333333333333;
    } else if (true) {
      p = 0.5;
    } 
    return p;
  }
  static double N3e2055d6940(Object []i) {
    double p = Double.NaN;
    /* regex */
    if (i[3] == null) {
      p = 0.8487217612355509;
    } else if (((Double)i[3]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N50029372941(i);
    } else if (true) {
    p = WekaStringREPTree.N2ad48653950(i);
    } 
    return p;
  }
  static double N50029372941(Object []i) {
    double p = Double.NaN;
    /* setDist */
    if (i[29] == null) {
      p = 0.8933757862856255;
    } else if (((Double)i[29]).doubleValue() < 0.788888888888889) {
    p = WekaStringREPTree.Ne3b3b2f942(i);
    } else if (true) {
    p = WekaStringREPTree.N7f2cfe3f946(i);
    } 
    return p;
  }
  static double Ne3b3b2f942(Object []i) {
    double p = Double.NaN;
    /* color */
    if (i[10] == null) {
      p = 0.8180574035354495;
    } else if (((Double)i[10]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N50f6ac94943(i);
    } else if (true) {
      p = 0.00904977375565611;
    } 
    return p;
  }
  static double N50f6ac94943(Object []i) {
    double p = Double.NaN;
    /* knownWordsCount */
    if (i[44] == null) {
      p = 0.8249118233399785;
    } else if (((Double)i[44]).doubleValue() < 2.5) {
    p = WekaStringREPTree.N6cc4cdb9944(i);
    } else if (true) {
    p = WekaStringREPTree.N28194a50945(i);
    } 
    return p;
  }
  static double N6cc4cdb9944(Object []i) {
    double p = Double.NaN;
    /* sumRepChar */
    if (i[42] == null) {
      p = 0.9128784094315117;
    } else if (((Double)i[42]).doubleValue() < 1.5) {
      p = 0.9251637043966323;
    } else if (true) {
      p = 0.6082474226804123;
    } 
    return p;
  }
  static double N28194a50945(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.7701399688958009;
    } else if (((Double)i[51]).doubleValue() < 0.802439024390244) {
      p = 0.810013022717407;
    } else if (true) {
      p = 0.5255215268530847;
    } 
    return p;
  }
  static double N7f2cfe3f946(Object []i) {
    double p = Double.NaN;
    /* digits */
    if (i[32] == null) {
      p = 0.971987461810102;
    } else if (((Double)i[32]).doubleValue() < 0.22460804362644854) {
      p = 0.2037735849056604;
    } else if (true) {
    p = WekaStringREPTree.N1a5b6f42947(i);
    } 
    return p;
  }
  static double N1a5b6f42947(Object []i) {
    double p = Double.NaN;
    /* dashes */
    if (i[39] == null) {
      p = 0.9801507739193199;
    } else if (((Double)i[39]).doubleValue() < 1.5) {
    p = WekaStringREPTree.N5038d0b5948(i);
    } else if (true) {
    p = WekaStringREPTree.N32115b28949(i);
    } 
    return p;
  }
  static double N5038d0b5948(Object []i) {
    double p = Double.NaN;
    /* slashes */
    if (i[40] == null) {
      p = 0.9873185450986789;
    } else if (((Double)i[40]).doubleValue() < 0.5) {
      p = 0.988567695574065;
    } else if (true) {
      p = 0.03125;
    } 
    return p;
  }
  static double N32115b28949(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.5555555555555556;
    } else if (((Double)i[37]).doubleValue() < 4.5) {
      p = 0.06179775280898876;
    } else if (true) {
      p = 0.9279661016949152;
    } 
    return p;
  }
  static double N2ad48653950(Object []i) {
    double p = Double.NaN;
    /* digits */
    if (i[32] == null) {
      p = 0.6403659751789111;
    } else if (((Double)i[32]).doubleValue() < 0.6653439153439153) {
    p = WekaStringREPTree.N6bb4dd34951(i);
    } else if (true) {
    p = WekaStringREPTree.N4a07d605958(i);
    } 
    return p;
  }
  static double N6bb4dd34951(Object []i) {
    double p = Double.NaN;
    /* dashes */
    if (i[39] == null) {
      p = 0.7841280577161538;
    } else if (((Double)i[39]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N7d9f158f952(i);
    } else if (true) {
    p = WekaStringREPTree.N61710c6955(i);
    } 
    return p;
  }
  static double N7d9f158f952(Object []i) {
    double p = Double.NaN;
    /* digits */
    if (i[32] == null) {
      p = 0.8350146004778338;
    } else if (((Double)i[32]).doubleValue() < 0.09307359307359307) {
    p = WekaStringREPTree.N45efd90f953(i);
    } else if (true) {
    p = WekaStringREPTree.N4b8729ff954(i);
    } 
    return p;
  }
  static double N45efd90f953(Object []i) {
    double p = Double.NaN;
    /* sumRepChar */
    if (i[42] == null) {
      p = 0.5965346534653465;
    } else if (((Double)i[42]).doubleValue() < 1.5) {
      p = 0.8069544364508393;
    } else if (true) {
      p = 0.13227513227513227;
    } 
    return p;
  }
  static double N4b8729ff954(Object []i) {
    double p = Double.NaN;
    /* maxSingleChar */
    if (i[30] == null) {
      p = 0.8807339449541285;
    } else if (((Double)i[30]).doubleValue() < 0.33122858736355665) {
      p = 0.8944756864042342;
    } else if (true) {
      p = 0.5797101449275363;
    } 
    return p;
  }
  static double N61710c6955(Object []i) {
    double p = Double.NaN;
    /* normEntropy */
    if (i[50] == null) {
      p = 0.4973821989528796;
    } else if (((Double)i[50]).doubleValue() < 3.1784413240373888) {
    p = WekaStringREPTree.N3214ee6956(i);
    } else if (true) {
    p = WekaStringREPTree.N383dc82c957(i);
    } 
    return p;
  }
  static double N3214ee6956(Object []i) {
    double p = Double.NaN;
    /* datatype */
    if (i[18] == null) {
      p = 0.6102502979737783;
    } else if (((Double)i[18]).doubleValue() < 0.5) {
      p = 0.6984993178717599;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N383dc82c957(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.3072289156626506;
    } else if (((Double)i[43]).doubleValue() < 0.9186813186813187) {
      p = 0.9016393442622951;
    } else if (true) {
      p = 0.2242562929061785;
    } 
    return p;
  }
  static double N4a07d605958(Object []i) {
    double p = Double.NaN;
    /* digits */
    if (i[32] == null) {
      p = 0.05212177121771218;
    } else if (((Double)i[32]).doubleValue() < 0.6793939393939394) {
    p = WekaStringREPTree.N74287ea3959(i);
    } else if (true) {
    p = WekaStringREPTree.N2bdd8394961(i);
    } 
    return p;
  }
  static double N74287ea3959(Object []i) {
    double p = Double.NaN;
    /* maxSingleChar */
    if (i[30] == null) {
      p = 0.1891025641025641;
    } else if (((Double)i[30]).doubleValue() < 0.3232909728308502) {
    p = WekaStringREPTree.N7d7758be960(i);
    } else if (true) {
      p = 0.07106598984771574;
    } 
    return p;
  }
  static double N7d7758be960(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.391304347826087;
    } else if (((Double)i[37]).doubleValue() < 2.5) {
      p = 0.03389830508474576;
    } else if (true) {
      p = 0.7678571428571429;
    } 
    return p;
  }
  static double N2bdd8394961(Object []i) {
    double p = Double.NaN;
    /* datatype */
    if (i[18] == null) {
      p = 0.029094827586206896;
    } else if (((Double)i[18]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N5f9edf14962(i);
    } else if (true) {
      p = 0.00441696113074205;
    } 
    return p;
  }
  static double N5f9edf14962(Object []i) {
    double p = Double.NaN;
    /* stackHeuristic */
    if (i[48] == null) {
      p = 0.06767955801104972;
    } else if (((Double)i[48]).doubleValue() < -0.13560508801264542) {
      p = 0.04131054131054131;
    } else if (true) {
      p = 0.9090909090909091;
    } 
    return p;
  }
  static double N68746f22963(Object []i) {
    double p = Double.NaN;
    /* regex */
    if (i[3] == null) {
      p = 0.5526940986410719;
    } else if (((Double)i[3]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N2f01783a964(i);
    } else if (true) {
    p = WekaStringREPTree.N4149c063982(i);
    } 
    return p;
  }
  static double N2f01783a964(Object []i) {
    double p = Double.NaN;
    /* maxSingleChar */
    if (i[30] == null) {
      p = 0.6403279467680608;
    } else if (((Double)i[30]).doubleValue() < 0.5106029106029106) {
    p = WekaStringREPTree.N68878f6d965(i);
    } else if (true) {
    p = WekaStringREPTree.N18317edc977(i);
    } 
    return p;
  }
  static double N68878f6d965(Object []i) {
    double p = Double.NaN;
    /* knownUniqueWords */
    if (i[45] == null) {
      p = 0.704302548643464;
    } else if (((Double)i[45]).doubleValue() < 4.5) {
    p = WekaStringREPTree.N41488b16966(i);
    } else if (true) {
    p = WekaStringREPTree.N78fa769e972(i);
    } 
    return p;
  }
  static double N41488b16966(Object []i) {
    double p = Double.NaN;
    /* digits */
    if (i[32] == null) {
      p = 0.6422904449810279;
    } else if (((Double)i[32]).doubleValue() < 0.69375) {
    p = WekaStringREPTree.Na8ef162967(i);
    } else if (true) {
    p = WekaStringREPTree.N7ac296f6969(i);
    } 
    return p;
  }
  static double Na8ef162967(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.7734483718341219;
    } else if (((Double)i[43]).doubleValue() < 0.8166666666666667) {
      p = 0.9680365296803652;
    } else if (true) {
    p = WekaStringREPTree.N2eea88a1968(i);
    } 
    return p;
  }
  static double N2eea88a1968(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.6881505204163331;
    } else if (((Double)i[37]).doubleValue() < 5.5) {
      p = 0.7239583333333334;
    } else if (true) {
      p = 0.26288659793814434;
    } 
    return p;
  }
  static double N7ac296f6969(Object []i) {
    double p = Double.NaN;
    /* knownWordsCount */
    if (i[44] == null) {
      p = 0.42857142857142855;
    } else if (((Double)i[44]).doubleValue() < 5.5) {
    p = WekaStringREPTree.N7fd7a283970(i);
    } else if (true) {
    p = WekaStringREPTree.N22f59fa971(i);
    } 
    return p;
  }
  static double N7fd7a283970(Object []i) {
    double p = Double.NaN;
    /* knownWordsCount */
    if (i[44] == null) {
      p = 0.33918539325842695;
    } else if (((Double)i[44]).doubleValue() < 3.5) {
      p = 0.5050505050505051;
    } else if (true) {
      p = 0.31239804241435565;
    } 
    return p;
  }
  static double N22f59fa971(Object []i) {
    double p = Double.NaN;
    /* dashes */
    if (i[39] == null) {
      p = 0.5915492957746479;
    } else if (((Double)i[39]).doubleValue() < 0.5) {
      p = 0.700152207001522;
    } else if (true) {
      p = 0.016129032258064516;
    } 
    return p;
  }
  static double N78fa769e972(Object []i) {
    double p = Double.NaN;
    /* dashes */
    if (i[39] == null) {
      p = 0.944;
    } else if (((Double)i[39]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N16612a51973(i);
    } else if (true) {
    p = WekaStringREPTree.N2c78324b975(i);
    } 
    return p;
  }
  static double N16612a51973(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.9631688672689368;
    } else if (((Double)i[43]).doubleValue() < 1.2) {
    p = WekaStringREPTree.N54e041a4974(i);
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N54e041a4974(Object []i) {
    double p = Double.NaN;
    /* digits */
    if (i[32] == null) {
      p = 0.9665271966527197;
    } else if (((Double)i[32]).doubleValue() < 0.4772727272727273) {
      p = 0.4;
    } else if (true) {
      p = 0.9705056179775281;
    } 
    return p;
  }
  static double N2c78324b975(Object []i) {
    double p = Double.NaN;
    /* setDist */
    if (i[29] == null) {
      p = 0.4918032786885245;
    } else if (((Double)i[29]).doubleValue() < 2.8) {
    p = WekaStringREPTree.N79defdc976(i);
    } else if (true) {
      p = 0.9565217391304348;
    } 
    return p;
  }
  static double N79defdc976(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.21052631578947367;
    } else if (((Double)i[31]).doubleValue() < 0.9473684210526316) {
      p = 1.0;
    } else if (true) {
      p = 0.03225806451612903;
    } 
    return p;
  }
  static double N18317edc977(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.22271914132379247;
    } else if (((Double)i[43]).doubleValue() < 0.9864864864864865) {
      p = 0.7333333333333333;
    } else if (true) {
    p = WekaStringREPTree.N4e0ae11f978(i);
    } 
    return p;
  }
  static double N4e0ae11f978(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.20863970588235295;
    } else if (((Double)i[37]).doubleValue() < 35.5) {
    p = WekaStringREPTree.N238d68ff979(i);
    } else if (true) {
      p = 1.0;
    } 
    return p;
  }
  static double N238d68ff979(Object []i) {
    double p = Double.NaN;
    /* maxRepChars */
    if (i[35] == null) {
      p = 0.19832402234636873;
    } else if (((Double)i[35]).doubleValue() < 3.5) {
    p = WekaStringREPTree.N4b86805d980(i);
    } else if (true) {
    p = WekaStringREPTree.N5852c06f981(i);
    } 
    return p;
  }
  static double N4b86805d980(Object []i) {
    double p = Double.NaN;
    /* digits */
    if (i[32] == null) {
      p = 0.2541743970315399;
    } else if (((Double)i[32]).doubleValue() < 0.7071428571428571) {
      p = 0.3641304347826087;
    } else if (true) {
      p = 0.19718309859154928;
    } 
    return p;
  }
  static double N5852c06f981(Object []i) {
    double p = Double.NaN;
    /* equals */
    if (i[38] == null) {
      p = 0.14205607476635515;
    } else if (((Double)i[38]).doubleValue() < 0.5) {
      p = 0.1311787072243346;
    } else if (true) {
      p = 0.7777777777777778;
    } 
    return p;
  }
  static double N4149c063982(Object []i) {
    double p = Double.NaN;
    /* knownWordsCount */
    if (i[44] == null) {
      p = 0.2026578073089701;
    } else if (((Double)i[44]).doubleValue() < 2.5) {
    p = WekaStringREPTree.N9cb8225983(i);
    } else if (true) {
    p = WekaStringREPTree.N7d61eb55991(i);
    } 
    return p;
  }
  static double N9cb8225983(Object []i) {
    double p = Double.NaN;
    /* setDist */
    if (i[29] == null) {
      p = 0.6345733041575492;
    } else if (((Double)i[29]).doubleValue() < 1.2916666666666665) {
    p = WekaStringREPTree.N76b07f29984(i);
    } else if (true) {
    p = WekaStringREPTree.N17d919b6988(i);
    } 
    return p;
  }
  static double N76b07f29984(Object []i) {
    double p = Double.NaN;
    /* sumRepChar */
    if (i[42] == null) {
      p = 0.754054054054054;
    } else if (((Double)i[42]).doubleValue() < 1.5) {
    p = WekaStringREPTree.N38af9828985(i);
    } else if (true) {
      p = 0.2413793103448276;
    } 
    return p;
  }
  static double N38af9828985(Object []i) {
    double p = Double.NaN;
    /* strLen */
    if (i[28] == null) {
      p = 0.7976539589442815;
    } else if (((Double)i[28]).doubleValue() < 5.5) {
    p = WekaStringREPTree.N376a0d86986(i);
    } else if (true) {
    p = WekaStringREPTree.N62656be4987(i);
    } 
    return p;
  }
  static double N376a0d86986(Object []i) {
    double p = Double.NaN;
    /* digits */
    if (i[32] == null) {
      p = 0.8253424657534246;
    } else if (((Double)i[32]).doubleValue() < 0.45) {
      p = 0.8659003831417624;
    } else if (true) {
      p = 0.4838709677419355;
    } 
    return p;
  }
  static double N62656be4987(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.6326530612244898;
    } else if (((Double)i[43]).doubleValue() < 0.8333333333333333) {
      p = 0.9375;
    } else if (true) {
      p = 0.48484848484848486;
    } 
    return p;
  }
  static double N17d919b6988(Object []i) {
    double p = Double.NaN;
    /* equals */
    if (i[38] == null) {
      p = 0.12643678160919541;
    } else if (((Double)i[38]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N53f3bdbd989(i);
    } else if (true) {
      p = 0.8333333333333334;
    } 
    return p;
  }
  static double N53f3bdbd989(Object []i) {
    double p = Double.NaN;
    /* digits */
    if (i[32] == null) {
      p = 0.07407407407407407;
    } else if (((Double)i[32]).doubleValue() < 0.16025641025641024) {
      p = 0.02;
    } else if (true) {
    p = WekaStringREPTree.N34129c78990(i);
    } 
    return p;
  }
  static double N34129c78990(Object []i) {
    double p = Double.NaN;
    /* maxRepChars */
    if (i[35] == null) {
      p = 0.16129032258064516;
    } else if (((Double)i[35]).doubleValue() < 2.5) {
      p = 0.75;
    } else if (true) {
      p = 0.07407407407407407;
    } 
    return p;
  }
  static double N7d61eb55991(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.08303030303030302;
    } else if (((Double)i[31]).doubleValue() < 0.80625) {
    p = WekaStringREPTree.N222a59e6992(i);
    } else if (true) {
    p = WekaStringREPTree.N6c7a164b993(i);
    } 
    return p;
  }
  static double N222a59e6992(Object []i) {
    double p = Double.NaN;
    /* digits */
    if (i[32] == null) {
      p = 0.575;
    } else if (((Double)i[32]).doubleValue() < 0.0625) {
      p = 0.06666666666666667;
    } else if (true) {
      p = 0.6923076923076923;
    } 
    return p;
  }
  static double N6c7a164b993(Object []i) {
    double p = Double.NaN;
    /* equals */
    if (i[38] == null) {
      p = 0.05796178343949045;
    } else if (((Double)i[38]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N4c2bb6e0994(i);
    } else if (true) {
      p = 1.0;
    } 
    return p;
  }
  static double N4c2bb6e0994(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.045806451612903226;
    } else if (((Double)i[43]).doubleValue() < 0.8541666666666667) {
      p = 0.8;
    } else if (true) {
    p = WekaStringREPTree.N3e62d773995(i);
    } 
    return p;
  }
  static double N3e62d773995(Object []i) {
    double p = Double.NaN;
    /* nonVocals */
    if (i[34] == null) {
      p = 0.04090909090909091;
    } else if (((Double)i[34]).doubleValue() < 0.08125) {
      p = 0.037352555701179554;
    } else if (true) {
      p = 0.42857142857142855;
    } 
    return p;
  }
  static double N4ef74c30996(Object []i) {
    double p = Double.NaN;
    /* normEntropy */
    if (i[50] == null) {
      p = 0.3304199420769549;
    } else if (((Double)i[50]).doubleValue() < 2.9521078536222998) {
    p = WekaStringREPTree.N7283d3eb997(i);
    } else if (true) {
    p = WekaStringREPTree.N7905a0b81030(i);
    } 
    return p;
  }
  static double N7283d3eb997(Object []i) {
    double p = Double.NaN;
    /* maxLenKnownWord */
    if (i[47] == null) {
      p = 0.6551268181271788;
    } else if (((Double)i[47]).doubleValue() < 1.5) {
    p = WekaStringREPTree.N638ef7ed998(i);
    } else if (true) {
    p = WekaStringREPTree.Nb86de0d1015(i);
    } 
    return p;
  }
  static double N638ef7ed998(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.8190086402910414;
    } else if (((Double)i[43]).doubleValue() < 0.48333333333333334) {
    p = WekaStringREPTree.N4bff7da0999(i);
    } else if (true) {
    p = WekaStringREPTree.N3cce57c71007(i);
    } 
    return p;
  }
  static double N4bff7da0999(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.3569937369519833;
    } else if (((Double)i[51]).doubleValue() < 0.7703296703296703) {
    p = WekaStringREPTree.N3f1d2e231000(i);
    } else if (true) {
    p = WekaStringREPTree.N1f760b471005(i);
    } 
    return p;
  }
  static double N3f1d2e231000(Object []i) {
    double p = Double.NaN;
    /* stackHeuristic */
    if (i[48] == null) {
      p = 0.4778761061946903;
    } else if (((Double)i[48]).doubleValue() < -0.2716514135686573) {
    p = WekaStringREPTree.N536dbea01001(i);
    } else if (true) {
    p = WekaStringREPTree.N776a6d9b1003(i);
    } 
    return p;
  }
  static double N536dbea01001(Object []i) {
    double p = Double.NaN;
    /* equals */
    if (i[38] == null) {
      p = 0.21;
    } else if (((Double)i[38]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N47c81abf1002(i);
    } else if (true) {
      p = 1.0;
    } 
    return p;
  }
  static double N47c81abf1002(Object []i) {
    double p = Double.NaN;
    /* digits */
    if (i[32] == null) {
      p = 0.17277486910994763;
    } else if (((Double)i[32]).doubleValue() < 0.09545454545454546) {
      p = 0.28125;
    } else if (true) {
      p = 0.06315789473684211;
    } 
    return p;
  }
  static double N776a6d9b1003(Object []i) {
    double p = Double.NaN;
    /* digits */
    if (i[32] == null) {
      p = 0.8633093525179856;
    } else if (((Double)i[32]).doubleValue() < 0.38095238095238093) {
    p = WekaStringREPTree.N21d039631004(i);
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N21d039631004(Object []i) {
    double p = Double.NaN;
    /* nonVocals */
    if (i[34] == null) {
      p = 0.8955223880597015;
    } else if (((Double)i[34]).doubleValue() < 0.7321428571428572) {
      p = 0.944;
    } else if (true) {
      p = 0.2222222222222222;
    } 
    return p;
  }
  static double N1f760b471005(Object []i) {
    double p = Double.NaN;
    /* strLen */
    if (i[28] == null) {
      p = 0.06428571428571428;
    } else if (((Double)i[28]).doubleValue() < 5.5) {
    p = WekaStringREPTree.N18ece7f41006(i);
    } else if (true) {
      p = 0.03875968992248062;
    } 
    return p;
  }
  static double N18ece7f41006(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.36363636363636365;
    } else if (((Double)i[51]).doubleValue() < 0.8074074074074075) {
      p = 1.0;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N3cce57c71007(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.875478438377137;
    } else if (((Double)i[51]).doubleValue() < 0.8418749999999999) {
    p = WekaStringREPTree.N1cf56a1c1008(i);
    } else if (true) {
    p = WekaStringREPTree.N2e570ded1014(i);
    } 
    return p;
  }
  static double N1cf56a1c1008(Object []i) {
    double p = Double.NaN;
    /* setDist */
    if (i[29] == null) {
      p = 0.8877604166666667;
    } else if (((Double)i[29]).doubleValue() < 1.303030303030303) {
    p = WekaStringREPTree.N33f676f61009(i);
    } else if (true) {
    p = WekaStringREPTree.N3576ddc21012(i);
    } 
    return p;
  }
  static double N33f676f61009(Object []i) {
    double p = Double.NaN;
    /* knownUniqueWords */
    if (i[45] == null) {
      p = 0.8987006099177937;
    } else if (((Double)i[45]).doubleValue() < 3.5) {
    p = WekaStringREPTree.N4c5ae43b1010(i);
    } else if (true) {
    p = WekaStringREPTree.N264f2181011(i);
    } 
    return p;
  }
  static double N4c5ae43b1010(Object []i) {
    double p = Double.NaN;
    /* stackHeuristic */
    if (i[48] == null) {
      p = 0.9343326195574589;
    } else if (((Double)i[48]).doubleValue() < -0.11409994360395032) {
      p = 0.8671259842519685;
    } else if (true) {
      p = 0.9725643896976484;
    } 
    return p;
  }
  static double N264f2181011(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.7956656346749226;
    } else if (((Double)i[51]).doubleValue() < 0.771712158808933) {
      p = 0.9688427299703264;
    } else if (true) {
      p = 0.4;
    } 
    return p;
  }
  static double N3576ddc21012(Object []i) {
    double p = Double.NaN;
    /* maxSingleChar */
    if (i[30] == null) {
      p = 0.2898550724637681;
    } else if (((Double)i[30]).doubleValue() < 0.28869047619047616) {
      p = 1.0;
    } else if (true) {
    p = WekaStringREPTree.N35b74c5c1013(i);
    } 
    return p;
  }
  static double N35b74c5c1013(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.2222222222222222;
    } else if (((Double)i[31]).doubleValue() < 0.4642857142857143) {
      p = 0.75;
    } else if (true) {
      p = 0.1864406779661017;
    } 
    return p;
  }
  static double N2e570ded1014(Object []i) {
    double p = Double.NaN;
    /* digits */
    if (i[32] == null) {
      p = 0.27848101265822783;
    } else if (((Double)i[32]).doubleValue() < 0.225) {
      p = 0.04;
    } else if (true) {
      p = 0.6896551724137931;
    } 
    return p;
  }
  static double Nb86de0d1015(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.47130833970925784;
    } else if (((Double)i[51]).doubleValue() < 0.8021739130434783) {
    p = WekaStringREPTree.N81d9a721016(i);
    } else if (true) {
    p = WekaStringREPTree.N51bf5add1029(i);
    } 
    return p;
  }
  static double N81d9a721016(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.5625192012288787;
    } else if (((Double)i[37]).doubleValue() < 4.5) {
    p = WekaStringREPTree.N747f2811017(i);
    } else if (true) {
    p = WekaStringREPTree.N1ebea0081024(i);
    } 
    return p;
  }
  static double N747f2811017(Object []i) {
    double p = Double.NaN;
    /* maxLenKnownWord */
    if (i[47] == null) {
      p = 0.68578352180937;
    } else if (((Double)i[47]).doubleValue() < 2.5) {
    p = WekaStringREPTree.N1169afe11018(i);
    } else if (true) {
    p = WekaStringREPTree.N70e38ce11021(i);
    } 
    return p;
  }
  static double N1169afe11018(Object []i) {
    double p = Double.NaN;
    /* strLen */
    if (i[28] == null) {
      p = 0.7711693548387096;
    } else if (((Double)i[28]).doubleValue() < 6.5) {
    p = WekaStringREPTree.N2ca26d771019(i);
    } else if (true) {
    p = WekaStringREPTree.N4808bc9b1020(i);
    } 
    return p;
  }
  static double N2ca26d771019(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.9013933547695605;
    } else if (((Double)i[43]).doubleValue() < 0.9166666666666667) {
      p = 0.994475138121547;
    } else if (true) {
      p = 0.8423817863397548;
    } 
    return p;
  }
  static double N4808bc9b1020(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.6555661274976213;
    } else if (((Double)i[51]).doubleValue() < 0.7417989417989418) {
      p = 0.8042203985932005;
    } else if (true) {
      p = 0.015151515151515152;
    } 
    return p;
  }
  static double N70e38ce11021(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.34146341463414637;
    } else if (((Double)i[51]).doubleValue() < 0.7413381123058542) {
    p = WekaStringREPTree.N2ca923bb1022(i);
    } else if (true) {
    p = WekaStringREPTree.N13df2a8c1023(i);
    } 
    return p;
  }
  static double N2ca923bb1022(Object []i) {
    double p = Double.NaN;
    /* maxRepChars */
    if (i[35] == null) {
      p = 0.5407725321888412;
    } else if (((Double)i[35]).doubleValue() < 2.5) {
      p = 0.779874213836478;
    } else if (true) {
      p = 0.02702702702702703;
    } 
    return p;
  }
  static double N13df2a8c1023(Object []i) {
    double p = Double.NaN;
    /* setDist */
    if (i[29] == null) {
      p = 0.16216216216216217;
    } else if (((Double)i[29]).doubleValue() < 0.55) {
      p = 0.09170305676855896;
    } else if (true) {
      p = 0.7;
    } 
    return p;
  }
  static double N1ebea0081024(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.17073170731707318;
    } else if (((Double)i[51]).doubleValue() < 0.7417989417989418) {
    p = WekaStringREPTree.N72d6b3ba1025(i);
    } else if (true) {
    p = WekaStringREPTree.N163370c21028(i);
    } 
    return p;
  }
  static double N72d6b3ba1025(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.4155844155844156;
    } else if (((Double)i[31]).doubleValue() < 0.4330357142857143) {
    p = WekaStringREPTree.N1787f2a01026(i);
    } else if (true) {
    p = WekaStringREPTree.N7de621961027(i);
    } 
    return p;
  }
  static double N1787f2a01026(Object []i) {
    double p = Double.NaN;
    /* maxSingleChar */
    if (i[30] == null) {
      p = 0.10416666666666667;
    } else if (((Double)i[30]).doubleValue() < 0.4195804195804196) {
      p = 0.058394160583941604;
    } else if (true) {
      p = 1.0;
    } 
    return p;
  }
  static double N7de621961027(Object []i) {
    double p = Double.NaN;
    /* maxLenKnownWord */
    if (i[47] == null) {
      p = 0.6890243902439024;
    } else if (((Double)i[47]).doubleValue() < 2.5) {
      p = 0.7720588235294118;
    } else if (true) {
      p = 0.2857142857142857;
    } 
    return p;
  }
  static double N163370c21028(Object []i) {
    double p = Double.NaN;
    /* vocals */
    if (i[33] == null) {
      p = 0.010615711252653927;
    } else if (((Double)i[33]).doubleValue() < 0.07142857142857142) {
      p = 0.00641025641025641;
    } else if (true) {
      p = 0.6666666666666666;
    } 
    return p;
  }
  static double N51bf5add1029(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.025525525525525526;
    } else if (((Double)i[31]).doubleValue() < 0.225) {
      p = 1.0;
    } else if (true) {
      p = 0.015174506828528073;
    } 
    return p;
  }
  static double N7905a0b81030(Object []i) {
    double p = Double.NaN;
    /* equals */
    if (i[38] == null) {
      p = 0.08523191431424162;
    } else if (((Double)i[38]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N35a3d49f1031(i);
    } else if (true) {
    p = WekaStringREPTree.N77659b301043(i);
    } 
    return p;
  }
  static double N35a3d49f1031(Object []i) {
    double p = Double.NaN;
    /* vocals */
    if (i[33] == null) {
      p = 0.0681292233638804;
    } else if (((Double)i[33]).doubleValue() < 0.06904761904761905) {
    p = WekaStringREPTree.N389b07891032(i);
    } else if (true) {
    p = WekaStringREPTree.N19b843ba1041(i);
    } 
    return p;
  }
  static double N389b07891032(Object []i) {
    double p = Double.NaN;
    /* nonVocals */
    if (i[34] == null) {
      p = 0.054812707444286395;
    } else if (((Double)i[34]).doubleValue() < 0.5007204610951008) {
    p = WekaStringREPTree.N13d9cbf51033(i);
    } else if (true) {
    p = WekaStringREPTree.N7b50df341038(i);
    } 
    return p;
  }
  static double N13d9cbf51033(Object []i) {
    double p = Double.NaN;
    /* stackHeuristic */
    if (i[48] == null) {
      p = 0.1438430802760625;
    } else if (((Double)i[48]).doubleValue() < -0.4975731229135022) {
    p = WekaStringREPTree.N478db9561034(i);
    } else if (true) {
    p = WekaStringREPTree.N6ca18a141035(i);
    } 
    return p;
  }
  static double N478db9561034(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.023696682464454975;
    } else if (((Double)i[31]).doubleValue() < 0.48545454545454547) {
      p = 1.0;
    } else if (true) {
      p = 0.01904761904761905;
    } 
    return p;
  }
  static double N6ca18a141035(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.246133154001345;
    } else if (((Double)i[51]).doubleValue() < 0.645497311827957) {
    p = WekaStringREPTree.Nc667f461036(i);
    } else if (true) {
    p = WekaStringREPTree.N51bd8b5c1037(i);
    } 
    return p;
  }
  static double Nc667f461036(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.8387096774193549;
    } else if (((Double)i[37]).doubleValue() < 12.5) {
      p = 0.945054945054945;
    } else if (true) {
      p = 0.2857142857142857;
    } 
    return p;
  }
  static double N51bd8b5c1037(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.14488188976377953;
    } else if (((Double)i[51]).doubleValue() < 0.7154761904761905) {
      p = 0.3699788583509514;
    } else if (true) {
      p = 0.011292346298619825;
    } 
    return p;
  }
  static double N7b50df341038(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.02335728952772074;
    } else if (((Double)i[31]).doubleValue() < 0.04310868245294475) {
      p = 1.0;
    } else if (true) {
    p = WekaStringREPTree.N1b410b601039(i);
    } 
    return p;
  }
  static double N1b410b601039(Object []i) {
    double p = Double.NaN;
    /* digits */
    if (i[32] == null) {
      p = 0.020970024443586775;
    } else if (((Double)i[32]).doubleValue() < 0.32666666666666666) {
    p = WekaStringREPTree.N2462cb011040(i);
    } else if (true) {
      p = 0.47058823529411764;
    } 
    return p;
  }
  static double N2462cb011040(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.01998452810727179;
    } else if (((Double)i[31]).doubleValue() < 0.07207792207792207) {
      p = 0.3225806451612903;
    } else if (true) {
      p = 0.018770226537216828;
    } 
    return p;
  }
  static double N19b843ba1041(Object []i) {
    double p = Double.NaN;
    /* maxRepChars */
    if (i[35] == null) {
      p = 0.6124031007751938;
    } else if (((Double)i[35]).doubleValue() < 2.5) {
    p = WekaStringREPTree.N64ec96c61042(i);
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N64ec96c61042(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.79;
    } else if (((Double)i[51]).doubleValue() < 0.7198879551820728) {
      p = 0.8651685393258427;
    } else if (true) {
      p = 0.18181818181818182;
    } 
    return p;
  }
  static double N77659b301043(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.9485981308411215;
    } else if (((Double)i[37]).doubleValue() < 13.5) {
      p = 0.995049504950495;
    } else if (true) {
      p = 0.16666666666666666;
    } 
    return p;
  }
  static double N456d6c1e1044(Object []i) {
    double p = Double.NaN;
    /* vocals */
    if (i[33] == null) {
      p = 0.6659470752089136;
    } else if (((Double)i[33]).doubleValue() < 0.2386128364389234) {
    p = WekaStringREPTree.N1e13529a1045(i);
    } else if (true) {
    p = WekaStringREPTree.N7354b8c51170(i);
    } 
    return p;
  }
  static double N1e13529a1045(Object []i) {
    double p = Double.NaN;
    /* maxLenKnownWord */
    if (i[47] == null) {
      p = 0.7821222685533301;
    } else if (((Double)i[47]).doubleValue() < 2.5) {
    p = WekaStringREPTree.N1ec9bd381046(i);
    } else if (true) {
    p = WekaStringREPTree.N7c3fdb621092(i);
    } 
    return p;
  }
  static double N1ec9bd381046(Object []i) {
    double p = Double.NaN;
    /* normEntropy */
    if (i[50] == null) {
      p = 0.9007009345794392;
    } else if (((Double)i[50]).doubleValue() < 2.3078392769838545) {
    p = WekaStringREPTree.N452e19ca1047(i);
    } else if (true) {
    p = WekaStringREPTree.N56dc15511068(i);
    } 
    return p;
  }
  static double N452e19ca1047(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.5316657796700373;
    } else if (((Double)i[43]).doubleValue() < 0.985981308411215) {
    p = WekaStringREPTree.N6b0d80ed1048(i);
    } else if (true) {
    p = WekaStringREPTree.N3cfdd8201050(i);
    } 
    return p;
  }
  static double N6b0d80ed1048(Object []i) {
    double p = Double.NaN;
    /* stackHeuristic */
    if (i[48] == null) {
      p = 0.8367729831144465;
    } else if (((Double)i[48]).doubleValue() < -0.5620675320664842) {
      p = 0.12359550561797752;
    } else if (true) {
    p = WekaStringREPTree.N6f8e88941049(i);
    } 
    return p;
  }
  static double N6f8e88941049(Object []i) {
    double p = Double.NaN;
    /* setDist */
    if (i[29] == null) {
      p = 0.9797297297297297;
    } else if (((Double)i[29]).doubleValue() < 0.55) {
      p = 0.0;
    } else if (true) {
      p = 0.9841628959276018;
    } 
    return p;
  }
  static double N3cfdd8201050(Object []i) {
    double p = Double.NaN;
    /* nonVocals */
    if (i[34] == null) {
      p = 0.41084695393759285;
    } else if (((Double)i[34]).doubleValue() < 0.2792207792207792) {
    p = WekaStringREPTree.N928763c1051(i);
    } else if (true) {
    p = WekaStringREPTree.Na1f72f51058(i);
    } 
    return p;
  }
  static double N928763c1051(Object []i) {
    double p = Double.NaN;
    /* stackHeuristic */
    if (i[48] == null) {
      p = 0.17713004484304934;
    } else if (((Double)i[48]).doubleValue() < -0.2716514135686573) {
    p = WekaStringREPTree.Ne25951c1052(i);
    } else if (true) {
    p = WekaStringREPTree.N15f476641053(i);
    } 
    return p;
  }
  static double Ne25951c1052(Object []i) {
    double p = Double.NaN;
    /* date */
    if (i[17] == null) {
      p = 0.0375;
    } else if (((Double)i[17]).doubleValue() < 0.5) {
      p = 0.02;
    } else if (true) {
      p = 0.3;
    } 
    return p;
  }
  static double N15f476641053(Object []i) {
    double p = Double.NaN;
    /* maxRepChars */
    if (i[35] == null) {
      p = 0.25524475524475526;
    } else if (((Double)i[35]).doubleValue() < 1.5) {
    p = WekaStringREPTree.N471a90221054(i);
    } else if (true) {
    p = WekaStringREPTree.N19976a651057(i);
    } 
    return p;
  }
  static double N471a90221054(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.16877637130801687;
    } else if (((Double)i[37]).doubleValue() < 3.5) {
    p = WekaStringREPTree.Ndc9876b1055(i);
    } else if (true) {
    p = WekaStringREPTree.N2f666ebb1056(i);
    } 
    return p;
  }
  static double Ndc9876b1055(Object []i) {
    double p = Double.NaN;
    /* regex */
    if (i[3] == null) {
      p = 0.1336405529953917;
    } else if (((Double)i[3]).doubleValue() < 0.5) {
      p = 0.10309278350515463;
    } else if (true) {
      p = 0.391304347826087;
    } 
    return p;
  }
  static double N2f666ebb1056(Object []i) {
    double p = Double.NaN;
    /* equals */
    if (i[38] == null) {
      p = 0.55;
    } else if (((Double)i[38]).doubleValue() < 0.5) {
      p = 0.6470588235294118;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N19976a651057(Object []i) {
    double p = Double.NaN;
    /* commands */
    if (i[5] == null) {
      p = 0.673469387755102;
    } else if (((Double)i[5]).doubleValue() < 0.5) {
      p = 0.8;
    } else if (true) {
      p = 0.1111111111111111;
    } 
    return p;
  }
  static double Na1f72f51058(Object []i) {
    double p = Double.NaN;
    /* regex */
    if (i[3] == null) {
      p = 0.5266666666666666;
    } else if (((Double)i[3]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N4b2c5e021059(i);
    } else if (true) {
    p = WekaStringREPTree.N5e17553a1066(i);
    } 
    return p;
  }
  static double N4b2c5e021059(Object []i) {
    double p = Double.NaN;
    /* stackHeuristic */
    if (i[48] == null) {
      p = 0.6421052631578947;
    } else if (((Double)i[48]).doubleValue() < -0.261827823560706) {
    p = WekaStringREPTree.N57a3e26a1060(i);
    } else if (true) {
    p = WekaStringREPTree.N2dc9b0f51063(i);
    } 
    return p;
  }
  static double N57a3e26a1060(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.31788079470198677;
    } else if (((Double)i[31]).doubleValue() < 0.18055555555555555) {
      p = 1.0;
    } else if (true) {
    p = WekaStringREPTree.N75c56eb91061(i);
    } 
    return p;
  }
  static double N75c56eb91061(Object []i) {
    double p = Double.NaN;
    /* simpleSplitWordLen */
    if (i[36] == null) {
      p = 0.23134328358208955;
    } else if (((Double)i[36]).doubleValue() < 4.5) {
      p = 0.7142857142857143;
    } else if (true) {
    p = WekaStringREPTree.N4bc222e1062(i);
    } 
    return p;
  }
  static double N4bc222e1062(Object []i) {
    double p = Double.NaN;
    /* date */
    if (i[17] == null) {
      p = 0.2047244094488189;
    } else if (((Double)i[17]).doubleValue() < 0.5) {
      p = 0.27380952380952384;
    } else if (true) {
      p = 0.06976744186046512;
    } 
    return p;
  }
  static double N2dc9b0f51063(Object []i) {
    double p = Double.NaN;
    /* country */
    if (i[14] == null) {
      p = 0.7373540856031129;
    } else if (((Double)i[14]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N6531a7941064(i);
    } else if (true) {
      p = 0.041666666666666664;
    } 
    return p;
  }
  static double N6531a7941064(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.7714285714285715;
    } else if (((Double)i[51]).doubleValue() < 0.7899159663865547) {
      p = 0.8414239482200647;
    } else if (true) {
    p = WekaStringREPTree.N3b5fad2d1065(i);
    } 
    return p;
  }
  static double N3b5fad2d1065(Object []i) {
    double p = Double.NaN;
    /* maxRepChars */
    if (i[35] == null) {
      p = 0.6519337016574586;
    } else if (((Double)i[35]).doubleValue() < 1.5) {
      p = 0.4606741573033708;
    } else if (true) {
      p = 0.8369565217391305;
    } 
    return p;
  }
  static double N5e17553a1066(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.2;
    } else if (((Double)i[31]).doubleValue() < 0.38095238095238093) {
      p = 0.09340659340659341;
    } else if (true) {
    p = WekaStringREPTree.N3eb918151067(i);
    } 
    return p;
  }
  static double N3eb918151067(Object []i) {
    double p = Double.NaN;
    /* maxSingleChar */
    if (i[30] == null) {
      p = 0.5660377358490566;
    } else if (((Double)i[30]).doubleValue() < 0.41428571428571426) {
      p = 0.6818181818181818;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N56dc15511068(Object []i) {
    double p = Double.NaN;
    /* maxRepChars */
    if (i[35] == null) {
      p = 0.9288234578415866;
    } else if (((Double)i[35]).doubleValue() < 3.5) {
    p = WekaStringREPTree.N102cec621069(i);
    } else if (true) {
    p = WekaStringREPTree.N3336e6b61091(i);
    } 
    return p;
  }
  static double N102cec621069(Object []i) {
    double p = Double.NaN;
    /* country */
    if (i[14] == null) {
      p = 0.9349673202614379;
    } else if (((Double)i[14]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N74f6c5d81070(i);
    } else if (true) {
    p = WekaStringREPTree.N2bec854f1088(i);
    } 
    return p;
  }
  static double N74f6c5d81070(Object []i) {
    double p = Double.NaN;
    /* xml */
    if (i[0] == null) {
      p = 0.9401537260060011;
    } else if (((Double)i[0]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N27912e31071(i);
    } else if (true) {
    p = WekaStringREPTree.N7ba8c7371084(i);
    } 
    return p;
  }
  static double N27912e31071(Object []i) {
    double p = Double.NaN;
    /* dashes */
    if (i[39] == null) {
      p = 0.9459851593914521;
    } else if (((Double)i[39]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N34b9f9601072(i);
    } else if (true) {
    p = WekaStringREPTree.N14f232c41079(i);
    } 
    return p;
  }
  static double N34b9f9601072(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.9546300705658254;
    } else if (((Double)i[43]).doubleValue() < 0.12701612903225806) {
    p = WekaStringREPTree.N43015c691073(i);
    } else if (true) {
    p = WekaStringREPTree.N30b6ffe01076(i);
    } 
    return p;
  }
  static double N43015c691073(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.7446808510638298;
    } else if (((Double)i[51]).doubleValue() < 0.5564663023679417) {
    p = WekaStringREPTree.N19b89d41074(i);
    } else if (true) {
    p = WekaStringREPTree.N4bbf6d0e1075(i);
    } 
    return p;
  }
  static double N19b89d41074(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.8201581027667985;
    } else if (((Double)i[31]).doubleValue() < 0.19615384615384618) {
      p = 0.6370967741935484;
    } else if (true) {
      p = 0.9961240310077519;
    } 
    return p;
  }
  static double N4bbf6d0e1075(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.08620689655172414;
    } else if (((Double)i[31]).doubleValue() < 0.07275132275132275) {
      p = 1.0;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N30b6ffe01076(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.9598846239183493;
    } else if (((Double)i[43]).doubleValue() < 0.8722826086956521) {
    p = WekaStringREPTree.N791d1f8b1077(i);
    } else if (true) {
    p = WekaStringREPTree.N2415fc551078(i);
    } 
    return p;
  }
  static double N791d1f8b1077(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.9750570876515019;
    } else if (((Double)i[31]).doubleValue() < 0.3011627906976744) {
      p = 0.950902625820569;
    } else if (true) {
      p = 0.9931401658646463;
    } 
    return p;
  }
  static double N2415fc551078(Object []i) {
    double p = Double.NaN;
    /* nonVocals */
    if (i[34] == null) {
      p = 0.9123900293255132;
    } else if (((Double)i[34]).doubleValue() < 0.20714285714285713) {
      p = 0.7090909090909091;
    } else if (true) {
      p = 0.9403669724770642;
    } 
    return p;
  }
  static double N14f232c41079(Object []i) {
    double p = Double.NaN;
    /* nonVocals */
    if (i[34] == null) {
      p = 0.7509765625;
    } else if (((Double)i[34]).doubleValue() < 0.5419580419580419) {
    p = WekaStringREPTree.N13bc86451080(i);
    } else if (true) {
    p = WekaStringREPTree.N93081b61082(i);
    } 
    return p;
  }
  static double N13bc86451080(Object []i) {
    double p = Double.NaN;
    /* setDist */
    if (i[29] == null) {
      p = 0.9336099585062241;
    } else if (((Double)i[29]).doubleValue() < 0.5227272727272727) {
      p = 0.9597122302158273;
    } else if (true) {
    p = WekaStringREPTree.N24c22fe1081(i);
    } 
    return p;
  }
  static double N24c22fe1081(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.2857142857142857;
    } else if (((Double)i[37]).doubleValue() < 4.0) {
      p = 0.1;
    } else if (true) {
      p = 0.75;
    } 
    return p;
  }
  static double N93081b61082(Object []i) {
    double p = Double.NaN;
    /* date */
    if (i[17] == null) {
      p = 0.3122923588039867;
    } else if (((Double)i[17]).doubleValue() < 0.5) {
    p = WekaStringREPTree.Ncd1e6461083(i);
    } else if (true) {
      p = 0.008547008547008548;
    } 
    return p;
  }
  static double Ncd1e6461083(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.5054347826086957;
    } else if (((Double)i[31]).doubleValue() < 0.27525252525252525) {
      p = 0.34375;
    } else if (true) {
      p = 0.875;
    } 
    return p;
  }
  static double N7ba8c7371084(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.25728155339805825;
    } else if (((Double)i[43]).doubleValue() < 0.9285714285714286) {
    p = WekaStringREPTree.N1890516e1085(i);
    } else if (true) {
    p = WekaStringREPTree.N15a04efb1086(i);
    } 
    return p;
  }
  static double N1890516e1085(Object []i) {
    double p = Double.NaN;
    /* sumRepChar */
    if (i[42] == null) {
      p = 0.4827586206896552;
    } else if (((Double)i[42]).doubleValue() < 2.5) {
      p = 0.7575757575757576;
    } else if (true) {
      p = 0.12;
    } 
    return p;
  }
  static double N15a04efb1086(Object []i) {
    double p = Double.NaN;
    /* equals */
    if (i[38] == null) {
      p = 0.16891891891891891;
    } else if (((Double)i[38]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N16c069df1087(i);
    } else if (true) {
      p = 1.0;
    } 
    return p;
  }
  static double N16c069df1087(Object []i) {
    double p = Double.NaN;
    /* classpath */
    if (i[11] == null) {
      p = 0.15172413793103448;
    } else if (((Double)i[11]).doubleValue() < 0.5) {
      p = 0.08955223880597014;
    } else if (true) {
      p = 0.9090909090909091;
    } 
    return p;
  }
  static double N2bec854f1088(Object []i) {
    double p = Double.NaN;
    /* stackHeuristic */
    if (i[48] == null) {
      p = 0.09933774834437085;
    } else if (((Double)i[48]).doubleValue() < -0.2716514135686573) {
      p = 0.023255813953488372;
    } else if (true) {
    p = WekaStringREPTree.N31edaa7d1089(i);
    } 
    return p;
  }
  static double N31edaa7d1089(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.5454545454545454;
    } else if (((Double)i[31]).doubleValue() < 0.38095238095238093) {
      p = 0.16666666666666666;
    } else if (true) {
    p = WekaStringREPTree.N26adfd2d1090(i);
    } 
    return p;
  }
  static double N26adfd2d1090(Object []i) {
    double p = Double.NaN;
    /* normEntropy */
    if (i[50] == null) {
      p = 0.6875;
    } else if (((Double)i[50]).doubleValue() < 2.5216406363433186) {
      p = 0.16666666666666666;
    } else if (true) {
      p = 1.0;
    } 
    return p;
  }
  static double N3336e6b61091(Object []i) {
    double p = Double.NaN;
    /* date */
    if (i[17] == null) {
      p = 0.07909604519774012;
    } else if (((Double)i[17]).doubleValue() < 0.5) {
      p = 0.3333333333333333;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N7c3fdb621092(Object []i) {
    double p = Double.NaN;
    /* setDist */
    if (i[29] == null) {
      p = 0.6007722897815688;
    } else if (((Double)i[29]).doubleValue() < 0.430952380952381) {
    p = WekaStringREPTree.N205d38da1093(i);
    } else if (true) {
    p = WekaStringREPTree.N4fa1c2121133(i);
    } 
    return p;
  }
  static double N205d38da1093(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.6977923139820115;
    } else if (((Double)i[51]).doubleValue() < 0.6900656814449918) {
    p = WekaStringREPTree.N6950ed691094(i);
    } else if (true) {
    p = WekaStringREPTree.N7b993c651118(i);
    } 
    return p;
  }
  static double N6950ed691094(Object []i) {
    double p = Double.NaN;
    /* xml */
    if (i[0] == null) {
      p = 0.7714042914807733;
    } else if (((Double)i[0]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N6dd7b5a31095(i);
    } else if (true) {
    p = WekaStringREPTree.N7d94beb91114(i);
    } 
    return p;
  }
  static double N6dd7b5a31095(Object []i) {
    double p = Double.NaN;
    /* minLenKnownWord */
    if (i[46] == null) {
      p = 0.7947789843150159;
    } else if (((Double)i[46]).doubleValue() < 2.5) {
    p = WekaStringREPTree.N6f3187b01096(i);
    } else if (true) {
    p = WekaStringREPTree.N2205a05d1104(i);
    } 
    return p;
  }
  static double N6f3187b01096(Object []i) {
    double p = Double.NaN;
    /* commands */
    if (i[5] == null) {
      p = 0.8833800032943502;
    } else if (((Double)i[5]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N2663e9641097(i);
    } else if (true) {
    p = WekaStringREPTree.N42e25b0b1101(i);
    } 
    return p;
  }
  static double N2663e9641097(Object []i) {
    double p = Double.NaN;
    /* country */
    if (i[14] == null) {
      p = 0.9080439404677534;
    } else if (((Double)i[14]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N48b673641098(i);
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N48b673641098(Object []i) {
    double p = Double.NaN;
    /* maxSingleChar */
    if (i[30] == null) {
      p = 0.9173080365133345;
    } else if (((Double)i[30]).doubleValue() < 0.1779788838612368) {
    p = WekaStringREPTree.N189cbd7c1099(i);
    } else if (true) {
    p = WekaStringREPTree.N7bf3a5d81100(i);
    } 
    return p;
  }
  static double N189cbd7c1099(Object []i) {
    double p = Double.NaN;
    /* dashes */
    if (i[39] == null) {
      p = 0.9493362831858407;
    } else if (((Double)i[39]).doubleValue() < 0.5) {
      p = 0.9572046437514227;
    } else if (true) {
      p = 0.6771653543307087;
    } 
    return p;
  }
  static double N7bf3a5d81100(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.781630740393627;
    } else if (((Double)i[37]).doubleValue() < 7.5) {
      p = 0.8111002921129503;
    } else if (true) {
      p = 0.025;
    } 
    return p;
  }
  static double N42e25b0b1101(Object []i) {
    double p = Double.NaN;
    /* vocals */
    if (i[33] == null) {
      p = 0.5573770491803278;
    } else if (((Double)i[33]).doubleValue() < 0.16333333333333333) {
    p = WekaStringREPTree.N39b43d601102(i);
    } else if (true) {
    p = WekaStringREPTree.N44be00771103(i);
    } 
    return p;
  }
  static double N39b43d601102(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.746268656716418;
    } else if (((Double)i[37]).doubleValue() < 1.5) {
      p = 0.045454545454545456;
    } else if (true) {
      p = 0.8089430894308943;
    } 
    return p;
  }
  static double N44be00771103(Object []i) {
    double p = Double.NaN;
    /* setDist */
    if (i[29] == null) {
      p = 0.2389937106918239;
    } else if (((Double)i[29]).doubleValue() < 0.19375) {
      p = 0.75;
    } else if (true) {
      p = 0.16546762589928057;
    } 
    return p;
  }
  static double N2205a05d1104(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.618187787261983;
    } else if (((Double)i[31]).doubleValue() < 0.21980676328502413) {
    p = WekaStringREPTree.N72ef8d151105(i);
    } else if (true) {
    p = WekaStringREPTree.N51a9ad5e1108(i);
    } 
    return p;
  }
  static double N72ef8d151105(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.35430157261794637;
    } else if (((Double)i[37]).doubleValue() < 4.5) {
    p = WekaStringREPTree.N6aa8e1151106(i);
    } else if (true) {
      p = 0.029239766081871343;
    } 
    return p;
  }
  static double N6aa8e1151106(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.5047361299052774;
    } else if (((Double)i[43]).doubleValue() < 0.875) {
    p = WekaStringREPTree.N5e21e98f1107(i);
    } else if (true) {
      p = 0.046511627906976744;
    } 
    return p;
  }
  static double N5e21e98f1107(Object []i) {
    double p = Double.NaN;
    /* nonVocals */
    if (i[34] == null) {
      p = 0.5650842266462481;
    } else if (((Double)i[34]).doubleValue() < 0.6909814323607427) {
      p = 0.3824561403508772;
    } else if (true) {
      p = 0.7065217391304348;
    } 
    return p;
  }
  static double N51a9ad5e1108(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.7633587786259542;
    } else if (((Double)i[43]).doubleValue() < 0.95) {
    p = WekaStringREPTree.N5f20155b1109(i);
    } else if (true) {
    p = WekaStringREPTree.N3fce8fd91112(i);
    } 
    return p;
  }
  static double N5f20155b1109(Object []i) {
    double p = Double.NaN;
    /* regex */
    if (i[3] == null) {
      p = 0.8702956989247311;
    } else if (((Double)i[3]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N72ade7e31110(i);
    } else if (true) {
    p = WekaStringREPTree.N239105a81111(i);
    } 
    return p;
  }
  static double N72ade7e31110(Object []i) {
    double p = Double.NaN;
    /* commands */
    if (i[5] == null) {
      p = 0.9138339920948617;
    } else if (((Double)i[5]).doubleValue() < 0.5) {
      p = 0.9216;
    } else if (true) {
      p = 0.26666666666666666;
    } 
    return p;
  }
  static double N239105a81111(Object []i) {
    double p = Double.NaN;
    /* vocals */
    if (i[33] == null) {
      p = 0.6233183856502242;
    } else if (((Double)i[33]).doubleValue() < 0.12771739130434784) {
      p = 0.8503937007874016;
    } else if (true) {
      p = 0.3229166666666667;
    } 
    return p;
  }
  static double N3fce8fd91112(Object []i) {
    double p = Double.NaN;
    /* equals */
    if (i[38] == null) {
      p = 0.429769392033543;
    } else if (((Double)i[38]).doubleValue() < 1.5) {
    p = WekaStringREPTree.N609bcfb61113(i);
    } else if (true) {
      p = 0.9905660377358491;
    } 
    return p;
  }
  static double N609bcfb61113(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.2695417789757412;
    } else if (((Double)i[37]).doubleValue() < 4.5) {
      p = 0.20819112627986347;
    } else if (true) {
      p = 0.5;
    } 
    return p;
  }
  static double N7d94beb91114(Object []i) {
    double p = Double.NaN;
    /* nonVocals */
    if (i[34] == null) {
      p = 0.05387205387205387;
    } else if (((Double)i[34]).doubleValue() < 0.7795138888888888) {
    p = WekaStringREPTree.N560348e61115(i);
    } else if (true) {
      p = 1.0;
    } 
    return p;
  }
  static double N560348e61115(Object []i) {
    double p = Double.NaN;
    /* nonVocals */
    if (i[34] == null) {
      p = 0.03767123287671233;
    } else if (((Double)i[34]).doubleValue() < 0.7029411764705882) {
    p = WekaStringREPTree.N1df8b5b81116(i);
    } else if (true) {
    p = WekaStringREPTree.N23202fce1117(i);
    } 
    return p;
  }
  static double N1df8b5b81116(Object []i) {
    double p = Double.NaN;
    /* nonVocals */
    if (i[34] == null) {
      p = 0.02158273381294964;
    } else if (((Double)i[34]).doubleValue() < 0.5358974358974359) {
      p = 0.10416666666666667;
    } else if (true) {
      p = 0.004347826086956522;
    } 
    return p;
  }
  static double N23202fce1117(Object []i) {
    double p = Double.NaN;
    /* minLenKnownWord */
    if (i[46] == null) {
      p = 0.35714285714285715;
    } else if (((Double)i[46]).doubleValue() < 2.5) {
      p = 1.0;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N7b993c651118(Object []i) {
    double p = Double.NaN;
    /* strLen */
    if (i[28] == null) {
      p = 0.45170454545454547;
    } else if (((Double)i[28]).doubleValue() < 8.5) {
    p = WekaStringREPTree.N37911f881119(i);
    } else if (true) {
      p = 0.0011560693641618498;
    } 
    return p;
  }
  static double N37911f881119(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.6514607893388006;
    } else if (((Double)i[43]).doubleValue() < 0.8452380952380952) {
    p = WekaStringREPTree.N6f1c29b71120(i);
    } else if (true) {
    p = WekaStringREPTree.N4ea5b7031124(i);
    } 
    return p;
  }
  static double N6f1c29b71120(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.9566563467492261;
    } else if (((Double)i[51]).doubleValue() < 0.771712158808933) {
    p = WekaStringREPTree.N4d6025c51121(i);
    } else if (true) {
      p = 0.07142857142857142;
    } 
    return p;
  }
  static double N4d6025c51121(Object []i) {
    double p = Double.NaN;
    /* commands */
    if (i[5] == null) {
      p = 0.9762658227848101;
    } else if (((Double)i[5]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N7f2842181122(i);
    } else if (true) {
    p = WekaStringREPTree.N407a7f2a1123(i);
    } 
    return p;
  }
  static double N7f2842181122(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.9806763285024155;
    } else if (((Double)i[31]).doubleValue() < 0.26785714285714285) {
      p = 0.8076923076923077;
    } else if (true) {
      p = 0.9964850615114236;
    } 
    return p;
  }
  static double N407a7f2a1123(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.7272727272727273;
    } else if (((Double)i[37]).doubleValue() < 2.5) {
      p = 0.25;
    } else if (true) {
      p = 1.0;
    } 
    return p;
  }
  static double N4ea5b7031124(Object []i) {
    double p = Double.NaN;
    /* equals */
    if (i[38] == null) {
      p = 0.5003831417624521;
    } else if (((Double)i[38]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N2a7ed1f1125(i);
    } else if (true) {
    p = WekaStringREPTree.N723e88f91129(i);
    } 
    return p;
  }
  static double N2a7ed1f1125(Object []i) {
    double p = Double.NaN;
    /* xml */
    if (i[0] == null) {
      p = 0.5829338446788112;
    } else if (((Double)i[0]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N3fa247d11126(i);
    } else if (true) {
      p = 0.04225352112676056;
    } 
    return p;
  }
  static double N3fa247d11126(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.6224279835390947;
    } else if (((Double)i[51]).doubleValue() < 0.7413381123058542) {
    p = WekaStringREPTree.N2cb2fc201127(i);
    } else if (true) {
    p = WekaStringREPTree.N4f4c4b1a1128(i);
    } 
    return p;
  }
  static double N2cb2fc201127(Object []i) {
    double p = Double.NaN;
    /* vocals */
    if (i[33] == null) {
      p = 0.7162629757785467;
    } else if (((Double)i[33]).doubleValue() < 0.0625) {
      p = 0.8959537572254336;
    } else if (true) {
      p = 0.6395061728395062;
    } 
    return p;
  }
  static double N4f4c4b1a1128(Object []i) {
    double p = Double.NaN;
    /* strLen */
    if (i[28] == null) {
      p = 0.4847715736040609;
    } else if (((Double)i[28]).doubleValue() < 6.5) {
      p = 0.5974842767295597;
    } else if (true) {
      p = 0.013157894736842105;
    } 
    return p;
  }
  static double N723e88f91129(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.1717557251908397;
    } else if (((Double)i[37]).doubleValue() < 3.5) {
    p = WekaStringREPTree.N5f0fd5a01130(i);
    } else if (true) {
    p = WekaStringREPTree.N64e7619d1131(i);
    } 
    return p;
  }
  static double N5f0fd5a01130(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.11538461538461539;
    } else if (((Double)i[37]).doubleValue() < 1.5) {
      p = 0.38461538461538464;
    } else if (true) {
      p = 0.08173076923076923;
    } 
    return p;
  }
  static double N64e7619d1131(Object []i) {
    double p = Double.NaN;
    /* nonVocals */
    if (i[34] == null) {
      p = 0.6428571428571429;
    } else if (((Double)i[34]).doubleValue() < 0.30952380952380953) {
    p = WekaStringREPTree.N495ee2801132(i);
    } else if (true) {
      p = 1.0;
    } 
    return p;
  }
  static double N495ee2801132(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.4117647058823529;
    } else if (((Double)i[37]).doubleValue() < 4.5) {
      p = 0.125;
    } else if (true) {
      p = 0.6666666666666666;
    } 
    return p;
  }
  static double N4fa1c2121133(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.36906854130052724;
    } else if (((Double)i[43]).doubleValue() < 0.9741379310344828) {
    p = WekaStringREPTree.N6ea2bc931134(i);
    } else if (true) {
    p = WekaStringREPTree.Nbb9e6dc1153(i);
    } 
    return p;
  }
  static double N6ea2bc931134(Object []i) {
    double p = Double.NaN;
    /* vocals */
    if (i[33] == null) {
      p = 0.5674157303370787;
    } else if (((Double)i[33]).doubleValue() < 0.17752100840336135) {
    p = WekaStringREPTree.N3116c3531135(i);
    } else if (true) {
    p = WekaStringREPTree.N1130520d1144(i);
    } 
    return p;
  }
  static double N3116c3531135(Object []i) {
    double p = Double.NaN;
    /* date */
    if (i[17] == null) {
      p = 0.6532381438041815;
    } else if (((Double)i[17]).doubleValue() < 0.5) {
    p = WekaStringREPTree.Nf627d131136(i);
    } else if (true) {
    p = WekaStringREPTree.N295cf7071143(i);
    } 
    return p;
  }
  static double Nf627d131136(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.7264858626658973;
    } else if (((Double)i[37]).doubleValue() < 16.5) {
    p = WekaStringREPTree.N4e928fbf1137(i);
    } else if (true) {
      p = 0.045871559633027525;
    } 
    return p;
  }
  static double N4e928fbf1137(Object []i) {
    double p = Double.NaN;
    /* minLenKnownWord */
    if (i[46] == null) {
      p = 0.7721674876847291;
    } else if (((Double)i[46]).doubleValue() < 2.5) {
    p = WekaStringREPTree.N352ff4da1138(i);
    } else if (true) {
    p = WekaStringREPTree.N2e32ccc51140(i);
    } 
    return p;
  }
  static double N352ff4da1138(Object []i) {
    double p = Double.NaN;
    /* dashes */
    if (i[39] == null) {
      p = 0.8752327746741154;
    } else if (((Double)i[39]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N3224a5771139(i);
    } else if (true) {
      p = 0.034482758620689655;
    } 
    return p;
  }
  static double N3224a5771139(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.8985645933014355;
    } else if (((Double)i[51]).doubleValue() < 0.6079083518107908) {
      p = 0.9333333333333333;
    } else if (true) {
      p = 0.6173913043478261;
    } 
    return p;
  }
  static double N2e32ccc51140(Object []i) {
    double p = Double.NaN;
    /* normEntropy */
    if (i[50] == null) {
      p = 0.5709090909090909;
    } else if (((Double)i[50]).doubleValue() < 3.216520769154309) {
    p = WekaStringREPTree.N748741cb1141(i);
    } else if (true) {
    p = WekaStringREPTree.N3e44f2a51142(i);
    } 
    return p;
  }
  static double N748741cb1141(Object []i) {
    double p = Double.NaN;
    /* xml */
    if (i[0] == null) {
      p = 0.7640845070422535;
    } else if (((Double)i[0]).doubleValue() < 0.5) {
      p = 0.7948717948717948;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N3e44f2a51142(Object []i) {
    double p = Double.NaN;
    /* knownUniqueWords */
    if (i[45] == null) {
      p = 0.36466165413533835;
    } else if (((Double)i[45]).doubleValue() < 1.5) {
      p = 0.5228758169934641;
    } else if (true) {
      p = 0.1504424778761062;
    } 
    return p;
  }
  static double N295cf7071143(Object []i) {
    double p = Double.NaN;
    /* strLen */
    if (i[28] == null) {
      p = 0.09649122807017543;
    } else if (((Double)i[28]).doubleValue() < 8.5) {
      p = 1.0;
    } else if (true) {
      p = 0.037383177570093455;
    } 
    return p;
  }
  static double N1130520d1144(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.2504708097928437;
    } else if (((Double)i[37]).doubleValue() < 1.5) {
    p = WekaStringREPTree.N5f77d0f91145(i);
    } else if (true) {
    p = WekaStringREPTree.N1b2668421148(i);
    } 
    return p;
  }
  static double N5f77d0f91145(Object []i) {
    double p = Double.NaN;
    /* commands */
    if (i[5] == null) {
      p = 0.8064516129032258;
    } else if (((Double)i[5]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N463fd0681146(i);
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N463fd0681146(Object []i) {
    double p = Double.NaN;
    /* equals */
    if (i[38] == null) {
      p = 0.9146341463414634;
    } else if (((Double)i[38]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N895e3671147(i);
    } else if (true) {
      p = 1.0;
    } 
    return p;
  }
  static double N895e3671147(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.7307692307692307;
    } else if (((Double)i[31]).doubleValue() < 0.09401709401709402) {
      p = 1.0;
    } else if (true) {
      p = 0.125;
    } 
    return p;
  }
  static double N1b2668421148(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.1324200913242009;
    } else if (((Double)i[43]).doubleValue() < 0.688259109311741) {
    p = WekaStringREPTree.N7a3793c71149(i);
    } else if (true) {
    p = WekaStringREPTree.N4dd6fd0a1152(i);
    } 
    return p;
  }
  static double N7a3793c71149(Object []i) {
    double p = Double.NaN;
    /* regex */
    if (i[3] == null) {
      p = 0.11163895486935867;
    } else if (((Double)i[3]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N42b3b0791150(i);
    } else if (true) {
      p = 0.01875;
    } 
    return p;
  }
  static double N42b3b0791150(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.1685823754789272;
    } else if (((Double)i[43]).doubleValue() < 0.4641025641025641) {
    p = WekaStringREPTree.N651aed931151(i);
    } else if (true) {
      p = 0.4444444444444444;
    } 
    return p;
  }
  static double N651aed931151(Object []i) {
    double p = Double.NaN;
    /* nonVocals */
    if (i[34] == null) {
      p = 0.1111111111111111;
    } else if (((Double)i[34]).doubleValue() < 0.6165158371040724) {
      p = 0.24615384615384617;
    } else if (true) {
      p = 0.052980132450331126;
    } 
    return p;
  }
  static double N4dd6fd0a1152(Object []i) {
    double p = Double.NaN;
    /* knownUniqueWords */
    if (i[45] == null) {
      p = 0.6470588235294118;
    } else if (((Double)i[45]).doubleValue() < 3.5) {
      p = 0.2857142857142857;
    } else if (true) {
      p = 0.9;
    } 
    return p;
  }
  static double Nbb9e6dc1153(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.18105743628756182;
    } else if (((Double)i[31]).doubleValue() < 0.17914438502673796) {
      p = 0.9682539682539683;
    } else if (true) {
    p = WekaStringREPTree.N5456afaa1154(i);
    } 
    return p;
  }
  static double N5456afaa1154(Object []i) {
    double p = Double.NaN;
    /* vocals */
    if (i[33] == null) {
      p = 0.161730319563523;
    } else if (((Double)i[33]).doubleValue() < 0.0058823529411764705) {
    p = WekaStringREPTree.N6692b6c61155(i);
    } else if (true) {
    p = WekaStringREPTree.N52815fa31161(i);
    } 
    return p;
  }
  static double N6692b6c61155(Object []i) {
    double p = Double.NaN;
    /* maxRepChars */
    if (i[35] == null) {
      p = 0.38153310104529614;
    } else if (((Double)i[35]).doubleValue() < 2.5) {
    p = WekaStringREPTree.N1cd629b31156(i);
    } else if (true) {
      p = 0.07954545454545454;
    } 
    return p;
  }
  static double N1cd629b31156(Object []i) {
    double p = Double.NaN;
    /* minLenKnownWord */
    if (i[46] == null) {
      p = 0.43621399176954734;
    } else if (((Double)i[46]).doubleValue() < 2.5) {
    p = WekaStringREPTree.N589da3f31157(i);
    } else if (true) {
    p = WekaStringREPTree.N4a00d9cf1159(i);
    } 
    return p;
  }
  static double N589da3f31157(Object []i) {
    double p = Double.NaN;
    /* regex */
    if (i[3] == null) {
      p = 0.6307692307692307;
    } else if (((Double)i[3]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N39d76cb51158(i);
    } else if (true) {
      p = 0.17073170731707318;
    } 
    return p;
  }
  static double N39d76cb51158(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.7532467532467533;
    } else if (((Double)i[37]).doubleValue() < 6.5) {
      p = 0.8636363636363636;
    } else if (true) {
      p = 0.09090909090909091;
    } 
    return p;
  }
  static double N4a00d9cf1159(Object []i) {
    double p = Double.NaN;
    /* stackHeuristic */
    if (i[48] == null) {
      p = 0.30584192439862545;
    } else if (((Double)i[48]).doubleValue() < -0.2810337660332421) {
    p = WekaStringREPTree.N6736fa8d1160(i);
    } else if (true) {
      p = 0.3761904761904762;
    } 
    return p;
  }
  static double N6736fa8d1160(Object []i) {
    double p = Double.NaN;
    /* strLen */
    if (i[28] == null) {
      p = 0.12345679012345678;
    } else if (((Double)i[28]).doubleValue() < 9.5) {
      p = 0.1724137931034483;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N52815fa31161(Object []i) {
    double p = Double.NaN;
    /* maxSingleChar */
    if (i[30] == null) {
      p = 0.09839357429718876;
    } else if (((Double)i[30]).doubleValue() < 0.17914438502673796) {
    p = WekaStringREPTree.N503133821162(i);
    } else if (true) {
    p = WekaStringREPTree.N4c0125631164(i);
    } 
    return p;
  }
  static double N503133821162(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.41304347826086957;
    } else if (((Double)i[31]).doubleValue() < 0.32291666666666663) {
      p = 0.047619047619047616;
    } else if (true) {
    p = WekaStringREPTree.N1cb346ea1163(i);
    } 
    return p;
  }
  static double N1cb346ea1163(Object []i) {
    double p = Double.NaN;
    /* minLenKnownWord */
    if (i[46] == null) {
      p = 0.72;
    } else if (((Double)i[46]).doubleValue() < 2.5) {
      p = 0.9473684210526315;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N4c0125631164(Object []i) {
    double p = Double.NaN;
    /* regex */
    if (i[3] == null) {
      p = 0.09095580678314491;
    } else if (((Double)i[3]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N14a507071165(i);
    } else if (true) {
    p = WekaStringREPTree.Ne3c0e401168(i);
    } 
    return p;
  }
  static double N14a507071165(Object []i) {
    double p = Double.NaN;
    /* minLenKnownWord */
    if (i[46] == null) {
      p = 0.12269031781226904;
    } else if (((Double)i[46]).doubleValue() < 2.5) {
    p = WekaStringREPTree.N4d518b321166(i);
    } else if (true) {
    p = WekaStringREPTree.N4bd310641167(i);
    } 
    return p;
  }
  static double N4d518b321166(Object []i) {
    double p = Double.NaN;
    /* simpleSplitWordLen */
    if (i[36] == null) {
      p = 0.27253668763102723;
    } else if (((Double)i[36]).doubleValue() < 4.5) {
      p = 0.6261682242990654;
    } else if (true) {
      p = 0.17027027027027028;
    } 
    return p;
  }
  static double N4bd310641167(Object []i) {
    double p = Double.NaN;
    /* classpath */
    if (i[11] == null) {
      p = 0.0410958904109589;
    } else if (((Double)i[11]).doubleValue() < 0.5) {
      p = 0.037122969837587005;
    } else if (true) {
      p = 0.2857142857142857;
    } 
    return p;
  }
  static double Ne3c0e401168(Object []i) {
    double p = Double.NaN;
    /* stackHeuristic */
    if (i[48] == null) {
      p = 0.01854974704890388;
    } else if (((Double)i[48]).doubleValue() < -0.25144318146498484) {
      p = 0.01384083044982699;
    } else if (true) {
    p = WekaStringREPTree.N329dbdbf1169(i);
    } 
    return p;
  }
  static double N329dbdbf1169(Object []i) {
    double p = Double.NaN;
    /* maxRepChars */
    if (i[35] == null) {
      p = 0.2;
    } else if (((Double)i[35]).doubleValue() < 1.5) {
      p = 0.0;
    } else if (true) {
      p = 1.0;
    } 
    return p;
  }
  static double N7354b8c51170(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.2897513465653361;
    } else if (((Double)i[37]).doubleValue() < 1.5) {
    p = WekaStringREPTree.N20d7d6fb1171(i);
    } else if (true) {
    p = WekaStringREPTree.N3b79fd761200(i);
    } 
    return p;
  }
  static double N20d7d6fb1171(Object []i) {
    double p = Double.NaN;
    /* minLenKnownWord */
    if (i[46] == null) {
      p = 0.770859805167302;
    } else if (((Double)i[46]).doubleValue() < 2.5) {
    p = WekaStringREPTree.N4ef782af1172(i);
    } else if (true) {
    p = WekaStringREPTree.N6a57ae101195(i);
    } 
    return p;
  }
  static double N4ef782af1172(Object []i) {
    double p = Double.NaN;
    /* equals */
    if (i[38] == null) {
      p = 0.8557360905957656;
    } else if (((Double)i[38]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N11d8ae8b1173(i);
    } else if (true) {
    p = WekaStringREPTree.Na82c5f11192(i);
    } 
    return p;
  }
  static double N11d8ae8b1173(Object []i) {
    double p = Double.NaN;
    /* knownWordsCount */
    if (i[44] == null) {
      p = 0.6807511737089202;
    } else if (((Double)i[44]).doubleValue() < 3.5) {
    p = WekaStringREPTree.N479cbee51174(i);
    } else if (true) {
    p = WekaStringREPTree.N266374ef1188(i);
    } 
    return p;
  }
  static double N479cbee51174(Object []i) {
    double p = Double.NaN;
    /* stackHeuristic */
    if (i[48] == null) {
      p = 0.517578125;
    } else if (((Double)i[48]).doubleValue() < -0.25144318146498484) {
    p = WekaStringREPTree.N59e2d8e31175(i);
    } else if (true) {
    p = WekaStringREPTree.N1c39680d1183(i);
    } 
    return p;
  }
  static double N59e2d8e31175(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.37910447761194027;
    } else if (((Double)i[31]).doubleValue() < 0.08712121212121213) {
    p = WekaStringREPTree.N2b72cb8a1176(i);
    } else if (true) {
    p = WekaStringREPTree.N5d43661b1178(i);
    } 
    return p;
  }
  static double N2b72cb8a1176(Object []i) {
    double p = Double.NaN;
    /* maxSingleChar */
    if (i[30] == null) {
      p = 0.7474747474747475;
    } else if (((Double)i[30]).doubleValue() < 0.11437908496732026) {
      p = 0.21052631578947367;
    } else if (true) {
    p = WekaStringREPTree.N7f8a94991177(i);
    } 
    return p;
  }
  static double N7f8a94991177(Object []i) {
    double p = Double.NaN;
    /* dashes */
    if (i[39] == null) {
      p = 0.875;
    } else if (((Double)i[39]).doubleValue() < 0.5) {
      p = 0.9333333333333333;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N5d43661b1178(Object []i) {
    double p = Double.NaN;
    /* simpleSplitWordLen */
    if (i[36] == null) {
      p = 0.2245762711864407;
    } else if (((Double)i[36]).doubleValue() < 4.5) {
    p = WekaStringREPTree.N122998901179(i);
    } else if (true) {
    p = WekaStringREPTree.N4bf48f61181(i);
    } 
    return p;
  }
  static double N122998901179(Object []i) {
    double p = Double.NaN;
    /* commands */
    if (i[5] == null) {
      p = 0.4677419354838709;
    } else if (((Double)i[5]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N2fba3fc41180(i);
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N2fba3fc41180(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.5471698113207547;
    } else if (((Double)i[51]).doubleValue() < 0.7527233115468409) {
      p = 0.6744186046511628;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N4bf48f61181(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.13793103448275862;
    } else if (((Double)i[31]).doubleValue() < 0.26136363636363635) {
      p = 0.05844155844155844;
    } else if (true) {
    p = WekaStringREPTree.N420a85c41182(i);
    } 
    return p;
  }
  static double N420a85c41182(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.75;
    } else if (((Double)i[43]).doubleValue() < 0.9) {
      p = 1.0;
    } else if (true) {
      p = 0.375;
    } 
    return p;
  }
  static double N1c39680d1183(Object []i) {
    double p = Double.NaN;
    /* maxLenKnownWord */
    if (i[47] == null) {
      p = 0.7796610169491526;
    } else if (((Double)i[47]).doubleValue() < 2.5) {
    p = WekaStringREPTree.N628330511184(i);
    } else if (true) {
    p = WekaStringREPTree.Na37aefe1186(i);
    } 
    return p;
  }
  static double N628330511184(Object []i) {
    double p = Double.NaN;
    /* nonVocals */
    if (i[34] == null) {
      p = 0.9076923076923077;
    } else if (((Double)i[34]).doubleValue() < 0.31666666666666665) {
      p = 1.0;
    } else if (true) {
    p = WekaStringREPTree.N1c852c0f1185(i);
    } 
    return p;
  }
  static double N1c852c0f1185(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.8260869565217391;
    } else if (((Double)i[51]).doubleValue() < 0.771712158808933) {
      p = 0.8769230769230769;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double Na37aefe1186(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.425531914893617;
    } else if (((Double)i[51]).doubleValue() < 0.7207792207792207) {
    p = WekaStringREPTree.N5d99c6b51187(i);
    } else if (true) {
      p = 0.15;
    } 
    return p;
  }
  static double N5d99c6b51187(Object []i) {
    double p = Double.NaN;
    /* nonVocals */
    if (i[34] == null) {
      p = 0.6296296296296297;
    } else if (((Double)i[34]).doubleValue() < 0.5854700854700855) {
      p = 0.4444444444444444;
    } else if (true) {
      p = 1.0;
    } 
    return p;
  }
  static double N266374ef1188(Object []i) {
    double p = Double.NaN;
    /* maxLenKnownWord */
    if (i[47] == null) {
      p = 0.9264705882352942;
    } else if (((Double)i[47]).doubleValue() < 2.5) {
      p = 0.9806949806949807;
    } else if (true) {
    p = WekaStringREPTree.N13b3d1781189(i);
    } 
    return p;
  }
  static double N13b3d1781189(Object []i) {
    double p = Double.NaN;
    /* knownWordsCount */
    if (i[44] == null) {
      p = 0.7530864197530864;
    } else if (((Double)i[44]).doubleValue() < 4.5) {
    p = WekaStringREPTree.N24c4ddae1190(i);
    } else if (true) {
    p = WekaStringREPTree.N37fb0bed1191(i);
    } 
    return p;
  }
  static double N24c4ddae1190(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.41935483870967744;
    } else if (((Double)i[43]).doubleValue() < 0.95) {
      p = 0.9166666666666666;
    } else if (true) {
      p = 0.10526315789473684;
    } 
    return p;
  }
  static double N37fb0bed1191(Object []i) {
    double p = Double.NaN;
    /* normEntropy */
    if (i[50] == null) {
      p = 0.96;
    } else if (((Double)i[50]).doubleValue() < 3.405521622251637) {
      p = 0.8181818181818182;
    } else if (true) {
      p = 1.0;
    } 
    return p;
  }
  static double Na82c5f11192(Object []i) {
    double p = Double.NaN;
    /* commands */
    if (i[5] == null) {
      p = 0.9821882951653944;
    } else if (((Double)i[5]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N7b7fdc81193(i);
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N7b7fdc81193(Object []i) {
    double p = Double.NaN;
    /* strLen */
    if (i[28] == null) {
      p = 0.9931389365351629;
    } else if (((Double)i[28]).doubleValue() < 8.5) {
    p = WekaStringREPTree.N51c693d1194(i);
    } else if (true) {
      p = 0.9982608695652174;
    } 
    return p;
  }
  static double N51c693d1194(Object []i) {
    double p = Double.NaN;
    /* maxLenKnownWord */
    if (i[47] == null) {
      p = 0.625;
    } else if (((Double)i[47]).doubleValue() < 2.5) {
      p = 1.0;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N6a57ae101195(Object []i) {
    double p = Double.NaN;
    /* nonVocals */
    if (i[34] == null) {
      p = 0.24848484848484848;
    } else if (((Double)i[34]).doubleValue() < 0.4494949494949495) {
    p = WekaStringREPTree.N766653e61196(i);
    } else if (true) {
    p = WekaStringREPTree.N28b464231198(i);
    } 
    return p;
  }
  static double N766653e61196(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.6095238095238096;
    } else if (((Double)i[43]).doubleValue() < 0.9285714285714286) {
      p = 0.8909090909090909;
    } else if (true) {
    p = WekaStringREPTree.N4e07b95f1197(i);
    } 
    return p;
  }
  static double N4e07b95f1197(Object []i) {
    double p = Double.NaN;
    /* stackHeuristic */
    if (i[48] == null) {
      p = 0.3;
    } else if (((Double)i[48]).doubleValue() < -0.130913911780353) {
      p = 0.21428571428571427;
    } else if (true) {
      p = 0.75;
    } 
    return p;
  }
  static double N28b464231198(Object []i) {
    double p = Double.NaN;
    /* equals */
    if (i[38] == null) {
      p = 0.08;
    } else if (((Double)i[38]).doubleValue() < 1.5) {
    p = WekaStringREPTree.N7fc4780b1199(i);
    } else if (true) {
      p = 1.0;
    } 
    return p;
  }
  static double N7fc4780b1199(Object []i) {
    double p = Double.NaN;
    /* nonVocals */
    if (i[34] == null) {
      p = 0.07174887892376682;
    } else if (((Double)i[34]).doubleValue() < 0.6408730158730158) {
      p = 0.03773584905660377;
    } else if (true) {
      p = 0.7272727272727273;
    } 
    return p;
  }
  static double N3b79fd761200(Object []i) {
    double p = Double.NaN;
    /* sumRepChar */
    if (i[42] == null) {
      p = 0.18825947105075053;
    } else if (((Double)i[42]).doubleValue() < 1.5) {
    p = WekaStringREPTree.N48c766071201(i);
    } else if (true) {
    p = WekaStringREPTree.N57c03d881251(i);
    } 
    return p;
  }
  static double N48c766071201(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.48743386243386244;
    } else if (((Double)i[43]).doubleValue() < 0.9615384615384616) {
    p = WekaStringREPTree.N435996401202(i);
    } else if (true) {
    p = WekaStringREPTree.N379614be1230(i);
    } 
    return p;
  }
  static double N435996401202(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.7052932761087267;
    } else if (((Double)i[31]).doubleValue() < 0.2426470588235294) {
    p = WekaStringREPTree.N1f81aa001203(i);
    } else if (true) {
    p = WekaStringREPTree.N2d9caaeb1219(i);
    } 
    return p;
  }
  static double N1f81aa001203(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.43594009983361065;
    } else if (((Double)i[43]).doubleValue() < 0.4807692307692308) {
    p = WekaStringREPTree.N6b6776cb1204(i);
    } else if (true) {
    p = WekaStringREPTree.N4a3631f81213(i);
    } 
    return p;
  }
  static double N6b6776cb1204(Object []i) {
    double p = Double.NaN;
    /* strLen */
    if (i[28] == null) {
      p = 0.3082191780821918;
    } else if (((Double)i[28]).doubleValue() < 10.5) {
    p = WekaStringREPTree.N1863d2fe1205(i);
    } else if (true) {
    p = WekaStringREPTree.N55c53a331208(i);
    } 
    return p;
  }
  static double N1863d2fe1205(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.5113636363636364;
    } else if (((Double)i[51]).doubleValue() < 0.6948275862068966) {
    p = WekaStringREPTree.N1787bc241206(i);
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N1787bc241206(Object []i) {
    double p = Double.NaN;
    /* stackHeuristic */
    if (i[48] == null) {
      p = 0.5421686746987951;
    } else if (((Double)i[48]).doubleValue() < -0.2810337660332421) {
    p = WekaStringREPTree.N544d57e1207(i);
    } else if (true) {
      p = 0.6326530612244898;
    } 
    return p;
  }
  static double N544d57e1207(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.4117647058823529;
    } else if (((Double)i[31]).doubleValue() < 0.15000000000000002) {
      p = 1.0;
    } else if (true) {
      p = 0.3333333333333333;
    } 
    return p;
  }
  static double N55c53a331208(Object []i) {
    double p = Double.NaN;
    /* vocals */
    if (i[33] == null) {
      p = 0.2571428571428571;
    } else if (((Double)i[33]).doubleValue() < 0.28174603174603174) {
    p = WekaStringREPTree.N53b7f6571209(i);
    } else if (true) {
    p = WekaStringREPTree.N5a37d3ed1211(i);
    } 
    return p;
  }
  static double N53b7f6571209(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.47863247863247865;
    } else if (((Double)i[37]).doubleValue() < 3.5) {
    p = WekaStringREPTree.N797b06991210(i);
    } else if (true) {
      p = 0.12;
    } 
    return p;
  }
  static double N797b06991210(Object []i) {
    double p = Double.NaN;
    /* simpleSplitWordLen */
    if (i[36] == null) {
      p = 0.5760869565217391;
    } else if (((Double)i[36]).doubleValue() < 4.5) {
      p = 0.4307692307692308;
    } else if (true) {
      p = 0.9259259259259259;
    } 
    return p;
  }
  static double N5a37d3ed1211(Object []i) {
    double p = Double.NaN;
    /* email */
    if (i[8] == null) {
      p = 0.1459227467811159;
    } else if (((Double)i[8]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N26df6e3a1212(i);
    } else if (true) {
      p = 0.6;
    } 
    return p;
  }
  static double N26df6e3a1212(Object []i) {
    double p = Double.NaN;
    /* simpleSplitWordLen */
    if (i[36] == null) {
      p = 0.13596491228070176;
    } else if (((Double)i[36]).doubleValue() < 5.5) {
      p = 0.107981220657277;
    } else if (true) {
      p = 0.5333333333333333;
    } 
    return p;
  }
  static double N4a3631f81213(Object []i) {
    double p = Double.NaN;
    /* minLenKnownWord */
    if (i[46] == null) {
      p = 0.7791411042944786;
    } else if (((Double)i[46]).doubleValue() < 2.5) {
    p = WekaStringREPTree.N6b58b9e91214(i);
    } else if (true) {
    p = WekaStringREPTree.N29a5f4e71217(i);
    } 
    return p;
  }
  static double N6b58b9e91214(Object []i) {
    double p = Double.NaN;
    /* country */
    if (i[14] == null) {
      p = 0.8380281690140845;
    } else if (((Double)i[14]).doubleValue() < 0.5) {
    p = WekaStringREPTree.Nf14a7d41215(i);
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double Nf14a7d41215(Object []i) {
    double p = Double.NaN;
    /* color */
    if (i[10] == null) {
      p = 0.8623188405797102;
    } else if (((Double)i[10]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N52e7a6b21216(i);
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N52e7a6b21216(Object []i) {
    double p = Double.NaN;
    /* knownWordsCount */
    if (i[44] == null) {
      p = 0.875;
    } else if (((Double)i[44]).doubleValue() < 2.5) {
      p = 0.7166666666666667;
    } else if (true) {
      p = 1.0;
    } 
    return p;
  }
  static double N29a5f4e71217(Object []i) {
    double p = Double.NaN;
    /* normEntropy */
    if (i[50] == null) {
      p = 0.38095238095238093;
    } else if (((Double)i[50]).doubleValue() < 3.438863726345893) {
    p = WekaStringREPTree.N79c97cb1218(i);
    } else if (true) {
      p = 0.23076923076923078;
    } 
    return p;
  }
  static double N79c97cb1218(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.625;
    } else if (((Double)i[37]).doubleValue() < 2.5) {
      p = 1.0;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N2d9caaeb1219(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.9084065244667503;
    } else if (((Double)i[31]).doubleValue() < 0.2792207792207792) {
    p = WekaStringREPTree.N42a15bdc1220(i);
    } else if (true) {
    p = WekaStringREPTree.N4b5189ac1226(i);
    } 
    return p;
  }
  static double N42a15bdc1220(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.7447916666666666;
    } else if (((Double)i[51]).doubleValue() < 0.7238095238095239) {
    p = WekaStringREPTree.N44a59da31221(i);
    } else if (true) {
      p = 0.07692307692307693;
    } 
    return p;
  }
  static double N44a59da31221(Object []i) {
    double p = Double.NaN;
    /* normEntropy */
    if (i[50] == null) {
      p = 0.7932960893854749;
    } else if (((Double)i[50]).doubleValue() < 3.2776134368191157) {
    p = WekaStringREPTree.N27e478331222(i);
    } else if (true) {
    p = WekaStringREPTree.N6f6745d61223(i);
    } 
    return p;
  }
  static double N27e478331222(Object []i) {
    double p = Double.NaN;
    /* regex */
    if (i[3] == null) {
      p = 0.9043478260869565;
    } else if (((Double)i[3]).doubleValue() < 0.5) {
      p = 0.95;
    } else if (true) {
      p = 0.6;
    } 
    return p;
  }
  static double N6f6745d61223(Object []i) {
    double p = Double.NaN;
    /* simpleSplitWordLen */
    if (i[36] == null) {
      p = 0.59375;
    } else if (((Double)i[36]).doubleValue() < 5.5) {
    p = WekaStringREPTree.N27508c5d1224(i);
    } else if (true) {
    p = WekaStringREPTree.N4f7045911225(i);
    } 
    return p;
  }
  static double N27508c5d1224(Object []i) {
    double p = Double.NaN;
    /* vocals */
    if (i[33] == null) {
      p = 0.3333333333333333;
    } else if (((Double)i[33]).doubleValue() < 0.303030303030303) {
      p = 0.5;
    } else if (true) {
      p = 0.08333333333333333;
    } 
    return p;
  }
  static double N4f7045911225(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.8235294117647058;
    } else if (((Double)i[51]).doubleValue() < 0.6559139784946237) {
      p = 0.875;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N4b5189ac1226(Object []i) {
    double p = Double.NaN;
    /* maxRepChars */
    if (i[35] == null) {
      p = 0.9603305785123967;
    } else if (((Double)i[35]).doubleValue() < 2.5) {
    p = WekaStringREPTree.N1e4d3ce51227(i);
    } else if (true) {
      p = 0.2;
    } 
    return p;
  }
  static double N1e4d3ce51227(Object []i) {
    double p = Double.NaN;
    /* stackHeuristic */
    if (i[48] == null) {
      p = 0.9666666666666667;
    } else if (((Double)i[48]).doubleValue() < -0.5814924944039974) {
      p = 0.0;
    } else if (true) {
    p = WekaStringREPTree.N3ddc69151228(i);
    } 
    return p;
  }
  static double N3ddc69151228(Object []i) {
    double p = Double.NaN;
    /* nonVocals */
    if (i[34] == null) {
      p = 0.9698996655518395;
    } else if (((Double)i[34]).doubleValue() < 0.2928571428571428) {
      p = 0.9970588235294118;
    } else if (true) {
    p = WekaStringREPTree.N704deff21229(i);
    } 
    return p;
  }
  static double N704deff21229(Object []i) {
    double p = Double.NaN;
    /* minLenKnownWord */
    if (i[46] == null) {
      p = 0.9341085271317829;
    } else if (((Double)i[46]).doubleValue() < 2.5) {
      p = 0.9567099567099567;
    } else if (true) {
      p = 0.7407407407407407;
    } 
    return p;
  }
  static double N379614be1230(Object []i) {
    double p = Double.NaN;
    /* maxLenKnownWord */
    if (i[47] == null) {
      p = 0.3001230012300123;
    } else if (((Double)i[47]).doubleValue() < 2.5) {
    p = WekaStringREPTree.N404bbcbd1231(i);
    } else if (true) {
    p = WekaStringREPTree.N658c5a191240(i);
    } 
    return p;
  }
  static double N404bbcbd1231(Object []i) {
    double p = Double.NaN;
    /* maxSingleChar */
    if (i[30] == null) {
      p = 0.5833333333333334;
    } else if (((Double)i[30]).doubleValue() < 0.2928571428571428) {
    p = WekaStringREPTree.N1e81f1601232(i);
    } else if (true) {
    p = WekaStringREPTree.Na307a8c1236(i);
    } 
    return p;
  }
  static double N1e81f1601232(Object []i) {
    double p = Double.NaN;
    /* country */
    if (i[14] == null) {
      p = 0.7567567567567568;
    } else if (((Double)i[14]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N1acaf3d1233(i);
    } else if (true) {
      p = 0.08333333333333333;
    } 
    return p;
  }
  static double N1acaf3d1233(Object []i) {
    double p = Double.NaN;
    /* nonVocals */
    if (i[34] == null) {
      p = 0.7852112676056338;
    } else if (((Double)i[34]).doubleValue() < 0.19444444444444442) {
      p = 0.9215686274509803;
    } else if (true) {
    p = WekaStringREPTree.N69868521234(i);
    } 
    return p;
  }
  static double N69868521234(Object []i) {
    double p = Double.NaN;
    /* setDist */
    if (i[29] == null) {
      p = 0.7553648068669528;
    } else if (((Double)i[29]).doubleValue() < 0.4722222222222222) {
    p = WekaStringREPTree.N1bab82681235(i);
    } else if (true) {
      p = 0.5;
    } 
    return p;
  }
  static double N1bab82681235(Object []i) {
    double p = Double.NaN;
    /* dashes */
    if (i[39] == null) {
      p = 0.7989949748743719;
    } else if (((Double)i[39]).doubleValue() < 0.5) {
      p = 0.8333333333333334;
    } else if (true) {
      p = 0.3076923076923077;
    } 
    return p;
  }
  static double Na307a8c1236(Object []i) {
    double p = Double.NaN;
    /* maxRepChars */
    if (i[35] == null) {
      p = 0.23648648648648649;
    } else if (((Double)i[35]).doubleValue() < 1.5) {
    p = WekaStringREPTree.N6e01f9b01237(i);
    } else if (true) {
      p = 0.9047619047619048;
    } 
    return p;
  }
  static double N6e01f9b01237(Object []i) {
    double p = Double.NaN;
    /* regex */
    if (i[3] == null) {
      p = 0.12598425196850394;
    } else if (((Double)i[3]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N2b9ed6da1238(i);
    } else if (true) {
      p = 0.031914893617021274;
    } 
    return p;
  }
  static double N2b9ed6da1238(Object []i) {
    double p = Double.NaN;
    /* country */
    if (i[14] == null) {
      p = 0.3939393939393939;
    } else if (((Double)i[14]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N6c61a9031239(i);
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N6c61a9031239(Object []i) {
    double p = Double.NaN;
    /* commands */
    if (i[5] == null) {
      p = 0.7222222222222222;
    } else if (((Double)i[5]).doubleValue() < 0.5) {
      p = 0.9285714285714286;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N658c5a191240(Object []i) {
    double p = Double.NaN;
    /* knownWordsCount */
    if (i[44] == null) {
      p = 0.19373942470389172;
    } else if (((Double)i[44]).doubleValue() < 3.5) {
    p = WekaStringREPTree.N421e3611241(i);
    } else if (true) {
    p = WekaStringREPTree.N14008db31249(i);
    } 
    return p;
  }
  static double N421e3611241(Object []i) {
    double p = Double.NaN;
    /* stackHeuristic */
    if (i[48] == null) {
      p = 0.1705150976909414;
    } else if (((Double)i[48]).doubleValue() < -0.13582570678432865) {
    p = WekaStringREPTree.N59d4cd391242(i);
    } else if (true) {
    p = WekaStringREPTree.N34f6515b1245(i);
    } 
    return p;
  }
  static double N59d4cd391242(Object []i) {
    double p = Double.NaN;
    /* pluses */
    if (i[41] == null) {
      p = 0.11435523114355231;
    } else if (((Double)i[41]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N389c4eb11243(i);
    } else if (true) {
      p = 1.0;
    } 
    return p;
  }
  static double N389c4eb11243(Object []i) {
    double p = Double.NaN;
    /* regex */
    if (i[3] == null) {
      p = 0.10784313725490197;
    } else if (((Double)i[3]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N3fc797291244(i);
    } else if (true) {
      p = 0.020338983050847456;
    } 
    return p;
  }
  static double N3fc797291244(Object []i) {
    double p = Double.NaN;
    /* stackHeuristic */
    if (i[48] == null) {
      p = 0.15738963531669867;
    } else if (((Double)i[48]).doubleValue() < -0.2716514135686573) {
      p = 0.07960199004975124;
    } else if (true) {
      p = 0.20625;
    } 
    return p;
  }
  static double N34f6515b1245(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.3223684210526316;
    } else if (((Double)i[31]).doubleValue() < 0.1875) {
    p = WekaStringREPTree.N4b34fff91246(i);
    } else if (true) {
    p = WekaStringREPTree.N1187c9e81247(i);
    } 
    return p;
  }
  static double N4b34fff91246(Object []i) {
    double p = Double.NaN;
    /* regex */
    if (i[3] == null) {
      p = 0.9333333333333333;
    } else if (((Double)i[3]).doubleValue() < 0.5) {
      p = 1.0;
    } else if (true) {
      p = 0.6666666666666666;
    } 
    return p;
  }
  static double N1187c9e81247(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.2906574394463668;
    } else if (((Double)i[37]).doubleValue() < 2.5) {
      p = 0.17088607594936708;
    } else if (true) {
    p = WekaStringREPTree.N127a7a2e1248(i);
    } 
    return p;
  }
  static double N127a7a2e1248(Object []i) {
    double p = Double.NaN;
    /* minLenKnownWord */
    if (i[46] == null) {
      p = 0.4351145038167939;
    } else if (((Double)i[46]).doubleValue() < 2.5) {
      p = 0.6428571428571429;
    } else if (true) {
      p = 0.19672131147540983;
    } 
    return p;
  }
  static double N14008db31249(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.6607142857142857;
    } else if (((Double)i[37]).doubleValue() < 3.5) {
    p = WekaStringREPTree.N78a773fd1250(i);
    } else if (true) {
      p = 0.23076923076923078;
    } 
    return p;
  }
  static double N78a773fd1250(Object []i) {
    double p = Double.NaN;
    /* dashes */
    if (i[39] == null) {
      p = 0.7906976744186046;
    } else if (((Double)i[39]).doubleValue() < 0.5) {
      p = 0.8947368421052632;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N57c03d881251(Object []i) {
    double p = Double.NaN;
    /* sumRepChar */
    if (i[42] == null) {
      p = 0.0774975514201763;
    } else if (((Double)i[42]).doubleValue() < 3.5) {
    p = WekaStringREPTree.N16aa86541252(i);
    } else if (true) {
    p = WekaStringREPTree.N275bf9b31272(i);
    } 
    return p;
  }
  static double N16aa86541252(Object []i) {
    double p = Double.NaN;
    /* maxRepChars */
    if (i[35] == null) {
      p = 0.19315121200461716;
    } else if (((Double)i[35]).doubleValue() < 1.5) {
    p = WekaStringREPTree.N6d7fc271253(i);
    } else if (true) {
    p = WekaStringREPTree.N14fa86ae1263(i);
    } 
    return p;
  }
  static double N6d7fc271253(Object []i) {
    double p = Double.NaN;
    /* simpleSplitWordLen */
    if (i[36] == null) {
      p = 0.13673890608875128;
    } else if (((Double)i[36]).doubleValue() < 7.5) {
    p = WekaStringREPTree.N45ac5f9b1254(i);
    } else if (true) {
    p = WekaStringREPTree.N4f74980d1258(i);
    } 
    return p;
  }
  static double N45ac5f9b1254(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.11887727022564668;
    } else if (((Double)i[31]).doubleValue() < 0.09307359307359307) {
    p = WekaStringREPTree.N135606db1255(i);
    } else if (true) {
    p = WekaStringREPTree.N518caac31256(i);
    } 
    return p;
  }
  static double N135606db1255(Object []i) {
    double p = Double.NaN;
    /* minLenKnownWord */
    if (i[46] == null) {
      p = 0.41836734693877553;
    } else if (((Double)i[46]).doubleValue() < 2.5) {
      p = 0.8;
    } else if (true) {
      p = 0.09433962264150944;
    } 
    return p;
  }
  static double N518caac31256(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.10180337405468295;
    } else if (((Double)i[31]).doubleValue() < 0.3875) {
    p = WekaStringREPTree.N680342111257(i);
    } else if (true) {
      p = 0.3958333333333333;
    } 
    return p;
  }
  static double N680342111257(Object []i) {
    double p = Double.NaN;
    /* simpleSplitWordLen */
    if (i[36] == null) {
      p = 0.0933572710951526;
    } else if (((Double)i[36]).doubleValue() < 5.5) {
      p = 0.06602254428341385;
    } else if (true) {
      p = 0.17249417249417248;
    } 
    return p;
  }
  static double N4f74980d1258(Object []i) {
    double p = Double.NaN;
    /* setDist */
    if (i[29] == null) {
      p = 0.4049586776859504;
    } else if (((Double)i[29]).doubleValue() < 0.31666666666666665) {
    p = WekaStringREPTree.N6c372fe61259(i);
    } else if (true) {
    p = WekaStringREPTree.N2a3888c11261(i);
    } 
    return p;
  }
  static double N6c372fe61259(Object []i) {
    double p = Double.NaN;
    /* regex */
    if (i[3] == null) {
      p = 0.7555555555555555;
    } else if (((Double)i[3]).doubleValue() < 0.5) {
      p = 0.9310344827586207;
    } else if (true) {
    p = WekaStringREPTree.N58594a111260(i);
    } 
    return p;
  }
  static double N58594a111260(Object []i) {
    double p = Double.NaN;
    /* simpleSplitWordLen */
    if (i[36] == null) {
      p = 0.4375;
    } else if (((Double)i[36]).doubleValue() < 8.5) {
      p = 1.0;
    } else if (true) {
      p = 0.18181818181818182;
    } 
    return p;
  }
  static double N2a3888c11261(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.19736842105263158;
    } else if (((Double)i[43]).doubleValue() < 0.9615384615384616) {
    p = WekaStringREPTree.N4167d97b1262(i);
    } else if (true) {
      p = 0.02564102564102564;
    } 
    return p;
  }
  static double N4167d97b1262(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.3783783783783784;
    } else if (((Double)i[31]).doubleValue() < 0.3375) {
      p = 0.20689655172413793;
    } else if (true) {
      p = 1.0;
    } 
    return p;
  }
  static double N14fa86ae1263(Object []i) {
    double p = Double.NaN;
    /* minLenKnownWord */
    if (i[46] == null) {
      p = 0.3585476550680787;
    } else if (((Double)i[46]).doubleValue() < 2.5) {
    p = WekaStringREPTree.N6e15fe21264(i);
    } else if (true) {
    p = WekaStringREPTree.N3e2059ae1269(i);
    } 
    return p;
  }
  static double N6e15fe21264(Object []i) {
    double p = Double.NaN;
    /* country */
    if (i[14] == null) {
      p = 0.44420600858369097;
    } else if (((Double)i[14]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N68f1b17f1265(i);
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N68f1b17f1265(Object []i) {
    double p = Double.NaN;
    /* regex */
    if (i[3] == null) {
      p = 0.5036496350364964;
    } else if (((Double)i[3]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N1722011b1266(i);
    } else if (true) {
      p = 0.21774193548387097;
    } 
    return p;
  }
  static double N1722011b1266(Object []i) {
    double p = Double.NaN;
    /* vocals */
    if (i[33] == null) {
      p = 0.627177700348432;
    } else if (((Double)i[33]).doubleValue() < 0.3798076923076923) {
    p = WekaStringREPTree.N57ad2aa71267(i);
    } else if (true) {
    p = WekaStringREPTree.N5b3f61ff1268(i);
    } 
    return p;
  }
  static double N57ad2aa71267(Object []i) {
    double p = Double.NaN;
    /* simpleSplitWordLen */
    if (i[36] == null) {
      p = 0.7155172413793104;
    } else if (((Double)i[36]).doubleValue() < 6.5) {
      p = 0.6064516129032258;
    } else if (true) {
      p = 0.935064935064935;
    } 
    return p;
  }
  static double N5b3f61ff1268(Object []i) {
    double p = Double.NaN;
    /* normEntropy */
    if (i[50] == null) {
      p = 0.2545454545454545;
    } else if (((Double)i[50]).doubleValue() < 2.6499918208507918) {
      p = 1.0;
    } else if (true) {
      p = 0.18;
    } 
    return p;
  }
  static double N3e2059ae1269(Object []i) {
    double p = Double.NaN;
    /* simpleSplitWordLen */
    if (i[36] == null) {
      p = 0.15384615384615385;
    } else if (((Double)i[36]).doubleValue() < 9.0) {
    p = WekaStringREPTree.N398dada81270(i);
    } else if (true) {
      p = 0.8333333333333334;
    } 
    return p;
  }
  static double N398dada81270(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.13227513227513227;
    } else if (((Double)i[51]).doubleValue() < 0.615530303030303) {
      p = 0.04310344827586207;
    } else if (true) {
    p = WekaStringREPTree.N7cb502c1271(i);
    } 
    return p;
  }
  static double N7cb502c1271(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.273972602739726;
    } else if (((Double)i[43]).doubleValue() < 0.8035714285714286) {
      p = 0.4666666666666667;
    } else if (true) {
      p = 0.13953488372093023;
    } 
    return p;
  }
  static double N275bf9b31272(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.023523074160531513;
    } else if (((Double)i[31]).doubleValue() < 0.20942982456140352) {
    p = WekaStringREPTree.N1b8a29df1273(i);
    } else if (true) {
    p = WekaStringREPTree.N4fbe37eb1274(i);
    } 
    return p;
  }
  static double N1b8a29df1273(Object []i) {
    double p = Double.NaN;
    /* knownUniqueWords */
    if (i[45] == null) {
      p = 0.014644351464435146;
    } else if (((Double)i[45]).doubleValue() < 6.5) {
      p = 0.012959786544692205;
    } else if (true) {
      p = 0.8181818181818182;
    } 
    return p;
  }
  static double N4fbe37eb1274(Object []i) {
    double p = Double.NaN;
    /* setDist */
    if (i[29] == null) {
      p = 0.17363344051446947;
    } else if (((Double)i[29]).doubleValue() < 0.43167701863354035) {
    p = WekaStringREPTree.N12a944001275(i);
    } else if (true) {
    p = WekaStringREPTree.N46271dd61279(i);
    } 
    return p;
  }
  static double N12a944001275(Object []i) {
    double p = Double.NaN;
    /* normEntropy */
    if (i[50] == null) {
      p = 0.3559322033898305;
    } else if (((Double)i[50]).doubleValue() < 3.9175988922012346) {
    p = WekaStringREPTree.N6a47b1871276(i);
    } else if (true) {
    p = WekaStringREPTree.N2049a9c11277(i);
    } 
    return p;
  }
  static double N6a47b1871276(Object []i) {
    double p = Double.NaN;
    /* regex */
    if (i[3] == null) {
      p = 0.26744186046511625;
    } else if (((Double)i[3]).doubleValue() < 0.5) {
      p = 0.40425531914893614;
    } else if (true) {
      p = 0.10256410256410256;
    } 
    return p;
  }
  static double N2049a9c11277(Object []i) {
    double p = Double.NaN;
    /* sumRepChar */
    if (i[42] == null) {
      p = 0.59375;
    } else if (((Double)i[42]).doubleValue() < 5.5) {
      p = 0.9285714285714286;
    } else if (true) {
    p = WekaStringREPTree.N1ef6d34c1278(i);
    } 
    return p;
  }
  static double N1ef6d34c1278(Object []i) {
    double p = Double.NaN;
    /* setDist */
    if (i[29] == null) {
      p = 0.3333333333333333;
    } else if (((Double)i[29]).doubleValue() < 0.2928571428571428) {
      p = 1.0;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N46271dd61279(Object []i) {
    double p = Double.NaN;
    /* nonVocals */
    if (i[34] == null) {
      p = 0.06217616580310881;
    } else if (((Double)i[34]).doubleValue() < 0.19090909090909092) {
      p = 0.8;
    } else if (true) {
      p = 0.0425531914893617;
    } 
    return p;
  }
  static double N11bb571c1280(Object []i) {
    double p = Double.NaN;
    /* normEntropy */
    if (i[50] == null) {
      p = 0.04750968206790957;
    } else if (((Double)i[50]).doubleValue() < 4.680686534699175) {
    p = WekaStringREPTree.N7c51f34b1281(i);
    } else if (true) {
    p = WekaStringREPTree.N7f0d96f21717(i);
    } 
    return p;
  }
  static double N7c51f34b1281(Object []i) {
    double p = Double.NaN;
    /* maxLenKnownWord */
    if (i[47] == null) {
      p = 0.023966310485276397;
    } else if (((Double)i[47]).doubleValue() < 4.5) {
    p = WekaStringREPTree.N5495333e1282(i);
    } else if (true) {
    p = WekaStringREPTree.N7b205dbd1593(i);
    } 
    return p;
  }
  static double N5495333e1282(Object []i) {
    double p = Double.NaN;
    /* digits */
    if (i[32] == null) {
      p = 0.24417524932839046;
    } else if (((Double)i[32]).doubleValue() < 1.1961722488038278E-4) {
    p = WekaStringREPTree.N2a225dd71283(i);
    } else if (true) {
    p = WekaStringREPTree.N225129c1422(i);
    } 
    return p;
  }
  static double N2a225dd71283(Object []i) {
    double p = Double.NaN;
    /* minLenKnownWord */
    if (i[46] == null) {
      p = 0.07257835663890873;
    } else if (((Double)i[46]).doubleValue() < 1.5) {
    p = WekaStringREPTree.N61eaec381284(i);
    } else if (true) {
    p = WekaStringREPTree.N5026735c1366(i);
    } 
    return p;
  }
  static double N61eaec381284(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.2428491306786315;
    } else if (((Double)i[51]).doubleValue() < 0.6256868131868132) {
    p = WekaStringREPTree.N125290e51285(i);
    } else if (true) {
    p = WekaStringREPTree.N6aa612241341(i);
    } 
    return p;
  }
  static double N125290e51285(Object []i) {
    double p = Double.NaN;
    /* vocals */
    if (i[33] == null) {
      p = 0.42014309301045677;
    } else if (((Double)i[33]).doubleValue() < 0.20722186076772936) {
    p = WekaStringREPTree.N6fa34d521286(i);
    } else if (true) {
    p = WekaStringREPTree.N353994411318(i);
    } 
    return p;
  }
  static double N6fa34d521286(Object []i) {
    double p = Double.NaN;
    /* date */
    if (i[17] == null) {
      p = 0.6030249459831074;
    } else if (((Double)i[17]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N575769941287(i);
    } else if (true) {
      p = 0.00922509225092251;
    } 
    return p;
  }
  static double N575769941287(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.673774455924379;
    } else if (((Double)i[43]).doubleValue() < 0.9511904761904761) {
    p = WekaStringREPTree.N616ac46a1288(i);
    } else if (true) {
    p = WekaStringREPTree.N1fd14d741305(i);
    } 
    return p;
  }
  static double N616ac46a1288(Object []i) {
    double p = Double.NaN;
    /* slashes */
    if (i[40] == null) {
      p = 0.8053843658773921;
    } else if (((Double)i[40]).doubleValue() < 1.5) {
    p = WekaStringREPTree.N67b9b51a1289(i);
    } else if (true) {
    p = WekaStringREPTree.N3b74ac81301(i);
    } 
    return p;
  }
  static double N67b9b51a1289(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.829979879275654;
    } else if (((Double)i[43]).doubleValue() < 0.41885964912280704) {
    p = WekaStringREPTree.N1205bd621290(i);
    } else if (true) {
    p = WekaStringREPTree.N1d483de41296(i);
    } 
    return p;
  }
  static double N1205bd621290(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.5676274944567627;
    } else if (((Double)i[31]).doubleValue() < 0.2353266888150609) {
    p = WekaStringREPTree.N7ef27d7f1291(i);
    } else if (true) {
    p = WekaStringREPTree.N5c669da81294(i);
    } 
    return p;
  }
  static double N7ef27d7f1291(Object []i) {
    double p = Double.NaN;
    /* maxSingleChar */
    if (i[30] == null) {
      p = 0.3487394957983193;
    } else if (((Double)i[30]).doubleValue() < 0.11269841269841269) {
    p = WekaStringREPTree.N490caf5f1292(i);
    } else if (true) {
    p = WekaStringREPTree.N6337c2011293(i);
    } 
    return p;
  }
  static double N490caf5f1292(Object []i) {
    double p = Double.NaN;
    /* simpleSplitWordLen */
    if (i[36] == null) {
      p = 0.71875;
    } else if (((Double)i[36]).doubleValue() < 7.5) {
      p = 0.2;
    } else if (true) {
      p = 0.8148148148148148;
    } 
    return p;
  }
  static double N6337c2011293(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.2912621359223301;
    } else if (((Double)i[37]).doubleValue() < 5.5) {
      p = 0.5;
    } else if (true) {
      p = 0.10909090909090909;
    } 
    return p;
  }
  static double N5c669da81294(Object []i) {
    double p = Double.NaN;
    /* equals */
    if (i[38] == null) {
      p = 0.812206572769953;
    } else if (((Double)i[38]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N31920ade1295(i);
    } else if (true) {
      p = 0.14285714285714285;
    } 
    return p;
  }
  static double N31920ade1295(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.8592964824120602;
    } else if (((Double)i[51]).doubleValue() < 0.48858329008822005) {
      p = 0.9655172413793104;
    } else if (true) {
      p = 0.5740740740740741;
    } 
    return p;
  }
  static double N1d483de41296(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.8767285657842749;
    } else if (((Double)i[51]).doubleValue() < 0.5411036036036037) {
    p = WekaStringREPTree.N4032d3861297(i);
    } else if (true) {
    p = WekaStringREPTree.N934b6cb1299(i);
    } 
    return p;
  }
  static double N4032d3861297(Object []i) {
    double p = Double.NaN;
    /* knownWordsCount */
    if (i[44] == null) {
      p = 0.9288203086112494;
    } else if (((Double)i[44]).doubleValue() < 28.5) {
    p = WekaStringREPTree.N28d18df51298(i);
    } else if (true) {
      p = 0.10526315789473684;
    } 
    return p;
  }
  static double N28d18df51298(Object []i) {
    double p = Double.NaN;
    /* knownUniqueWords */
    if (i[45] == null) {
      p = 0.9366834170854271;
    } else if (((Double)i[45]).doubleValue() < 4.5) {
      p = 0.7910863509749304;
    } else if (true) {
      p = 0.9687308399754752;
    } 
    return p;
  }
  static double N934b6cb1299(Object []i) {
    double p = Double.NaN;
    /* strLen */
    if (i[28] == null) {
      p = 0.6762452107279694;
    } else if (((Double)i[28]).doubleValue() < 16.5) {
    p = WekaStringREPTree.N55cf0d141300(i);
    } else if (true) {
      p = 0.007936507936507936;
    } 
    return p;
  }
  static double N55cf0d141300(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.8888888888888888;
    } else if (((Double)i[43]).doubleValue() < 0.5166666666666666) {
      p = 0.6438356164383562;
    } else if (true) {
      p = 0.9442724458204335;
    } 
    return p;
  }
  static double N3b74ac81301(Object []i) {
    double p = Double.NaN;
    /* setDist */
    if (i[29] == null) {
      p = 0.07920792079207921;
    } else if (((Double)i[29]).doubleValue() < 0.245) {
    p = WekaStringREPTree.N27adc16e1302(i);
    } else if (true) {
    p = WekaStringREPTree.Nb83a9be1303(i);
    } 
    return p;
  }
  static double N27adc16e1302(Object []i) {
    double p = Double.NaN;
    /* nonVocals */
    if (i[34] == null) {
      p = 0.46153846153846156;
    } else if (((Double)i[34]).doubleValue() < 0.5227272727272727) {
      p = 1.0;
    } else if (true) {
      p = 0.125;
    } 
    return p;
  }
  static double Nb83a9be1303(Object []i) {
    double p = Double.NaN;
    /* crypto */
    if (i[19] == null) {
      p = 0.022727272727272728;
    } else if (((Double)i[19]).doubleValue() < 0.5) {
      p = 0.0;
    } else if (true) {
    p = WekaStringREPTree.N2609b2771304(i);
    } 
    return p;
  }
  static double N2609b2771304(Object []i) {
    double p = Double.NaN;
    /* regex */
    if (i[3] == null) {
      p = 0.3333333333333333;
    } else if (((Double)i[3]).doubleValue() < 0.5) {
      p = 1.0;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N1fd14d741305(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.3969986357435198;
    } else if (((Double)i[31]).doubleValue() < 0.1863425925925926) {
    p = WekaStringREPTree.N563e49511306(i);
    } else if (true) {
    p = WekaStringREPTree.N2b175c001308(i);
    } 
    return p;
  }
  static double N563e49511306(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.8978494623655914;
    } else if (((Double)i[37]).doubleValue() < 5.5) {
      p = 0.9593023255813954;
    } else if (true) {
    p = WekaStringREPTree.N4066c4711307(i);
    } 
    return p;
  }
  static double N4066c4711307(Object []i) {
    double p = Double.NaN;
    /* simpleSplitWordLen */
    if (i[36] == null) {
      p = 0.14285714285714285;
    } else if (((Double)i[36]).doubleValue() < 12.5) {
      p = 0.0;
    } else if (true) {
      p = 1.0;
    } 
    return p;
  }
  static double N2b175c001308(Object []i) {
    double p = Double.NaN;
    /* knownUniqueWords */
    if (i[45] == null) {
      p = 0.32421875;
    } else if (((Double)i[45]).doubleValue() < 3.5) {
    p = WekaStringREPTree.N3eb81efb1309(i);
    } else if (true) {
    p = WekaStringREPTree.N7d3d101b1312(i);
    } 
    return p;
  }
  static double N3eb81efb1309(Object []i) {
    double p = Double.NaN;
    /* setDist */
    if (i[29] == null) {
      p = 0.08549222797927461;
    } else if (((Double)i[29]).doubleValue() < 0.08012820512820512) {
      p = 0.75;
    } else if (true) {
    p = WekaStringREPTree.N1ae8bcbc1310(i);
    } 
    return p;
  }
  static double N1ae8bcbc1310(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.07853403141361257;
    } else if (((Double)i[31]).doubleValue() < 0.5638586956521738) {
    p = WekaStringREPTree.N6cdba6dc1311(i);
    } else if (true) {
      p = 0.02054794520547945;
    } 
    return p;
  }
  static double N6cdba6dc1311(Object []i) {
    double p = Double.NaN;
    /* vocals */
    if (i[33] == null) {
      p = 0.11440677966101695;
    } else if (((Double)i[33]).doubleValue() < 0.08712121212121213) {
      p = 0.2542372881355932;
    } else if (true) {
      p = 0.06779661016949153;
    } 
    return p;
  }
  static double N7d3d101b1312(Object []i) {
    double p = Double.NaN;
    /* stackHeuristic */
    if (i[48] == null) {
      p = 0.4272930648769575;
    } else if (((Double)i[48]).doubleValue() < -0.4726170115087667) {
    p = WekaStringREPTree.N30c86811313(i);
    } else if (true) {
    p = WekaStringREPTree.N6d0267011315(i);
    } 
    return p;
  }
  static double N30c86811313(Object []i) {
    double p = Double.NaN;
    /* regex */
    if (i[3] == null) {
      p = 0.315712187958884;
    } else if (((Double)i[3]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N5cdec7001314(i);
    } else if (true) {
      p = 0.0392156862745098;
    } 
    return p;
  }
  static double N5cdec7001314(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.3958333333333333;
    } else if (((Double)i[31]).doubleValue() < 0.28348214285714285) {
      p = 0.1686746987951807;
    } else if (true) {
      p = 0.5;
    } 
    return p;
  }
  static double N6d0267011315(Object []i) {
    double p = Double.NaN;
    /* vocals */
    if (i[33] == null) {
      p = 0.784037558685446;
    } else if (((Double)i[33]).doubleValue() < 0.16228070175438597) {
    p = WekaStringREPTree.N78aa1f721316(i);
    } else if (true) {
    p = WekaStringREPTree.N1f75a6681317(i);
    } 
    return p;
  }
  static double N78aa1f721316(Object []i) {
    double p = Double.NaN;
    /* slashes */
    if (i[40] == null) {
      p = 0.8606060606060606;
    } else if (((Double)i[40]).doubleValue() < 1.5) {
      p = 0.8875;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N1f75a6681317(Object []i) {
    double p = Double.NaN;
    /* setDist */
    if (i[29] == null) {
      p = 0.5208333333333334;
    } else if (((Double)i[29]).doubleValue() < 0.125) {
      p = 1.0;
    } else if (true) {
      p = 0.46511627906976744;
    } 
    return p;
  }
  static double N353994411318(Object []i) {
    double p = Double.NaN;
    /* setDist */
    if (i[29] == null) {
      p = 0.1870305458187281;
    } else if (((Double)i[29]).doubleValue() < 0.32666666666666666) {
    p = WekaStringREPTree.N4b7dc7881319(i);
    } else if (true) {
    p = WekaStringREPTree.N662706a71334(i);
    } 
    return p;
  }
  static double N4b7dc7881319(Object []i) {
    double p = Double.NaN;
    /* knownUniqueWords */
    if (i[45] == null) {
      p = 0.47931654676258995;
    } else if (((Double)i[45]).doubleValue() < 4.5) {
    p = WekaStringREPTree.N6304101a1320(i);
    } else if (true) {
    p = WekaStringREPTree.N5e403b4a1328(i);
    } 
    return p;
  }
  static double N6304101a1320(Object []i) {
    double p = Double.NaN;
    /* setDist */
    if (i[29] == null) {
      p = 0.28413793103448276;
    } else if (((Double)i[29]).doubleValue() < 0.20714285714285713) {
    p = WekaStringREPTree.N5170bcf41321(i);
    } else if (true) {
    p = WekaStringREPTree.N4e31276e1324(i);
    } 
    return p;
  }
  static double N5170bcf41321(Object []i) {
    double p = Double.NaN;
    /* knownWordsCount */
    if (i[44] == null) {
      p = 0.5661764705882353;
    } else if (((Double)i[44]).doubleValue() < 2.5) {
    p = WekaStringREPTree.N2812b1071322(i);
    } else if (true) {
    p = WekaStringREPTree.Ndf6620a1323(i);
    } 
    return p;
  }
  static double N2812b1071322(Object []i) {
    double p = Double.NaN;
    /* normEntropy */
    if (i[50] == null) {
      p = 0.21052631578947367;
    } else if (((Double)i[50]).doubleValue() < 3.8984640474436807) {
      p = 0.4375;
    } else if (true) {
      p = 0.045454545454545456;
    } 
    return p;
  }
  static double Ndf6620a1323(Object []i) {
    double p = Double.NaN;
    /* commands */
    if (i[5] == null) {
      p = 0.7040816326530612;
    } else if (((Double)i[5]).doubleValue() < 0.5) {
      p = 0.7840909090909091;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N4e31276e1324(Object []i) {
    double p = Double.NaN;
    /* maxRepChars */
    if (i[35] == null) {
      p = 0.21901528013582344;
    } else if (((Double)i[35]).doubleValue() < 1.5) {
    p = WekaStringREPTree.N1a72a5401325(i);
    } else if (true) {
      p = 0.4247787610619469;
    } 
    return p;
  }
  static double N1a72a5401325(Object []i) {
    double p = Double.NaN;
    /* sumRepChar */
    if (i[42] == null) {
      p = 0.17016806722689076;
    } else if (((Double)i[42]).doubleValue() < 1.5) {
    p = WekaStringREPTree.N27d5a5801326(i);
    } else if (true) {
      p = 0.11271676300578035;
    } 
    return p;
  }
  static double N27d5a5801326(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.3230769230769231;
    } else if (((Double)i[43]).doubleValue() < 0.95) {
    p = WekaStringREPTree.N198d65421327(i);
    } else if (true) {
      p = 0.17391304347826086;
    } 
    return p;
  }
  static double N198d65421327(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.4918032786885246;
    } else if (((Double)i[43]).doubleValue() < 0.5470085470085471) {
      p = 0.25;
    } else if (true) {
      p = 0.9523809523809523;
    } 
    return p;
  }
  static double N5e403b4a1328(Object []i) {
    double p = Double.NaN;
    /* slashes */
    if (i[40] == null) {
      p = 0.8449612403100775;
    } else if (((Double)i[40]).doubleValue() < 1.5) {
    p = WekaStringREPTree.N5117dd671329(i);
    } else if (true) {
      p = 0.25;
    } 
    return p;
  }
  static double N5117dd671329(Object []i) {
    double p = Double.NaN;
    /* dashes */
    if (i[39] == null) {
      p = 0.864;
    } else if (((Double)i[39]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N5be49b601330(i);
    } else if (true) {
      p = 0.3684210526315789;
    } 
    return p;
  }
  static double N5be49b601330(Object []i) {
    double p = Double.NaN;
    /* country */
    if (i[14] == null) {
      p = 0.8904494382022472;
    } else if (((Double)i[14]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N2931522b1331(i);
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N2931522b1331(Object []i) {
    double p = Double.NaN;
    /* nonVocals */
    if (i[34] == null) {
      p = 0.8954802259887006;
    } else if (((Double)i[34]).doubleValue() < 0.5669642857142857) {
    p = WekaStringREPTree.N7674b62c1332(i);
    } else if (true) {
    p = WekaStringREPTree.N19e7a1601333(i);
    } 
    return p;
  }
  static double N7674b62c1332(Object []i) {
    double p = Double.NaN;
    /* commands */
    if (i[5] == null) {
      p = 0.949748743718593;
    } else if (((Double)i[5]).doubleValue() < 0.5) {
      p = 0.9717514124293786;
    } else if (true) {
      p = 0.7727272727272727;
    } 
    return p;
  }
  static double N19e7a1601333(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.8258064516129032;
    } else if (((Double)i[37]).doubleValue() < 8.5) {
      p = 0.8421052631578947;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N662706a71334(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.07425399028452463;
    } else if (((Double)i[31]).doubleValue() < 0.08421985815602837) {
    p = WekaStringREPTree.N45a4b0421335(i);
    } else if (true) {
    p = WekaStringREPTree.N16b2bb0c1336(i);
    } 
    return p;
  }
  static double N45a4b0421335(Object []i) {
    double p = Double.NaN;
    /* knownWordsCount */
    if (i[44] == null) {
      p = 0.5656565656565656;
    } else if (((Double)i[44]).doubleValue() < 4.5) {
      p = 0.1590909090909091;
    } else if (true) {
      p = 0.8909090909090909;
    } 
    return p;
  }
  static double N16b2bb0c1336(Object []i) {
    double p = Double.NaN;
    /* equals */
    if (i[38] == null) {
      p = 0.05677326625943227;
    } else if (((Double)i[38]).doubleValue() < 1.5) {
    p = WekaStringREPTree.N327af41b1337(i);
    } else if (true) {
    p = WekaStringREPTree.Nf99f5e01340(i);
    } 
    return p;
  }
  static double N327af41b1337(Object []i) {
    double p = Double.NaN;
    /* vocals */
    if (i[33] == null) {
      p = 0.05152394775036284;
    } else if (((Double)i[33]).doubleValue() < 0.24467120181405894) {
      p = 0.137291280148423;
    } else if (true) {
    p = WekaStringREPTree.N6cb6decd1338(i);
    } 
    return p;
  }
  static double N6cb6decd1338(Object []i) {
    double p = Double.NaN;
    /* equals */
    if (i[38] == null) {
      p = 0.03067207938655841;
    } else if (((Double)i[38]).doubleValue() < 0.5) {
      p = 0.026740433379437527;
    } else if (true) {
    p = WekaStringREPTree.Nc7045b91339(i);
    } 
    return p;
  }
  static double Nc7045b91339(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.20833333333333334;
    } else if (((Double)i[31]).doubleValue() < 0.17543859649122806) {
      p = 0.8888888888888888;
    } else if (true) {
      p = 0.05128205128205128;
    } 
    return p;
  }
  static double Nf99f5e01340(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.5925925925925926;
    } else if (((Double)i[37]).doubleValue() < 4.5) {
      p = 1.0;
    } else if (true) {
      p = 0.15384615384615385;
    } 
    return p;
  }
  static double N6aa612241341(Object []i) {
    double p = Double.NaN;
    /* date */
    if (i[17] == null) {
      p = 0.08985562310030396;
    } else if (((Double)i[17]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N30bce90b1342(i);
    } else if (true) {
    p = WekaStringREPTree.N6676f6a01363(i);
    } 
    return p;
  }
  static double N30bce90b1342(Object []i) {
    double p = Double.NaN;
    /* simpleSplitWordLen */
    if (i[36] == null) {
      p = 0.18068356374807987;
    } else if (((Double)i[36]).doubleValue() < 58.0) {
    p = WekaStringREPTree.N3e6f3f281343(i);
    } else if (true) {
      p = 0.9130434782608695;
    } 
    return p;
  }
  static double N3e6f3f281343(Object []i) {
    double p = Double.NaN;
    /* strLen */
    if (i[28] == null) {
      p = 0.17085035999221637;
    } else if (((Double)i[28]).doubleValue() < 11.5) {
    p = WekaStringREPTree.N7e19ebf01344(i);
    } else if (true) {
      p = 0.006896551724137931;
    } 
    return p;
  }
  static double N7e19ebf01344(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.23529411764705882;
    } else if (((Double)i[43]).doubleValue() < 0.9045454545454545) {
    p = WekaStringREPTree.N2474f1251345(i);
    } else if (true) {
    p = WekaStringREPTree.N3c01cfa11353(i);
    } 
    return p;
  }
  static double N2474f1251345(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.6563380281690141;
    } else if (((Double)i[31]).doubleValue() < 0.2792207792207792) {
    p = WekaStringREPTree.N7357a0111346(i);
    } else if (true) {
    p = WekaStringREPTree.N4816278d1350(i);
    } 
    return p;
  }
  static double N7357a0111346(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.507537688442211;
    } else if (((Double)i[51]).doubleValue() < 0.7261904761904763) {
    p = WekaStringREPTree.N3406472c1347(i);
    } else if (true) {
    p = WekaStringREPTree.N5717c371348(i);
    } 
    return p;
  }
  static double N3406472c1347(Object []i) {
    double p = Double.NaN;
    /* dashes */
    if (i[39] == null) {
      p = 0.6223776223776224;
    } else if (((Double)i[39]).doubleValue() < 0.5) {
      p = 0.7007874015748031;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N5717c371348(Object []i) {
    double p = Double.NaN;
    /* strLen */
    if (i[28] == null) {
      p = 0.21428571428571427;
    } else if (((Double)i[28]).doubleValue() < 6.5) {
    p = WekaStringREPTree.N68f48651349(i);
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N68f48651349(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.75;
    } else if (((Double)i[51]).doubleValue() < 0.7735042735042734) {
      p = 1.0;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N4816278d1350(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.8461538461538461;
    } else if (((Double)i[51]).doubleValue() < 0.7196428571428571) {
      p = 0.9133858267716536;
    } else if (true) {
    p = WekaStringREPTree.N4eaf36841351(i);
    } 
    return p;
  }
  static double N4eaf36841351(Object []i) {
    double p = Double.NaN;
    /* strLen */
    if (i[28] == null) {
      p = 0.5517241379310345;
    } else if (((Double)i[28]).doubleValue() < 7.5) {
    p = WekaStringREPTree.N40317ba21352(i);
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N40317ba21352(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.8888888888888888;
    } else if (((Double)i[51]).doubleValue() < 0.7496807151979565) {
      p = 1.0;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N3c01cfa11353(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.1904619076184763;
    } else if (((Double)i[51]).doubleValue() < 0.7161172161172161) {
    p = WekaStringREPTree.N45d2ade31354(i);
    } else if (true) {
    p = WekaStringREPTree.N2ce6c6ec1360(i);
    } 
    return p;
  }
  static double N45d2ade31354(Object []i) {
    double p = Double.NaN;
    /* knownWordsCount */
    if (i[44] == null) {
      p = 0.25597269624573377;
    } else if (((Double)i[44]).doubleValue() < 3.5) {
    p = WekaStringREPTree.N727eb8cb1355(i);
    } else if (true) {
    p = WekaStringREPTree.N5b7a84341358(i);
    } 
    return p;
  }
  static double N727eb8cb1355(Object []i) {
    double p = Double.NaN;
    /* strLen */
    if (i[28] == null) {
      p = 0.2088050314465409;
    } else if (((Double)i[28]).doubleValue() < 9.5) {
    p = WekaStringREPTree.N39d9314d1356(i);
    } else if (true) {
    p = WekaStringREPTree.Nb978d101357(i);
    } 
    return p;
  }
  static double N39d9314d1356(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.3070063694267516;
    } else if (((Double)i[31]).doubleValue() < 0.35416666666666663) {
      p = 0.41025641025641024;
    } else if (true) {
      p = 0.18258426966292135;
    } 
    return p;
  }
  static double Nb978d101357(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.11304347826086956;
    } else if (((Double)i[31]).doubleValue() < 0.2863636363636364) {
      p = 0.036885245901639344;
    } else if (true) {
      p = 0.2302839116719243;
    } 
    return p;
  }
  static double N5b7a84341358(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.7023809523809523;
    } else if (((Double)i[51]).doubleValue() < 0.6961789375582479) {
      p = 0.7687074829931972;
    } else if (true) {
    p = WekaStringREPTree.N5c45d7701359(i);
    } 
    return p;
  }
  static double N5c45d7701359(Object []i) {
    double p = Double.NaN;
    /* strLen */
    if (i[28] == null) {
      p = 0.23809523809523808;
    } else if (((Double)i[28]).doubleValue() < 9.5) {
      p = 1.0;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N2ce6c6ec1360(Object []i) {
    double p = Double.NaN;
    /* strLen */
    if (i[28] == null) {
      p = 0.11738578680203046;
    } else if (((Double)i[28]).doubleValue() < 7.5) {
    p = WekaStringREPTree.N1bae316d1361(i);
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N1bae316d1361(Object []i) {
    double p = Double.NaN;
    /* email */
    if (i[8] == null) {
      p = 0.14374514374514374;
    } else if (((Double)i[8]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N147a5d081362(i);
    } else if (true) {
      p = 1.0;
    } 
    return p;
  }
  static double N147a5d081362(Object []i) {
    double p = Double.NaN;
    /* knownWordsCount */
    if (i[44] == null) {
      p = 0.13973458235753317;
    } else if (((Double)i[44]).doubleValue() < 2.5) {
      p = 0.12126387702818105;
    } else if (true) {
      p = 0.33636363636363636;
    } 
    return p;
  }
  static double N6676f6a01363(Object []i) {
    double p = Double.NaN;
    /* vocals */
    if (i[33] == null) {
      p = 9.398496240601503E-4;
    } else if (((Double)i[33]).doubleValue() < 0.10555555555555556) {
    p = WekaStringREPTree.N7cbd9d241364(i);
    } else if (true) {
    p = WekaStringREPTree.N1672fe871365(i);
    } 
    return p;
  }
  static double N7cbd9d241364(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 3.784295175023652E-4;
    } else if (((Double)i[51]).doubleValue() < 0.6852892218060758) {
      p = 0.004694835680751174;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N1672fe871365(Object []i) {
    double p = Double.NaN;
    /* vocals */
    if (i[33] == null) {
      p = 0.08571428571428572;
    } else if (((Double)i[33]).doubleValue() < 0.11437908496732026) {
      p = 0.4;
    } else if (true) {
      p = 0.03333333333333333;
    } 
    return p;
  }
  static double N5026735c1366(Object []i) {
    double p = Double.NaN;
    /* equals */
    if (i[38] == null) {
      p = 0.032138532332283844;
    } else if (((Double)i[38]).doubleValue() < 1.5) {
    p = WekaStringREPTree.N1b45c0e1367(i);
    } else if (true) {
    p = WekaStringREPTree.N2141a121419(i);
    } 
    return p;
  }
  static double N1b45c0e1367(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.028718686031776977;
    } else if (((Double)i[31]).doubleValue() < 0.30662393162393164) {
    p = WekaStringREPTree.N11f0a5a11368(i);
    } else if (true) {
    p = WekaStringREPTree.N3e748291406(i);
    } 
    return p;
  }
  static double N11f0a5a11368(Object []i) {
    double p = Double.NaN;
    /* equals */
    if (i[38] == null) {
      p = 0.02357697542230406;
    } else if (((Double)i[38]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N10f7f7de1369(i);
    } else if (true) {
    p = WekaStringREPTree.N53251a661391(i);
    } 
    return p;
  }
  static double N10f7f7de1369(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.02156783103168156;
    } else if (((Double)i[31]).doubleValue() < 0.1986842105263158) {
    p = WekaStringREPTree.N73a8da0f1370(i);
    } else if (true) {
    p = WekaStringREPTree.N418c5a9c1379(i);
    } 
    return p;
  }
  static double N73a8da0f1370(Object []i) {
    double p = Double.NaN;
    /* knownUniqueWords */
    if (i[45] == null) {
      p = 0.016909792634264408;
    } else if (((Double)i[45]).doubleValue() < 6.5) {
    p = WekaStringREPTree.N50dfbc581371(i);
    } else if (true) {
    p = WekaStringREPTree.N6ee4d9ab1377(i);
    } 
    return p;
  }
  static double N50dfbc581371(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.01652675760755509;
    } else if (((Double)i[37]).doubleValue() < 0.5) {
      p = 3.2499187520311994E-4;
    } else if (true) {
    p = WekaStringREPTree.N4416d64f1372(i);
    } 
    return p;
  }
  static double N4416d64f1372(Object []i) {
    double p = Double.NaN;
    /* nonVocals */
    if (i[34] == null) {
      p = 0.019416162748014915;
    } else if (((Double)i[34]).doubleValue() < 0.758098223615465) {
    p = WekaStringREPTree.N6bf080141373(i);
    } else if (true) {
    p = WekaStringREPTree.N732d0d241375(i);
    } 
    return p;
  }
  static double N6bf080141373(Object []i) {
    double p = Double.NaN;
    /* nonVocals */
    if (i[34] == null) {
      p = 0.015551781292844135;
    } else if (((Double)i[34]).doubleValue() < 0.6792857142857143) {
      p = 0.011252394126409875;
    } else if (true) {
    p = WekaStringREPTree.N5e3d57c71374(i);
    } 
    return p;
  }
  static double N5e3d57c71374(Object []i) {
    double p = Double.NaN;
    /* minLenKnownWord */
    if (i[46] == null) {
      p = 0.029883834353108096;
    } else if (((Double)i[46]).doubleValue() < 2.5) {
      p = 0.09666080843585237;
    } else if (true) {
      p = 0.022388795739224775;
    } 
    return p;
  }
  static double N732d0d241375(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.084716459197787;
    } else if (((Double)i[37]).doubleValue() < 1.5) {
    p = WekaStringREPTree.N1fb19a01376(i);
    } else if (true) {
      p = 0.03458049886621315;
    } 
    return p;
  }
  static double N1fb19a01376(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.16312056737588654;
    } else if (((Double)i[51]).doubleValue() < 0.6900656814449918) {
      p = 0.323943661971831;
    } else if (true) {
      p = 0.10900473933649289;
    } 
    return p;
  }
  static double N6ee4d9ab1377(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.16666666666666666;
    } else if (((Double)i[31]).doubleValue() < 0.13721804511278196) {
      p = 0.8214285714285714;
    } else if (true) {
    p = WekaStringREPTree.N5a5338df1378(i);
    } 
    return p;
  }
  static double N5a5338df1378(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.0234375;
    } else if (((Double)i[31]).doubleValue() < 0.15388257575757575) {
      p = 0.2;
    } else if (true) {
      p = 0.00847457627118644;
    } 
    return p;
  }
  static double N418c5a9c1379(Object []i) {
    double p = Double.NaN;
    /* knownWordsCount */
    if (i[44] == null) {
      p = 0.04397419760855884;
    } else if (((Double)i[44]).doubleValue() < 1.5) {
    p = WekaStringREPTree.N18e36d141380(i);
    } else if (true) {
    p = WekaStringREPTree.N4278284b1386(i);
    } 
    return p;
  }
  static double N18e36d141380(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.10837745250700716;
    } else if (((Double)i[51]).doubleValue() < 0.8021739130434783) {
    p = WekaStringREPTree.N5082d6221381(i);
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N5082d6221381(Object []i) {
    double p = Double.NaN;
    /* nonVocals */
    if (i[34] == null) {
      p = 0.12305516265912306;
    } else if (((Double)i[34]).doubleValue() < 0.7947368421052632) {
    p = WekaStringREPTree.N13d4992d1382(i);
    } else if (true) {
    p = WekaStringREPTree.N332729ad1384(i);
    } 
    return p;
  }
  static double N13d4992d1382(Object []i) {
    double p = Double.NaN;
    /* commands */
    if (i[5] == null) {
      p = 0.11015683345780433;
    } else if (((Double)i[5]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N302f79711383(i);
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N302f79711383(Object []i) {
    double p = Double.NaN;
    /* slashes */
    if (i[40] == null) {
      p = 0.1254251700680272;
    } else if (((Double)i[40]).doubleValue() < 0.5) {
      p = 0.13204146011716988;
    } else if (true) {
      p = 0.015037593984962405;
    } 
    return p;
  }
  static double N332729ad1384(Object []i) {
    double p = Double.NaN;
    /* strLen */
    if (i[28] == null) {
      p = 0.35333333333333333;
    } else if (((Double)i[28]).doubleValue() < 7.5) {
    p = WekaStringREPTree.N75d2da2d1385(i);
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N75d2da2d1385(Object []i) {
    double p = Double.NaN;
    /* slashes */
    if (i[40] == null) {
      p = 0.4774774774774775;
    } else if (((Double)i[40]).doubleValue() < 0.5) {
      p = 0.5;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N4278284b1386(Object []i) {
    double p = Double.NaN;
    /* maxSingleChar */
    if (i[30] == null) {
      p = 0.02220818861172508;
    } else if (((Double)i[30]).doubleValue() < 0.06559139784946236) {
      p = 1.0;
    } else if (true) {
    p = WekaStringREPTree.N95735841387(i);
    } 
    return p;
  }
  static double N95735841387(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.021899347230996;
    } else if (((Double)i[43]).doubleValue() < 0.9393382352941176) {
    p = WekaStringREPTree.N3370f421388(i);
    } else if (true) {
      p = 0.011687571265678449;
    } 
    return p;
  }
  static double N3370f421388(Object []i) {
    double p = Double.NaN;
    /* stackHeuristic */
    if (i[48] == null) {
      p = 0.05076551168412571;
    } else if (((Double)i[48]).doubleValue() < -0.5210300470577258) {
    p = WekaStringREPTree.N6057aebb1389(i);
    } else if (true) {
    p = WekaStringREPTree.N63eef88a1390(i);
    } 
    return p;
  }
  static double N6057aebb1389(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.025755879059350503;
    } else if (((Double)i[31]).doubleValue() < 0.2838827838827839) {
      p = 0.01991798476859988;
    } else if (true) {
      p = 0.1518987341772152;
    } 
    return p;
  }
  static double N63eef88a1390(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.11494252873563218;
    } else if (((Double)i[51]).doubleValue() < 0.6073781291172595) {
      p = 0.24786324786324787;
    } else if (true) {
      p = 0.047619047619047616;
    } 
    return p;
  }
  static double N53251a661391(Object []i) {
    double p = Double.NaN;
    /* nonVocals */
    if (i[34] == null) {
      p = 0.16022099447513813;
    } else if (((Double)i[34]).doubleValue() < 0.6381818181818182) {
    p = WekaStringREPTree.N6853425f1392(i);
    } else if (true) {
    p = WekaStringREPTree.N6c0d7c831402(i);
    } 
    return p;
  }
  static double N6853425f1392(Object []i) {
    double p = Double.NaN;
    /* minLenKnownWord */
    if (i[46] == null) {
      p = 0.07804370447450572;
    } else if (((Double)i[46]).doubleValue() < 2.5) {
    p = WekaStringREPTree.N352c1b981393(i);
    } else if (true) {
    p = WekaStringREPTree.N7d8989811397(i);
    } 
    return p;
  }
  static double N352c1b981393(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.22624434389140272;
    } else if (((Double)i[31]).doubleValue() < 0.1715686274509804) {
    p = WekaStringREPTree.N21129f1f1394(i);
    } else if (true) {
    p = WekaStringREPTree.N282cb7c71396(i);
    } 
    return p;
  }
  static double N21129f1f1394(Object []i) {
    double p = Double.NaN;
    /* strLen */
    if (i[28] == null) {
      p = 0.5909090909090909;
    } else if (((Double)i[28]).doubleValue() < 11.5) {
      p = 0.0;
    } else if (true) {
    p = WekaStringREPTree.N5a9f47711395(i);
    } 
    return p;
  }
  static double N5a9f47711395(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.7959183673469388;
    } else if (((Double)i[37]).doubleValue() < 1.5) {
      p = 0.9722222222222222;
    } else if (true) {
      p = 0.3076923076923077;
    } 
    return p;
  }
  static double N282cb7c71396(Object []i) {
    double p = Double.NaN;
    /* pluses */
    if (i[41] == null) {
      p = 0.07096774193548387;
    } else if (((Double)i[41]).doubleValue() < 0.5) {
      p = 0.02040816326530612;
    } else if (true) {
      p = 1.0;
    } 
    return p;
  }
  static double N7d8989811397(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.033783783783783786;
    } else if (((Double)i[37]).doubleValue() < 1.5) {
    p = WekaStringREPTree.N48d61b481398(i);
    } else if (true) {
    p = WekaStringREPTree.N14f9390f1401(i);
    } 
    return p;
  }
  static double N48d61b481398(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.09545454545454546;
    } else if (((Double)i[31]).doubleValue() < 0.21825396825396826) {
      p = 0.029411764705882353;
    } else if (true) {
    p = WekaStringREPTree.N68d279ec1399(i);
    } 
    return p;
  }
  static double N68d279ec1399(Object []i) {
    double p = Double.NaN;
    /* strLen */
    if (i[28] == null) {
      p = 0.32;
    } else if (((Double)i[28]).doubleValue() < 9.5) {
    p = WekaStringREPTree.N258d79be1400(i);
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N258d79be1400(Object []i) {
    double p = Double.NaN;
    /* maxRepChars */
    if (i[35] == null) {
      p = 0.5925925925925926;
    } else if (((Double)i[35]).doubleValue() < 1.5) {
      p = 0.5416666666666666;
    } else if (true) {
      p = 1.0;
    } 
    return p;
  }
  static double N14f9390f1401(Object []i) {
    double p = Double.NaN;
    /* stackHeuristic */
    if (i[48] == null) {
      p = 0.007692307692307693;
    } else if (((Double)i[48]).doubleValue() < -0.12535411001015198) {
      p = 0.0038684719535783366;
    } else if (true) {
      p = 0.6666666666666666;
    } 
    return p;
  }
  static double N6c0d7c831402(Object []i) {
    double p = Double.NaN;
    /* strLen */
    if (i[28] == null) {
      p = 0.792;
    } else if (((Double)i[28]).doubleValue() < 11.5) {
    p = WekaStringREPTree.N176b75f71403(i);
    } else if (true) {
      p = 0.9375;
    } 
    return p;
  }
  static double N176b75f71403(Object []i) {
    double p = Double.NaN;
    /* nonVocals */
    if (i[34] == null) {
      p = 0.3103448275862069;
    } else if (((Double)i[34]).doubleValue() < 0.7525252525252526) {
    p = WekaStringREPTree.N5965be2d1404(i);
    } else if (true) {
    p = WekaStringREPTree.N409c54f1405(i);
    } 
    return p;
  }
  static double N5965be2d1404(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.2;
    } else if (((Double)i[37]).doubleValue() < 1.5) {
      p = 0.5;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N409c54f1405(Object []i) {
    double p = Double.NaN;
    /* maxRepChars */
    if (i[35] == null) {
      p = 0.5555555555555556;
    } else if (((Double)i[35]).doubleValue() < 1.5) {
      p = 0.8333333333333334;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N3e748291406(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.08279539713724389;
    } else if (((Double)i[43]).doubleValue() < 0.8944444444444444) {
    p = WekaStringREPTree.N4f6f416f1407(i);
    } else if (true) {
    p = WekaStringREPTree.N7aaca91a1414(i);
    } 
    return p;
  }
  static double N4f6f416f1407(Object []i) {
    double p = Double.NaN;
    /* stackHeuristic */
    if (i[48] == null) {
      p = 0.5110192837465565;
    } else if (((Double)i[48]).doubleValue() < -0.4412135489704734) {
      p = 0.2397003745318352;
    } else if (true) {
    p = WekaStringREPTree.N3b8f0a791408(i);
    } 
    return p;
  }
  static double N3b8f0a791408(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.6688453159041394;
    } else if (((Double)i[51]).doubleValue() < 0.7735042735042734) {
    p = WekaStringREPTree.N71e693fa1409(i);
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N71e693fa1409(Object []i) {
    double p = Double.NaN;
    /* commands */
    if (i[5] == null) {
      p = 0.7732997481108312;
    } else if (((Double)i[5]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N48793bef1410(i);
    } else if (true) {
    p = WekaStringREPTree.N7b8b43c71413(i);
    } 
    return p;
  }
  static double N48793bef1410(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.8125;
    } else if (((Double)i[37]).doubleValue() < 0.5) {
      p = 0.0;
    } else if (true) {
    p = WekaStringREPTree.N7d286fb61411(i);
    } 
    return p;
  }
  static double N7d286fb61411(Object []i) {
    double p = Double.NaN;
    /* xml */
    if (i[0] == null) {
      p = 0.835195530726257;
    } else if (((Double)i[0]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N3eb77ea81412(i);
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N3eb77ea81412(Object []i) {
    double p = Double.NaN;
    /* setDist */
    if (i[29] == null) {
      p = 0.8470254957507082;
    } else if (((Double)i[29]).doubleValue() < 0.20714285714285713) {
      p = 0.9414893617021277;
    } else if (true) {
      p = 0.7393939393939394;
    } 
    return p;
  }
  static double N7b8b43c71413(Object []i) {
    double p = Double.NaN;
    /* setDist */
    if (i[29] == null) {
      p = 0.27586206896551724;
    } else if (((Double)i[29]).doubleValue() < 0.16193181818181818) {
      p = 0.875;
    } else if (true) {
      p = 0.047619047619047616;
    } 
    return p;
  }
  static double N7aaca91a1414(Object []i) {
    double p = Double.NaN;
    /* nonVocals */
    if (i[34] == null) {
      p = 0.03421875;
    } else if (((Double)i[34]).doubleValue() < 0.5683229813664596) {
    p = WekaStringREPTree.N44c73c261415(i);
    } else if (true) {
    p = WekaStringREPTree.N7fcf2fc11418(i);
    } 
    return p;
  }
  static double N44c73c261415(Object []i) {
    double p = Double.NaN;
    /* pluses */
    if (i[41] == null) {
      p = 0.03000491883915396;
    } else if (((Double)i[41]).doubleValue() < 0.5) {
      p = 0.027238000332170737;
    } else if (true) {
    p = WekaStringREPTree.N410058281416(i);
    } 
    return p;
  }
  static double N410058281416(Object []i) {
    double p = Double.NaN;
    /* stackHeuristic */
    if (i[48] == null) {
      p = 0.24358974358974358;
    } else if (((Double)i[48]).doubleValue() < -0.2987993789864775) {
      p = 0.06818181818181818;
    } else if (true) {
    p = WekaStringREPTree.N60b4beb41417(i);
    } 
    return p;
  }
  static double N60b4beb41417(Object []i) {
    double p = Double.NaN;
    /* minLenKnownWord */
    if (i[46] == null) {
      p = 0.47058823529411764;
    } else if (((Double)i[46]).doubleValue() < 3.5) {
      p = 1.0;
    } else if (true) {
      p = 0.3333333333333333;
    } 
    return p;
  }
  static double N7fcf2fc11418(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.11960132890365449;
    } else if (((Double)i[37]).doubleValue() < 0.5) {
      p = 0.0;
    } else if (true) {
      p = 0.1875;
    } 
    return p;
  }
  static double N2141a121419(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.5846456692913385;
    } else if (((Double)i[37]).doubleValue() < 1.5) {
    p = WekaStringREPTree.N4196c3601420(i);
    } else if (true) {
    p = WekaStringREPTree.N41294f81421(i);
    } 
    return p;
  }
  static double N4196c3601420(Object []i) {
    double p = Double.NaN;
    /* strLen */
    if (i[28] == null) {
      p = 0.9896907216494846;
    } else if (((Double)i[28]).doubleValue() < 8.5) {
      p = 0.0;
    } else if (true) {
      p = 0.9965397923875432;
    } 
    return p;
  }
  static double N41294f81421(Object []i) {
    double p = Double.NaN;
    /* sumRepChar */
    if (i[42] == null) {
      p = 0.041474654377880185;
    } else if (((Double)i[42]).doubleValue() < 1.5) {
      p = 0.75;
    } else if (true) {
      p = 0.028169014084507043;
    } 
    return p;
  }
  static double N225129c1422(Object []i) {
    double p = Double.NaN;
    /* knownUniqueWords */
    if (i[45] == null) {
      p = 0.6951344957053952;
    } else if (((Double)i[45]).doubleValue() < 6.5) {
    p = WekaStringREPTree.N20435c401423(i);
    } else if (true) {
    p = WekaStringREPTree.N36cda2c21528(i);
    } 
    return p;
  }
  static double N20435c401423(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.3631062814736284;
    } else if (((Double)i[43]).doubleValue() < 0.9372549019607843) {
    p = WekaStringREPTree.N573906eb1424(i);
    } else if (true) {
    p = WekaStringREPTree.N8e501041472(i);
    } 
    return p;
  }
  static double N573906eb1424(Object []i) {
    double p = Double.NaN;
    /* stackHeuristic */
    if (i[48] == null) {
      p = 0.586106564829969;
    } else if (((Double)i[48]).doubleValue() < -0.5210300470577258) {
    p = WekaStringREPTree.N479ceda01425(i);
    } else if (true) {
    p = WekaStringREPTree.N20f5281c1446(i);
    } 
    return p;
  }
  static double N479ceda01425(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.3547338480292564;
    } else if (((Double)i[37]).doubleValue() < 1.5) {
    p = WekaStringREPTree.N6d07a63d1426(i);
    } else if (true) {
    p = WekaStringREPTree.N38ba6ce31430(i);
    } 
    return p;
  }
  static double N6d07a63d1426(Object []i) {
    double p = Double.NaN;
    /* nonVocals */
    if (i[34] == null) {
      p = 0.8621495327102804;
    } else if (((Double)i[34]).doubleValue() < 0.4564393939393939) {
      p = 0.4722222222222222;
    } else if (true) {
    p = WekaStringREPTree.N571c56811427(i);
    } 
    return p;
  }
  static double N571c56811427(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.8979591836734694;
    } else if (((Double)i[51]).doubleValue() < 0.5837912087912087) {
    p = WekaStringREPTree.N488d1cd71428(i);
    } else if (true) {
      p = 0.09090909090909091;
    } 
    return p;
  }
  static double N488d1cd71428(Object []i) {
    double p = Double.NaN;
    /* simpleSplitWordLen */
    if (i[36] == null) {
      p = 0.9212598425196851;
    } else if (((Double)i[36]).doubleValue() < 16.5) {
    p = WekaStringREPTree.N68dc098b1429(i);
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N68dc098b1429(Object []i) {
    double p = Double.NaN;
    /* knownWordsCount */
    if (i[44] == null) {
      p = 0.9285714285714286;
    } else if (((Double)i[44]).doubleValue() < 5.5) {
      p = 0.8125;
    } else if (true) {
      p = 0.9774436090225563;
    } 
    return p;
  }
  static double N38ba6ce31430(Object []i) {
    double p = Double.NaN;
    /* setDist */
    if (i[29] == null) {
      p = 0.24790949335956713;
    } else if (((Double)i[29]).doubleValue() < 0.31698564593301437) {
    p = WekaStringREPTree.Nd278d2b1431(i);
    } else if (true) {
    p = WekaStringREPTree.N7ceb31851439(i);
    } 
    return p;
  }
  static double Nd278d2b1431(Object []i) {
    double p = Double.NaN;
    /* vocals */
    if (i[33] == null) {
      p = 0.6794117647058824;
    } else if (((Double)i[33]).doubleValue() < 0.19292803970223327) {
    p = WekaStringREPTree.N2d6c53fc1432(i);
    } else if (true) {
    p = WekaStringREPTree.N7fbdb8941435(i);
    } 
    return p;
  }
  static double N2d6c53fc1432(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.8283261802575107;
    } else if (((Double)i[51]).doubleValue() < 0.49390243902439024) {
      p = 0.9444444444444444;
    } else if (true) {
    p = WekaStringREPTree.N25f4878b1433(i);
    } 
    return p;
  }
  static double N25f4878b1433(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.17142857142857143;
    } else if (((Double)i[43]).doubleValue() < 0.6235294117647059) {
      p = 0.038461538461538464;
    } else if (true) {
    p = WekaStringREPTree.N4e423aa21434(i);
    } 
    return p;
  }
  static double N4e423aa21434(Object []i) {
    double p = Double.NaN;
    /* date */
    if (i[17] == null) {
      p = 0.5555555555555556;
    } else if (((Double)i[17]).doubleValue() < 0.5) {
      p = 1.0;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N7fbdb8941435(Object []i) {
    double p = Double.NaN;
    /* knownUniqueWords */
    if (i[45] == null) {
      p = 0.35514018691588783;
    } else if (((Double)i[45]).doubleValue() < 5.5) {
    p = WekaStringREPTree.N3081f72c1436(i);
    } else if (true) {
    p = WekaStringREPTree.N3148f6681437(i);
    } 
    return p;
  }
  static double N3081f72c1436(Object []i) {
    double p = Double.NaN;
    /* vocals */
    if (i[33] == null) {
      p = 0.1780821917808219;
    } else if (((Double)i[33]).doubleValue() < 0.2132034632034632) {
      p = 0.4666666666666667;
    } else if (true) {
      p = 0.10344827586206896;
    } 
    return p;
  }
  static double N3148f6681437(Object []i) {
    double p = Double.NaN;
    /* slashes */
    if (i[40] == null) {
      p = 0.7352941176470589;
    } else if (((Double)i[40]).doubleValue() < 1.5) {
    p = WekaStringREPTree.N6e005dc91438(i);
    } else if (true) {
      p = 0.16666666666666666;
    } 
    return p;
  }
  static double N6e005dc91438(Object []i) {
    double p = Double.NaN;
    /* brand */
    if (i[20] == null) {
      p = 0.8571428571428571;
    } else if (((Double)i[20]).doubleValue() < 0.5) {
      p = 0.9230769230769231;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N7ceb31851439(Object []i) {
    double p = Double.NaN;
    /* vocals */
    if (i[33] == null) {
      p = 0.16125221500295334;
    } else if (((Double)i[33]).doubleValue() < 0.17192118226600986) {
    p = WekaStringREPTree.N436c81a31440(i);
    } else if (true) {
    p = WekaStringREPTree.N609db5461445(i);
    } 
    return p;
  }
  static double N436c81a31440(Object []i) {
    double p = Double.NaN;
    /* date */
    if (i[17] == null) {
      p = 0.2908622908622909;
    } else if (((Double)i[17]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N3561c4101441(i);
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N3561c4101441(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.4388349514563107;
    } else if (((Double)i[37]).doubleValue() < 12.5) {
    p = WekaStringREPTree.N59e329601442(i);
    } else if (true) {
      p = 0.14432989690721648;
    } 
    return p;
  }
  static double N59e329601442(Object []i) {
    double p = Double.NaN;
    /* vocals */
    if (i[33] == null) {
      p = 0.507177033492823;
    } else if (((Double)i[33]).doubleValue() < 0.106203007518797) {
    p = WekaStringREPTree.N7c214cc01443(i);
    } else if (true) {
    p = WekaStringREPTree.N5b67bb7e1444(i);
    } 
    return p;
  }
  static double N7c214cc01443(Object []i) {
    double p = Double.NaN;
    /* digits */
    if (i[32] == null) {
      p = 0.7135416666666666;
    } else if (((Double)i[32]).doubleValue() < 0.28174603174603174) {
      p = 0.7486338797814208;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N5b67bb7e1444(Object []i) {
    double p = Double.NaN;
    /* nonVocals */
    if (i[34] == null) {
      p = 0.33185840707964603;
    } else if (((Double)i[34]).doubleValue() < 0.5208695652173914) {
      p = 0.2158273381294964;
    } else if (true) {
      p = 0.5172413793103449;
    } 
    return p;
  }
  static double N609db5461445(Object []i) {
    double p = Double.NaN;
    /* nonVocals */
    if (i[34] == null) {
      p = 0.05131004366812227;
    } else if (((Double)i[34]).doubleValue() < 0.6465952080706179) {
      p = 0.047149122807017545;
    } else if (true) {
      p = 1.0;
    } 
    return p;
  }
  static double N20f5281c1446(Object []i) {
    double p = Double.NaN;
    /* date */
    if (i[17] == null) {
      p = 0.7735352205398288;
    } else if (((Double)i[17]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N56c4278e1447(i);
    } else if (true) {
    p = WekaStringREPTree.N79dc53181471(i);
    } 
    return p;
  }
  static double N56c4278e1447(Object []i) {
    double p = Double.NaN;
    /* knownWordsCount */
    if (i[44] == null) {
      p = 0.8039081247857388;
    } else if (((Double)i[44]).doubleValue() < 3.5) {
    p = WekaStringREPTree.N301eda631448(i);
    } else if (true) {
    p = WekaStringREPTree.N3f67593e1462(i);
    } 
    return p;
  }
  static double N301eda631448(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.5876152832674572;
    } else if (((Double)i[31]).doubleValue() < 0.3550420168067227) {
    p = WekaStringREPTree.N3d246ea31449(i);
    } else if (true) {
    p = WekaStringREPTree.N768fc0f21457(i);
    } 
    return p;
  }
  static double N3d246ea31449(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.46387832699619774;
    } else if (((Double)i[37]).doubleValue() < 1.5) {
    p = WekaStringREPTree.N341814d31450(i);
    } else if (true) {
    p = WekaStringREPTree.N6f19ac191454(i);
    } 
    return p;
  }
  static double N341814d31450(Object []i) {
    double p = Double.NaN;
    /* equals */
    if (i[38] == null) {
      p = 0.75;
    } else if (((Double)i[38]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N4397ad891451(i);
    } else if (true) {
      p = 1.0;
    } 
    return p;
  }
  static double N4397ad891451(Object []i) {
    double p = Double.NaN;
    /* digits */
    if (i[32] == null) {
      p = 0.6518518518518519;
    } else if (((Double)i[32]).doubleValue() < 0.08712121212121213) {
    p = WekaStringREPTree.N59cba5a1452(i);
    } else if (true) {
    p = WekaStringREPTree.N1bd39d3c1453(i);
    } 
    return p;
  }
  static double N59cba5a1452(Object []i) {
    double p = Double.NaN;
    /* nonVocals */
    if (i[34] == null) {
      p = 0.40816326530612246;
    } else if (((Double)i[34]).doubleValue() < 0.5357142857142857) {
      p = 0.0625;
    } else if (true) {
      p = 0.5757575757575758;
    } 
    return p;
  }
  static double N1bd39d3c1453(Object []i) {
    double p = Double.NaN;
    /* commands */
    if (i[5] == null) {
      p = 0.7906976744186046;
    } else if (((Double)i[5]).doubleValue() < 0.5) {
      p = 0.8292682926829268;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N6f19ac191454(Object []i) {
    double p = Double.NaN;
    /* stackHeuristic */
    if (i[48] == null) {
      p = 0.3047337278106509;
    } else if (((Double)i[48]).doubleValue() < -0.315596028282386) {
      p = 0.18907563025210083;
    } else if (true) {
    p = WekaStringREPTree.N119cbf961455(i);
    } 
    return p;
  }
  static double N119cbf961455(Object []i) {
    double p = Double.NaN;
    /* crypto */
    if (i[19] == null) {
      p = 0.58;
    } else if (((Double)i[19]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N713299951456(i);
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N713299951456(Object []i) {
    double p = Double.NaN;
    /* vocals */
    if (i[33] == null) {
      p = 0.651685393258427;
    } else if (((Double)i[33]).doubleValue() < 0.34523809523809523) {
      p = 0.7037037037037037;
    } else if (true) {
      p = 0.125;
    } 
    return p;
  }
  static double N768fc0f21457(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.8669527896995708;
    } else if (((Double)i[51]).doubleValue() < 0.7453703703703703) {
    p = WekaStringREPTree.N5454d35e1458(i);
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N5454d35e1458(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.8782608695652174;
    } else if (((Double)i[51]).doubleValue() < 0.6518489378442172) {
    p = WekaStringREPTree.N20c0a64d1459(i);
    } else if (true) {
    p = WekaStringREPTree.N4ddbbdf81461(i);
    } 
    return p;
  }
  static double N20c0a64d1459(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.9195402298850575;
    } else if (((Double)i[31]).doubleValue() < 0.4330357142857143) {
    p = WekaStringREPTree.N455b6df11460(i);
    } else if (true) {
      p = 0.9915966386554622;
    } 
    return p;
  }
  static double N455b6df11460(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.7636363636363637;
    } else if (((Double)i[37]).doubleValue() < 9.0) {
      p = 0.8076923076923077;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N4ddbbdf81461(Object []i) {
    double p = Double.NaN;
    /* strLen */
    if (i[28] == null) {
      p = 0.75;
    } else if (((Double)i[28]).doubleValue() < 10.5) {
      p = 0.9333333333333333;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N3f67593e1462(Object []i) {
    double p = Double.NaN;
    /* xml */
    if (i[0] == null) {
      p = 0.8799814643188137;
    } else if (((Double)i[0]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N1ab062511463(i);
    } else if (true) {
    p = WekaStringREPTree.N43b9fd51470(i);
    } 
    return p;
  }
  static double N1ab062511463(Object []i) {
    double p = Double.NaN;
    /* crypto */
    if (i[19] == null) {
      p = 0.9079578139980825;
    } else if (((Double)i[19]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N41ab0131464(i);
    } else if (true) {
    p = WekaStringREPTree.N82ea68c1467(i);
    } 
    return p;
  }
  static double N41ab0131464(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.9350180505415162;
    } else if (((Double)i[51]).doubleValue() < 0.6916017797552837) {
    p = WekaStringREPTree.N14bee9151465(i);
    } else if (true) {
      p = 0.16666666666666666;
    } 
    return p;
  }
  static double N14bee9151465(Object []i) {
    double p = Double.NaN;
    /* setDist */
    if (i[29] == null) {
      p = 0.939802802283342;
    } else if (((Double)i[29]).doubleValue() < 0.6333333333333333) {
    p = WekaStringREPTree.N1115ec151466(i);
    } else if (true) {
      p = 0.3684210526315789;
    } 
    return p;
  }
  static double N1115ec151466(Object []i) {
    double p = Double.NaN;
    /* vocals */
    if (i[33] == null) {
      p = 0.9454926624737946;
    } else if (((Double)i[33]).doubleValue() < 0.17752100840336135) {
      p = 0.9734789391575663;
    } else if (true) {
      p = 0.8881789137380192;
    } 
    return p;
  }
  static double N82ea68c1467(Object []i) {
    double p = Double.NaN;
    /* simpleSplitWordLen */
    if (i[36] == null) {
      p = 0.5510204081632653;
    } else if (((Double)i[36]).doubleValue() < 9.5) {
    p = WekaStringREPTree.N59e505b21468(i);
    } else if (true) {
      p = 0.9545454545454546;
    } 
    return p;
  }
  static double N59e505b21468(Object []i) {
    double p = Double.NaN;
    /* sumRepChar */
    if (i[42] == null) {
      p = 0.3786407766990291;
    } else if (((Double)i[42]).doubleValue() < 2.5) {
      p = 0.25;
    } else if (true) {
    p = WekaStringREPTree.N3af0a9da1469(i);
    } 
    return p;
  }
  static double N3af0a9da1469(Object []i) {
    double p = Double.NaN;
    /* digits */
    if (i[32] == null) {
      p = 0.5581395348837209;
    } else if (((Double)i[32]).doubleValue() < 0.20416666666666666) {
      p = 0.2962962962962963;
    } else if (true) {
      p = 1.0;
    } 
    return p;
  }
  static double N43b9fd51470(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.06944444444444445;
    } else if (((Double)i[31]).doubleValue() < 0.4019607843137255) {
      p = 0.015151515151515152;
    } else if (true) {
      p = 0.6666666666666666;
    } 
    return p;
  }
  static double N79dc53181471(Object []i) {
    double p = Double.NaN;
    /* nonVocals */
    if (i[34] == null) {
      p = 0.04132231404958678;
    } else if (((Double)i[34]).doubleValue() < 0.28888888888888886) {
      p = 0.8333333333333334;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N8e501041472(Object []i) {
    double p = Double.NaN;
    /* equals */
    if (i[38] == null) {
      p = 0.23527572188053789;
    } else if (((Double)i[38]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N37e4d7bb1473(i);
    } else if (true) {
    p = WekaStringREPTree.N6f44a1571518(i);
    } 
    return p;
  }
  static double N37e4d7bb1473(Object []i) {
    double p = Double.NaN;
    /* knownUniqueWords */
    if (i[45] == null) {
      p = 0.17785077428437354;
    } else if (((Double)i[45]).doubleValue() < 3.5) {
    p = WekaStringREPTree.N6f7923a51474(i);
    } else if (true) {
    p = WekaStringREPTree.Nbabafc21496(i);
    } 
    return p;
  }
  static double N6f7923a51474(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.10893916099275203;
    } else if (((Double)i[31]).doubleValue() < 0.2111111111111111) {
    p = WekaStringREPTree.N74a6f9c11475(i);
    } else if (true) {
    p = WekaStringREPTree.Nf107c501485(i);
    } 
    return p;
  }
  static double N74a6f9c11475(Object []i) {
    double p = Double.NaN;
    /* setDist */
    if (i[29] == null) {
      p = 0.2625169147496617;
    } else if (((Double)i[29]).doubleValue() < 0.4642857142857143) {
    p = WekaStringREPTree.N54eb2b701476(i);
    } else if (true) {
    p = WekaStringREPTree.N2d778add1480(i);
    } 
    return p;
  }
  static double N54eb2b701476(Object []i) {
    double p = Double.NaN;
    /* strLen */
    if (i[28] == null) {
      p = 0.22782608695652173;
    } else if (((Double)i[28]).doubleValue() < 8.5) {
    p = WekaStringREPTree.N45a377591477(i);
    } else if (true) {
      p = 0.03278688524590164;
    } 
    return p;
  }
  static double N45a377591477(Object []i) {
    double p = Double.NaN;
    /* vocals */
    if (i[33] == null) {
      p = 0.2509727626459144;
    } else if (((Double)i[33]).doubleValue() < 0.4642857142857143) {
    p = WekaStringREPTree.N636110431478(i);
    } else if (true) {
      p = 0.7777777777777778;
    } 
    return p;
  }
  static double N636110431478(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.24158415841584158;
    } else if (((Double)i[51]).doubleValue() < 0.7765072765072765) {
      p = 0.37;
    } else if (true) {
    p = WekaStringREPTree.N20ca951f1479(i);
    } 
    return p;
  }
  static double N20ca951f1479(Object []i) {
    double p = Double.NaN;
    /* color */
    if (i[10] == null) {
      p = 0.20987654320987653;
    } else if (((Double)i[10]).doubleValue() < 0.5) {
      p = 0.22911051212938005;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N2d778add1480(Object []i) {
    double p = Double.NaN;
    /* maxRepChars */
    if (i[35] == null) {
      p = 0.38414634146341464;
    } else if (((Double)i[35]).doubleValue() < 1.5) {
    p = WekaStringREPTree.N733029951481(i);
    } else if (true) {
    p = WekaStringREPTree.N7d9e8ef71484(i);
    } 
    return p;
  }
  static double N733029951481(Object []i) {
    double p = Double.NaN;
    /* normEntropy */
    if (i[50] == null) {
      p = 0.45454545454545453;
    } else if (((Double)i[50]).doubleValue() < 2.510820318171659) {
    p = WekaStringREPTree.N1838ccb81482(i);
    } else if (true) {
      p = 0.3076923076923077;
    } 
    return p;
  }
  static double N1838ccb81482(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.47674418604651164;
    } else if (((Double)i[51]).doubleValue() < 0.7846153846153846) {
      p = 0.8181818181818182;
    } else if (true) {
    p = WekaStringREPTree.N6c2ed0cd1483(i);
    } 
    return p;
  }
  static double N6c2ed0cd1483(Object []i) {
    double p = Double.NaN;
    /* setDist */
    if (i[29] == null) {
      p = 0.359375;
    } else if (((Double)i[29]).doubleValue() < 0.875) {
      p = 0.3387096774193548;
    } else if (true) {
      p = 1.0;
    } 
    return p;
  }
  static double N7d9e8ef71484(Object []i) {
    double p = Double.NaN;
    /* vocals */
    if (i[33] == null) {
      p = 0.27692307692307694;
    } else if (((Double)i[33]).doubleValue() < 0.07142857142857142) {
      p = 0.875;
    } else if (true) {
      p = 0.19298245614035087;
    } 
    return p;
  }
  static double Nf107c501485(Object []i) {
    double p = Double.NaN;
    /* pluses */
    if (i[41] == null) {
      p = 0.07918196119559517;
    } else if (((Double)i[41]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N51133c061486(i);
    } else if (true) {
    p = WekaStringREPTree.N95e33cc1492(i);
    } 
    return p;
  }
  static double N51133c061486(Object []i) {
    double p = Double.NaN;
    /* normEntropy */
    if (i[50] == null) {
      p = 0.07260016133369185;
    } else if (((Double)i[50]).doubleValue() < 2.1573948124007094) {
    p = WekaStringREPTree.N4b2136511487(i);
    } else if (true) {
    p = WekaStringREPTree.N4241e0f41488(i);
    } 
    return p;
  }
  static double N4b2136511487(Object []i) {
    double p = Double.NaN;
    /* knownWordsCount */
    if (i[44] == null) {
      p = 0.3333333333333333;
    } else if (((Double)i[44]).doubleValue() < 3.5) {
      p = 0.24242424242424243;
    } else if (true) {
      p = 0.8333333333333334;
    } 
    return p;
  }
  static double N4241e0f41488(Object []i) {
    double p = Double.NaN;
    /* slashes */
    if (i[40] == null) {
      p = 0.06983695652173913;
    } else if (((Double)i[40]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N4ebff6101489(i);
    } else if (true) {
    p = WekaStringREPTree.N44d52de21491(i);
    } 
    return p;
  }
  static double N4ebff6101489(Object []i) {
    double p = Double.NaN;
    /* date */
    if (i[17] == null) {
      p = 0.06441717791411043;
    } else if (((Double)i[17]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N60410cd1490(i);
    } else if (true) {
      p = 0.004658385093167702;
    } 
    return p;
  }
  static double N60410cd1490(Object []i) {
    double p = Double.NaN;
    /* vocals */
    if (i[33] == null) {
      p = 0.07749830047586675;
    } else if (((Double)i[33]).doubleValue() < 0.14835164835164835) {
      p = 0.12823397075365578;
    } else if (true) {
      p = 0.05552849488553337;
    } 
    return p;
  }
  static double N44d52de21491(Object []i) {
    double p = Double.NaN;
    /* vocals */
    if (i[33] == null) {
      p = 0.2765957446808511;
    } else if (((Double)i[33]).doubleValue() < 0.07417582417582418) {
      p = 0.08571428571428572;
    } else if (true) {
      p = 0.3898305084745763;
    } 
    return p;
  }
  static double N95e33cc1492(Object []i) {
    double p = Double.NaN;
    /* regex */
    if (i[3] == null) {
      p = 0.3368421052631579;
    } else if (((Double)i[3]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N38604b811493(i);
    } else if (true) {
      p = 0.5384615384615384;
    } 
    return p;
  }
  static double N38604b811493(Object []i) {
    double p = Double.NaN;
    /* simpleSplitWordLen */
    if (i[36] == null) {
      p = 0.19642857142857142;
    } else if (((Double)i[36]).doubleValue() < 6.5) {
    p = WekaStringREPTree.N1e44b6381494(i);
    } else if (true) {
      p = 1.0;
    } 
    return p;
  }
  static double N1e44b6381494(Object []i) {
    double p = Double.NaN;
    /* maxRepChars */
    if (i[35] == null) {
      p = 0.08163265306122448;
    } else if (((Double)i[35]).doubleValue() < 1.5) {
      p = 0.023255813953488372;
    } else if (true) {
    p = WekaStringREPTree.N7393222f1495(i);
    } 
    return p;
  }
  static double N7393222f1495(Object []i) {
    double p = Double.NaN;
    /* strLen */
    if (i[28] == null) {
      p = 0.5;
    } else if (((Double)i[28]).doubleValue() < 7.5) {
      p = 0.0;
    } else if (true) {
      p = 1.0;
    } 
    return p;
  }
  static double Nbabafc21496(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.2568622513220851;
    } else if (((Double)i[37]).doubleValue() < 1.5) {
    p = WekaStringREPTree.N31add1751497(i);
    } else if (true) {
    p = WekaStringREPTree.N50de186c1505(i);
    } 
    return p;
  }
  static double N31add1751497(Object []i) {
    double p = Double.NaN;
    /* commands */
    if (i[5] == null) {
      p = 0.5411764705882353;
    } else if (((Double)i[5]).doubleValue() < 0.5) {
    p = WekaStringREPTree.Nae3540e1498(i);
    } else if (true) {
      p = 0.00909090909090909;
    } 
    return p;
  }
  static double Nae3540e1498(Object []i) {
    double p = Double.NaN;
    /* crypto */
    if (i[19] == null) {
      p = 0.6054945054945055;
    } else if (((Double)i[19]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N600b9d271499(i);
    } else if (true) {
    p = WekaStringREPTree.N7922d8921502(i);
    } 
    return p;
  }
  static double N600b9d271499(Object []i) {
    double p = Double.NaN;
    /* date */
    if (i[17] == null) {
      p = 0.6585067319461444;
    } else if (((Double)i[17]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N3688eb5b1500(i);
    } else if (true) {
      p = 0.07142857142857142;
    } 
    return p;
  }
  static double N3688eb5b1500(Object []i) {
    double p = Double.NaN;
    /* dashes */
    if (i[39] == null) {
      p = 0.7017082785808147;
    } else if (((Double)i[39]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N69f1a2861501(i);
    } else if (true) {
      p = 0.08888888888888889;
    } 
    return p;
  }
  static double N69f1a2861501(Object []i) {
    double p = Double.NaN;
    /* digits */
    if (i[32] == null) {
      p = 0.7402234636871509;
    } else if (((Double)i[32]).doubleValue() < 0.10555555555555556) {
      p = 0.40875912408759124;
    } else if (true) {
      p = 0.8186528497409327;
    } 
    return p;
  }
  static double N7922d8921502(Object []i) {
    double p = Double.NaN;
    /* setDist */
    if (i[29] == null) {
      p = 0.13978494623655913;
    } else if (((Double)i[29]).doubleValue() < 0.7386363636363636) {
    p = WekaStringREPTree.N457c90341503(i);
    } else if (true) {
      p = 0.75;
    } 
    return p;
  }
  static double N457c90341503(Object []i) {
    double p = Double.NaN;
    /* strLen */
    if (i[28] == null) {
      p = 0.11235955056179775;
    } else if (((Double)i[28]).doubleValue() < 8.5) {
    p = WekaStringREPTree.N345f69f31504(i);
    } else if (true) {
      p = 0.03896103896103896;
    } 
    return p;
  }
  static double N345f69f31504(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.5833333333333334;
    } else if (((Double)i[31]).doubleValue() < 0.1875) {
      p = 0.0;
    } else if (true) {
      p = 0.7;
    } 
    return p;
  }
  static double N50de186c1505(Object []i) {
    double p = Double.NaN;
    /* setDist */
    if (i[29] == null) {
      p = 0.15859030837004406;
    } else if (((Double)i[29]).doubleValue() < 0.26969696969696966) {
    p = WekaStringREPTree.N3f57bcad1506(i);
    } else if (true) {
    p = WekaStringREPTree.N7daa0fbd1513(i);
    } 
    return p;
  }
  static double N3f57bcad1506(Object []i) {
    double p = Double.NaN;
    /* pluses */
    if (i[41] == null) {
      p = 0.30610134436401243;
    } else if (((Double)i[41]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N1e8b76431507(i);
    } else if (true) {
    p = WekaStringREPTree.N36a5cabc1511(i);
    } 
    return p;
  }
  static double N1e8b76431507(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.2691879866518354;
    } else if (((Double)i[51]).doubleValue() < 0.6700680272108844) {
    p = WekaStringREPTree.N515494901508(i);
    } else if (true) {
      p = 0.06878306878306878;
    } 
    return p;
  }
  static double N515494901508(Object []i) {
    double p = Double.NaN;
    /* sumRepChar */
    if (i[42] == null) {
      p = 0.32253521126760565;
    } else if (((Double)i[42]).doubleValue() < 1.5) {
    p = WekaStringREPTree.N71e9ebae1509(i);
    } else if (true) {
    p = WekaStringREPTree.N73d983ea1510(i);
    } 
    return p;
  }
  static double N71e9ebae1509(Object []i) {
    double p = Double.NaN;
    /* knownWordsCount */
    if (i[44] == null) {
      p = 0.47904191616766467;
    } else if (((Double)i[44]).doubleValue() < 5.5) {
      p = 0.4157303370786517;
    } else if (true) {
      p = 0.7313432835820896;
    } 
    return p;
  }
  static double N73d983ea1510(Object []i) {
    double p = Double.NaN;
    /* xml */
    if (i[0] == null) {
      p = 0.18351063829787234;
    } else if (((Double)i[0]).doubleValue() < 0.5) {
      p = 0.25;
    } else if (true) {
      p = 0.009615384615384616;
    } 
    return p;
  }
  static double N36a5cabc1511(Object []i) {
    double p = Double.NaN;
    /* nonVocals */
    if (i[34] == null) {
      p = 0.7941176470588235;
    } else if (((Double)i[34]).doubleValue() < 0.22474747474747475) {
      p = 0.4;
    } else if (true) {
    p = WekaStringREPTree.N432038ec1512(i);
    } 
    return p;
  }
  static double N432038ec1512(Object []i) {
    double p = Double.NaN;
    /* digits */
    if (i[32] == null) {
      p = 0.8253968253968254;
    } else if (((Double)i[32]).doubleValue() < 0.05012531328320802) {
      p = 0.0;
    } else if (true) {
      p = 0.8813559322033898;
    } 
    return p;
  }
  static double N7daa0fbd1513(Object []i) {
    double p = Double.NaN;
    /* sumRepChar */
    if (i[42] == null) {
      p = 0.08669354838709678;
    } else if (((Double)i[42]).doubleValue() < 2.5) {
    p = WekaStringREPTree.N425305311514(i);
    } else if (true) {
    p = WekaStringREPTree.N5a3bc7ed1515(i);
    } 
    return p;
  }
  static double N425305311514(Object []i) {
    double p = Double.NaN;
    /* simpleSplitWordLen */
    if (i[36] == null) {
      p = 0.14781491002570696;
    } else if (((Double)i[36]).doubleValue() < 15.5) {
      p = 0.1423027166882277;
    } else if (true) {
      p = 1.0;
    } 
    return p;
  }
  static double N5a3bc7ed1515(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.0472636815920398;
    } else if (((Double)i[31]).doubleValue() < 0.15476190476190477) {
      p = 1.0;
    } else if (true) {
    p = WekaStringREPTree.N181e731e1516(i);
    } 
    return p;
  }
  static double N181e731e1516(Object []i) {
    double p = Double.NaN;
    /* normEntropy */
    if (i[50] == null) {
      p = 0.04568106312292359;
    } else if (((Double)i[50]).doubleValue() < 4.044545451384127) {
    p = WekaStringREPTree.N356450471517(i);
    } else if (true) {
      p = 0.2631578947368421;
    } 
    return p;
  }
  static double N356450471517(Object []i) {
    double p = Double.NaN;
    /* vocals */
    if (i[33] == null) {
      p = 0.04219409282700422;
    } else if (((Double)i[33]).doubleValue() < 0.07275132275132275) {
      p = 0.09210526315789473;
    } else if (true) {
      p = 0.030303030303030304;
    } 
    return p;
  }
  static double N6f44a1571518(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.6931711880261927;
    } else if (((Double)i[37]).doubleValue() < 2.5) {
    p = WekaStringREPTree.N6bc407fd1519(i);
    } else if (true) {
    p = WekaStringREPTree.N17d881321521(i);
    } 
    return p;
  }
  static double N6bc407fd1519(Object []i) {
    double p = Double.NaN;
    /* strLen */
    if (i[28] == null) {
      p = 0.9435975609756098;
    } else if (((Double)i[28]).doubleValue() < 8.5) {
      p = 0.09523809523809523;
    } else if (true) {
    p = WekaStringREPTree.N291f181520(i);
    } 
    return p;
  }
  static double N291f181520(Object []i) {
    double p = Double.NaN;
    /* commands */
    if (i[5] == null) {
      p = 0.9716535433070866;
    } else if (((Double)i[5]).doubleValue() < 0.5) {
      p = 0.9793650793650793;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N17d881321521(Object []i) {
    double p = Double.NaN;
    /* maxSingleChar */
    if (i[30] == null) {
      p = 0.29539951573849876;
    } else if (((Double)i[30]).doubleValue() < 0.1380952380952381) {
    p = WekaStringREPTree.N5ddcc4871522(i);
    } else if (true) {
    p = WekaStringREPTree.Nd771cc91525(i);
    } 
    return p;
  }
  static double N5ddcc4871522(Object []i) {
    double p = Double.NaN;
    /* sumRepChar */
    if (i[42] == null) {
      p = 0.5816993464052288;
    } else if (((Double)i[42]).doubleValue() < 4.5) {
    p = WekaStringREPTree.N16eccb2e1523(i);
    } else if (true) {
      p = 0.07407407407407407;
    } 
    return p;
  }
  static double N16eccb2e1523(Object []i) {
    double p = Double.NaN;
    /* normEntropy */
    if (i[50] == null) {
      p = 0.6904761904761905;
    } else if (((Double)i[50]).doubleValue() < 3.545926548164837) {
      p = 0.3333333333333333;
    } else if (true) {
    p = WekaStringREPTree.N5ef5c7341524(i);
    } 
    return p;
  }
  static double N5ef5c7341524(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.8333333333333334;
    } else if (((Double)i[31]).doubleValue() < 0.45833333333333337) {
      p = 0.43478260869565216;
    } else if (true) {
      p = 0.9701492537313433;
    } 
    return p;
  }
  static double Nd771cc91525(Object []i) {
    double p = Double.NaN;
    /* digits */
    if (i[32] == null) {
      p = 0.12692307692307692;
    } else if (((Double)i[32]).doubleValue() < 0.14835164835164835) {
      p = 0.07239819004524888;
    } else if (true) {
    p = WekaStringREPTree.N36b4091c1526(i);
    } 
    return p;
  }
  static double N36b4091c1526(Object []i) {
    double p = Double.NaN;
    /* sumRepChar */
    if (i[42] == null) {
      p = 0.4358974358974359;
    } else if (((Double)i[42]).doubleValue() < 1.5) {
    p = WekaStringREPTree.N4671115f1527(i);
    } else if (true) {
      p = 0.14285714285714285;
    } 
    return p;
  }
  static double N4671115f1527(Object []i) {
    double p = Double.NaN;
    /* digits */
    if (i[32] == null) {
      p = 0.7777777777777778;
    } else if (((Double)i[32]).doubleValue() < 0.2403846153846154) {
      p = 1.0;
    } else if (true) {
      p = 0.5;
    } 
    return p;
  }
  static double N36cda2c21528(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.9057325376145247;
    } else if (((Double)i[37]).doubleValue() < 3.5) {
    p = WekaStringREPTree.N36971861529(i);
    } else if (true) {
    p = WekaStringREPTree.N3bd323e91545(i);
    } 
    return p;
  }
  static double N36971861529(Object []i) {
    double p = Double.NaN;
    /* maxSingleChar */
    if (i[30] == null) {
      p = 0.9724211232938017;
    } else if (((Double)i[30]).doubleValue() < 0.19326542161856253) {
    p = WekaStringREPTree.N1583741e1530(i);
    } else if (true) {
    p = WekaStringREPTree.N12d2ce031539(i);
    } 
    return p;
  }
  static double N1583741e1530(Object []i) {
    double p = Double.NaN;
    /* date */
    if (i[17] == null) {
      p = 0.9831396017953734;
    } else if (((Double)i[17]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N5b3674181531(i);
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N5b3674181531(Object []i) {
    double p = Double.NaN;
    /* dashes */
    if (i[39] == null) {
      p = 0.9860333583424713;
    } else if (((Double)i[39]).doubleValue() < 1.5) {
    p = WekaStringREPTree.N36060e1532(i);
    } else if (true) {
    p = WekaStringREPTree.N7d446ed11538(i);
    } 
    return p;
  }
  static double N36060e1532(Object []i) {
    double p = Double.NaN;
    /* maxRepChars */
    if (i[35] == null) {
      p = 0.9873944720712385;
    } else if (((Double)i[35]).doubleValue() < 11.0) {
    p = WekaStringREPTree.N481ba2cf1533(i);
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N481ba2cf1533(Object []i) {
    double p = Double.NaN;
    /* simpleSplitWordLen */
    if (i[36] == null) {
      p = 0.9879657486692895;
    } else if (((Double)i[36]).doubleValue() < 5.0) {
      p = 0.0;
    } else if (true) {
    p = WekaStringREPTree.N46b61c561534(i);
    } 
    return p;
  }
  static double N46b61c561534(Object []i) {
    double p = Double.NaN;
    /* AppSignatures */
    if (i[22] == null) {
      p = 0.9884232461217874;
    } else if (((Double)i[22]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N2e48362c1535(i);
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N2e48362c1535(Object []i) {
    double p = Double.NaN;
    /* commands */
    if (i[5] == null) {
      p = 0.9888239041056228;
    } else if (((Double)i[5]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N1efe439d1536(i);
    } else if (true) {
    p = WekaStringREPTree.Nbe687571537(i);
    } 
    return p;
  }
  static double N1efe439d1536(Object []i) {
    double p = Double.NaN;
    /* dashes */
    if (i[39] == null) {
      p = 0.9893283841781696;
    } else if (((Double)i[39]).doubleValue() < 0.5) {
      p = 0.9902805261319986;
    } else if (true) {
      p = 0.7166666666666667;
    } 
    return p;
  }
  static double Nbe687571537(Object []i) {
    double p = Double.NaN;
    /* maxSingleChar */
    if (i[30] == null) {
      p = 0.6666666666666666;
    } else if (((Double)i[30]).doubleValue() < 0.13339920948616601) {
      p = 0.9411764705882353;
    } else if (true) {
      p = 0.2;
    } 
    return p;
  }
  static double N7d446ed11538(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.2727272727272727;
    } else if (((Double)i[43]).doubleValue() < 0.8273809523809523) {
      p = 1.0;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N12d2ce031539(Object []i) {
    double p = Double.NaN;
    /* simpleSplitWordLen */
    if (i[36] == null) {
      p = 0.5983935742971888;
    } else if (((Double)i[36]).doubleValue() < 13.5) {
    p = WekaStringREPTree.N7e5c856f1540(i);
    } else if (true) {
    p = WekaStringREPTree.N1b75c2e31543(i);
    } 
    return p;
  }
  static double N7e5c856f1540(Object []i) {
    double p = Double.NaN;
    /* knownWordsCount */
    if (i[44] == null) {
      p = 0.8554216867469879;
    } else if (((Double)i[44]).doubleValue() < 8.5) {
    p = WekaStringREPTree.N413f69cc1541(i);
    } else if (true) {
      p = 0.9869281045751634;
    } 
    return p;
  }
  static double N413f69cc1541(Object []i) {
    double p = Double.NaN;
    /* simpleSplitWordLen */
    if (i[36] == null) {
      p = 0.6458333333333334;
    } else if (((Double)i[36]).doubleValue() < 10.5) {
    p = WekaStringREPTree.N1f53a5dc1542(i);
    } else if (true) {
      p = 0.11428571428571428;
    } 
    return p;
  }
  static double N1f53a5dc1542(Object []i) {
    double p = Double.NaN;
    /* xml */
    if (i[0] == null) {
      p = 0.9508196721311475;
    } else if (((Double)i[0]).doubleValue() < 0.5) {
      p = 1.0;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N1b75c2e31543(Object []i) {
    double p = Double.NaN;
    /* knownWordsCount */
    if (i[44] == null) {
      p = 0.3413654618473896;
    } else if (((Double)i[44]).doubleValue() < 13.5) {
    p = WekaStringREPTree.N1984b1f1544(i);
    } else if (true) {
      p = 0.8987341772151899;
    } 
    return p;
  }
  static double N1984b1f1544(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.08235294117647059;
    } else if (((Double)i[31]).doubleValue() < 0.21773399014778325) {
      p = 0.9230769230769231;
    } else if (true) {
      p = 0.012738853503184714;
    } 
    return p;
  }
  static double N3bd323e91545(Object []i) {
    double p = Double.NaN;
    /* maxSingleChar */
    if (i[30] == null) {
      p = 0.7042919905373437;
    } else if (((Double)i[30]).doubleValue() < 0.1372431506849315) {
    p = WekaStringREPTree.N39ac0c0a1546(i);
    } else if (true) {
    p = WekaStringREPTree.N7a220c9a1571(i);
    } 
    return p;
  }
  static double N39ac0c0a1546(Object []i) {
    double p = Double.NaN;
    /* date */
    if (i[17] == null) {
      p = 0.8179590017825312;
    } else if (((Double)i[17]).doubleValue() < 0.5) {
    p = WekaStringREPTree.Nc7ba3061547(i);
    } else if (true) {
    p = WekaStringREPTree.N68702e031570(i);
    } 
    return p;
  }
  static double Nc7ba3061547(Object []i) {
    double p = Double.NaN;
    /* normEntropy */
    if (i[50] == null) {
      p = 0.847735674676525;
    } else if (((Double)i[50]).doubleValue() < 4.163588189440362) {
    p = WekaStringREPTree.N4ff8d1251548(i);
    } else if (true) {
    p = WekaStringREPTree.N54504ecd1556(i);
    } 
    return p;
  }
  static double N4ff8d1251548(Object []i) {
    double p = Double.NaN;
    /* brand */
    if (i[20] == null) {
      p = 0.5946601941747572;
    } else if (((Double)i[20]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N6d167f581549(i);
    } else if (true) {
    p = WekaStringREPTree.N74bf17911555(i);
    } 
    return p;
  }
  static double N6d167f581549(Object []i) {
    double p = Double.NaN;
    /* slashes */
    if (i[40] == null) {
      p = 0.6944444444444444;
    } else if (((Double)i[40]).doubleValue() < 1.5) {
    p = WekaStringREPTree.N3403e2ac1550(i);
    } else if (true) {
      p = 0.1509433962264151;
    } 
    return p;
  }
  static double N3403e2ac1550(Object []i) {
    double p = Double.NaN;
    /* digits */
    if (i[32] == null) {
      p = 0.7941176470588235;
    } else if (((Double)i[32]).doubleValue() < 0.3717105263157895) {
    p = WekaStringREPTree.N65b104b91551(i);
    } else if (true) {
    p = WekaStringREPTree.N19c65cdc1554(i);
    } 
    return p;
  }
  static double N65b104b91551(Object []i) {
    double p = Double.NaN;
    /* dashes */
    if (i[39] == null) {
      p = 0.8366972477064221;
    } else if (((Double)i[39]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N6c4980d31552(i);
    } else if (true) {
    p = WekaStringREPTree.N327bcebd1553(i);
    } 
    return p;
  }
  static double N6c4980d31552(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.8836206896551724;
    } else if (((Double)i[51]).doubleValue() < 0.6079365079365079) {
      p = 0.9084821428571429;
    } else if (true) {
      p = 0.1875;
    } 
    return p;
  }
  static double N327bcebd1553(Object []i) {
    double p = Double.NaN;
    /* setDist */
    if (i[29] == null) {
      p = 0.5679012345679012;
    } else if (((Double)i[29]).doubleValue() < 0.2571428571428571) {
      p = 0.9459459459459459;
    } else if (true) {
      p = 0.25;
    } 
    return p;
  }
  static double N19c65cdc1554(Object []i) {
    double p = Double.NaN;
    /* setDist */
    if (i[29] == null) {
      p = 0.09090909090909091;
    } else if (((Double)i[29]).doubleValue() < 0.19375) {
      p = 1.0;
    } else if (true) {
      p = 0.03225806451612903;
    } 
    return p;
  }
  static double N74bf17911555(Object []i) {
    double p = Double.NaN;
    /* vocals */
    if (i[33] == null) {
      p = 0.10714285714285714;
    } else if (((Double)i[33]).doubleValue() < 0.15192307692307694) {
      p = 0.6875;
    } else if (true) {
      p = 0.03225806451612903;
    } 
    return p;
  }
  static double N54504ecd1556(Object []i) {
    double p = Double.NaN;
    /* xml */
    if (i[0] == null) {
      p = 0.9072488584474886;
    } else if (((Double)i[0]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N38b27cdc1557(i);
    } else if (true) {
    p = WekaStringREPTree.N4f3bbf681567(i);
    } 
    return p;
  }
  static double N38b27cdc1557(Object []i) {
    double p = Double.NaN;
    /* setDist */
    if (i[29] == null) {
      p = 0.922469280280866;
    } else if (((Double)i[29]).doubleValue() < 0.4198717948717949) {
    p = WekaStringREPTree.N1339e7aa1558(i);
    } else if (true) {
    p = WekaStringREPTree.N6239aba61561(i);
    } 
    return p;
  }
  static double N1339e7aa1558(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.9525471039776692;
    } else if (((Double)i[51]).doubleValue() < 0.5267942583732058) {
    p = WekaStringREPTree.N1fb669c31559(i);
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N1fb669c31559(Object []i) {
    double p = Double.NaN;
    /* brand */
    if (i[20] == null) {
      p = 0.967741935483871;
    } else if (((Double)i[20]).doubleValue() < 0.5) {
      p = 0.9786915887850467;
    } else if (true) {
    p = WekaStringREPTree.N49c66ade1560(i);
    } 
    return p;
  }
  static double N49c66ade1560(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.7671232876712328;
    } else if (((Double)i[43]).doubleValue() < 0.7842420212765957) {
      p = 0.5633802816901409;
    } else if (true) {
      p = 0.96;
    } 
    return p;
  }
  static double N6239aba61561(Object []i) {
    double p = Double.NaN;
    /* knownUniqueWords */
    if (i[45] == null) {
      p = 0.7663043478260869;
    } else if (((Double)i[45]).doubleValue() < 11.5) {
    p = WekaStringREPTree.N3e6104fc1562(i);
    } else if (true) {
    p = WekaStringREPTree.N479460a61565(i);
    } 
    return p;
  }
  static double N3e6104fc1562(Object []i) {
    double p = Double.NaN;
    /* vocals */
    if (i[33] == null) {
      p = 0.46236559139784944;
    } else if (((Double)i[33]).doubleValue() < 0.15707236842105263) {
    p = WekaStringREPTree.N12359a821563(i);
    } else if (true) {
    p = WekaStringREPTree.N68df92801564(i);
    } 
    return p;
  }
  static double N12359a821563(Object []i) {
    double p = Double.NaN;
    /* regex */
    if (i[3] == null) {
      p = 0.6538461538461539;
    } else if (((Double)i[3]).doubleValue() < 0.5) {
      p = 0.7857142857142857;
    } else if (true) {
      p = 0.1;
    } 
    return p;
  }
  static double N68df92801564(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.21951219512195122;
    } else if (((Double)i[51]).doubleValue() < 0.3565375302663438) {
      p = 0.11428571428571428;
    } else if (true) {
      p = 0.8333333333333334;
    } 
    return p;
  }
  static double N479460a61565(Object []i) {
    double p = Double.NaN;
    /* nonVocals */
    if (i[34] == null) {
      p = 0.9207650273224044;
    } else if (((Double)i[34]).doubleValue() < 0.3431372549019608) {
      p = 0.3125;
    } else if (true) {
    p = WekaStringREPTree.N7164ca4c1566(i);
    } 
    return p;
  }
  static double N7164ca4c1566(Object []i) {
    double p = Double.NaN;
    /* dashes */
    if (i[39] == null) {
      p = 0.9485714285714286;
    } else if (((Double)i[39]).doubleValue() < 0.5) {
      p = 0.9821428571428571;
    } else if (true) {
      p = 0.14285714285714285;
    } 
    return p;
  }
  static double N4f3bbf681567(Object []i) {
    double p = Double.NaN;
    /* knownUniqueWords */
    if (i[45] == null) {
      p = 0.3023255813953488;
    } else if (((Double)i[45]).doubleValue() < 12.0) {
    p = WekaStringREPTree.N5be46f9d1568(i);
    } else if (true) {
      p = 1.0;
    } 
    return p;
  }
  static double N5be46f9d1568(Object []i) {
    double p = Double.NaN;
    /* vocals */
    if (i[33] == null) {
      p = 0.10447761194029852;
    } else if (((Double)i[33]).doubleValue() < 0.07670454545454546) {
      p = 1.0;
    } else if (true) {
    p = WekaStringREPTree.N3f91b5171569(i);
    } 
    return p;
  }
  static double N3f91b5171569(Object []i) {
    double p = Double.NaN;
    /* pluses */
    if (i[41] == null) {
      p = 0.0625;
    } else if (((Double)i[41]).doubleValue() < 0.5) {
      p = 0.016666666666666666;
    } else if (true) {
      p = 0.75;
    } 
    return p;
  }
  static double N68702e031570(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.0125;
    } else if (((Double)i[31]).doubleValue() < 0.6117511520737328) {
      p = 0.0;
    } else if (true) {
      p = 1.0;
    } 
    return p;
  }
  static double N7a220c9a1571(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.3475524475524476;
    } else if (((Double)i[43]).doubleValue() < 0.9713315217391305) {
    p = WekaStringREPTree.N2421cc41572(i);
    } else if (true) {
    p = WekaStringREPTree.N70f02c321583(i);
    } 
    return p;
  }
  static double N2421cc41572(Object []i) {
    double p = Double.NaN;
    /* date */
    if (i[17] == null) {
      p = 0.5223097112860893;
    } else if (((Double)i[17]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N30c938961573(i);
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N30c938961573(Object []i) {
    double p = Double.NaN;
    /* vocals */
    if (i[33] == null) {
      p = 0.6094946401225115;
    } else if (((Double)i[33]).doubleValue() < 0.15075757575757576) {
    p = WekaStringREPTree.N59a008ba1574(i);
    } else if (true) {
    p = WekaStringREPTree.N56673b2c1579(i);
    } 
    return p;
  }
  static double N59a008ba1574(Object []i) {
    double p = Double.NaN;
    /* slashes */
    if (i[40] == null) {
      p = 0.7535545023696683;
    } else if (((Double)i[40]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N338c99c81575(i);
    } else if (true) {
    p = WekaStringREPTree.N172b0131578(i);
    } 
    return p;
  }
  static double N338c99c81575(Object []i) {
    double p = Double.NaN;
    /* digits */
    if (i[32] == null) {
      p = 0.84593837535014;
    } else if (((Double)i[32]).doubleValue() < 0.39230769230769236) {
    p = WekaStringREPTree.N21ba07411576(i);
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N21ba07411576(Object []i) {
    double p = Double.NaN;
    /* nonVocals */
    if (i[34] == null) {
      p = 0.8728323699421965;
    } else if (((Double)i[34]).doubleValue() < 0.5601135190918473) {
      p = 0.9251968503937008;
    } else if (true) {
    p = WekaStringREPTree.N58ce96681577(i);
    } 
    return p;
  }
  static double N58ce96681577(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.7282608695652174;
    } else if (((Double)i[51]).doubleValue() < 0.41707119741100324) {
      p = 0.9354838709677419;
    } else if (true) {
      p = 0.3;
    } 
    return p;
  }
  static double N172b0131578(Object []i) {
    double p = Double.NaN;
    /* stackHeuristic */
    if (i[48] == null) {
      p = 0.24615384615384617;
    } else if (((Double)i[48]).doubleValue() < -0.9748850995248621) {
      p = 0.11320754716981132;
    } else if (true) {
      p = 0.8333333333333334;
    } 
    return p;
  }
  static double N56673b2c1579(Object []i) {
    double p = Double.NaN;
    /* stackHeuristic */
    if (i[48] == null) {
      p = 0.3463203463203463;
    } else if (((Double)i[48]).doubleValue() < -0.8148460000031382) {
    p = WekaStringREPTree.N2796aeae1580(i);
    } else if (true) {
      p = 0.9032258064516129;
    } 
    return p;
  }
  static double N2796aeae1580(Object []i) {
    double p = Double.NaN;
    /* knownUniqueWords */
    if (i[45] == null) {
      p = 0.26;
    } else if (((Double)i[45]).doubleValue() < 9.5) {
    p = WekaStringREPTree.Nb4711e21581(i);
    } else if (true) {
    p = WekaStringREPTree.N1fa1cab11582(i);
    } 
    return p;
  }
  static double Nb4711e21581(Object []i) {
    double p = Double.NaN;
    /* vocals */
    if (i[33] == null) {
      p = 0.152317880794702;
    } else if (((Double)i[33]).doubleValue() < 0.2079937304075235) {
      p = 0.3013698630136986;
    } else if (true) {
      p = 0.01282051282051282;
    } 
    return p;
  }
  static double N1fa1cab11582(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.5918367346938775;
    } else if (((Double)i[37]).doubleValue() < 10.5) {
      p = 0.8461538461538461;
    } else if (true) {
      p = 0.30434782608695654;
    } 
    return p;
  }
  static double N70f02c321583(Object []i) {
    double p = Double.NaN;
    /* setDist */
    if (i[29] == null) {
      p = 0.14820359281437126;
    } else if (((Double)i[29]).doubleValue() < 0.3564705882352941) {
    p = WekaStringREPTree.N62010f5c1584(i);
    } else if (true) {
    p = WekaStringREPTree.N31ff43be1587(i);
    } 
    return p;
  }
  static double N62010f5c1584(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.5135135135135135;
    } else if (((Double)i[51]).doubleValue() < 0.5747520976353928) {
    p = WekaStringREPTree.N51fadaff1585(i);
    } else if (true) {
      p = 0.3;
    } 
    return p;
  }
  static double N51fadaff1585(Object []i) {
    double p = Double.NaN;
    /* vocals */
    if (i[33] == null) {
      p = 0.5925925925925926;
    } else if (((Double)i[33]).doubleValue() < 0.106203007518797) {
      p = 1.0;
    } else if (true) {
    p = WekaStringREPTree.N401f76331586(i);
    } 
    return p;
  }
  static double N401f76331586(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.3888888888888889;
    } else if (((Double)i[31]).doubleValue() < 0.29901960784313725) {
      p = 1.0;
    } else if (true) {
      p = 0.26666666666666666;
    } 
    return p;
  }
  static double N31ff43be1587(Object []i) {
    double p = Double.NaN;
    /* knownUniqueWords */
    if (i[45] == null) {
      p = 0.12678288431061807;
    } else if (((Double)i[45]).doubleValue() < 12.5) {
    p = WekaStringREPTree.N5b6ec1321588(i);
    } else if (true) {
    p = WekaStringREPTree.N132e0cc1592(i);
    } 
    return p;
  }
  static double N5b6ec1321588(Object []i) {
    double p = Double.NaN;
    /* strLen */
    if (i[28] == null) {
      p = 0.10052910052910052;
    } else if (((Double)i[28]).doubleValue() < 20.5) {
      p = 0.2765957446808511;
    } else if (true) {
    p = WekaStringREPTree.N5c44c5821589(i);
    } 
    return p;
  }
  static double N5c44c5821589(Object []i) {
    double p = Double.NaN;
    /* normEntropy */
    if (i[50] == null) {
      p = 0.08461538461538462;
    } else if (((Double)i[50]).doubleValue() < 3.403989446485262) {
      p = 0.2857142857142857;
    } else if (true) {
    p = WekaStringREPTree.N67d18ed71590(i);
    } 
    return p;
  }
  static double N67d18ed71590(Object []i) {
    double p = Double.NaN;
    /* knownUniqueWords */
    if (i[45] == null) {
      p = 0.07615230460921844;
    } else if (((Double)i[45]).doubleValue() < 9.5) {
    p = WekaStringREPTree.N2c78d3201591(i);
    } else if (true) {
      p = 0.16346153846153846;
    } 
    return p;
  }
  static double N2c78d3201591(Object []i) {
    double p = Double.NaN;
    /* stackHeuristic */
    if (i[48] == null) {
      p = 0.053164556962025315;
    } else if (((Double)i[48]).doubleValue() < -0.859173500360007) {
      p = 0.035842293906810034;
    } else if (true) {
      p = 0.09482758620689655;
    } 
    return p;
  }
  static double N132e0cc1592(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.359375;
    } else if (((Double)i[37]).doubleValue() < 7.5) {
      p = 1.0;
    } else if (true) {
      p = 0.10869565217391304;
    } 
    return p;
  }
  static double N7b205dbd1593(Object []i) {
    double p = Double.NaN;
    /* digits */
    if (i[32] == null) {
      p = 0.0027688451022896536;
    } else if (((Double)i[32]).doubleValue() < 0.2586618876941458) {
    p = WekaStringREPTree.N106cc3381594(i);
    } else if (true) {
    p = WekaStringREPTree.N4c1f22f31699(i);
    } 
    return p;
  }
  static double N106cc3381594(Object []i) {
    double p = Double.NaN;
    /* maxLenKnownWord */
    if (i[47] == null) {
      p = 0.0022708835789125204;
    } else if (((Double)i[47]).doubleValue() < 5.5) {
    p = WekaStringREPTree.N7a67e3c61595(i);
    } else if (true) {
    p = WekaStringREPTree.Nc9d0d61659(i);
    } 
    return p;
  }
  static double N7a67e3c61595(Object []i) {
    double p = Double.NaN;
    /* knownUniqueWords */
    if (i[45] == null) {
      p = 0.013473678543065968;
    } else if (((Double)i[45]).doubleValue() < 11.5) {
    p = WekaStringREPTree.N6cc558c61596(i);
    } else if (true) {
    p = WekaStringREPTree.N1458ed9c1645(i);
    } 
    return p;
  }
  static double N6cc558c61596(Object []i) {
    double p = Double.NaN;
    /* equals */
    if (i[38] == null) {
      p = 0.009812563634748502;
    } else if (((Double)i[38]).doubleValue() < 1.5) {
    p = WekaStringREPTree.N15713d561597(i);
    } else if (true) {
    p = WekaStringREPTree.N4ae9cfc11640(i);
    } 
    return p;
  }
  static double N15713d561597(Object []i) {
    double p = Double.NaN;
    /* digits */
    if (i[32] == null) {
      p = 0.008633705767699782;
    } else if (((Double)i[32]).doubleValue() < 0.02684684684684685) {
    p = WekaStringREPTree.N63f259c31598(i);
    } else if (true) {
    p = WekaStringREPTree.N146dfe61619(i);
    } 
    return p;
  }
  static double N63f259c31598(Object []i) {
    double p = Double.NaN;
    /* minLenKnownWord */
    if (i[46] == null) {
      p = 0.004546518741173183;
    } else if (((Double)i[46]).doubleValue() < 1.5) {
    p = WekaStringREPTree.N26ceffa81599(i);
    } else if (true) {
    p = WekaStringREPTree.N7582ff541612(i);
    } 
    return p;
  }
  static double N26ceffa81599(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.016811732443066652;
    } else if (((Double)i[31]).doubleValue() < 0.3099343185550082) {
    p = WekaStringREPTree.N600b90df1600(i);
    } else if (true) {
    p = WekaStringREPTree.N3d9c13b51607(i);
    } 
    return p;
  }
  static double N600b90df1600(Object []i) {
    double p = Double.NaN;
    /* normEntropy */
    if (i[50] == null) {
      p = 0.012510198531411477;
    } else if (((Double)i[50]).doubleValue() < 4.624258320609007) {
    p = WekaStringREPTree.N7c8c9a051601(i);
    } else if (true) {
    p = WekaStringREPTree.N60129b9a1604(i);
    } 
    return p;
  }
  static double N7c8c9a051601(Object []i) {
    double p = Double.NaN;
    /* equals */
    if (i[38] == null) {
      p = 0.01214602524735585;
    } else if (((Double)i[38]).doubleValue() < 0.5) {
    p = WekaStringREPTree.Nd41f8161602(i);
    } else if (true) {
    p = WekaStringREPTree.N5c2375a91603(i);
    } 
    return p;
  }
  static double Nd41f8161602(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.011266430210723972;
    } else if (((Double)i[43]).doubleValue() < 0.9354166666666667) {
      p = 0.01889457884513509;
    } else if (true) {
      p = 0.006310234052317577;
    } 
    return p;
  }
  static double N5c2375a91603(Object []i) {
    double p = Double.NaN;
    /* nonVocals */
    if (i[34] == null) {
      p = 0.057971014492753624;
    } else if (((Double)i[34]).doubleValue() < 0.6602564102564102) {
      p = 0.030534351145038167;
    } else if (true) {
      p = 0.5714285714285714;
    } 
    return p;
  }
  static double N60129b9a1604(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.11320754716981132;
    } else if (((Double)i[31]).doubleValue() < 0.23735632183908045) {
    p = WekaStringREPTree.N78d6692f1605(i);
    } else if (true) {
      p = 0.6666666666666666;
    } 
    return p;
  }
  static double N78d6692f1605(Object []i) {
    double p = Double.NaN;
    /* maxSingleChar */
    if (i[30] == null) {
      p = 0.0425531914893617;
    } else if (((Double)i[30]).doubleValue() < 0.07019704433497537) {
    p = WekaStringREPTree.N7a55af6b1606(i);
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N7a55af6b1606(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.2222222222222222;
    } else if (((Double)i[43]).doubleValue() < 0.7616191904047975) {
      p = 1.0;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N3d9c13b51607(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.04743465634075508;
    } else if (((Double)i[43]).doubleValue() < 0.9372549019607843) {
    p = WekaStringREPTree.N492691d71608(i);
    } else if (true) {
      p = 0.019230769230769232;
    } 
    return p;
  }
  static double N492691d71608(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.16417910447761194;
    } else if (((Double)i[51]).doubleValue() < 0.5889894419306184) {
    p = WekaStringREPTree.N27216cd1609(i);
    } else if (true) {
    p = WekaStringREPTree.N558bdf1f1610(i);
    } 
    return p;
  }
  static double N27216cd1609(Object []i) {
    double p = Double.NaN;
    /* setDist */
    if (i[29] == null) {
      p = 0.23193916349809887;
    } else if (((Double)i[29]).doubleValue() < 0.245) {
      p = 0.6666666666666666;
    } else if (true) {
      p = 0.16956521739130434;
    } 
    return p;
  }
  static double N558bdf1f1610(Object []i) {
    double p = Double.NaN;
    /* crypto */
    if (i[19] == null) {
      p = 0.03597122302158273;
    } else if (((Double)i[19]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N8576fa01611(i);
    } else if (true) {
      p = 0.5;
    } 
    return p;
  }
  static double N8576fa01611(Object []i) {
    double p = Double.NaN;
    /* setDist */
    if (i[29] == null) {
      p = 0.029197080291970802;
    } else if (((Double)i[29]).doubleValue() < 0.08712121212121213) {
      p = 0.5;
    } else if (true) {
      p = 0.022222222222222223;
    } 
    return p;
  }
  static double N7582ff541612(Object []i) {
    double p = Double.NaN;
    /* dashes */
    if (i[39] == null) {
      p = 0.002767328231071907;
    } else if (((Double)i[39]).doubleValue() < 1.5) {
    p = WekaStringREPTree.N67545b571613(i);
    } else if (true) {
      p = 0.018154311649016642;
    } 
    return p;
  }
  static double N67545b571613(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.0026788665263450867;
    } else if (((Double)i[31]).doubleValue() < 0.5783625730994152) {
    p = WekaStringREPTree.N6c2c13851614(i);
    } else if (true) {
    p = WekaStringREPTree.N78641d231617(i);
    } 
    return p;
  }
  static double N6c2c13851614(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.0026225223262905683;
    } else if (((Double)i[31]).doubleValue() < 0.280625) {
    p = WekaStringREPTree.N5f354bcf1615(i);
    } else if (true) {
      p = 0.007733066017471001;
    } 
    return p;
  }
  static double N5f354bcf1615(Object []i) {
    double p = Double.NaN;
    /* equals */
    if (i[38] == null) {
      p = 0.0022914502003859283;
    } else if (((Double)i[38]).doubleValue() < 0.5) {
      p = 0.002029522028770354;
    } else if (true) {
    p = WekaStringREPTree.N3daf77221616(i);
    } 
    return p;
  }
  static double N3daf77221616(Object []i) {
    double p = Double.NaN;
    /* nonVocals */
    if (i[34] == null) {
      p = 0.022743947175348497;
    } else if (((Double)i[34]).doubleValue() < 0.6145104895104896) {
      p = 0.009016393442622951;
    } else if (true) {
      p = 0.13986013986013987;
    } 
    return p;
  }
  static double N78641d231617(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.035175879396984924;
    } else if (((Double)i[43]).doubleValue() < 0.5069444444444444) {
      p = 1.0;
    } else if (true) {
    p = WekaStringREPTree.N745899911618(i);
    } 
    return p;
  }
  static double N745899911618(Object []i) {
    double p = Double.NaN;
    /* classpath */
    if (i[11] == null) {
      p = 0.015384615384615385;
    } else if (((Double)i[11]).doubleValue() < 0.5) {
      p = 0.010362694300518135;
    } else if (true) {
      p = 0.5;
    } 
    return p;
  }
  static double N146dfe61619(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.04932701706895255;
    } else if (((Double)i[37]).doubleValue() < 1.5) {
    p = WekaStringREPTree.N4716be8b1620(i);
    } else if (true) {
    p = WekaStringREPTree.N73cd37c01633(i);
    } 
    return p;
  }
  static double N4716be8b1620(Object []i) {
    double p = Double.NaN;
    /* knownWordsCount */
    if (i[44] == null) {
      p = 0.18862911795961743;
    } else if (((Double)i[44]).doubleValue() < 7.5) {
    p = WekaStringREPTree.N1fc32e4f1621(i);
    } else if (true) {
    p = WekaStringREPTree.N1046d5171629(i);
    } 
    return p;
  }
  static double N1fc32e4f1621(Object []i) {
    double p = Double.NaN;
    /* equals */
    if (i[38] == null) {
      p = 0.10494931425163984;
    } else if (((Double)i[38]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N2f67b8371622(i);
    } else if (true) {
    p = WekaStringREPTree.N7efaad5a1626(i);
    } 
    return p;
  }
  static double N2f67b8371622(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.07901234567901234;
    } else if (((Double)i[43]).doubleValue() < 0.8293269230769231) {
    p = WekaStringREPTree.N1869fbd21623(i);
    } else if (true) {
      p = 0.03927068723702665;
    } 
    return p;
  }
  static double N1869fbd21623(Object []i) {
    double p = Double.NaN;
    /* digits */
    if (i[32] == null) {
      p = 0.3711340206185567;
    } else if (((Double)i[32]).doubleValue() < 0.150997150997151) {
    p = WekaStringREPTree.N6af9fcb21624(i);
    } else if (true) {
    p = WekaStringREPTree.N6cce16f41625(i);
    } 
    return p;
  }
  static double N6af9fcb21624(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.24503311258278146;
    } else if (((Double)i[31]).doubleValue() < 0.16333333333333333) {
      p = 0.5689655172413793;
    } else if (true) {
      p = 0.043010752688172046;
    } 
    return p;
  }
  static double N6cce16f41625(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.813953488372093;
    } else if (((Double)i[31]).doubleValue() < 0.28500000000000003) {
      p = 0.9210526315789473;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N7efaad5a1626(Object []i) {
    double p = Double.NaN;
    /* simpleSplitWordLen */
    if (i[36] == null) {
      p = 0.8421052631578947;
    } else if (((Double)i[36]).doubleValue() < 4.5) {
      p = 0.0;
    } else if (true) {
    p = WekaStringREPTree.N291a7e3c1627(i);
    } 
    return p;
  }
  static double N291a7e3c1627(Object []i) {
    double p = Double.NaN;
    /* maxSingleChar */
    if (i[30] == null) {
      p = 0.9230769230769231;
    } else if (((Double)i[30]).doubleValue() < 0.1715686274509804) {
      p = 1.0;
    } else if (true) {
    p = WekaStringREPTree.Nca30bc11628(i);
    } 
    return p;
  }
  static double Nca30bc11628(Object []i) {
    double p = Double.NaN;
    /* digits */
    if (i[32] == null) {
      p = 0.6363636363636364;
    } else if (((Double)i[32]).doubleValue() < 0.10555555555555556) {
      p = 0.2;
    } else if (true) {
      p = 1.0;
    } 
    return p;
  }
  static double N1046d5171629(Object []i) {
    double p = Double.NaN;
    /* date */
    if (i[17] == null) {
      p = 0.8731707317073171;
    } else if (((Double)i[17]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N3b7d3a381630(i);
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N3b7d3a381630(Object []i) {
    double p = Double.NaN;
    /* commands */
    if (i[5] == null) {
      p = 0.9226804123711341;
    } else if (((Double)i[5]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N416c58f51631(i);
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N416c58f51631(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.9470899470899471;
    } else if (((Double)i[31]).doubleValue() < 0.29520697167755994) {
    p = WekaStringREPTree.N5505ae1a1632(i);
    } else if (true) {
      p = 0.25;
    } 
    return p;
  }
  static double N5505ae1a1632(Object []i) {
    double p = Double.NaN;
    /* maxSingleChar */
    if (i[30] == null) {
      p = 0.9779005524861878;
    } else if (((Double)i[30]).doubleValue() < 0.15812500000000002) {
      p = 1.0;
    } else if (true) {
      p = 0.8571428571428571;
    } 
    return p;
  }
  static double N73cd37c01633(Object []i) {
    double p = Double.NaN;
    /* normEntropy */
    if (i[50] == null) {
      p = 0.026364193746167996;
    } else if (((Double)i[50]).doubleValue() < 4.334600311067559) {
    p = WekaStringREPTree.N21337f7b1634(i);
    } else if (true) {
    p = WekaStringREPTree.N7a362b6b1636(i);
    } 
    return p;
  }
  static double N21337f7b1634(Object []i) {
    double p = Double.NaN;
    /* maxSingleChar */
    if (i[30] == null) {
      p = 0.01787342695604596;
    } else if (((Double)i[30]).doubleValue() < 0.07229965156794424) {
    p = WekaStringREPTree.N2bb30581635(i);
    } else if (true) {
      p = 0.01630484565356783;
    } 
    return p;
  }
  static double N2bb30581635(Object []i) {
    double p = Double.NaN;
    /* simpleSplitWordLen */
    if (i[36] == null) {
      p = 0.3673469387755102;
    } else if (((Double)i[36]).doubleValue() < 8.5) {
      p = 0.07407407407407407;
    } else if (true) {
      p = 0.7272727272727273;
    } 
    return p;
  }
  static double N7a362b6b1636(Object []i) {
    double p = Double.NaN;
    /* setDist */
    if (i[29] == null) {
      p = 0.2328159645232816;
    } else if (((Double)i[29]).doubleValue() < 0.3516483516483516) {
    p = WekaStringREPTree.N60df60da1637(i);
    } else if (true) {
      p = 0.02553191489361702;
    } 
    return p;
  }
  static double N60df60da1637(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.4583333333333333;
    } else if (((Double)i[51]).doubleValue() < 0.45521390374331555) {
    p = WekaStringREPTree.N5a2d131d1638(i);
    } else if (true) {
      p = 0.04838709677419355;
    } 
    return p;
  }
  static double N5a2d131d1638(Object []i) {
    double p = Double.NaN;
    /* sumRepChar */
    if (i[42] == null) {
      p = 0.6233766233766234;
    } else if (((Double)i[42]).doubleValue() < 6.5) {
      p = 0.8111111111111111;
    } else if (true) {
    p = WekaStringREPTree.N14fc1f01639(i);
    } 
    return p;
  }
  static double N14fc1f01639(Object []i) {
    double p = Double.NaN;
    /* vocals */
    if (i[33] == null) {
      p = 0.359375;
    } else if (((Double)i[33]).doubleValue() < 0.19375) {
      p = 0.4888888888888889;
    } else if (true) {
      p = 0.05263157894736842;
    } 
    return p;
  }
  static double N4ae9cfc11640(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.2803149606299213;
    } else if (((Double)i[37]).doubleValue() < 2.5) {
      p = 0.9634146341463414;
    } else if (true) {
    p = WekaStringREPTree.N512baff61641(i);
    } 
    return p;
  }
  static double N512baff61641(Object []i) {
    double p = Double.NaN;
    /* digits */
    if (i[32] == null) {
      p = 0.04246284501061571;
    } else if (((Double)i[32]).doubleValue() < 0.0641729581331503) {
    p = WekaStringREPTree.N632ceb351642(i);
    } else if (true) {
    p = WekaStringREPTree.N1800a5751644(i);
    } 
    return p;
  }
  static double N632ceb351642(Object []i) {
    double p = Double.NaN;
    /* strLen */
    if (i[28] == null) {
      p = 0.018867924528301886;
    } else if (((Double)i[28]).doubleValue() < 15.5) {
    p = WekaStringREPTree.N1c93f6e11643(i);
    } else if (true) {
      p = 0.007653061224489796;
    } 
    return p;
  }
  static double N1c93f6e11643(Object []i) {
    double p = Double.NaN;
    /* nonVocals */
    if (i[34] == null) {
      p = 0.15625;
    } else if (((Double)i[34]).doubleValue() < 0.458041958041958) {
      p = 0.0;
    } else if (true) {
      p = 0.2777777777777778;
    } 
    return p;
  }
  static double N1800a5751644(Object []i) {
    double p = Double.NaN;
    /* maxSingleChar */
    if (i[30] == null) {
      p = 0.2553191489361702;
    } else if (((Double)i[30]).doubleValue() < 0.08759590792838876) {
      p = 1.0;
    } else if (true) {
      p = 0.16666666666666666;
    } 
    return p;
  }
  static double N1458ed9c1645(Object []i) {
    double p = Double.NaN;
    /* digits */
    if (i[32] == null) {
      p = 0.25234061524743645;
    } else if (((Double)i[32]).doubleValue() < 0.040270270270270275) {
    p = WekaStringREPTree.N10a9d9611646(i);
    } else if (true) {
    p = WekaStringREPTree.N2fd953a61652(i);
    } 
    return p;
  }
  static double N10a9d9611646(Object []i) {
    double p = Double.NaN;
    /* digits */
    if (i[32] == null) {
      p = 0.03211009174311927;
    } else if (((Double)i[32]).doubleValue() < 0.019433962264150943) {
    p = WekaStringREPTree.N130e116b1647(i);
    } else if (true) {
    p = WekaStringREPTree.N5ddf0d241649(i);
    } 
    return p;
  }
  static double N130e116b1647(Object []i) {
    double p = Double.NaN;
    /* vocals */
    if (i[33] == null) {
      p = 0.013286713286713287;
    } else if (((Double)i[33]).doubleValue() < 0.42277727183868863) {
    p = WekaStringREPTree.Ne3835721648(i);
    } else if (true) {
      p = 1.0;
    } 
    return p;
  }
  static double Ne3835721648(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.011904761904761904;
    } else if (((Double)i[31]).doubleValue() < 0.3116554054054054) {
      p = 0.0031007751937984496;
    } else if (true) {
      p = 0.09420289855072464;
    } 
    return p;
  }
  static double N5ddf0d241649(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.3125;
    } else if (((Double)i[31]).doubleValue() < 0.12072072072072072) {
    p = WekaStringREPTree.N363a52f1650(i);
    } else if (true) {
    p = WekaStringREPTree.N608569611651(i);
    } 
    return p;
  }
  static double N363a52f1650(Object []i) {
    double p = Double.NaN;
    /* date */
    if (i[17] == null) {
      p = 0.8461538461538461;
    } else if (((Double)i[17]).doubleValue() < 0.5) {
      p = 1.0;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N608569611651(Object []i) {
    double p = Double.NaN;
    /* stackHeuristic */
    if (i[48] == null) {
      p = 0.11428571428571428;
    } else if (((Double)i[48]).doubleValue() < -2.443883890363853) {
      p = 0.019230769230769232;
    } else if (true) {
      p = 0.3888888888888889;
    } 
    return p;
  }
  static double N2fd953a61652(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.7210599721059973;
    } else if (((Double)i[37]).doubleValue() < 6.5) {
    p = WekaStringREPTree.Na4add541653(i);
    } else if (true) {
    p = WekaStringREPTree.N66c610241657(i);
    } 
    return p;
  }
  static double Na4add541653(Object []i) {
    double p = Double.NaN;
    /* dashes */
    if (i[39] == null) {
      p = 0.9668615984405458;
    } else if (((Double)i[39]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N141e5bef1654(i);
    } else if (true) {
      p = 0.23076923076923078;
    } 
    return p;
  }
  static double N141e5bef1654(Object []i) {
    double p = Double.NaN;
    /* date */
    if (i[17] == null) {
      p = 0.986;
    } else if (((Double)i[17]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N5f9be66c1655(i);
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N5f9be66c1655(Object []i) {
    double p = Double.NaN;
    /* vocals */
    if (i[33] == null) {
      p = 0.9919517102615694;
    } else if (((Double)i[33]).doubleValue() < 0.3158244680851064) {
    p = WekaStringREPTree.N3abada5a1656(i);
    } else if (true) {
      p = 0.875;
    } 
    return p;
  }
  static double N3abada5a1656(Object []i) {
    double p = Double.NaN;
    /* simpleSplitWordLen */
    if (i[36] == null) {
      p = 0.9938650306748467;
    } else if (((Double)i[36]).doubleValue() < 29.5) {
      p = 0.9978354978354979;
    } else if (true) {
      p = 0.9259259259259259;
    } 
    return p;
  }
  static double N66c610241657(Object []i) {
    double p = Double.NaN;
    /* knownUniqueWords */
    if (i[45] == null) {
      p = 0.10294117647058823;
    } else if (((Double)i[45]).doubleValue() < 20.5) {
      p = 0.06735751295336788;
    } else if (true) {
    p = WekaStringREPTree.N61fe301658(i);
    } 
    return p;
  }
  static double N61fe301658(Object []i) {
    double p = Double.NaN;
    /* maxSingleChar */
    if (i[30] == null) {
      p = 0.7272727272727273;
    } else if (((Double)i[30]).doubleValue() < 0.16116532721010332) {
      p = 1.0;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double Nc9d0d61659(Object []i) {
    double p = Double.NaN;
    /* knownWordsCount */
    if (i[44] == null) {
      p = 0.0010035023602862798;
    } else if (((Double)i[44]).doubleValue() < 1498.5) {
    p = WekaStringREPTree.N6ccdb29f1660(i);
    } else if (true) {
    p = WekaStringREPTree.N764faa61698(i);
    } 
    return p;
  }
  static double N6ccdb29f1660(Object []i) {
    double p = Double.NaN;
    /* equals */
    if (i[38] == null) {
      p = 9.997061031562693E-4;
    } else if (((Double)i[38]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N3adcc8121661(i);
    } else if (true) {
    p = WekaStringREPTree.N3cdf2c611683(i);
    } 
    return p;
  }
  static double N3adcc8121661(Object []i) {
    double p = Double.NaN;
    /* digits */
    if (i[32] == null) {
      p = 8.688522298987659E-4;
    } else if (((Double)i[32]).doubleValue() < 0.20389266817838247) {
    p = WekaStringREPTree.N354321071662(i);
    } else if (true) {
    p = WekaStringREPTree.N4b23c30a1677(i);
    } 
    return p;
  }
  static double N354321071662(Object []i) {
    double p = Double.NaN;
    /* maxLenKnownWord */
    if (i[47] == null) {
      p = 8.350564966695021E-4;
    } else if (((Double)i[47]).doubleValue() < 22.5) {
    p = WekaStringREPTree.N7b4208191663(i);
    } else if (true) {
    p = WekaStringREPTree.N9ebe38b1676(i);
    } 
    return p;
  }
  static double N7b4208191663(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 8.335155756899851E-4;
    } else if (((Double)i[37]).doubleValue() < 1.5) {
    p = WekaStringREPTree.N7a1a14a41664(i);
    } else if (true) {
    p = WekaStringREPTree.N5ba88be81672(i);
    } 
    return p;
  }
  static double N7a1a14a41664(Object []i) {
    double p = Double.NaN;
    /* digits */
    if (i[32] == null) {
      p = 0.0015231293384590158;
    } else if (((Double)i[32]).doubleValue() < 0.06091527520098949) {
    p = WekaStringREPTree.N265adfad1665(i);
    } else if (true) {
    p = WekaStringREPTree.N4b41dd5c1668(i);
    } 
    return p;
  }
  static double N265adfad1665(Object []i) {
    double p = Double.NaN;
    /* date */
    if (i[17] == null) {
      p = 0.0012205734851613663;
    } else if (((Double)i[17]).doubleValue() < 0.5) {
    p = WekaStringREPTree.Na3d99781666(i);
    } else if (true) {
      p = 1.0904293020162038E-5;
    } 
    return p;
  }
  static double Na3d99781666(Object []i) {
    double p = Double.NaN;
    /* simpleSplitWordLen */
    if (i[36] == null) {
      p = 0.001838675707750854;
    } else if (((Double)i[36]).doubleValue() < 1.5) {
      p = 2.3482882214806574E-4;
    } else if (true) {
    p = WekaStringREPTree.N61544ae61667(i);
    } 
    return p;
  }
  static double N61544ae61667(Object []i) {
    double p = Double.NaN;
    /* dashes */
    if (i[39] == null) {
      p = 0.003155214219769294;
    } else if (((Double)i[39]).doubleValue() < 1.5) {
      p = 0.0030111163817105615;
    } else if (true) {
      p = 0.011927181418706842;
    } 
    return p;
  }
  static double N4b41dd5c1668(Object []i) {
    double p = Double.NaN;
    /* knownUniqueWords */
    if (i[45] == null) {
      p = 0.026760996616425715;
    } else if (((Double)i[45]).doubleValue() < 12.5) {
    p = WekaStringREPTree.N3b96c42e1669(i);
    } else if (true) {
      p = 1.0;
    } 
    return p;
  }
  static double N3b96c42e1669(Object []i) {
    double p = Double.NaN;
    /* knownWordsCount */
    if (i[44] == null) {
      p = 0.021645021645021644;
    } else if (((Double)i[44]).doubleValue() < 9.5) {
    p = WekaStringREPTree.N5d066c7d1670(i);
    } else if (true) {
    p = WekaStringREPTree.N1e461e411671(i);
    } 
    return p;
  }
  static double N5d066c7d1670(Object []i) {
    double p = Double.NaN;
    /* maxLenKnownWord */
    if (i[47] == null) {
      p = 0.016103568045468898;
    } else if (((Double)i[47]).doubleValue() < 10.5) {
      p = 0.01364522417153996;
    } else if (true) {
      p = 0.10112359550561797;
    } 
    return p;
  }
  static double N1e461e411671(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.2835820895522388;
    } else if (((Double)i[31]).doubleValue() < 0.20465116279069767) {
      p = 0.8571428571428571;
    } else if (true) {
      p = 0.021739130434782608;
    } 
    return p;
  }
  static double N5ba88be81672(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 6.462249773375927E-4;
    } else if (((Double)i[31]).doubleValue() < 0.5368112014453479) {
    p = WekaStringREPTree.N569283071673(i);
    } else if (true) {
      p = 0.010058675607711651;
    } 
    return p;
  }
  static double N569283071673(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 6.350992924736275E-4;
    } else if (((Double)i[37]).doubleValue() < 3.5) {
    p = WekaStringREPTree.N3899782c1674(i);
    } else if (true) {
      p = 4.998644203353063E-4;
    } 
    return p;
  }
  static double N3899782c1674(Object []i) {
    double p = Double.NaN;
    /* knownUniqueWords */
    if (i[45] == null) {
      p = 9.889176726037556E-4;
    } else if (((Double)i[45]).doubleValue() < 30.0) {
    p = WekaStringREPTree.N1603cd681675(i);
    } else if (true) {
      p = 1.0;
    } 
    return p;
  }
  static double N1603cd681675(Object []i) {
    double p = Double.NaN;
    /* knownUniqueWords */
    if (i[45] == null) {
      p = 9.81758637863636E-4;
    } else if (((Double)i[45]).doubleValue() < 26.0) {
      p = 9.781860918419997E-4;
    } else if (true) {
      p = 0.3333333333333333;
    } 
    return p;
  }
  static double N9ebe38b1676(Object []i) {
    double p = Double.NaN;
    /* knownWordsCount */
    if (i[44] == null) {
      p = 0.08333333333333333;
    } else if (((Double)i[44]).doubleValue() < 17.5) {
      p = 0.0;
    } else if (true) {
      p = 0.6666666666666666;
    } 
    return p;
  }
  static double N4b23c30a1677(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.015524805939925751;
    } else if (((Double)i[31]).doubleValue() < 0.24744897959183673) {
    p = WekaStringREPTree.N38089a5a1678(i);
    } else if (true) {
    p = WekaStringREPTree.N30e868be1679(i);
    } 
    return p;
  }
  static double N38089a5a1678(Object []i) {
    double p = Double.NaN;
    /* normEntropy */
    if (i[50] == null) {
      p = 0.43037974683544306;
    } else if (((Double)i[50]).doubleValue() < 3.66449777920046) {
      p = 0.06666666666666667;
    } else if (true) {
      p = 0.9117647058823529;
    } 
    return p;
  }
  static double N30e868be1679(Object []i) {
    double p = Double.NaN;
    /* nonVocals */
    if (i[34] == null) {
      p = 0.004160887656033287;
    } else if (((Double)i[34]).doubleValue() < 0.6852425180598556) {
    p = WekaStringREPTree.N66c922931680(i);
    } else if (true) {
    p = WekaStringREPTree.N4f0100a71682(i);
    } 
    return p;
  }
  static double N66c922931680(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.0034782608695652175;
    } else if (((Double)i[31]).doubleValue() < 0.2540322580645161) {
    p = WekaStringREPTree.N332796d31681(i);
    } else if (true) {
      p = 0.0014149274849663955;
    } 
    return p;
  }
  static double N332796d31681(Object []i) {
    double p = Double.NaN;
    /* strLen */
    if (i[28] == null) {
      p = 0.125;
    } else if (((Double)i[28]).doubleValue() < 26.0) {
      p = 0.023255813953488372;
    } else if (true) {
      p = 1.0;
    } 
    return p;
  }
  static double N4f0100a71682(Object []i) {
    double p = Double.NaN;
    /* strLen */
    if (i[28] == null) {
      p = 0.2222222222222222;
    } else if (((Double)i[28]).doubleValue() < 15.0) {
      p = 0.0;
    } else if (true) {
      p = 1.0;
    } 
    return p;
  }
  static double N3cdf2c611683(Object []i) {
    double p = Double.NaN;
    /* nonVocals */
    if (i[34] == null) {
      p = 0.0076138147566719;
    } else if (((Double)i[34]).doubleValue() < 0.6693989071038251) {
    p = WekaStringREPTree.N13ad5cd31684(i);
    } else if (true) {
    p = WekaStringREPTree.N3fed28701693(i);
    } 
    return p;
  }
  static double N13ad5cd31684(Object []i) {
    double p = Double.NaN;
    /* nonVocals */
    if (i[34] == null) {
      p = 0.004541326067211626;
    } else if (((Double)i[34]).doubleValue() < 0.6545092838196287) {
    p = WekaStringREPTree.N1c33c17b1685(i);
    } else if (true) {
    p = WekaStringREPTree.N54e7df6a1692(i);
    } 
    return p;
  }
  static double N1c33c17b1685(Object []i) {
    double p = Double.NaN;
    /* digits */
    if (i[32] == null) {
      p = 0.0038839568801521877;
    } else if (((Double)i[32]).doubleValue() < 0.15047169811320754) {
    p = WekaStringREPTree.N5bf0fe621686(i);
    } else if (true) {
    p = WekaStringREPTree.N6ce86ce11691(i);
    } 
    return p;
  }
  static double N5bf0fe621686(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.003309409888357257;
    } else if (((Double)i[37]).doubleValue() < 1.5) {
    p = WekaStringREPTree.N1e097d591687(i);
    } else if (true) {
      p = 0.0020292550942758096;
    } 
    return p;
  }
  static double N1e097d591687(Object []i) {
    double p = Double.NaN;
    /* digits */
    if (i[32] == null) {
      p = 0.024544179523141654;
    } else if (((Double)i[32]).doubleValue() < 0.059714795008912656) {
    p = WekaStringREPTree.N673be18f1688(i);
    } else if (true) {
    p = WekaStringREPTree.N39de3d361690(i);
    } 
    return p;
  }
  static double N673be18f1688(Object []i) {
    double p = Double.NaN;
    /* equals */
    if (i[38] == null) {
      p = 0.008626887131560028;
    } else if (((Double)i[38]).doubleValue() < 1.5) {
      p = 0.0029455081001472753;
    } else if (true) {
    p = WekaStringREPTree.N6581dc0a1689(i);
    } 
    return p;
  }
  static double N6581dc0a1689(Object []i) {
    double p = Double.NaN;
    /* maxLenKnownWord */
    if (i[47] == null) {
      p = 0.24242424242424243;
    } else if (((Double)i[47]).doubleValue() < 6.5) {
      p = 0.6666666666666666;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N39de3d361690(Object []i) {
    double p = Double.NaN;
    /* stackHeuristic */
    if (i[48] == null) {
      p = 0.6571428571428571;
    } else if (((Double)i[48]).doubleValue() < -0.33958482965358394) {
      p = 1.0;
    } else if (true) {
      p = 0.07692307692307693;
    } 
    return p;
  }
  static double N6ce86ce11691(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.09868421052631579;
    } else if (((Double)i[37]).doubleValue() < 2.5) {
      p = 0.75;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N54e7df6a1692(Object []i) {
    double p = Double.NaN;
    /* digits */
    if (i[32] == null) {
      p = 0.18681318681318682;
    } else if (((Double)i[32]).doubleValue() < 0.03943452380952381) {
      p = 0.02631578947368421;
    } else if (true) {
      p = 1.0;
    } 
    return p;
  }
  static double N3fed28701693(Object []i) {
    double p = Double.NaN;
    /* digits */
    if (i[32] == null) {
      p = 0.5031847133757962;
    } else if (((Double)i[32]).doubleValue() < 0.03907203907203907) {
    p = WekaStringREPTree.N771285361694(i);
    } else if (true) {
    p = WekaStringREPTree.N64bce8321697(i);
    } 
    return p;
  }
  static double N771285361694(Object []i) {
    double p = Double.NaN;
    /* maxRepChars */
    if (i[35] == null) {
      p = 0.18181818181818182;
    } else if (((Double)i[35]).doubleValue() < 2.5) {
    p = WekaStringREPTree.N583260511695(i);
    } else if (true) {
      p = 1.0;
    } 
    return p;
  }
  static double N583260511695(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.14285714285714285;
    } else if (((Double)i[37]).doubleValue() < 1.5) {
    p = WekaStringREPTree.N32c4e8b21696(i);
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N32c4e8b21696(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.32432432432432434;
    } else if (((Double)i[43]).doubleValue() < 0.8947368421052632) {
      p = 1.0;
    } else if (true) {
      p = 0.16666666666666666;
    } 
    return p;
  }
  static double N64bce8321697(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.9130434782608695;
    } else if (((Double)i[37]).doubleValue() < 11.5) {
      p = 1.0;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N764faa61698(Object []i) {
    double p = Double.NaN;
    /* knownUniqueWords */
    if (i[45] == null) {
      p = 0.35714285714285715;
    } else if (((Double)i[45]).doubleValue() < 458.5) {
      p = 1.0;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N4c1f22f31699(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.20460216246187968;
    } else if (((Double)i[37]).doubleValue() < 1.5) {
    p = WekaStringREPTree.N598bd2ba1700(i);
    } else if (true) {
    p = WekaStringREPTree.N34c010411712(i);
    } 
    return p;
  }
  static double N598bd2ba1700(Object []i) {
    double p = Double.NaN;
    /* knownUniqueWords */
    if (i[45] == null) {
      p = 0.6635514018691588;
    } else if (((Double)i[45]).doubleValue() < 6.5) {
    p = WekaStringREPTree.N5a755cc11701(i);
    } else if (true) {
    p = WekaStringREPTree.Ne57b96d1709(i);
    } 
    return p;
  }
  static double N5a755cc11701(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.16756756756756758;
    } else if (((Double)i[43]).doubleValue() < 0.90625) {
      p = 0.8260869565217391;
    } else if (true) {
    p = WekaStringREPTree.N7ae42ce31702(i);
    } 
    return p;
  }
  static double N7ae42ce31702(Object []i) {
    double p = Double.NaN;
    /* vocals */
    if (i[33] == null) {
      p = 0.1239193083573487;
    } else if (((Double)i[33]).doubleValue() < 0.26969696969696966) {
    p = WekaStringREPTree.N4f5991f61703(i);
    } else if (true) {
    p = WekaStringREPTree.N38234a381705(i);
    } 
    return p;
  }
  static double N4f5991f61703(Object []i) {
    double p = Double.NaN;
    /* knownUniqueWords */
    if (i[45] == null) {
      p = 0.06097560975609756;
    } else if (((Double)i[45]).doubleValue() < 5.5) {
      p = 0.029411764705882353;
    } else if (true) {
    p = WekaStringREPTree.N484094a51704(i);
    } 
    return p;
  }
  static double N484094a51704(Object []i) {
    double p = Double.NaN;
    /* nonVocals */
    if (i[34] == null) {
      p = 0.21428571428571427;
    } else if (((Double)i[34]).doubleValue() < 0.4807692307692308) {
      p = 0.0;
    } else if (true) {
      p = 1.0;
    } 
    return p;
  }
  static double N38234a381705(Object []i) {
    double p = Double.NaN;
    /* strLen */
    if (i[28] == null) {
      p = 0.27722772277227725;
    } else if (((Double)i[28]).doubleValue() < 9.5) {
      p = 0.13114754098360656;
    } else if (true) {
    p = WekaStringREPTree.N63fbfaeb1706(i);
    } 
    return p;
  }
  static double N63fbfaeb1706(Object []i) {
    double p = Double.NaN;
    /* normEntropy */
    if (i[50] == null) {
      p = 0.5;
    } else if (((Double)i[50]).doubleValue() < 3.108861674944148) {
      p = 0.6875;
    } else if (true) {
    p = WekaStringREPTree.N602e01431707(i);
    } 
    return p;
  }
  static double N602e01431707(Object []i) {
    double p = Double.NaN;
    /* maxLenKnownWord */
    if (i[47] == null) {
      p = 0.375;
    } else if (((Double)i[47]).doubleValue() < 5.5) {
    p = WekaStringREPTree.N2c07545f1708(i);
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N2c07545f1708(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.6428571428571429;
    } else if (((Double)i[31]).doubleValue() < 0.35) {
      p = 1.0;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double Ne57b96d1709(Object []i) {
    double p = Double.NaN;
    /* dashes */
    if (i[39] == null) {
      p = 0.9257142857142857;
    } else if (((Double)i[39]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N32c726ee1710(i);
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N32c726ee1710(Object []i) {
    double p = Double.NaN;
    /* strLen */
    if (i[28] == null) {
      p = 0.96;
    } else if (((Double)i[28]).doubleValue() < 14.5) {
    p = WekaStringREPTree.N22f31dec1711(i);
    } else if (true) {
      p = 0.975346687211094;
    } 
    return p;
  }
  static double N22f31dec1711(Object []i) {
    double p = Double.NaN;
    /* crypto */
    if (i[19] == null) {
      p = 0.5769230769230769;
    } else if (((Double)i[19]).doubleValue() < 0.5) {
      p = 1.0;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N34c010411712(Object []i) {
    double p = Double.NaN;
    /* pluses */
    if (i[41] == null) {
      p = 0.01103665746945211;
    } else if (((Double)i[41]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N76f4b651713(i);
    } else if (true) {
    p = WekaStringREPTree.N2c4d1ac1716(i);
    } 
    return p;
  }
  static double N76f4b651713(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.009512485136741973;
    } else if (((Double)i[31]).doubleValue() < 0.3245554035567716) {
      p = 0.36363636363636365;
    } else if (true) {
    p = WekaStringREPTree.Nc94fd301714(i);
    } 
    return p;
  }
  static double Nc94fd301714(Object []i) {
    double p = Double.NaN;
    /* setDist */
    if (i[29] == null) {
      p = 0.007961783439490446;
    } else if (((Double)i[29]).doubleValue() < 0.2928571428571428) {
      p = 0.034722222222222224;
    } else if (true) {
    p = WekaStringREPTree.N36328d331715(i);
    } 
    return p;
  }
  static double N36328d331715(Object []i) {
    double p = Double.NaN;
    /* equals */
    if (i[38] == null) {
      p = 0.002403846153846154;
    } else if (((Double)i[38]).doubleValue() < 0.5) {
      p = 0.0014925373134328358;
    } else if (true) {
      p = 0.02857142857142857;
    } 
    return p;
  }
  static double N2c4d1ac1716(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.2857142857142857;
    } else if (((Double)i[37]).doubleValue() < 4.5) {
      p = 1.0;
    } else if (true) {
      p = 0.16666666666666666;
    } 
    return p;
  }
  static double N7f0d96f21717(Object []i) {
    double p = Double.NaN;
    /* maxLenKnownWord */
    if (i[47] == null) {
      p = 0.6910578787981898;
    } else if (((Double)i[47]).doubleValue() < 5.5) {
    p = WekaStringREPTree.N545b995e1718(i);
    } else if (true) {
    p = WekaStringREPTree.N7a1234bf1748(i);
    } 
    return p;
  }
  static double N545b995e1718(Object []i) {
    double p = Double.NaN;
    /* digits */
    if (i[32] == null) {
      p = 0.9322361376227943;
    } else if (((Double)i[32]).doubleValue() < 0.0010526315789473684) {
    p = WekaStringREPTree.N76a2ddf31719(i);
    } else if (true) {
    p = WekaStringREPTree.N45312be21726(i);
    } 
    return p;
  }
  static double N76a2ddf31719(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.2421331566743955;
    } else if (((Double)i[51]).doubleValue() < 0.40887868062354094) {
    p = WekaStringREPTree.N524f3b3a1720(i);
    } else if (true) {
    p = WekaStringREPTree.N2ef14fe1724(i);
    } 
    return p;
  }
  static double N524f3b3a1720(Object []i) {
    double p = Double.NaN;
    /* setDist */
    if (i[29] == null) {
      p = 0.746900826446281;
    } else if (((Double)i[29]).doubleValue() < 0.4527506654835847) {
    p = WekaStringREPTree.N41e68d871721(i);
    } else if (true) {
    p = WekaStringREPTree.N49ff7d8c1722(i);
    } 
    return p;
  }
  static double N41e68d871721(Object []i) {
    double p = Double.NaN;
    /* xml */
    if (i[0] == null) {
      p = 0.984375;
    } else if (((Double)i[0]).doubleValue() < 0.5) {
      p = 0.9914163090128756;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N49ff7d8c1722(Object []i) {
    double p = Double.NaN;
    /* regex */
    if (i[3] == null) {
      p = 0.11363636363636363;
    } else if (((Double)i[3]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N29526c051723(i);
    } else if (true) {
      p = 0.006134969325153374;
    } 
    return p;
  }
  static double N29526c051723(Object []i) {
    double p = Double.NaN;
    /* setDist */
    if (i[29] == null) {
      p = 0.2871287128712871;
    } else if (((Double)i[29]).doubleValue() < 0.6792004749653671) {
      p = 0.71875;
    } else if (true) {
      p = 0.08695652173913043;
    } 
    return p;
  }
  static double N2ef14fe1724(Object []i) {
    double p = Double.NaN;
    /* setDist */
    if (i[29] == null) {
      p = 0.0039005363237445147;
    } else if (((Double)i[29]).doubleValue() < 1.5105905006418485) {
      p = 0.0014698677119059284;
    } else if (true) {
    p = WekaStringREPTree.N77102b911725(i);
    } 
    return p;
  }
  static double N77102b911725(Object []i) {
    double p = Double.NaN;
    /* regex */
    if (i[3] == null) {
      p = 0.5;
    } else if (((Double)i[3]).doubleValue() < 0.5) {
      p = 1.0;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N45312be21726(Object []i) {
    double p = Double.NaN;
    /* vocals */
    if (i[33] == null) {
      p = 0.9844012118480683;
    } else if (((Double)i[33]).doubleValue() < 0.013423423423423425) {
    p = WekaStringREPTree.N7fb955051727(i);
    } else if (true) {
    p = WekaStringREPTree.N3f9342d41730(i);
    } 
    return p;
  }
  static double N7fb955051727(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.17037037037037037;
    } else if (((Double)i[31]).doubleValue() < 0.42871621621621625) {
      p = 0.009216589861751152;
    } else if (true) {
    p = WekaStringREPTree.N58be6e81728(i);
    } 
    return p;
  }
  static double N58be6e81728(Object []i) {
    double p = Double.NaN;
    /* stackHeuristic */
    if (i[48] == null) {
      p = 0.8301886792452831;
    } else if (((Double)i[48]).doubleValue() < -3.4043371689364417) {
      p = 0.125;
    } else if (true) {
    p = WekaStringREPTree.N7331196b1729(i);
    } 
    return p;
  }
  static double N7331196b1729(Object []i) {
    double p = Double.NaN;
    /* digits */
    if (i[32] == null) {
      p = 0.9555555555555556;
    } else if (((Double)i[32]).doubleValue() < 0.0375) {
      p = 0.6;
    } else if (true) {
      p = 1.0;
    } 
    return p;
  }
  static double N3f9342d41730(Object []i) {
    double p = Double.NaN;
    /* maxSingleChar */
    if (i[30] == null) {
      p = 0.9899417681312864;
    } else if (((Double)i[30]).doubleValue() < 0.13456657555642326) {
    p = WekaStringREPTree.Nab7395e1731(i);
    } else if (true) {
    p = WekaStringREPTree.N2b76ff4e1747(i);
    } 
    return p;
  }
  static double Nab7395e1731(Object []i) {
    double p = Double.NaN;
    /* simpleSplitWordLen */
    if (i[36] == null) {
      p = 0.9920070823321108;
    } else if (((Double)i[36]).doubleValue() < 10.5) {
      p = 0.1875;
    } else if (true) {
    p = WekaStringREPTree.N50d132461732(i);
    } 
    return p;
  }
  static double N50d132461732(Object []i) {
    double p = Double.NaN;
    /* digits */
    if (i[32] == null) {
      p = 0.9926587854087031;
    } else if (((Double)i[32]).doubleValue() < 0.05486978774650007) {
    p = WekaStringREPTree.N2bd083761733(i);
    } else if (true) {
    p = WekaStringREPTree.N27eedb641744(i);
    } 
    return p;
  }
  static double N2bd083761733(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.9004124926340601;
    } else if (((Double)i[43]).doubleValue() < 0.8731435643564356) {
    p = WekaStringREPTree.Ne70f13a1734(i);
    } else if (true) {
    p = WekaStringREPTree.N49964d751740(i);
    } 
    return p;
  }
  static double Ne70f13a1734(Object []i) {
    double p = Double.NaN;
    /* regex */
    if (i[3] == null) {
      p = 0.9599733155436958;
    } else if (((Double)i[3]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N3d3e54631735(i);
    } else if (true) {
    p = WekaStringREPTree.N64a402801736(i);
    } 
    return p;
  }
  static double N3d3e54631735(Object []i) {
    double p = Double.NaN;
    /* maxLenKnownWord */
    if (i[47] == null) {
      p = 0.984174830444612;
    } else if (((Double)i[47]).doubleValue() < 4.5) {
      p = 0.9933829611248967;
    } else if (true) {
      p = 0.8898305084745762;
    } 
    return p;
  }
  static double N64a402801736(Object []i) {
    double p = Double.NaN;
    /* slashes */
    if (i[40] == null) {
      p = 0.7732558139534884;
    } else if (((Double)i[40]).doubleValue() < 1.5) {
    p = WekaStringREPTree.N4b40f6511737(i);
    } else if (true) {
    p = WekaStringREPTree.Nd62fe5b1739(i);
    } 
    return p;
  }
  static double N4b40f6511737(Object []i) {
    double p = Double.NaN;
    /* maxSingleChar */
    if (i[30] == null) {
      p = 0.9197080291970803;
    } else if (((Double)i[30]).doubleValue() < 0.1122565864833906) {
    p = WekaStringREPTree.N42b027221738(i);
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N42b027221738(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.9545454545454546;
    } else if (((Double)i[51]).doubleValue() < 0.496232934911913) {
      p = 1.0;
    } else if (true) {
      p = 0.25;
    } 
    return p;
  }
  static double Nd62fe5b1739(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.2;
    } else if (((Double)i[31]).doubleValue() < 0.1599025974025974) {
      p = 1.0;
    } else if (true) {
      p = 0.0967741935483871;
    } 
    return p;
  }
  static double N49964d751740(Object []i) {
    double p = Double.NaN;
    /* GzipCmp */
    if (i[51] == null) {
      p = 0.4494949494949495;
    } else if (((Double)i[51]).doubleValue() < 0.418859649122807) {
    p = WekaStringREPTree.N528c8681741(i);
    } else if (true) {
    p = WekaStringREPTree.N5ce8d8691743(i);
    } 
    return p;
  }
  static double N528c8681741(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.7980769230769231;
    } else if (((Double)i[37]).doubleValue() < 30.0) {
    p = WekaStringREPTree.N466276d81742(i);
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N466276d81742(Object []i) {
    double p = Double.NaN;
    /* setDist */
    if (i[29] == null) {
      p = 0.9120879120879121;
    } else if (((Double)i[29]).doubleValue() < 0.6516544117647058) {
      p = 0.9431818181818182;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N5ce8d8691743(Object []i) {
    double p = Double.NaN;
    /* strLen */
    if (i[28] == null) {
      p = 0.06382978723404255;
    } else if (((Double)i[28]).doubleValue() < 381.5) {
      p = 0.022222222222222223;
    } else if (true) {
      p = 1.0;
    } 
    return p;
  }
  static double N27eedb641744(Object []i) {
    double p = Double.NaN;
    /* maxRepChars */
    if (i[35] == null) {
      p = 0.9967994498227795;
    } else if (((Double)i[35]).doubleValue() < 5.5) {
    p = WekaStringREPTree.N64c63c791745(i);
    } else if (true) {
      p = 0.2727272727272727;
    } 
    return p;
  }
  static double N64c63c791745(Object []i) {
    double p = Double.NaN;
    /* PublicKeys */
    if (i[23] == null) {
      p = 0.9970101865326101;
    } else if (((Double)i[23]).doubleValue() < 0.5) {
    p = WekaStringREPTree.N31c7528f1746(i);
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N31c7528f1746(Object []i) {
    double p = Double.NaN;
    /* ip */
    if (i[15] == null) {
      p = 0.9973004446326488;
    } else if (((Double)i[15]).doubleValue() < 0.5) {
      p = 0.9974588384774207;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N2b76ff4e1747(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.3805970149253731;
    } else if (((Double)i[37]).doubleValue() < 9.5) {
      p = 1.0;
    } else if (true) {
      p = 0.1782178217821782;
    } 
    return p;
  }
  static double N7a1234bf1748(Object []i) {
    double p = Double.NaN;
    /* digits */
    if (i[32] == null) {
      p = 0.03615676359039191;
    } else if (((Double)i[32]).doubleValue() < 0.0821406665303619) {
    p = WekaStringREPTree.N2f62ea701749(i);
    } else if (true) {
    p = WekaStringREPTree.N53f6fd091752(i);
    } 
    return p;
  }
  static double N2f62ea701749(Object []i) {
    double p = Double.NaN;
    /* knownUniqueWords */
    if (i[45] == null) {
      p = 0.005241746205601627;
    } else if (((Double)i[45]).doubleValue() < 623.5) {
    p = WekaStringREPTree.N24ba96391750(i);
    } else if (true) {
      p = 0.625;
    } 
    return p;
  }
  static double N24ba96391750(Object []i) {
    double p = Double.NaN;
    /* digits */
    if (i[32] == null) {
      p = 0.0048536088930640365;
    } else if (((Double)i[32]).doubleValue() < 0.05547457078069323) {
      p = 0.0023659949416659867;
    } else if (true) {
    p = WekaStringREPTree.N38aa816f1751(i);
    } 
    return p;
  }
  static double N38aa816f1751(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.06382978723404255;
    } else if (((Double)i[31]).doubleValue() < 0.12390350877192982) {
      p = 0.9047619047619048;
    } else if (true) {
      p = 0.028225806451612902;
    } 
    return p;
  }
  static double N53f6fd091752(Object []i) {
    double p = Double.NaN;
    /* nonVocals */
    if (i[34] == null) {
      p = 0.1662277814351547;
    } else if (((Double)i[34]).doubleValue() < 0.5396754924120116) {
    p = WekaStringREPTree.N6bffbc6d1753(i);
    } else if (true) {
    p = WekaStringREPTree.N539d0191757(i);
    } 
    return p;
  }
  static double N6bffbc6d1753(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.037833532457188374;
    } else if (((Double)i[37]).doubleValue() < 3.0) {
      p = 1.0;
    } else if (true) {
    p = WekaStringREPTree.N1b84f4751754(i);
    } 
    return p;
  }
  static double N1b84f4751754(Object []i) {
    double p = Double.NaN;
    /* vocals */
    if (i[33] == null) {
      p = 0.020672882042967168;
    } else if (((Double)i[33]).doubleValue() < 0.0823170731707317) {
    p = WekaStringREPTree.N7749bf931755(i);
    } else if (true) {
      p = 0.011517893870835048;
    } 
    return p;
  }
  static double N7749bf931755(Object []i) {
    double p = Double.NaN;
    /* stackHeuristic */
    if (i[48] == null) {
      p = 0.6388888888888888;
    } else if (((Double)i[48]).doubleValue() < -1.6135423141550622) {
    p = WekaStringREPTree.N13330ac61756(i);
    } else if (true) {
      p = 0.84;
    } 
    return p;
  }
  static double N13330ac61756(Object []i) {
    double p = Double.NaN;
    /* strLen */
    if (i[28] == null) {
      p = 0.18181818181818182;
    } else if (((Double)i[28]).doubleValue() < 109.5) {
      p = 0.0;
    } else if (true) {
      p = 1.0;
    } 
    return p;
  }
  static double N539d0191757(Object []i) {
    double p = Double.NaN;
    /* knownWordsCount */
    if (i[44] == null) {
      p = 0.777988614800759;
    } else if (((Double)i[44]).doubleValue() < 22.5) {
    p = WekaStringREPTree.N39a2bb971758(i);
    } else if (true) {
    p = WekaStringREPTree.N3ad2e171759(i);
    } 
    return p;
  }
  static double N39a2bb971758(Object []i) {
    double p = Double.NaN;
    /* regexWordSize */
    if (i[37] == null) {
      p = 0.20224719101123595;
    } else if (((Double)i[37]).doubleValue() < 3.5) {
      p = 0.7;
    } else if (true) {
      p = 0.057971014492753624;
    } 
    return p;
  }
  static double N3ad2e171759(Object []i) {
    double p = Double.NaN;
    /* vocals */
    if (i[33] == null) {
      p = 0.8949771689497716;
    } else if (((Double)i[33]).doubleValue() < 0.053418803418803416) {
      p = 0.043478260869565216;
    } else if (true) {
    p = WekaStringREPTree.N8c3619e1760(i);
    } 
    return p;
  }
  static double N8c3619e1760(Object []i) {
    double p = Double.NaN;
    /* equals */
    if (i[38] == null) {
      p = 0.9421686746987952;
    } else if (((Double)i[38]).doubleValue() < 2.5) {
    p = WekaStringREPTree.N4331d1871761(i);
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N4331d1871761(Object []i) {
    double p = Double.NaN;
    /* maxRepChars */
    if (i[35] == null) {
      p = 0.9606879606879607;
    } else if (((Double)i[35]).doubleValue() < 4.5) {
    p = WekaStringREPTree.N6f63b4751762(i);
    } else if (true) {
      p = 0.14285714285714285;
    } 
    return p;
  }
  static double N6f63b4751762(Object []i) {
    double p = Double.NaN;
    /* simpleSplitWordLen */
    if (i[36] == null) {
      p = 0.975;
    } else if (((Double)i[36]).doubleValue() < 26.5) {
      p = 0.3333333333333333;
    } else if (true) {
    p = WekaStringREPTree.N554e2181763(i);
    } 
    return p;
  }
  static double N554e2181763(Object []i) {
    double p = Double.NaN;
    /* digits */
    if (i[32] == null) {
      p = 0.9847715736040609;
    } else if (((Double)i[32]).doubleValue() < 0.09137291280148424) {
    p = WekaStringREPTree.N1608bcbd1764(i);
    } else if (true) {
    p = WekaStringREPTree.N5bf8fa121765(i);
    } 
    return p;
  }
  static double N1608bcbd1764(Object []i) {
    double p = Double.NaN;
    /* nonLetter */
    if (i[31] == null) {
      p = 0.7777777777777778;
    } else if (((Double)i[31]).doubleValue() < 0.16498257839721253) {
      p = 1.0;
    } else if (true) {
      p = 0.0;
    } 
    return p;
  }
  static double N5bf8fa121765(Object []i) {
    double p = Double.NaN;
    /* knownWordsBySplitLen */
    if (i[43] == null) {
      p = 0.9946808510638298;
    } else if (((Double)i[43]).doubleValue() < 0.9408567079799957) {
      p = 1.0;
    } else if (true) {
      p = 0.8571428571428571;
    } 
    return p;
  }
}

