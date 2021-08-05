package com.company;

public class Translate {

    public String yoon(char c, char d){
        String ans = "";
        if (d == 'ャ' || d == 'ゃ'){
            switch(c){
                case 'キ':
                case 'き':
                    ans = "kya";
                break;

                case 'シ':
                case 'し':
                    ans = "sha";
                break;

                case 'チ':
                case 'ち':
                    ans = "cha";
                break;

                case 'ニ':
                case 'に':
                    ans = "nya";
                break;

                case 'ヒ':
                case 'ひ':
                    ans = "hya";
                break;

                case 'ミ':
                case 'み':
                    ans = "mya";
                break;

                case 'リ':
                case 'り':
                    ans = "rya";
                break;

                case 'ギ':
                case 'ぎ':
                    ans = "gya";
                break;

                case 'ジ':
                case 'じ':
                    ans = "ja";
                break;

                case 'ビ':
                case 'び':
                    ans = "bya";
                break;

                case 'ピ':
                case 'ぴ':
                    ans = "pya";
                break;

                default:
                    ans = this.change(c);
                break;
            }
        } else if (d == 'ュ' || d == 'ゅ'){
            switch(c) {
                case 'キ':
                case 'き':
                    ans = "kyu";
                    break;

                case 'シ':
                case 'し':
                    ans = "shu";
                    break;

                case 'チ':
                case 'ち':
                    ans = "chu";
                    break;

                case 'ニ':
                case 'に':
                    ans = "nyu";
                    break;

                case 'ヒ':
                case 'ひ':
                    ans = "hyu";
                    break;

                case 'ミ':
                case 'み':
                    ans = "myu";
                    break;

                case 'リ':
                case 'り':
                    ans = "ryu";
                    break;

                case 'ギ':
                case 'ぎ':
                    ans = "gyu";
                    break;

                case 'ジ':
                case 'じ':
                    ans = "ju";
                    break;

                case 'ビ':
                case 'び':
                    ans = "byu";
                    break;

                case 'ピ':
                case 'ぴ':
                    ans = "pyu";
                    break;

                default:
                    ans = this.change(c);
                break;
            }
        } else if (d == 'ョ' || d == 'ょ') {
            switch (c) {
                case 'キ':
                case 'き':
                    ans = "kyo";
                    break;

                case 'シ':
                case 'し':
                    ans = "sho";
                    break;

                case 'チ':
                case 'ち':
                    ans = "cho";
                    break;

                case 'ニ':
                case 'に':
                    ans = "nyo";
                    break;

                case 'ヒ':
                case 'ひ':
                    ans = "hyo";
                    break;

                case 'ミ':
                case 'み':
                    ans = "myo";
                    break;

                case 'リ':
                case 'り':
                    ans = "ryo";
                    break;

                case 'ギ':
                case 'ぎ':
                    ans = "gyo";
                    break;

                case 'ジ':
                case 'じ':
                    ans = "jo";
                    break;

                case 'ビ':
                case 'び':
                    ans = "byo";
                    break;

                case 'ピ':
                case 'ぴ':
                    ans = "pyo";
                    break;

                default:
                    ans = this.change(c);
                    break;
            }

        }
        return ans;
    }

