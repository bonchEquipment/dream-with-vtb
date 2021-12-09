import {Image, ScrollView, StyleSheet, Text, TouchableOpacity, TouchableWithoutFeedback, View} from "react-native";
import React, {useState} from "react";

export default function Dreams({navigation}) {
    const loadScene = () => {
        navigation.navigate("Auth/confirm");

    }

    const [dreams, setDreams] = useState([
        {name:"laptop",key:"1"},{name:"adventure",key:"2"},
    ])
    return (

        <View style={styles.header}>
            <View style={{flex: 0, flexDirection: 'row', justifyContent: 'flex-start'}}>
                <Text style={styles.headerText}>Мечты</Text>
            </View>

            <View style={styles.manageDreams} style={{flex: 1, flexDirection: 'row', justifyContent: 'flex-end'}}>
                <TouchableOpacity onPress={loadScene}>
                    <Image source={require('../../../assets/ManageDreams.png')} style={styles.manageDreams}/>
                </TouchableOpacity>
            </View>
            <ScrollView>
                {dreams.map(item=>(<View key={item.key}>
                    <Text>item.name</Text>
                </View>))}
            </ScrollView>
        </View>


    )
}


const styles = StyleSheet.create({
    header: {
        marginTop: 10,
        flex: 0,
        flexDirection: 'row',
        position: 'absolute',
        backgroundColor: "#FFFFFF"
    },
    headerText: {
        flex: 0,
        marginLeft: 10,
        overflow: "hidden",
        fontSize: 30
    },
    manageDreams: {
        flex: 0,
        marginRight: 10,
        marginTop: 10,
        overflow: "hidden",
    }
})
