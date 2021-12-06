import React from "react";
import {Button, View} from "react-native";


export function Auhorize({navigation}){
    const loadScene = () =>{
        navigation.goBack();
    }


    return (
        <View>
        <Text>Привет</Text>
            <Button onPress={loadScene()}>Назад</Button>
        </View>

    )
}