    public String change(char c){
        String ans;
        switch(c){
            case 'あ':
            case 'ア':
                ans = "a";
            break;

            case 'い':
            case 'イ':
                ans = "i";
                break;

            case 'う':
            case 'ウ':
                ans = "u";
                break;


            case 'え':
            case 'エ':
                ans = "e";
                break;


            case 'お':
            case 'オ':
                ans = "o";
                break;

            case 'か':
            case 'カ':
                ans = "ka";
                break;

            case 'き':
            case 'キ':
                ans = "ki";
                break;

            case 'く':
            case 'ク':
                ans = "ku";
                break;

            case 'け':
            case 'ケ':
                ans = "ke";
                break;

            case 'こ':
            case 'コ':
                ans = "ko";
                break;

            case 'さ':
            case 'サ':
                ans = "sa";
                break;

            case 'し':
            case 'シ':
                ans = "shi";
                break;

            case 'す':
            case 'ス':
                ans = "su";
                break;

            case 'せ':
            case 'セ':
                ans = "se";
                break;

            case 'そ':
            case 'ソ':
                ans = "so";
                break;

            case 'た':
            case 'タ':
                ans = "ta";
                break;

            case 'ち':
            case 'チ':
                ans = "chi";
                break;

            case 'つ':
            case 'ツ':
                ans = "tsu";
                break;

            case 'て':
            case 'テ':
                ans = "te";
                break;

            case 'と':
            case 'ト':
                ans = "to";
                break;

            case 'な':
            case 'ナ':
                ans = "na";
                break;

            case 'に':
            case 'ニ':
                ans = "ni";
                break;

            case 'ぬ':
            case 'ヌ':
                ans = "nu";
                break;

            case 'ね':
            case 'ネ':
                ans = "ne";
                break;

            case 'の':
            case 'ノ':
                ans = "no";
                break;

            case 'は':
            case 'ハ':
                ans = "ha/wa";
                break;

            case 'ひ':
            case 'ヒ':
                ans = "hi";
                break;

            case 'ふ':
            case 'フ':
                ans = "ho";
                break;

            case 'へ':
            case 'ヘ':
                ans = "he";
                break;

            case 'ほ':
            case 'ホ':
                ans = "ho";
                break;

            case 'ま':
            case 'マ':
                ans = "ma";
                break;

            case 'み':
            case 'ミ':
                ans = "mi";
                break;

            case 'む':
            case 'ム':
                ans = "mu";
                break;

            case 'め':
            case 'メ':
                ans = "me";
                break;

            case 'も':
            case 'モ':
                ans = "mo";
                break;

            case 'や':
            case 'ヤ':
                ans = "ya";
                break;

            case 'ゆ':
            case 'ユ':
                ans = "yu";
                break;

            case 'よ':
            case 'ヨ':
                ans = "yo";
                break;

            case 'ら':
            case 'ラ':
                ans = "ra";
                break;

            case 'り':
            case 'リ':
                ans = "ri";
                break;

            case 'る':
            case 'ル':
                ans = "ru";
                break;

            case 'れ':
            case 'レ':
                ans = "re";
                break;

            case 'ろ':
            case 'ロ':
                ans = "ro";
                break;

            case 'わ':
            case 'ワ':
                ans = "wa";
                break;

            case 'を':
            case 'ヲ':
                ans = "wo";
                break;

            case 'ん':
            case 'ン':
                ans = "n";
                break;

            case 'が':
            case 'ガ':
                ans = "ga";
                break;

            case 'ぎ':
            case 'ギ':
                ans = "gi";
                break;

            case 'ぐ':
            case 'グ':
                ans = "gu";
                break;

            case 'げ':
            case 'ゲ':
                ans = "ge";
                break;

            case 'ご':
            case 'ゴ':
                ans = "go";
                break;

            case 'ざ':
            case 'ザ':
                ans = "za";
                break;

            case 'じ':
            case 'ジ':
                ans = "ji";
                break;

            case 'ず':
            case 'ズ':
                ans = "zu";
                break;

            case 'ぜ':
            case 'ゼ':
                ans = "ze";
                break;

            case 'ぞ':
            case 'ゾ':
                ans = "zo";
                break;

            case 'だ':
            case 'ダ':
                ans = "da";
                break;

            case 'ぢ':
            case 'ヂ':
                ans = "(d)ji";
                break;

            case 'づ':
            case 'ヅ':
                ans = "(d)zu";
                break;

            case 'で':
            case 'デ':
                ans = "de";
                break;

            case 'ど':
            case 'ド':
                ans = "do";
                break;

            case 'ば':
            case 'バ':
                ans = "ba";
                break;

            case 'び':
            case 'ビ':
                ans = "bi";
                break;

            case 'ぶ':
            case 'ブ':
                ans = "bu";
                break;

            case 'べ':
            case 'ベ':
                ans = "be";
                break;

            case 'ぼ':
            case 'ボ':
                ans = "bo";
                break;

            case 'ぱ':
            case 'パ':
                ans = "pa";
                break;

            case 'ぴ':
            case 'ピ':
                ans = "pi";
                break;

            case 'ぷ':
            case 'プ':
                ans = "pu";
                break;

            case 'ぺ':
            case 'ペ':
                ans = "pe";
                break;

            case 'ぽ':
            case 'ポ':
                ans = "po";
                break;

            case '。':
                ans = ".";
                break;


            default:
                ans = Character.toString(c);
            break;
        }

        return ans;
    }
}
