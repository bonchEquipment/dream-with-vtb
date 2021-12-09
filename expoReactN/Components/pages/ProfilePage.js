import {Image, StyleSheet, Text, TouchableOpacity, View} from "react-native";

import React from "react";
import SemiCircleProgress from "../SemiCircleProgress";

export default function ProfilePage({navigation}){
    const loadScene = () =>{
        navigation.navigate("Auth/confirm");

    }

    return (

        <View style={styles.content}>
            <View>
                <SemiCircleProgress    circleRadius={100} percentage={35} progressWidth={5}   progressColor={"dodgerblue"} >
                    <Text style={{ fontSize: 32, color: "dodgerblue" }}>35%</Text>
                </SemiCircleProgress>
            </View>
            <View style={styles.textContainer}>
                <Text style={styles.mainText}>
                    Приблизили вас к мечте
                </Text>
                <Text style={styles.signMonths}>за этот месяц</Text>
                <Text style={styles.signSuccess}>
                    Это на 200% больше предыдущего месяца
                </Text>
            </View>
        </View>


    )
}


const styles = StyleSheet.create( {
        content: {
            backgroundColor:"white",
            alignItems: 'center',
            flex: 0,
            justifyContent: 'center'
        },
        textContainer:{
            textAlign:"center",
            marginTop:10
        },
        mainText:{
            textAlign: "center"
        },
        signSuccess:{
            color:"dodgerblue",
            textAlign: "center",
            marginTop: 10
        },
        signMonths:{
            textDecorationLine: "underline",
            textAlign: "center"

        }
    }
)
