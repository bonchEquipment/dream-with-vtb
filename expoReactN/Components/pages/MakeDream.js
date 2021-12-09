import {Text, TouchableHighlight, View, StyleSheet, Image} from "react-native";
import React from "react";

export default function MakeDream(){
    return(
        <View style={styles.element} >
            <Text>make</Text>
        </View>
    )
}

const styles= StyleSheet.create({
    element:{
        padding:15,
        flexDirection: "row",
    },
})