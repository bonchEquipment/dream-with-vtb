import React, {useState} from "react";
import {Button, Image, Pressable, StyleSheet, Text, View} from "react-native";
import InteractiveTextInput from "react-native-text-input-interactive";

export default function AuthMain({navigation}){
    const loadScene = () =>{
        navigation.navigate("Auth/confirm");
    }

    const [cardNumber, setCardNumber] = useState('')

    return (
        <View style={styles.container}>
            <View>
                <Image style={styles.icon}
                       source={require("../../../assets/Logo.png")}/>
            </View>
            <View>
                <InteractiveTextInput value={cardNumber} onChangeText={setCardNumber} mainColor="#1e72d9" placeholder='Введите номер карты'/>
            </View>
            <Pressable style={styles.buttonOneStyle} onPress={loadScene}>
                <Text style={styles.text}>Войти</Text>
            </Pressable>
        </View>

    )
}

const styles = StyleSheet.create({
    separation:{
        marginVertical: 8,
    },
    titleText:{
        marginTop: 10,
        fontFamily: "Roboto",
        fontStyle: "normal",
        fontWeight: "normal",
        fontSize: 36,
        textAlign: "center",
        marginBottom: 10

    },
    container: {
        flex: 1,
        backgroundColor: "white",
        alignItems: 'center',
        justifyContent: 'center',
    },
    icon: {
        width:170,
        height:60,
        marginBottom: 80,
    },
    placeholder:{
        width: 310,
        height: 310,
        marginBottom: 20,
        resizeMode:"cover",
    },
    text:{
        fontFamily: "Roboto",
        fontStyle: "normal",
        fontSize: 18,
        lineHeight: 22,
        color: "white"
    },
    buttonOneStyle: {
        marginTop: 80,
        backgroundColor: "#4B84E8",
        borderRadius: 14,
        width: 321,
        height:50,
        alignItems: "center",
        justifyContent: "center",
    },
    buttonTwoStyle: {
        backgroundColor: "rgba(75, 132, 232, 0.56)",
        borderRadius: 14,
        width: 321,
        height:50,
        alignItems: "center",
        justifyContent: "center",
        marginBottom: 50,
    },
    cont:{
        width: 375,
        height:403,
        backgroundColor: "rgba(255,255,255,0.1)",
        borderRadius: 47,
        borderColor: "rgba(0, 0, 0, 0.1)",
        borderStyle: "solid"

    }
});