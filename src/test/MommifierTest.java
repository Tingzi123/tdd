package test;

import org.junit.jupiter.api.Test;

import main.Mommifier;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MommifierTest {
    @Test
    void should_throw_exception_when_string_is_null(){
        assertThrows(Exception.class,()->{
            Mommifier mommifier=new Mommifier();
            String str=null;
            mommifier.vowelslenOver30Per(str);
        });
    }

    @Test
    void should_return_empty_string_when_string_is_empty() throws Exception {
        Mommifier mommifier=new Mommifier();
        String str="";
        String re=mommifier.vowelslenOver30Per(str);
        assertEquals("",re);
    }

    @Test
    void should_return_this_string_when_vowels_length_low_30Per() throws Exception {
        Mommifier mommifier=new Mommifier();
        String str="yyyyeessss";
        String re=mommifier.vowelslenOver30Per(str);
        assertEquals("yyyyeessss",re);
    }

    @Test
    void should_return_this_string_when_vowels_length_over_30Per_but_no_continuous() throws Exception {
        Mommifier mommifier=new Mommifier();
        String str="nonono";
        String re=mommifier.vowelslenOver30Per(str);
        assertEquals("nonono",re);
    }

    @Test
    void should_return_insert_mommy() throws Exception {
        Mommifier mommifier=new Mommifier();
        String str="keep";
        String re=mommifier.vowelslenOver30Per(str);
        assertEquals("kemommyep",re);
    }

    @Test
    void should_return_insert_mommy_continuous() throws Exception {
        Mommifier mommifier=new Mommifier();
        String str="keeep";
        String re=mommifier.vowelslenOver30Per(str);
        assertEquals("kemommyemommyep",re);
    }
}
